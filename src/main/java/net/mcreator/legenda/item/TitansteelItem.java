
package net.mcreator.legenda.item;

@LegendaModElements.ModElement.Tag
public class TitansteelItem extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:titansteel")
	public static final Item block = null;

	public TitansteelItem(LegendaModElements instance) {
		super(instance, 6);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("titansteel");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
