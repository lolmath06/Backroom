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

public class ChaiseManilla extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Define the shapes for each element in the JSON model
    private static final VoxelShape LEG1_NORTH = Block.box(3, 0, 3, 4, 6, 4);
    private static final VoxelShape LEG2_NORTH = Block.box(12, 0, 12, 13, 6, 13);
    private static final VoxelShape LEG3_NORTH = Block.box(12, 0, 3, 13, 6, 4);
    private static final VoxelShape LEG4_NORTH = Block.box(3, 0, 12, 4, 6, 13);
    private static final VoxelShape BACK_SUPPORT1_NORTH = Block.box(12, 7, 3, 13, 11, 4);
    private static final VoxelShape BACK_SUPPORT2_NORTH = Block.box(12, 7, 12, 13, 19, 13);
    private static final VoxelShape BACK_SUPPORT3_NORTH = Block.box(9, 7, 12, 10, 19, 13);
    private static final VoxelShape BACK_SUPPORT4_NORTH = Block.box(10.75, 7, 12, 11.25, 19, 13);
    private static final VoxelShape BACK_SUPPORT5_NORTH = Block.box(7.75, 7, 12, 8.25, 19, 13);
    private static final VoxelShape BACK_SUPPORT6_NORTH = Block.box(4.75, 7, 12, 5.25, 19, 13);
    private static final VoxelShape BACK_SUPPORT7_NORTH = Block.box(6, 7, 12, 7, 19, 13);
    private static final VoxelShape ARMREST_SUPPORT1_NORTH = Block.box(3, 7, 3, 4, 11, 4);
    private static final VoxelShape ARMREST_SUPPORT2_NORTH = Block.box(3, 7, 12, 4, 19, 13);
    private static final VoxelShape SEAT_NORTH = Block.box(3, 6, 3, 13, 7, 13);
    private static final VoxelShape ARMREST1_NORTH = Block.box(3, 10, 4, 4, 11, 12);
    private static final VoxelShape ARMREST2_NORTH = Block.box(12, 10, 4, 13, 11, 12);
    private static final VoxelShape HEADREST_NORTH = Block.box(3, 19, 12, 13, 20, 13);

    // SOUTH shapes
    private static final VoxelShape LEG1_SOUTH = Block.box(12, 0, 12, 13, 6, 13);
    private static final VoxelShape LEG2_SOUTH = Block.box(3, 0, 3, 4, 6, 4);
    private static final VoxelShape LEG3_SOUTH = Block.box(3, 0, 12, 4, 6, 13);
    private static final VoxelShape LEG4_SOUTH = Block.box(12, 0, 3, 13, 6, 4);
    private static final VoxelShape BACK_SUPPORT1_SOUTH = Block.box(3, 7, 12, 4, 11, 13);
    private static final VoxelShape BACK_SUPPORT2_SOUTH = Block.box(3, 7, 3, 4, 19, 4);
    private static final VoxelShape BACK_SUPPORT3_SOUTH = Block.box(6, 7, 3, 7, 19, 4);
    private static final VoxelShape BACK_SUPPORT4_SOUTH = Block.box(4.75, 7, 3, 5.25, 19, 4);
    private static final VoxelShape BACK_SUPPORT5_SOUTH = Block.box(7.75, 7, 3, 8.25, 19, 4);
    private static final VoxelShape BACK_SUPPORT6_SOUTH = Block.box(10.75, 7, 3, 11.25, 19, 4);
    private static final VoxelShape BACK_SUPPORT7_SOUTH = Block.box(9, 7, 3, 10, 19, 4);
    private static final VoxelShape ARMREST_SUPPORT1_SOUTH = Block.box(12, 7, 12, 13, 11, 13);
    private static final VoxelShape ARMREST_SUPPORT2_SOUTH = Block.box(12, 7, 3, 13, 19, 4);
    private static final VoxelShape SEAT_SOUTH = Block.box(3, 6, 3, 13, 7, 13);
    private static final VoxelShape ARMREST1_SOUTH = Block.box(12, 10, 4, 13, 11, 12);
    private static final VoxelShape ARMREST2_SOUTH = Block.box(3, 10, 4, 4, 11, 12);
    private static final VoxelShape HEADREST_SOUTH = Block.box(3, 19, 3, 13, 20, 4);

    // WEST shapes
    private static final VoxelShape LEG1_WEST = Block.box(3, 0, 12, 4, 6, 13);
    private static final VoxelShape LEG2_WEST = Block.box(12, 0, 3, 13, 6, 4);
    private static final VoxelShape LEG3_WEST = Block.box(3, 0, 3, 4, 6, 4);
    private static final VoxelShape LEG4_WEST = Block.box(12, 0, 12, 13, 6, 13);
    private static final VoxelShape BACK_SUPPORT1_WEST = Block.box(3, 7, 3, 4, 11, 4);
    private static final VoxelShape BACK_SUPPORT2_WEST = Block.box(12, 7, 3, 13, 19, 4);
    private static final VoxelShape BACK_SUPPORT3_WEST = Block.box(12, 7, 9, 13, 19, 10);
    private static final VoxelShape BACK_SUPPORT4_WEST = Block.box(12, 7, 10.75, 13, 19, 11.25);
    private static final VoxelShape BACK_SUPPORT5_WEST = Block.box(12, 7, 7.75, 13, 19, 8.25);
    private static final VoxelShape BACK_SUPPORT6_WEST = Block.box(12, 7, 4.75, 13, 19, 5.25);
    private static final VoxelShape BACK_SUPPORT7_WEST = Block.box(12, 7, 6, 13, 19, 7);
    private static final VoxelShape ARMREST_SUPPORT1_WEST = Block.box(3, 7, 12, 4, 11, 13);
    private static final VoxelShape ARMREST_SUPPORT2_WEST = Block.box(12, 7, 12, 13, 19, 13);
    private static final VoxelShape SEAT_WEST = Block.box(3, 6, 3, 13, 7, 13);
    private static final VoxelShape ARMREST1_WEST = Block.box(4, 10, 3, 12, 11, 4);
    private static final VoxelShape ARMREST2_WEST = Block.box(4, 10, 12, 12, 11, 13);
    private static final VoxelShape HEADREST_WEST = Block.box(12, 19, 3, 13, 20, 13);

    // EAST shapes
    private static final VoxelShape LEG1_EAST = Block.box(12, 0, 3, 13, 6, 4);
    private static final VoxelShape LEG2_EAST = Block.box(3, 0, 12, 4, 6, 13);
    private static final VoxelShape LEG3_EAST = Block.box(12, 0, 12, 13, 6, 13);
    private static final VoxelShape LEG4_EAST = Block.box(3, 0, 3, 4, 6, 4);
    private static final VoxelShape BACK_SUPPORT1_EAST = Block.box(12, 7, 12, 13, 11, 13);
    private static final VoxelShape BACK_SUPPORT2_EAST = Block.box(3, 7, 12, 4, 19, 13);
    private static final VoxelShape BACK_SUPPORT3_EAST = Block.box(3, 7, 6, 4, 19, 7);
    private static final VoxelShape BACK_SUPPORT4_EAST = Block.box(3, 7, 4.75, 4, 19, 5.25);
    private static final VoxelShape BACK_SUPPORT5_EAST = Block.box(3, 7, 7.75, 4, 19, 8.25);
    private static final VoxelShape BACK_SUPPORT6_EAST = Block.box(3, 7, 10.75, 4, 19, 11.25);
    private static final VoxelShape BACK_SUPPORT7_EAST = Block.box(3, 7, 9, 4, 19, 10);
    private static final VoxelShape ARMREST_SUPPORT1_EAST = Block.box(12, 7, 3, 13, 11, 4);
    private static final VoxelShape ARMREST_SUPPORT2_EAST = Block.box(3, 7, 3, 4, 19, 4);
    private static final VoxelShape SEAT_EAST = Block.box(3, 6, 3, 13, 7, 13);
    private static final VoxelShape ARMREST1_EAST = Block.box(4, 10, 3, 12, 11, 4);
    private static final VoxelShape ARMREST2_EAST = Block.box(4, 10, 12, 12, 11, 13);
    private static final VoxelShape HEADREST_EAST = Block.box(3, 19, 3, 4, 20, 13);

    public ChaiseManilla() {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0f, 3.0f));
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

    // Define combined shapes for each direction
    private static final VoxelShape SHAPE_NORTH = Shapes.or(LEG1_NORTH, LEG2_NORTH, LEG3_NORTH, LEG4_NORTH, BACK_SUPPORT1_NORTH, BACK_SUPPORT2_NORTH, BACK_SUPPORT3_NORTH, BACK_SUPPORT4_NORTH, BACK_SUPPORT5_NORTH, BACK_SUPPORT6_NORTH, BACK_SUPPORT7_NORTH, ARMREST_SUPPORT1_NORTH, ARMREST_SUPPORT2_NORTH, SEAT_NORTH, ARMREST1_NORTH, ARMREST2_NORTH, HEADREST_NORTH);
    private static final VoxelShape SHAPE_SOUTH = Shapes.or(LEG1_SOUTH, LEG2_SOUTH, LEG3_SOUTH, LEG4_SOUTH, BACK_SUPPORT1_SOUTH, BACK_SUPPORT2_SOUTH, BACK_SUPPORT3_SOUTH, BACK_SUPPORT4_SOUTH, BACK_SUPPORT5_SOUTH, BACK_SUPPORT6_SOUTH, BACK_SUPPORT7_SOUTH, ARMREST_SUPPORT1_SOUTH, ARMREST_SUPPORT2_SOUTH, SEAT_SOUTH, ARMREST1_SOUTH, ARMREST2_SOUTH, HEADREST_SOUTH);
    private static final VoxelShape SHAPE_WEST = Shapes.or(LEG1_WEST, LEG2_WEST, LEG3_WEST, LEG4_WEST, BACK_SUPPORT1_WEST, BACK_SUPPORT2_WEST, BACK_SUPPORT3_WEST, BACK_SUPPORT4_WEST, BACK_SUPPORT5_WEST, BACK_SUPPORT6_WEST, BACK_SUPPORT7_WEST, ARMREST_SUPPORT1_WEST, ARMREST_SUPPORT2_WEST, SEAT_WEST, ARMREST1_WEST, ARMREST2_WEST, HEADREST_WEST);
    private static final VoxelShape SHAPE_EAST = Shapes.or(LEG1_EAST, LEG2_EAST, LEG3_EAST, LEG4_EAST, BACK_SUPPORT1_EAST, BACK_SUPPORT2_EAST, BACK_SUPPORT3_EAST, BACK_SUPPORT4_EAST, BACK_SUPPORT5_EAST, BACK_SUPPORT6_EAST, BACK_SUPPORT7_EAST, ARMREST_SUPPORT1_EAST, ARMREST_SUPPORT2_EAST, SEAT_EAST, ARMREST1_EAST, ARMREST2_EAST, HEADREST_EAST);

}
