package com.dolmen.backroom.entity.client;

import com.dolmen.backroom.entity.custom.DeathMothsEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DeathMothsRender extends MobRenderer<DeathMothsEntity, DeadMothModel<DeathMothsEntity>>{
    public DeathMothsRender(EntityRendererProvider.Context pContext) {
        super(pContext, new DeadMothModel<>(pContext.bakeLayer(ModModelLayers.DEATH_MOTHS_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(DeathMothsEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath("backroom", "textures/entity/death_moths.png");
    }

    @Override
    public void render(DeathMothsEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.scale(0.5F, 0.5F, 0.5F);
        pPoseStack.mulPose(Axis.YP.rotationDegrees(-90));

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}