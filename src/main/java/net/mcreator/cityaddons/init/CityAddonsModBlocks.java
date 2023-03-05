
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cityaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cityaddons.block.WaterToPoopConverterBlock;
import net.mcreator.cityaddons.block.PoopBlock;
import net.mcreator.cityaddons.block.OilBlock;
import net.mcreator.cityaddons.CityAddonsMod;

public class CityAddonsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CityAddonsMod.MODID);
	public static final RegistryObject<Block> POOP = REGISTRY.register("poop", () -> new PoopBlock());
	public static final RegistryObject<Block> WATER_TO_POOP_CONVERTER = REGISTRY.register("water_to_poop_converter",
			() -> new WaterToPoopConverterBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
}
