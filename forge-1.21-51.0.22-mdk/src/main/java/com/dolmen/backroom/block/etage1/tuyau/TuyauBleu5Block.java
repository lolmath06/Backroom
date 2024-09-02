package com.dolmen.backroom.block.etage1.tuyau;

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
import net.minecraft.world.phys.shapes.VoxelShape;

public class TuyauBleu5Block extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Voxel shapes for each direction
    private static final VoxelShape SHAPE_NORTH = Block.box(5.5, 8, 0, 10.5, 13, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.box(5.5, 8, 0, 10.5, 13, 16);
    private static final VoxelShape SHAPE_WEST = Block.box(0, 8, 5.5, 16, 13, 10.5);
    private static final VoxelShape SHAPE_EAST = Block.box(0, 8, 5.5, 16, 13, 10.5);

    public TuyauBleu5Block() {
        super(Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(3.0F).noOcclusion());
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
