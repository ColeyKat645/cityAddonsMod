
package net.mcreator.cityaddons.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cityaddons.procedures.PoopMobplayerCollidesBlockProcedure;
import net.mcreator.cityaddons.init.CityAddonsModFluids;

public class PoopBlock extends LiquidBlock {
	public PoopBlock() {
		super(() -> CityAddonsModFluids.POOP.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		PoopMobplayerCollidesBlockProcedure.execute(entity);
	}
}
