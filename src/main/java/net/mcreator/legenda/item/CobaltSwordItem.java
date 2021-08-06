
package net.mcreator.legenda.item;

@LegendaModElements.ModElement.Tag
public class CobaltSwordItem extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:cobalt_sword")
	public static final Item block = null;

	public CobaltSwordItem(LegendaModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1700;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("cobalt_sword"));
	}

}
