
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cityaddons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.cityaddons.world.features.lakes.PoopFeature;
import net.mcreator.cityaddons.world.features.lakes.OilFeature;
import net.mcreator.cityaddons.CityAddonsMod;

@Mod.EventBusSubscriber
public class CityAddonsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CityAddonsMod.MODID);
	public static final RegistryObject<Feature<?>> POOP = REGISTRY.register("poop", PoopFeature::feature);
	public static final RegistryObject<Feature<?>> OIL = REGISTRY.register("oil", OilFeature::feature);
}
