package com.dolmen.backroom.block.etage0.conduit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class conduit_daeration extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public conduit_daeration() {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(-1.0F, 3600000.0F));
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

    private static final VoxelShape SHAPE_TOP_NORTH = Block.box(0, 15, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_BOTTOM_NORTH = Block.box(0, 0, 0, 16, 1, 16);
    private static final VoxelShape SHAPE_LEFT_NORTH = Block.box(0, 1, 0, 1, 15, 16);
    private static final VoxelShape SHAPE_RIGHT_NORTH = Block.box(15, 1, 0, 16, 15, 16);

    private static final VoxelShape SHAPE_TOP_SOUTH = Block.box(0, 15, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_BOTTOM_SOUTH = Block.box(0, 0, 0, 16, 1, 16);
    private static final VoxelShape SHAPE_LEFT_SOUTH = Block.box(0, 1, 0, 1, 15, 16);
    private static final VoxelShape SHAPE_RIGHT_SOUTH = Block.box(15, 1, 0, 16, 15, 16);

    private static final VoxelShape SHAPE_TOP_WEST = Block.box(0, 15, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_BOTTOM_WEST = Block.box(0, 0, 0, 16, 1, 16);
    private static final VoxelShape SHAPE_LEFT_WEST = Block.box(0, 1, 0, 1, 15, 16);
    private static final VoxelShape SHAPE_RIGHT_WEST = Block.box(15, 1, 0, 16, 15, 16);

    private static final VoxelShape SHAPE_TOP_EAST = Block.box(0, 15, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_BOTTOM_EAST = Block.box(0, 0, 0, 16, 1, 16);
    private static final VoxelShape SHAPE_LEFT_EAST = Block.box(0, 1, 0, 1, 15, 16);
    private static final VoxelShape SHAPE_RIGHT_EAST = Block.box(15, 1, 0, 16, 15, 16);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case SOUTH:
                return Shapes.or(SHAPE_TOP_SOUTH, SHAPE_BOTTOM_SOUTH, SHAPE_LEFT_SOUTH, SHAPE_RIGHT_SOUTH);
            case WEST:
                return Shapes.or(SHAPE_TOP_WEST, SHAPE_BOTTOM_WEST, SHAPE_LEFT_WEST, SHAPE_RIGHT_WEST);
            case EAST:
                return Shapes.or(SHAPE_TOP_EAST, SHAPE_BOTTOM_EAST, SHAPE_LEFT_EAST, SHAPE_RIGHT_EAST);
            case NORTH:
            default:
                return Shapes.or(SHAPE_TOP_NORTH, SHAPE_BOTTOM_NORTH, SHAPE_LEFT_NORTH, SHAPE_RIGHT_NORTH);
        }
    }
}
