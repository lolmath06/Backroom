package com.dolmen.backroom.event;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.entity.ModEntities;
import com.dolmen.backroom.entity.client.DeathMothsRender;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BackroomMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.CUSTOM_ENDER_PEARL.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(ModEntities.DEATH_MOTHS.get(), DeathMothsRender::new);
    }
}
