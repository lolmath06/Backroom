package com.dolmen.backroom.event;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.entity.ModEntities;
import com.dolmen.backroom.entity.client.DeathMoths;
import com.dolmen.backroom.entity.client.ModModelLayers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BackroomMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.DEATH_MOTHS_LAYER, DeathMoths::createBodyLayer);
    }

    @SubscribeEvent
    public static void onRegisterAttributes(EntityAttributeCreationEvent event) {
        ModEntities.registerAttributes(event);
    }
}
