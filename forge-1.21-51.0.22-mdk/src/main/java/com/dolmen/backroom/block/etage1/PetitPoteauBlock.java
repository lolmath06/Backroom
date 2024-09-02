package com.dolmen.backroom.block.etage1;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PetitPoteauBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PetitPoteauBlock() {
        super(Properties.ofFullCopy(Blocks.STONE).strength(-1.0F, 3600000.0F).noOcclusion());
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // Define the voxel shapes for the block in all four directions
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(0, 0, 15, 16, 16, 16),
            Block.box(0, 0, 14, 16, 16, 15),
            Block.box(0, 0, 13, 16, 16, 14),
            Block.box(0.25, 0, 12.5, 15.75, 16, 13),
            Block.box(0.5, 0, 12.25, 15.5, 16, 12.5),
            Block.box(1, 0, 12.125, 15, 16, 12.25)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(0, 0, 0, 16, 16, 1),
            Block.box(0, 0, 1, 16, 16, 2),
            Block.box(0, 0, 2, 16, 16, 3),
            Block.box(0.25, 0, 3, 15.75, 16, 3.5),
            Block.box(0.5, 0, 3.5, 15.5, 16, 3.75),
            Block.box(1, 0, 3.75, 15, 16, 3.875)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(15, 0, 0, 16, 16, 16),
            Block.box(14, 0, 0, 15, 16, 16),
            Block.box(13, 0, 0, 14, 16, 16),
            Block.box(12.5, 0, 0.25, 13, 16, 15.75),
            Block.box(12.25, 0, 0.5, 12.5, 16, 15.5),
            Block.box(12.125, 0, 1, 12.25, 16, 15)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 0, 0, 1, 16, 16),
            Block.box(1, 0, 0, 2, 16, 16),
            Block.box(2, 0, 0, 3, 16, 16),
            Block.box(3, 0, 0.25, 3.5, 16, 15.75),
            Block.box(3.5, 0, 0.5, 3.75, 16, 15.5),
            Block.box(3.75, 0, 1, 3.875, 16, 15)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case SOUTH:
                return SHAPE_SOUTH;
            case WEST:
                return SHAPE_WEST;
            case EAST:
                return SHAPE_EAST;
            case NORTH:
            default:
                return SHAPE_NORTH;
        }
    }
}
