package com.dolmen.backroom.block.etage1.panneau;

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

public class PanneauTriangleBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PanneauTriangleBlock() {
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

    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(0, 1, 15, 16, 2, 16),
            Block.box(0.58333, 2, 15, 15.41667, 3, 16),
            Block.box(1.16667, 3, 15, 14.83333, 4, 16),
            Block.box(1.75, 4, 15, 14.25, 5, 16),
            Block.box(2.33333, 5, 15, 13.66667, 6, 16),
            Block.box(2.91667, 6, 15, 13.08333, 7, 16),
            Block.box(3.5, 7, 15, 12.5, 8, 16),
            Block.box(4.08333, 8, 15, 11.91667, 9, 16),
            Block.box(4.66667, 9, 15, 11.33333, 10, 16),
            Block.box(5.25, 10, 15, 10.75, 11, 16),
            Block.box(5.83333, 11, 15, 10.16667, 12, 16),
            Block.box(6.41667, 12, 15, 9.58333, 13, 16),
            Block.box(7, 13, 15, 9, 14, 16),
            Block.box(7.58333, 14, 15, 8.41667, 15, 16)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(0, 1, 0, 16, 2, 1),
            Block.box(0.58333, 2, 0, 15.41667, 3, 1),
            Block.box(1.16667, 3, 0, 14.83333, 4, 1),
            Block.box(1.75, 4, 0, 14.25, 5, 1),
            Block.box(2.33333, 5, 0, 13.66667, 6, 1),
            Block.box(2.91667, 6, 0, 13.08333, 7, 1),
            Block.box(3.5, 7, 0, 12.5, 8, 1),
            Block.box(4.08333, 8, 0, 11.91667, 9, 1),
            Block.box(4.66667, 9, 0, 11.33333, 10, 1),
            Block.box(5.25, 10, 0, 10.75, 11, 1),
            Block.box(5.83333, 11, 0, 10.16667, 12, 1),
            Block.box(6.41667, 12, 0, 9.58333, 13, 1),
            Block.box(7, 13, 0, 9, 14, 1),
            Block.box(7.58333, 14, 0, 8.41667, 15, 1)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(15, 1, 0, 16, 2, 16),
            Block.box(15, 2, 0.58333, 16, 3, 15.41667),
            Block.box(15, 3, 1.16667, 16, 4, 14.83333),
            Block.box(15, 4, 1.75, 16, 5, 14.25),
            Block.box(15, 5, 2.33333, 16, 6, 13.66667),
            Block.box(15, 6, 2.91667, 16, 7, 13.08333),
            Block.box(15, 7, 3.5, 16, 8, 12.5),
            Block.box(15, 8, 4.08333, 16, 9, 11.91667),
            Block.box(15, 9, 4.66667, 16, 10, 11.33333),
            Block.box(15, 10, 5.25, 16, 11, 10.75),
            Block.box(15, 11, 5.83333, 16, 12, 10.16667),
            Block.box(15, 12, 6.41667, 16, 13, 9.58333),
            Block.box(15, 13, 7, 16, 14, 9),
            Block.box(15, 14, 7.58333, 16, 15, 8.41667)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 1, 0, 1, 2, 16),
            Block.box(0, 2, 0.58333, 1, 3, 15.41667),
            Block.box(0, 3, 1.16667, 1, 4, 14.83333),
            Block.box(0, 4, 1.75, 1, 5, 14.25),
            Block.box(0, 5, 2.33333, 1, 6, 13.66667),
            Block.box(0, 6, 2.91667, 1, 7, 13.08333),
            Block.box(0, 7, 3.5, 1, 8, 12.5),
            Block.box(0, 8, 4.08333, 1, 9, 11.91667),
            Block.box(0, 9, 4.66667, 1, 10, 11.33333),
            Block.box(0, 10, 5.25, 1, 11, 10.75),
            Block.box(0, 11, 5.83333, 1, 12, 10.16667),
            Block.box(0, 12, 6.41667, 1, 13, 9.58333),
            Block.box(0, 13, 7, 1, 14, 9),
            Block.box(0, 14, 7.58333, 1, 15, 8.41667)
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
