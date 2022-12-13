
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magnificentexpansion.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MagnificentExpansionModTabs {
	public static CreativeModeTab TAB_MAGNIFICENT_MOD;
	public static CreativeModeTab TAB_TROLL;

	public static void load() {
		TAB_MAGNIFICENT_MOD = new CreativeModeTab("tabmagnificent_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AMETHYST_CLUSTER);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_TROLL = new CreativeModeTab("tabtroll") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CREEPER_WALL_HEAD);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
