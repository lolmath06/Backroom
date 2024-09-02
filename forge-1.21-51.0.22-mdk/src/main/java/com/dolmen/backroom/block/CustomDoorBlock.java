package com.dolmen.backroom.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomDoorBlock extends DoorBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    private static final VoxelShape SHAPE_CLOSED_NORTH = Block.box(0, 0, 0, 16, 16, 3);
    private static final VoxelShape SHAPE_OPEN_NORTH = Block.box(14.5, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_CLOSED_SOUTH = Block.box(0, 0, 13, 16, 16, 16);
    private static final VoxelShape SHAPE_OPEN_SOUTH = Block.box(0, 0, 0, 1.5, 16, 16);
    private static final VoxelShape SHAPE_CLOSED_WEST = Block.box(0, 0, 0, 3, 16, 16);
    private static final VoxelShape SHAPE_OPEN_WEST = Block.box(0, 0, 0, 16, 16, 1.5);
    private static final VoxelShape SHAPE_CLOSED_EAST = Block.box(13, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_OPEN_EAST = Block.box(0, 0, 14.5, 16, 16, 16);

    public CustomDoorBlock() {
        super(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_DOOR).strength(3.0f, 3.0f).noOcclusion());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(OPEN, Boolean.FALSE)
                .setValue(HINGE, DoorHingeSide.LEFT)
                .setValue(POWERED, Boolean.FALSE)
                .setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        return context.getLevel().getBlockState(blockpos.above()).canBeReplaced(context) ? this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()) : null;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, HINGE, POWERED, HALF);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        boolean open = state.getValue(OPEN);
        switch (direction) {
            case NORTH:
            default:
                return open ? SHAPE_OPEN_NORTH : SHAPE_CLOSED_NORTH;
            case SOUTH:
                return open ? SHAPE_OPEN_SOUTH : SHAPE_CLOSED_SOUTH;
            case WEST:
                return open ? SHAPE_OPEN_WEST : SHAPE_CLOSED_WEST;
            case EAST:
                return open ? SHAPE_OPEN_EAST : SHAPE_CLOSED_EAST;
        }
    }
}