package com.dolmen.backroom.block.etage0;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LustreManilla extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    // Define the shapes for each element in the JSON model
    private static final VoxelShape SHAPE_1 = Block.box(9.2044, 1.5, 7.60218, 10, 2.2956, 8.39782);
    private static final VoxelShape SHAPE_2 = Block.box(9.694, 2.2956, 7.60218, 10.944, 3.0912, 8.39782);
    private static final VoxelShape SHAPE_3 = Block.box(10.7044, 1.5, 7.60218, 13.7044, 2.2956, 8.39782);
    private static final VoxelShape SHAPE_4 = Block.box(13.2044, 0.7044, 7.60218, 15.2044, 1.5, 8.39782);
    private static final VoxelShape SHAPE_5 = Block.box(15.2044, 0.7044, 7.60218, 17.2044, 1.5, 8.39782);
    private static final VoxelShape SHAPE_6 = Block.box(16.7044, 1.5, 7.60218, 19.7044, 2.2956, 8.39782);
    private static final VoxelShape SHAPE_7 = Block.box(19.2044, 2.2956, 7.60218, 21.2044, 3.0912, 8.39782);
    private static final VoxelShape SHAPE_8 = Block.box(20.4088, 3.0912, 7.60218, 21.2044, 3.8868, 8.39782);
    private static final VoxelShape SHAPE_9 = Block.box(19.6132, 3.8868, 6.8066, 22, 4.3868, 9.1934);
    private static final VoxelShape SHAPE_10 = Block.box(20.4088, 4.3868, 7.60218, 21.2044, 6.3758, 8.39782);
    private static final VoxelShape SHAPE_11 = Block.box(7.60218, 1.5, 6, 8.39782, 2.2956, 6.7956);
    private static final VoxelShape SHAPE_12 = Block.box(7.60218, 2.2956, 5.056, 8.39782, 3.0912, 6.306);
    private static final VoxelShape SHAPE_13 = Block.box(7.60218, 1.5, 2.2956, 8.39782, 2.2956, 5.2956);
    private static final VoxelShape SHAPE_14 = Block.box(7.60218, 0.7044, 0.7956, 8.39782, 1.5, 2.7956);
    private static final VoxelShape SHAPE_15 = Block.box(7.60218, 0.7044, -1.2044, 8.39782, 1.5, 0.7956);
    private static final VoxelShape SHAPE_16 = Block.box(7.60218, 1.5, -3.7044, 8.39782, 2.2956, -0.7044);
    private static final VoxelShape SHAPE_17 = Block.box(7.60218, 2.2956, -5.2044, 8.39782, 3.0912, -3.2044);
    private static final VoxelShape SHAPE_18 = Block.box(7.60218, 3.0912, -5.2044, 8.39782, 3.8868, -4.4088);
    private static final VoxelShape SHAPE_19 = Block.box(6.8066, 3.8868, -6, 9.1934, 4.3868, -3.6132);
    private static final VoxelShape SHAPE_20 = Block.box(7.60218, 4.3868, -5.2044, 8.39782, 6.3758, -4.4088);
    private static final VoxelShape SHAPE_21 = Block.box(6, 1.5, 7.60218, 6.7956, 2.2956, 8.39782);
    private static final VoxelShape SHAPE_22 = Block.box(5.056, 2.2956, 7.60218, 6.306, 3.0912, 8.39782);
    private static final VoxelShape SHAPE_23 = Block.box(2.2956, 1.5, 7.60218, 5.2956, 2.2956, 8.39782);
    private static final VoxelShape SHAPE_24 = Block.box(0.7956, 0.7044, 7.60218, 2.7956, 1.5, 8.39782);
    private static final VoxelShape SHAPE_25 = Block.box(-1.2044, 0.7044, 7.60218, 0.7956, 1.5, 8.39782);
    private static final VoxelShape SHAPE_26 = Block.box(-3.7044, 1.5, 7.60218, -0.7044, 2.2956, 8.39782);
    private static final VoxelShape SHAPE_27 = Block.box(-5.2044, 2.2956, 7.60218, -3.2044, 3.0912, 8.39782);
    private static final VoxelShape SHAPE_28 = Block.box(-5.2044, 3.0912, 7.60218, -4.4088, 3.8868, 8.39782);
    private static final VoxelShape SHAPE_29 = Block.box(-6, 3.8868, 6.8066, -3.6132, 4.3868, 9.1934);
    private static final VoxelShape SHAPE_30 = Block.box(-5.2044, 4.3868, 7.60218, -4.4088, 6.3758, 8.39782);
    private static final VoxelShape SHAPE_31 = Block.box(7.60218, 1.5, 9.2044, 8.39782, 2.2956, 10);
    private static final VoxelShape SHAPE_32 = Block.box(7.60218, 2.2956, 9.694, 8.39782, 3.0912, 10.944);
    private static final VoxelShape SHAPE_33 = Block.box(7.60218, 1.5, 10.7044, 8.39782, 2.2956, 13.7044);
    private static final VoxelShape SHAPE_34 = Block.box(7.60218, 0.7044, 13.2044, 8.39782, 1.5, 15.2044);
    private static final VoxelShape SHAPE_35 = Block.box(7.60218, 0.7044, 15.2044, 8.39782, 1.5, 17.2044);
    private static final VoxelShape SHAPE_36 = Block.box(7.60218, 1.5, 16.7044, 8.39782, 2.2956, 19.7044);
    private static final VoxelShape SHAPE_37 = Block.box(7.60218, 2.2956, 19.2044, 8.39782, 3.0912, 21.2044);
    private static final VoxelShape SHAPE_38 = Block.box(7.60218, 3.0912, 20.4088, 8.39782, 3.8868, 21.2044);
    private static final VoxelShape SHAPE_39 = Block.box(6.8066, 3.8868, 19.6132, 9.1934, 4.3868, 22);
    private static final VoxelShape SHAPE_40 = Block.box(7.60218, 4.3868, 20.4088, 8.39782, 6.3758, 21.2044);
    private static final VoxelShape SHAPE_41 = Block.box(7.25, 0, 7.25, 8.75, 16, 8.75);

    // Combine all shapes into one
    private static final VoxelShape SHAPE = Shapes.or(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4, SHAPE_5, SHAPE_6, SHAPE_7, SHAPE_8, SHAPE_9, SHAPE_10, SHAPE_11, SHAPE_12, SHAPE_13, SHAPE_14, SHAPE_15, SHAPE_16, SHAPE_17, SHAPE_18, SHAPE_19, SHAPE_20, SHAPE_21, SHAPE_22, SHAPE_23, SHAPE_24, SHAPE_25, SHAPE_26, SHAPE_27, SHAPE_28, SHAPE_29, SHAPE_30, SHAPE_31, SHAPE_32, SHAPE_33, SHAPE_34, SHAPE_35, SHAPE_36, SHAPE_37, SHAPE_38, SHAPE_39, SHAPE_40, SHAPE_41);

    public LustreManilla() {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).strength(0.3f).lightLevel((state) -> 15)); // Setting light level to maximum (15)
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, true));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(LIT, true);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
