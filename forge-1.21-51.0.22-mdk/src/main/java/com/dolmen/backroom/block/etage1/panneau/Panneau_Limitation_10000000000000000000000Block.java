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

public class Panneau_Limitation_10000000000000000000000Block extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public Panneau_Limitation_10000000000000000000000Block() {
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
            Block.box(-10, 0, 15, 26, 16, 16),
            Block.box(-12, 1, 15, -10, 15, 16),
            Block.box(-14, 2, 15, -12, 14, 16),
            Block.box(-15, 4, 15, -14, 12, 16),
            Block.box(-16, 6, 15, -15, 10, 16),
            Block.box(26, 1, 15, 28, 15, 16),
            Block.box(28, 2, 15, 30, 14, 16),
            Block.box(30, 4, 15, 31, 12, 16),
            Block.box(31, 6, 15, 32, 10, 16)
    );

    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Block.box(-10, 0, 0, 26, 16, 1),
            Block.box(-12, 1, 0, -10, 15, 1),
            Block.box(-14, 2, 0, -12, 14, 1),
            Block.box(-15, 4, 0, -14, 12, 1),
            Block.box(-16, 6, 0, -15, 10, 1),
            Block.box(26, 1, 0, 28, 15, 1),
            Block.box(28, 2, 0, 30, 14, 1),
            Block.box(30, 4, 0, 31, 12, 1),
            Block.box(31, 6, 0, 32, 10, 1)
    );

    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Block.box(15, 0, -10, 16, 16, 26),
            Block.box(15, 1, -12, 16, 15, -10),
            Block.box(15, 2, -14, 16, 14, -12),
            Block.box(15, 4, -15, 16, 12, -14),
            Block.box(15, 6, -16, 16, 10, -15),
            Block.box(15, 1, 26, 16, 15, 28),
            Block.box(15, 2, 28, 16, 14, 30),
            Block.box(15, 4, 30, 16, 12, 31),
            Block.box(15, 6, 31, 16, 10, 32)
    );

    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Block.box(0, 0, -10, 1, 16, 26),
            Block.box(0, 1, -12, 1, 15, -10),
            Block.box(0, 2, -14, 1, 14, -12),
            Block.box(0, 4, -15, 1, 12, -14),
            Block.box(0, 6, -16, 1, 10, -15),
            Block.box(0, 1, 26, 1, 15, 28),
            Block.box(0, 2, 28, 1, 14, 30),
            Block.box(0, 4, 30, 1, 12, 31),
            Block.box(0, 6, 31, 1, 10, 32)
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
