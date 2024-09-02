package com.dolmen.backroom.item;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.entity.ModEntities;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class item_mod {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BackroomMod.MOD_ID);

    public static final RegistryObject<Item> EAU_DAMANDE = ITEMS.register("eau_damande",
            () -> new EauDamandeItem(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationModifier(20.0F)
                            .alwaysEdible()
                            .build())));

    public static final RegistryObject<Item> ENDER_PERLE_NOIRE = ITEMS.register("ender_perle_noire",
            () -> new InfiniteEnderPearlItem(new Item.Properties()
                    .stacksTo(1)));

    public static final RegistryObject<Item> OEIL_OMNISCIENT = ITEMS.register("oeil_omniscient",
            () -> new infiniteOmniscientEyeItem(new Item.Properties()
                    .stacksTo(1)));

    public static final RegistryObject<Item> POUDRE_DE_NETHER_STAR = ITEMS.register("poudre_de_nether_star",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)));

    public static final RegistryObject<Item> CATALYSTE_DIMENSIONNEL = ITEMS.register("catalyste_dimensionnel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)));

    public static final RegistryObject<Item> DEATH_MOTH_SPAWN_EGG = ITEMS.register("death_moth_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    ModEntities.DEATH_MOTHS,
                    0xC5903B, // Base color of the egg
                    0x4A391D, // Spots color of the egg
                    new Item.Properties() // Item properties
                            .stacksTo(64) // Ensure correct registry name in 1.21
            )
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
