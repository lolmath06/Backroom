package com.dolmen.backroom.block.etage0.conduit;

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

public class conduit_daeration2 extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public conduit_daeration2() {
        super(Properties.ofFullCopy(Blocks.STONE).strength(-1.0F, 3600000.0F));
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

    // Voxel shapes for each direction
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(0, 11, 0, 1, 15, 16),
            Block.box(0, 5, 0, 1, 11, 5),
            Block.box(0, 5, 11, 1, 11, 16),
            Block.box(0, 15, 0, 16, 16, 16),
            Block.box(15, 1, 0, 16, 15, 16),
            Block.box(0, 1, 0, 1, 5, 16),
            Block.box(0, 0, 0, 16, 1, 16)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(15, 11, 0, 16, 15, 16),
            Block.box(15, 5, 11, 16, 11, 16),
            Block.box(15, 5, 0, 16, 11, 5),
            Block.box(0, 15, 0, 16, 16, 16),
            Block.box(0, 1, 0, 1, 15, 16),
            Block.box(15, 1, 0, 16, 5, 16),
            Block.box(0, 0, 0, 16, 1, 16)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(0, 11, 15, 16, 15, 16),
            Block.box(11, 5, 15, 16, 11, 16),
            Block.box(0, 5, 15, 5, 11, 16),
            Block.box(0, 15, 0, 16, 16, 16),
            Block.box(0, 1, 0, 16, 15, 1),
            Block.box(0, 1, 15, 16, 5, 16),
            Block.box(0, 0, 0, 16, 1, 16)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 11, 0, 16, 15, 1),
            Block.box(0, 5, 0, 5, 11, 1),
            Block.box(11, 5, 0, 16, 11, 1),
            Block.box(0, 15, 0, 16, 16, 16),
            Block.box(0, 1, 15, 16, 15, 16),
            Block.box(0, 1, 0, 16, 5, 1),
            Block.box(0, 0, 0, 16, 1, 16)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH:
            default:
                return SHAPE_NORTH;
            case SOUTH:
                return SHAPE_SOUTH;
            case WEST:
                return SHAPE_WEST;
            case EAST:
                return SHAPE_EAST;
        }
    }
}
