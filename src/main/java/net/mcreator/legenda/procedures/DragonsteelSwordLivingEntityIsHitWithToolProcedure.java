package net.mcreator.legenda.procedures;

@LegendaModElements.ModElement.Tag
public class DragonsteelSwordLivingEntityIsHitWithToolProcedure extends LegendaModElements.ModElement {

	public DragonsteelSwordLivingEntityIsHitWithToolProcedure(LegendaModElements instance) {
		super(instance, 15);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LegendaMod.LOGGER.warn("Failed to load dependency entity for procedure DragonsteelSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LegendaMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DragonsteelSwordLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");

		entity.setFire((int) 5);
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1));
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 1));
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 1));

	}

}
