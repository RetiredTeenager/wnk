package net.aot.mytitan.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.PlayerModel;

import net.aot.mytitan.MyTitanModVariables;
import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;
import java.util.HashMap;

import com.mrcrayfish.obfuscate.client.event.PlayerModelEvent;

@MyTitanModElements.ModElement.Tag
public class ProcedureSaluteProcedure extends MyTitanModElements.ModElement {
	public ProcedureSaluteProcedure(MyTitanModElements instance) {
		super(instance, 108);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure ProcedureSalute!");
			return;
		}
		if (dependencies.get("playerModel") == null) {
			if (!dependencies.containsKey("playerModel"))
				MyTitanMod.LOGGER.warn("Failed to load dependency playerModel for procedure ProcedureSalute!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		PlayerModel playerModel = (PlayerModel) dependencies.get("playerModel");
		if ((((entity.getCapability(MyTitanModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyTitanModVariables.PlayerVariables())).isSaluting) == (true))) {
			playerModel.bipedHead.rotateAngleX = (float) 0.25;
			playerModel.bipedRightArm.rotateAngleX = (float) 50;
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
