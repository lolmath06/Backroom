package com.dolmen.backroom.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class EauDamandeItem extends Item {
    public EauDamandeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(finishUsingItem(itemstack, world, player));
    }

    public ItemStack finishUsingItem(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide) {
            ((ServerLevel) world).sendParticles(ParticleTypes.SPLASH, player.getX(), player.getY() + player.getEyeHeight(), player.getZ(), 5, 0.5, 0.5, 0.5, 0.1);
        }
        player.playSound(SoundEvents.GENERIC_DRINK, 1.0F, 1.0F);
        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1));
        stack.shrink(1);
        return stack.isEmpty() ? ItemStack.EMPTY : stack;
    }
}
