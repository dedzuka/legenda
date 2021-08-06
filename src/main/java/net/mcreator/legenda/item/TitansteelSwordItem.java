
package net.mcreator.legenda.item;

@LegendaModElements.ModElement.Tag
public class TitansteelSwordItem extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:titansteel_sword")
	public static final Item block = null;

	public TitansteelSwordItem(LegendaModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 50;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 17f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitansteelItem.block, (int) (1)));
			}
		}, 3, -3.9f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("titansteel_sword"));
	}

}
