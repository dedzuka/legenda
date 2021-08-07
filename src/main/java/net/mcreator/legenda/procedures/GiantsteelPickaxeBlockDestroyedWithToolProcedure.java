package net.mcreator.legenda.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.legenda.LegendaModElements;
import net.mcreator.legenda.LegendaMod;

import java.util.Map;

@LegendaModElements.ModElement.Tag
public class GiantsteelPickaxeBlockDestroyedWithToolProcedure extends LegendaModElements.ModElement {
	public GiantsteelPickaxeBlockDestroyedWithToolProcedure(LegendaModElements instance) {
		super(instance, 44);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LegendaMod.LOGGER.warn("Failed to load dependency x for procedure GiantsteelPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LegendaMod.LOGGER.warn("Failed to load dependency y for procedure GiantsteelPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LegendaMod.LOGGER.warn("Failed to load dependency z for procedure GiantsteelPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LegendaMod.LOGGER.warn("Failed to load dependency world for procedure GiantsteelPickaxeBlockDestroyedWithTool!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) ((Math.floor(x)) + 1), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + 1), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) ((Math.floor(x)) + 1), (int) ((Math.floor(y)) + 1), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + 1), (int) ((Math.floor(y)) + 1), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(
					world.getBlockState(new BlockPos((int) ((Math.floor(x)) + 1), (int) ((Math.floor(y)) + (-1)), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + 1), (int) ((Math.floor(y)) + (-1)), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(
					world.getBlockState(new BlockPos((int) ((Math.floor(x)) + (-1)), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + (-1)), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(
					world.getBlockState(new BlockPos((int) ((Math.floor(x)) + (-1)), (int) ((Math.floor(y)) + 1), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + (-1)), (int) ((Math.floor(y)) + 1), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(
					world.getBlockState(new BlockPos((int) ((Math.floor(x)) + (-1)), (int) ((Math.floor(y)) + (-1)), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + (-1)), (int) ((Math.floor(y)) + (-1)), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 1), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 1), (int) ((Math.floor(z)) + 0)), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(
					world.getBlockState(new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + (-1)), (int) ((Math.floor(z)) + 0))),
					(World) world, new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + 0), (int) ((Math.floor(z)) + 0)));
			world.destroyBlock(new BlockPos((int) ((Math.floor(x)) + 0), (int) ((Math.floor(y)) + (-1)), (int) ((Math.floor(z)) + 0)), false);
		}
	}
}
