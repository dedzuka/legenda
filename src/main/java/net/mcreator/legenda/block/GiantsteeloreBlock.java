
package net.mcreator.legenda.block;

import net.minecraft.block.material.Material;

@LegendaModElements.ModElement.Tag
public class GiantsteeloreBlock extends LegendaModElements.ModElement {

	@ObjectHolder("legenda:giantsteelore")
	public static final Block block = null;

	public GiantsteeloreBlock(LegendaModElements instance) {
		super(instance, 9);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("giantsteelore");
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
