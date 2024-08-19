package com.dolmen.backroom.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class CustomChestBlock extends BarrelBlock {
    public CustomChestBlock() {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)
                .strength(1.0F).sound(SoundType.WOOD));
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CustomChestBlockEntity(pos, state);
    }

    public InteractionResult use(BlockState state, Level world, BlockPos pos, ServerPlayer player, InteractionHand hand, BlockHitResult hit) {
        if (world.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            MenuProvider menuProvider = this.getMenuProvider(state, world, pos);
            if (menuProvider != null) {
                player.openMenu(menuProvider);
            }
            return InteractionResult.CONSUME;
        }
    }

    @Nullable
    @Override
    public MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        return blockEntity instanceof CustomChestBlockEntity ? (MenuProvider) blockEntity : null;
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CustomChestBlockEntity) {
                Containers.dropContents(world, pos, (CustomChestBlockEntity) blockEntity);
                world.updateNeighbourForOutputSignal(pos, this);
            }
            super.onRemove(state, world, pos, newState, isMoving);
        }
    }
}