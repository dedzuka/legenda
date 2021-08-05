
package net.mcreator.legenda.item;

@LegendaModElements.ModElement.Tag
public class LavasteelItem extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:lavasteel")
	public static final Item block = null;

	public LavasteelItem(LegendaModElements instance) {
		super(instance, 4);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("lavasteel");
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

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("not drop in the water!"));
		}

	}

}
