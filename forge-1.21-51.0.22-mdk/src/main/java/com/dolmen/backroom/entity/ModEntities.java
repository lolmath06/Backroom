package com.dolmen.backroom.entity;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.entity.custom.DeathMothsEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BackroomMod.MOD_ID);

    public static final RegistryObject<EntityType<CustomEnderpearlEntity>> CUSTOM_ENDER_PEARL = ENTITY_TYPES.register("custom_ender_pearl",
            () -> EntityType.Builder.<CustomEnderpearlEntity>of(CustomEnderpearlEntity::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .build(BackroomMod.MOD_ID + ":custom_ender_pearl"));

    public static final RegistryObject<EntityType<DeathMothsEntity>> DEATH_MOTHS =
            ENTITY_TYPES.register("death_moths",
                    () -> EntityType.Builder.of(DeathMothsEntity::new, MobCategory.MONSTER)
                            .sized(1f, 1f)
                            .build(BackroomMod.MOD_ID + ":death_moths"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(DEATH_MOTHS.get(), DeathMothsEntity.createAttributes().build());
    }
}
