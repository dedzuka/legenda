
package net.mcreator.legenda.item;

@LegendaModElements.ModElement.Tag
public class KanerosekaItem extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:kaneroseka")
	public static final Item block = null;

	public KanerosekaItem(LegendaModElements instance) {
		super(instance, 7);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("kaneroseka");
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
