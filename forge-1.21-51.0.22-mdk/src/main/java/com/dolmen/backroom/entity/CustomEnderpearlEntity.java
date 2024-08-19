package com.dolmen.backroom.entity;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomEnderpearlEntity extends ThrownEnderpearl {

    public CustomEnderpearlEntity(EntityType<? extends ThrownEnderpearl> type, Level world) {
        super(type, world);
    }

    public CustomEnderpearlEntity(Level world, LivingEntity thrower) {
        super(world, thrower);
    }

    @Override
    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide) {
            this.level().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundSource.PLAYERS, 1.0F, 1.0F);
            this.discard();
        }
    }

    @Override
    public void tick() {
        super.tick();
        this.setNoGravity(true); // Disable gravity

        if (this.isInWater()) {
            this.setDeltaMovement(this.getDeltaMovement().multiply(0.8, 0.8, 0.8)); // Adjust motion in water
        }
    }

    @OnlyIn(Dist.CLIENT)
    public void handleEntityEvent(byte id) {
        if (id == 3) {
            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(ParticleTypes.PORTAL, this.getX(), this.getY(), this.getZ(), this.random.nextGaussian() * 0.05D, this.random.nextGaussian() * 0.05D, this.random.nextGaussian() * 0.05D);
            }
        }
    }

    @Override
    public ItemStack getItem() {
        return new ItemStack(Items.ENDER_PEARL);
    }
}
