package com.dolmen.backroom.block.etage0;

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

public class CrackedBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public CrackedBlock() {
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

    // Define the shapes excluding the center crack
    private static final VoxelShape SHAPE_NORTH = Shapes.or(
            Shapes.box(0.0, 0.0, 0.0, 0.405, 1.0, 1.0),
            Shapes.box(0.595, 0.0, 0.0, 1.0, 1.0, 1.0)
    );
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(
            Shapes.box(0.0, 0.0, 0.0, 0.405, 1.0, 1.0),
            Shapes.box(0.595, 0.0, 0.0, 1.0, 1.0, 1.0)
    );
    private static final VoxelShape SHAPE_WEST = Shapes.or(
            Shapes.box(0.0, 0.0, 0.0, 1.0, 1.0, 0.405),
            Shapes.box(0.0, 0.0, 0.595, 1.0, 1.0, 1.0)
    );
    private static final VoxelShape SHAPE_EAST = Shapes.or(
            Shapes.box(0.0, 0.0, 0.0, 1.0, 1.0, 0.405),
            Shapes.box(0.0, 0.0, 0.595, 1.0, 1.0, 1.0)
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
