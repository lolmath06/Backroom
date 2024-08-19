package com.dolmen.backroom.block.etage1.rampe;

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

public class RampeBlock4 extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public RampeBlock4() {
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

    // Define voxel shapes based on the JSON data for each direction
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Shapes.box(0.0, 10.6667 / 16.0, 0.0, 16.0 / 16.0, 16.0 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 9.60004 / 16.0, 2.0 / 16.0, 16.0 / 16.0, 10.6667 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 8.53344 / 16.0, 5.0 / 16.0, 16.0 / 16.0, 9.6001 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 7.46684 / 16.0, 8.0 / 16.0, 16.0 / 16.0, 8.5335 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 6.40024 / 16.0, 11.0 / 16.0, 16.0 / 16.0, 7.4669 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 5.3335 / 16.0, 14.0 / 16.0, 16.0 / 16.0, 6.4003 / 16.0, 16.0 / 16.0)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Shapes.box(0.0, 10.6667 / 16.0, 0.0, 16.0 / 16.0, 16.0 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 9.60004 / 16.0, 0.0, 16.0 / 16.0, 10.6667 / 16.0, 14.0 / 16.0),
            Shapes.box(0.0, 8.53344 / 16.0, 0.0, 16.0 / 16.0, 9.6001 / 16.0, 11.0 / 16.0),
            Shapes.box(0.0, 7.46684 / 16.0, 0.0, 16.0 / 16.0, 8.5335 / 16.0, 8.0 / 16.0),
            Shapes.box(0.0, 6.40024 / 16.0, 0.0, 16.0 / 16.0, 7.4669 / 16.0, 5.0 / 16.0),
            Shapes.box(0.0, 5.3335 / 16.0, 0.0, 16.0 / 16.0, 6.4003 / 16.0, 2.0 / 16.0)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Shapes.box(0.0, 10.6667 / 16.0, 0.0, 16.0 / 16.0, 16.0 / 16.0, 16.0 / 16.0),
            Shapes.box(2.0 / 16.0, 9.60004 / 16.0, 0.0, 16.0 / 16.0, 10.6667 / 16.0, 16.0 / 16.0),
            Shapes.box(5.0 / 16.0, 8.53344 / 16.0, 0.0, 16.0 / 16.0, 9.6001 / 16.0, 16.0 / 16.0),
            Shapes.box(8.0 / 16.0, 7.46684 / 16.0, 0.0, 16.0 / 16.0, 8.5335 / 16.0, 16.0 / 16.0),
            Shapes.box(11.0 / 16.0, 6.40024 / 16.0, 0.0, 16.0 / 16.0, 7.4669 / 16.0, 16.0 / 16.0),
            Shapes.box(14.0 / 16.0, 5.3335 / 16.0, 0.0, 16.0 / 16.0, 6.4003 / 16.0, 16.0 / 16.0)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Shapes.box(0.0, 10.6667 / 16.0, 0.0, 16.0 / 16.0, 16.0 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 9.60004 / 16.0, 0.0, 14.0 / 16.0, 10.6667 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 8.53344 / 16.0, 0.0, 11.0 / 16.0, 9.6001 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 7.46684 / 16.0, 0.0, 8.0 / 16.0, 8.5335 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 6.40024 / 16.0, 0.0, 5.0 / 16.0, 7.4669 / 16.0, 16.0 / 16.0),
            Shapes.box(0.0, 5.3335 / 16.0, 0.0, 2.0 / 16.0, 6.4003 / 16.0, 16.0 / 16.0)
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
