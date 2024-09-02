package com.dolmen.backroom;

import com.dolmen.backroom.block.CustomBlockEntities;
import com.dolmen.backroom.block.blocs_mod;
import com.dolmen.backroom.event.ClientModEvents;
import com.dolmen.backroom.item.ModCreativeModTabs;
import com.dolmen.backroom.item.item_mod;
import com.dolmen.backroom.entity.ModEntities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(BackroomMod.MOD_ID)
public class BackroomMod {
    public static final String MOD_ID = "backroom";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BackroomMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        item_mod.register(modEventBus);
        blocs_mod.register(modEventBus);
        CustomBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(ClientModEvents::registerRenderers);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }
}
