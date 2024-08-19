package com.dolmen.backroom.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.EnderpearlItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class InfiniteEnderPearlItem extends EnderpearlItem {

    public InfiniteEnderPearlItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        player.getCooldowns().addCooldown(this, 20);

        if (!world.isClientSide) {
            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(world, player);
            thrownEnderpearl.setItem(itemStack);
            thrownEnderpearl.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);

            world.addFreshEntity(thrownEnderpearl);

            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundSource.NEUTRAL, 1.0F, 1.0F);

            return InteractionResultHolder.success(itemStack);
        }

        return InteractionResultHolder.pass(itemStack);
    }
}