package net.aot.mytitan.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.aot.mytitan.MyTitanModElements;
import net.aot.mytitan.MyTitanMod;

import java.util.Map;

@MyTitanModElements.ModElement.Tag
public class TitanJumpersProcedure extends MyTitanModElements.ModElement {
	public TitanJumpersProcedure(MyTitanModElements instance) {
		super(instance, 119);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MyTitanMod.LOGGER.warn("Failed to load dependency entity for procedure TitanJumpers!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getRidingEntity()) instanceof LivingEntity) ? ((entity.getRidingEntity()).onGround) : false)) {
			(entity.getRidingEntity()).setMotion(0, 1.5, 0);
		}
	}
}
