package net.mcreator.legenda.procedures;

@LegendaModElements.ModElement.Tag
public class DragonLavasteelSwordLivingEntityIsHitWithToolProcedure extends LegendaModElements.ModElement {

	public DragonLavasteelSwordLivingEntityIsHitWithToolProcedure(LegendaModElements instance) {
		super(instance, 16);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LegendaMod.LOGGER.warn("Failed to load dependency entity for procedure DragonLavasteelSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LegendaMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DragonLavasteelSwordLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");

		entity.setFire((int) 7);
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 2));
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 2));
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 2));

	}

}
