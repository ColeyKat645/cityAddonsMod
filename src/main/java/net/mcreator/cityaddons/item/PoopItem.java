
package net.mcreator.cityaddons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.cityaddons.init.CityAddonsModFluids;

public class PoopItem extends BucketItem {
	public PoopItem() {
		super(CityAddonsModFluids.POOP,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
