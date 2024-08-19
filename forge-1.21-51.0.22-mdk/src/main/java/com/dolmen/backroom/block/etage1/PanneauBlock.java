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

public class PanneauBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PanneauBlock() {
        super(Properties.ofFullCopy(Blocks.STONE).strength(1.5f, 6.0f));
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
            Block.box(6, 0, 15, 10, 16, 16),
            Block.box(10, 1, 15, 12, 15, 16),
            Block.box(4, 1, 15, 6, 15, 16),
            Block.box(2, 2, 15, 4, 14, 16),
            Block.box(12, 2, 15, 14, 14, 16),
            Block.box(14, 4, 15, 15, 12, 16),
            Block.box(1, 4, 15, 2, 12, 16),
            Block.box(15, 6, 15, 16, 10, 16),
            Block.box(0, 6, 15, 1, 10, 16)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(6, 0, 0, 10, 16, 1),
            Block.box(4, 1, 0, 6, 15, 1),
            Block.box(10, 1, 0, 12, 15, 1),
            Block.box(12, 2, 0, 14, 14, 1),
            Block.box(2, 2, 0, 4, 14, 1),
            Block.box(1, 4, 0, 2, 12, 1),
            Block.box(14, 4, 0, 15, 12, 1),
            Block.box(0, 6, 0, 1, 10, 1),
            Block.box(15, 6, 0, 16, 10, 1)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(15, 0, 6, 16, 16, 10),
            Block.box(15, 1, 4, 16, 15, 6),
            Block.box(15, 1, 10, 16, 15, 12),
            Block.box(15, 2, 2, 16, 14, 4),
            Block.box(15, 2, 12, 16, 14, 14),
            Block.box(15, 4, 1, 16, 12, 2),
            Block.box(15, 4, 14, 16, 12, 15),
            Block.box(15, 6, 0, 16, 10, 1),
            Block.box(15, 6, 15, 16, 10, 16)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 0, 6, 1, 16, 10),
            Block.box(0, 1, 10, 1, 15, 12),
            Block.box(0, 1, 4, 1, 15, 6),
            Block.box(0, 2, 12, 1, 14, 14),
            Block.box(0, 2, 2, 1, 14, 4),
            Block.box(0, 4, 14, 1, 12, 15),
            Block.box(0, 4, 1, 1, 12, 2),
            Block.box(0, 6, 15, 1, 10, 16),
            Block.box(0, 6, 0, 1, 10, 1)
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
