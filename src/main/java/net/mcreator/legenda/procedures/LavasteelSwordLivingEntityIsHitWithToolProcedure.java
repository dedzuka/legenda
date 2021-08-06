package net.mcreator.legenda.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.legenda.LegendaModElements;
import net.mcreator.legenda.LegendaMod;

import java.util.Map;

@LegendaModElements.ModElement.Tag
public class LavasteelSwordLivingEntityIsHitWithToolProcedure extends LegendaModElements.ModElement {
	public LavasteelSwordLivingEntityIsHitWithToolProcedure(LegendaModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LegendaMod.LOGGER.warn("Failed to load dependency entity for procedure LavasteelSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 3);
	}
}
