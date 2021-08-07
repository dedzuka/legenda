
package net.mcreator.legenda.block;

import net.minecraft.block.material.Material;

@LegendaModElements.ModElement.Tag
public class GigantwoodBlock extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:gigantwood")
	public static final Block block = null;

	public GigantwoodBlock(LegendaModElements instance) {
		super(instance, 26);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 100f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.AXE).setRequiresTool());

			setRegistryName("gigantwood");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 2;
		}

		@Override
		public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 1;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
