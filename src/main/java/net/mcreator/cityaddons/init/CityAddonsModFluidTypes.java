
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cityaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.cityaddons.fluid.types.PoopFluidType;
import net.mcreator.cityaddons.fluid.types.OilFluidType;
import net.mcreator.cityaddons.CityAddonsMod;

public class CityAddonsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CityAddonsMod.MODID);
	public static final RegistryObject<FluidType> POOP_TYPE = REGISTRY.register("poop", () -> new PoopFluidType());
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
}
