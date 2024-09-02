package com.dolmen.backroom.block.etage0.conduit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VentBlock1 extends TrapDoorBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;

    // Shapes based on the new model information
    private static final VoxelShape SHAPE_CLOSED_NORTH = Block.box(4, 4, 15, 12, 12, 16);
    private static final VoxelShape SHAPE_OPEN_NORTH = Shapes.or(
            Block.box(4, 4, 15, 12, 5, 16),
            Block.box(4, 5, 15, 5, 11, 16),
            Block.box(4, 11, 15, 12, 12, 16),
            Block.box(11, 5, 15, 12, 11, 16),
            Block.box(5, 10.25, 9, 11, 11, 15)
    );

    private static final VoxelShape SHAPE_CLOSED_SOUTH = Block.box(4, 4, 0, 12, 12, 1);
    private static final VoxelShape SHAPE_OPEN_SOUTH = Shapes.or(
            Block.box(4, 4, 0, 12, 5, 1),
            Block.box(4, 5, 0, 5, 11, 1),
            Block.box(4, 11, 0, 12, 12, 1),
            Block.box(11, 5, 0, 12, 11, 1),
            Block.box(5, 10.25, 1, 11, 11, 7)
    );

    private static final VoxelShape SHAPE_CLOSED_WEST = Block.box(15, 4, 4, 16, 12, 12);
    private static final VoxelShape SHAPE_OPEN_WEST = Shapes.or(
            Block.box(15, 4, 4, 16, 5, 12),
            Block.box(15, 5, 4, 16, 11, 5),
            Block.box(15, 11, 4, 16, 12, 12),
            Block.box(15, 5, 11, 16, 11, 12),
            Block.box(9, 10.25, 5, 15, 11, 11)
    );

    private static final VoxelShape SHAPE_CLOSED_EAST = Block.box(0, 4, 4, 1, 12, 12);
    private static final VoxelShape SHAPE_OPEN_EAST = Shapes.or(
            Block.box(0, 4, 4, 1, 5, 12),
            Block.box(0, 5, 4, 1, 11, 5),
            Block.box(0, 11, 4, 1, 12, 12),
            Block.box(0, 5, 11, 1, 11, 12),
            Block.box(1, 10.25, 5, 7, 11, 11)
    );

    public VentBlock1() {
        super(BlockSetType.ACACIA, Properties.ofFullCopy(Blocks.ACACIA_TRAPDOOR).strength(-1.0F, 3600000.0F).noOcclusion());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(OPEN, Boolean.FALSE)
                .setValue(POWERED, Boolean.FALSE)
                .setValue(WATERLOGGED, Boolean.FALSE)
                .setValue(HALF, Half.BOTTOM));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        FluidState fluidstate = context.getLevel().getFluidState(blockpos);
        Direction direction = context.getHorizontalDirection().getOpposite();
        return this.defaultBlockState().setValue(FACING, direction)
                .setValue(OPEN, Boolean.FALSE)
                .setValue(POWERED, Boolean.FALSE)
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER)
                .setValue(HALF, context.getClickLocation().y - blockpos.getY() > 0.5D ? Half.TOP : Half.BOTTOM);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, WATERLOGGED, HALF);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        boolean open = state.getValue(OPEN);

        switch (direction) {
            case SOUTH:
                return open ? SHAPE_OPEN_SOUTH : SHAPE_CLOSED_SOUTH;
            case WEST:
                return open ? SHAPE_OPEN_WEST : SHAPE_CLOSED_WEST;
            case EAST:
                return open ? SHAPE_OPEN_EAST : SHAPE_CLOSED_EAST;
            case NORTH:
            default:
                return open ? SHAPE_OPEN_NORTH : SHAPE_CLOSED_NORTH;
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
