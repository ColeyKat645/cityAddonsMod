
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cityaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cityaddons.block.entity.WaterToPoopConverterBlockEntity;
import net.mcreator.cityaddons.CityAddonsMod;

public class CityAddonsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			CityAddonsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WATER_TO_POOP_CONVERTER = register("water_to_poop_converter",
			CityAddonsModBlocks.WATER_TO_POOP_CONVERTER, WaterToPoopConverterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
