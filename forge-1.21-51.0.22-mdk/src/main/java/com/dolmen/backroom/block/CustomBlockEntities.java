package com.dolmen.backroom.block;

import com.dolmen.backroom.BackroomMod;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BackroomMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CustomChestBlockEntity>> CUSTOM_CHEST = BLOCK_ENTITIES.register("custom_chest", () ->
            BlockEntityType.Builder.of(CustomChestBlockEntity::new, blocs_mod.BOX.get()).build(null));
}
