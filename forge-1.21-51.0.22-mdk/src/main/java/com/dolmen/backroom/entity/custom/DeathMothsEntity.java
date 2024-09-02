package com.dolmen.backroom.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;

public class DeathMothsEntity extends Monster {
    private boolean isAggressive;
    private String animationState = "vol";

    public DeathMothsEntity(EntityType<? extends Monster> type, Level level) {
        super(type, level);
        this.isAggressive = false;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 4.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomFlyingGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new HurtByTargetGoal(this).setAlertOthers());

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    @Override
    public void setTarget(@javax.annotation.Nullable LivingEntity entity) {
        if (entity != null && !isAggressive) {
            this.isAggressive = true;
            this.animationState = "attack";
            this.playSound(SoundEvents.BEE_STING, 1.0F, 1.0F);
        }
        super.setTarget(entity);
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (!this.level().isClientSide) {
            LivingEntity attacker = source.getEntity() instanceof LivingEntity ? (LivingEntity) source.getEntity() : null;
            if (attacker != null) {
                this.setTarget(attacker);
            }
        }
        return super.hurt(source, amount);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.isAggressive) {
            this.goalSelector.removeGoal(new RandomLookAroundGoal(this));
        }

        updateAnimationState();
    }

    private void updateAnimationState() {
        boolean nearWall = false;
        BlockPos currentPos = this.blockPosition();

        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                for (int y = 0; y <= 4; y++) {
                    BlockPos checkPos = currentPos.offset(x, y, z);
                    BlockState blockState = this.level().getBlockState(checkPos);
                    if (blockState.is(Blocks.STONE) || blockState.is(Blocks.DIRT)) {
                        nearWall = true;
                        break;
                    }
                }
                if (nearWall) break;
            }
            if (nearWall) break;
        }

        if (nearWall) {
            this.animationState = "rester_immobile_mure";
        } else {
            this.animationState = "rester_immobile_sol";
        }
    }

    public String getAnimationState() {
        return this.animationState;
    }
}
