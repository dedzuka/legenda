
package net.mcreator.legenda.item;

@LegendaModElements.ModElement.Tag
public class GigantsSteelItem extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:gigants_steel")
	public static final Item block = null;

	public GigantsSteelItem(LegendaModElements instance) {
		super(instance, 5);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("gigants_steel");
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
