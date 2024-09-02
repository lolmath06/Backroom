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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Cable2Block extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Define the VoxelShape based on the JSON model
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(7.3, 13.8, 0, 8.7, 15.2, 16),
            Block.box(0, 13.8, 7.3, 8, 15.2, 8.7)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(7.3, 13.8, 0, 8.7, 15.2, 16),
            Block.box(8, 13.8, 7.3, 16, 15.2, 8.7)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(0, 13.8, 7.3, 16, 15.2, 8.7),
            Block.box(7.3, 13.8, 8, 8.7, 15.2, 16)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 13.8, 7.3, 16, 15.2, 8.7),
            Block.box(7.3, 13.8, 0, 8.7, 15.2, 8)
    );

    public Cable2Block() {
        super(Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(1.0f));
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
