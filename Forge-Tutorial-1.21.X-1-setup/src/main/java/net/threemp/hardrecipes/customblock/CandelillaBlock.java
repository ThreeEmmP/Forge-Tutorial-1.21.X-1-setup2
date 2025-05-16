package net.threemp.hardrecipes.customblock;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CandelillaBlock extends TallGrassBlock {

    public CandelillaBlock(Properties p_57318_) {
        super(p_57318_);
    }

    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.SAND) || pState.is(BlockTags.DIRT) || pState.is(Blocks.GRASS_BLOCK);
    }
}
