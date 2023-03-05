
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cityaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cityaddons.item.PoopItem;
import net.mcreator.cityaddons.item.OilItem;
import net.mcreator.cityaddons.CityAddonsMod;

public class CityAddonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CityAddonsMod.MODID);
	public static final RegistryObject<Item> POOP_BUCKET = REGISTRY.register("poop_bucket", () -> new PoopItem());
	public static final RegistryObject<Item> WATER_TO_POOP_CONVERTER = block(CityAddonsModBlocks.WATER_TO_POOP_CONVERTER,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OIL_BUCKET = REGISTRY.register("oil_bucket", () -> new OilItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
