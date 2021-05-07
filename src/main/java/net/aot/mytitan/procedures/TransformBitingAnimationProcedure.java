package net.aot.mytitan.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.PlayerModel;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;
import java.util.HashMap;

import com.mrcrayfish.obfuscate.client.event.PlayerModelEvent;

@MyTitanModElements.ModElement.Tag
public class TransformBitingAnimationProcedure extends MyTitanModElements.ModElement {
	public TransformBitingAnimationProcedure(MyTitanModElements instance) {
		super(instance, 68);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure TransformBitingAnimation!");
			return;
		}
		if (dependencies.get("playerModel") == null) {
			if (!dependencies.containsKey("playerModel"))
				MyTitanMod.LOGGER.warn("Failed to load dependency playerModel for procedure TransformBitingAnimation!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		PlayerModel playerModel = (PlayerModel) dependencies.get("playerModel");
		if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyTitanModVariables.PlayerVariables())).isTransformAnimationOn) == (true))) {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() instanceof SwordItem) == (true))) {
				playerModel.bipedLeftArm.rotateAngleY = (float) 75;
				playerModel.bipedHead.rotateAngleY = (float) (-30);
				playerModel.bipedHead.rotateAngleX = (float) 20;
				playerModel.bipedRightArm.rotateAngleY = (float) 80;
			} else if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() instanceof SwordItem) == (true))) {
				playerModel.bipedRightArm.rotateAngleY = (float) 75;
				playerModel.bipedHead.rotateAngleY = (float) 30;
				playerModel.bipedHead.rotateAngleY = (float) 70;
				playerModel.bipedLeftArm.rotateAngleY = (float) 80;
			} else {
				playerModel.bipedHead.rotateAngleY = (float) 75;
				playerModel.bipedHead.rotateAngleX = (float) 50;
				playerModel.bipedRightArm.rotateAngleX = (float) (-140);
				playerModel.bipedRightArm.rotateAngleY = (float) 100;
				playerModel.bipedHead.rotateAngleZ = (float) 0;
			}
		}
	}

	@SubscribeEvent
	public void setupPlayerRotations(PlayerModelEvent.SetupAngles.Post event) {
		Entity entity = event.getEntity();
		PlayerModel playerModel = event.getModelPlayer();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("entity", entity);
		dependencies.put("playerModel", playerModel);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
