
package net.mcreator.cityaddons.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.cityaddons.init.CityAddonsModItems;
import net.mcreator.cityaddons.init.CityAddonsModFluids;
import net.mcreator.cityaddons.init.CityAddonsModFluidTypes;
import net.mcreator.cityaddons.init.CityAddonsModBlocks;

public abstract class PoopFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CityAddonsModFluidTypes.POOP_TYPE.get(),
			() -> CityAddonsModFluids.POOP.get(), () -> CityAddonsModFluids.FLOWING_POOP.get()).explosionResistance(100f).tickRate(15)
			.bucket(() -> CityAddonsModItems.POOP_BUCKET.get()).block(() -> (LiquidBlock) CityAddonsModBlocks.POOP.get());

	private PoopFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends PoopFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PoopFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
