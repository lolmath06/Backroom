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

public class conduit_daeration3 extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public conduit_daeration3() {
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
            Block.box(11, 5, 0, 12, 11, 16),
            Block.box(4, 11, 0, 12, 12, 16),
            Block.box(4, 5, 0, 5, 11, 16),
            Block.box(4, 4, 0, 12, 5, 16)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(4, 5, 0, 5, 11, 16),
            Block.box(4, 11, 0, 12, 12, 16),
            Block.box(11, 5, 0, 12, 11, 16),
            Block.box(4, 4, 0, 12, 5, 16)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(0, 5, 11, 16, 11, 12),
            Block.box(0, 11, 4, 16, 12, 12),
            Block.box(0, 5, 4, 16, 11, 5),
            Block.box(0, 4, 4, 16, 5, 12)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 5, 4, 16, 11, 5),
            Block.box(0, 11, 4, 16, 12, 12),
            Block.box(0, 5, 11, 16, 11, 12),
            Block.box(0, 4, 4, 16, 5, 12)
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
