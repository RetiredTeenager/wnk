package net.aot.mytitan;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.IWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class MyTitanModVariables {
	public MyTitanModVariables(MyTitanModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				MyTitanMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				MyTitanMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				MyTitanMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}
	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "my_titan_worldvars";
		public boolean isCartMinigunOn = false;
		public double getCartCoordsX = 0;
		public double getCartCoordsY = 0;
		public double getCartCoordsZ = 0;
		public boolean hasCartMinigunSpawned = false;
		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			isCartMinigunOn = nbt.getBoolean("isCartMinigunOn");
			getCartCoordsX = nbt.getDouble("getCartCoordsX");
			getCartCoordsY = nbt.getDouble("getCartCoordsY");
			getCartCoordsZ = nbt.getDouble("getCartCoordsZ");
			hasCartMinigunSpawned = nbt.getBoolean("hasCartMinigunSpawned");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("isCartMinigunOn", isCartMinigunOn);
			nbt.putDouble("getCartCoordsX", getCartCoordsX);
			nbt.putDouble("getCartCoordsY", getCartCoordsY);
			nbt.putDouble("getCartCoordsZ", getCartCoordsZ);
			nbt.putBoolean("hasCartMinigunSpawned", hasCartMinigunSpawned);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (!world.getWorld().isRemote)
				MyTitanMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(world.getWorld().dimension::getType),
						new WorldSavedDataSyncMessage(1, this));
		}
		static WorldVariables clientSide = new WorldVariables();
		public static WorldVariables get(IWorld world) {
			if (world.getWorld() instanceof ServerWorld) {
				return ((ServerWorld) world.getWorld()).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "my_titan_mapvars";
		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (!world.getWorld().isRemote)
				MyTitanMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}
		static MapVariables clientSide = new MapVariables();
		public static MapVariables get(IWorld world) {
			if (world.getWorld() instanceof ServerWorld) {
				return world.getWorld().getServer().getWorld(DimensionType.OVERWORLD).getSavedData().getOrCreate(MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;
		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}
	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;
	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("my_titan", "player_variables"), new PlayerVariablesProvider());
	}
	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);
		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putDouble("selectedTitan", instance.selectedTitan);
			nbt.putBoolean("hasTitanAttack", instance.hasTitanAttack);
			nbt.putBoolean("hasTitanColossus", instance.hasTitanColossus);
			nbt.putBoolean("hasTitanFemale", instance.hasTitanFemale);
			nbt.putBoolean("hasTitanArmored", instance.hasTitanArmored);
			nbt.putBoolean("hasTitanCart", instance.hasTitanCart);
			nbt.putBoolean("hasTitanBeast", instance.hasTitanBeast);
			nbt.putBoolean("hasTitanWarHammer", instance.hasTitanWarHammer);
			nbt.putBoolean("hasTitanJaw", instance.hasTitanJaw);
			nbt.putBoolean("hasTitanFounding", instance.hasTitanFounding);
			nbt.putBoolean("isColossalAbilityOn", instance.isColossalAbilityOn);
			nbt.putBoolean("isTransformAnimationOn", instance.isTransformAnimationOn);
			nbt.putBoolean("isTransformed", instance.isTransformed);
			nbt.putBoolean("TitanJump", instance.TitanJump);
			nbt.putDouble("transformationCooldownTimer", instance.transformationCooldownTimer);
			nbt.putBoolean("isSaluting", instance.isSaluting);
			nbt.putBoolean("isShifter", instance.isShifter);
			nbt.putDouble("energyPoints", instance.energyPoints);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.selectedTitan = nbt.getDouble("selectedTitan");
			instance.hasTitanAttack = nbt.getBoolean("hasTitanAttack");
			instance.hasTitanColossus = nbt.getBoolean("hasTitanColossus");
			instance.hasTitanFemale = nbt.getBoolean("hasTitanFemale");
			instance.hasTitanArmored = nbt.getBoolean("hasTitanArmored");
			instance.hasTitanCart = nbt.getBoolean("hasTitanCart");
			instance.hasTitanBeast = nbt.getBoolean("hasTitanBeast");
			instance.hasTitanWarHammer = nbt.getBoolean("hasTitanWarHammer");
			instance.hasTitanJaw = nbt.getBoolean("hasTitanJaw");
			instance.hasTitanFounding = nbt.getBoolean("hasTitanFounding");
			instance.isColossalAbilityOn = nbt.getBoolean("isColossalAbilityOn");
			instance.isTransformAnimationOn = nbt.getBoolean("isTransformAnimationOn");
			instance.isTransformed = nbt.getBoolean("isTransformed");
			instance.TitanJump = nbt.getBoolean("TitanJump");
			instance.transformationCooldownTimer = nbt.getDouble("transformationCooldownTimer");
			instance.isSaluting = nbt.getBoolean("isSaluting");
			instance.isShifter = nbt.getBoolean("isShifter");
			instance.energyPoints = nbt.getDouble("energyPoints");
		}
	}

	public static class PlayerVariables {
		public double selectedTitan = 0.0;
		public boolean hasTitanAttack = false;
		public boolean hasTitanColossus = false;
		public boolean hasTitanFemale = false;
		public boolean hasTitanArmored = false;
		public boolean hasTitanCart = false;
		public boolean hasTitanBeast = false;
		public boolean hasTitanWarHammer = false;
		public boolean hasTitanJaw = false;
		public boolean hasTitanFounding = false;
		public boolean isColossalAbilityOn = false;
		public boolean isTransformAnimationOn = false;
		public boolean isTransformed = false;
		public boolean TitanJump = false;
		public double transformationCooldownTimer = 0;
		public boolean isSaluting = false;
		public boolean isShifter = false;
		public double energyPoints = 0;
		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				MyTitanMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}
	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote)
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote)
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote)
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.selectedTitan = original.selectedTitan;
		clone.hasTitanAttack = original.hasTitanAttack;
		clone.hasTitanColossus = original.hasTitanColossus;
		clone.hasTitanFemale = original.hasTitanFemale;
		clone.hasTitanArmored = original.hasTitanArmored;
		clone.hasTitanCart = original.hasTitanCart;
		clone.hasTitanBeast = original.hasTitanBeast;
		clone.hasTitanWarHammer = original.hasTitanWarHammer;
		clone.hasTitanJaw = original.hasTitanJaw;
		clone.hasTitanFounding = original.hasTitanFounding;
		clone.isColossalAbilityOn = original.isColossalAbilityOn;
		clone.isTransformAnimationOn = original.isTransformAnimationOn;
		clone.isTransformed = original.isTransformed;
		clone.TitanJump = original.TitanJump;
		clone.transformationCooldownTimer = original.transformationCooldownTimer;
		clone.isSaluting = original.isSaluting;
		clone.isShifter = original.isShifter;
		if (!event.isWasDeath()) {
			clone.energyPoints = original.energyPoints;
		}
	}
	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;
		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.selectedTitan = message.data.selectedTitan;
					variables.hasTitanAttack = message.data.hasTitanAttack;
					variables.hasTitanColossus = message.data.hasTitanColossus;
					variables.hasTitanFemale = message.data.hasTitanFemale;
					variables.hasTitanArmored = message.data.hasTitanArmored;
					variables.hasTitanCart = message.data.hasTitanCart;
					variables.hasTitanBeast = message.data.hasTitanBeast;
					variables.hasTitanWarHammer = message.data.hasTitanWarHammer;
					variables.hasTitanJaw = message.data.hasTitanJaw;
					variables.hasTitanFounding = message.data.hasTitanFounding;
					variables.isColossalAbilityOn = message.data.isColossalAbilityOn;
					variables.isTransformAnimationOn = message.data.isTransformAnimationOn;
					variables.isTransformed = message.data.isTransformed;
					variables.TitanJump = message.data.TitanJump;
					variables.transformationCooldownTimer = message.data.transformationCooldownTimer;
					variables.isSaluting = message.data.isSaluting;
					variables.isShifter = message.data.isShifter;
					variables.energyPoints = message.data.energyPoints;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
