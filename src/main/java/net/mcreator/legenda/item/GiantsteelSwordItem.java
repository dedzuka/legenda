
package net.mcreator.legenda.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.legenda.LegendaModElements;

@LegendaModElements.ModElement.Tag
public class GiantsteelSwordItem extends LegendaModElements.ModElement {
	@ObjectHolder("legenda:giantsteel_sword")
	public static final Item block = null;
	public GiantsteelSwordItem(LegendaModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GigantsSteelItem.block, (int) (1)));
			}
		}, 3, -3.5f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("giantsteel_sword"));
	}
}
