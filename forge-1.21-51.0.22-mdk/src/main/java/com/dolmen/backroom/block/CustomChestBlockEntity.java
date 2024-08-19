package com.dolmen.backroom.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomChestBlockEntity extends RandomizableContainerBlockEntity {
    private NonNullList<ItemStack> items = NonNullList.withSize(27, ItemStack.EMPTY);

    protected CustomChestBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public CustomChestBlockEntity(BlockPos pos, BlockState state) {
        this(CustomBlockEntities.CUSTOM_CHEST.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.backroom.box");
    }

    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory playerInventory) {
        return new ChestMenu(null, id, playerInventory, this, 27);
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    @Override
    public int getContainerSize() {
        return 27;
    }
}
