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

public class lampe_eteinte_etage1 extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Voxel shapes for each direction
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(7.95, 14.5, 3.95, 8.05, 16, 4.05),
            Block.box(7.95, 14.5, 11.95, 8.05, 16, 12.05),
            Block.box(7, 14, 1.15, 8, 14.5, 14.85),
            Block.box(8, 14, 1.15, 9, 14.5, 14.85),
            Block.box(8, 14, 1, 9, 14.5, 1.15),
            Block.box(7, 14, 1, 8, 14.5, 1.15),
            Block.box(8, 14, 14.85, 9, 14.5, 15),
            Block.box(7, 14, 14.85, 8, 14.5, 15)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(7.95, 14.5, 11.95, 8.05, 16, 12.05),
            Block.box(7.95, 14.5, 3.95, 8.05, 16, 4.05),
            Block.box(8, 14, 1.15, 9, 14.5, 14.85),
            Block.box(7, 14, 1.15, 8, 14.5, 14.85),
            Block.box(7, 14, 14.85, 8, 14.5, 15),
            Block.box(8, 14, 14.85, 9, 14.5, 15),
            Block.box(7, 14, 1, 8, 14.5, 1.15),
            Block.box(8, 14, 1, 9, 14.5, 1.15)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(3.95, 14.5, 7.95, 4.05, 16, 8.05),
            Block.box(11.95, 14.5, 7.95, 12.05, 16, 8.05),
            Block.box(1.15, 14, 7, 14.85, 14.5, 8),
            Block.box(1.15, 14, 8, 14.85, 14.5, 9),
            Block.box(1, 14, 8, 1.15, 14.5, 9),
            Block.box(1, 14, 7, 1.15, 14.5, 8),
            Block.box(14.85, 14, 8, 15, 14.5, 9),
            Block.box(14.85, 14, 7, 15, 14.5, 8)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(11.95, 14.5, 7.95, 12.05, 16, 8.05),
            Block.box(3.95, 14.5, 7.95, 4.05, 16, 8.05),
            Block.box(1.15, 14, 8, 14.85, 14.5, 9),
            Block.box(1.15, 14, 7, 14.85, 14.5, 8),
            Block.box(14.85, 14, 7, 15, 14.5, 8),
            Block.box(14.85, 14, 8, 15, 14.5, 9),
            Block.box(1, 14, 7, 1.15, 14.5, 8),
            Block.box(1, 14, 8, 1.15, 14.5, 9)
    );

    public lampe_eteinte_etage1() {
        super(Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(-1.0F, 3600000.0F));
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
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
