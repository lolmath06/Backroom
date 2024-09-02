package com.dolmen.backroom.block.etage0.conduit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class conduit_daeration3_1 extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    // Shapes based on the JSON model
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Block.box(11, 5, 0, 12, 11, 16),
            Block.box(4, 11, 0, 12, 12, 16),
            Block.box(4, 5, 0, 5, 11, 16),
            Block.box(4, 4, 0, 12, 5, 16),
            Block.box(0, 0, 0, 16, 4, 1),
            Block.box(0, 12, 0, 16, 16, 1),
            Block.box(0, 4, 0, 4, 12, 1),
            Block.box(12, 4, 0, 16, 12, 1)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(4, 5, 0, 5, 11, 16),
            Block.box(4, 4, 0, 12, 5, 16),
            Block.box(4, 11, 0, 12, 12, 16),
            Block.box(11, 5, 0, 12, 11, 16),
            Block.box(0, 0, 0, 16, 4, 1),
            Block.box(0, 12, 0, 16, 16, 1),
            Block.box(0, 4, 0, 4, 12, 1),
            Block.box(12, 4, 0, 16, 12, 1)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(15, 5, 4, 16, 11, 12),
            Block.box(15, 4, 4, 16, 5, 12),
            Block.box(15, 11, 4, 16, 12, 12),
            Block.box(15, 5, 11, 16, 11, 12),
            Block.box(0, 0, 0, 1, 4, 16),
            Block.box(0, 12, 0, 1, 16, 16),
            Block.box(0, 4, 0, 1, 12, 4),
            Block.box(0, 4, 12, 1, 12, 16)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 5, 4, 1, 11, 12),
            Block.box(0, 4, 4, 1, 5, 12),
            Block.box(0, 11, 4, 1, 12, 12),
            Block.box(0, 5, 11, 1, 11, 12),
            Block.box(15, 0, 0, 16, 4, 16),
            Block.box(15, 12, 0, 16, 16, 16),
            Block.box(15, 4, 0, 16, 12, 4),
            Block.box(15, 4, 12, 16, 12, 16)
    );

    public conduit_daeration3_1() {
        super(Properties.ofFullCopy(Blocks.IRON_BARS).strength(-1.0F, 3600000.0F).noOcclusion());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        FluidState fluidstate = context.getLevel().getFluidState(blockpos);
        Direction direction = context.getHorizontalDirection().getOpposite();
        return this.defaultBlockState().setValue(FACING, direction)
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
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

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }
}
