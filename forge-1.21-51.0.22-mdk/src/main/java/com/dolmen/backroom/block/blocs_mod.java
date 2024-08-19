package com.dolmen.backroom.block;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.block.etage0.*;
import com.dolmen.backroom.block.etage1.*;
import com.dolmen.backroom.block.etage1.rampe.*;
import com.dolmen.backroom.item.item_mod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class blocs_mod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BackroomMod.MOD_ID);

    public static final RegistryObject<Block> LUMIERE_ETAGE0 = registerBlock("lumiere_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F)
                    .lightLevel(state -> 15)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> LUMIERE_ETEINTE_ETAGE0 = registerBlock("lumiere_eteinte_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_ETAGE0 = registerBlock("papier_peint_jaune_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_BAS_ETAGE0 = registerBlock("papier_peint_jaune_bas_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_BAS_PRISE_ETAGE0 = registerBlock("papier_peint_jaune_bas_prise_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_FLECHE_DROITE_ETAGE0 = registerBlock("papier_peint_jaune_fleche_droite_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_FLECHE_GAUCHE_ETAGE0 = registerBlock("papier_peint_jaune_fleche_gauche_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_TACHE1_ETAGE0 = registerBlock("papier_peint_jaune_tache1_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_TACHE2_ETAGE0 = registerBlock("papier_peint_jaune_tache2_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_TACHE3_ETAGE0 = registerBlock("papier_peint_jaune_tache3_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_HAUT_ETAGE0 = registerBlock("papier_peint_jaune_haut_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> PLAFOND_ETAGE0 = registerBlock("plafond_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SOL_JAUNE_ETAGE0 = registerBlock("sol_jaune_etage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.WET_SPONGE)));

    public static final RegistryObject<Block> CAMERA = registerBlock("camera",
            CameraBlock::new);

    public static final RegistryObject<Block> PORTE_EXITE = registerBlock("porte_exit",
            CustomDoorBlock::new);

    public static final RegistryObject<Block> BOX = registerBlock("box", CustomChestBlock::new);

    public static final RegistryObject<Block> ETAGERE = registerBlock("etagere",
            EtagereBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_JAUNE_NOCLIP_ETAGE0 = registerBlock("papier_peint_jaune_noclip_etage0",
            CustomBlock::new);

    public static final RegistryObject<Block> CRACKED_PAPIER_PEINT_JAUNE_ETAGE0 = registerBlock("cracked_papier_peint_jaune_etage0",
            CrackedBlock::new);

    public static final RegistryObject<Block> CRACKED_PAPIER_PEINT_JAUNE_BAS_ETAGE0 = registerBlock("cracked_papier_peint_jaune_bas_etage0",
            CrackedBlock::new);

    public static final RegistryObject<Block> CRACKED_PAPIER_PEINT_JAUNE_HAUT_ETAGE0 = registerBlock("cracked_papier_peint_jaune_haut_etage0",
            CrackedBlock::new);

    public static final RegistryObject<Block> GRILLE_DAERATION = registerBlock("grille_daeration",
            VentBlock::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION = registerBlock("conduit_daeration",
            DuctBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_ROUGE_MANILLA = registerBlock("papier_peint_rouge_manilla",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_ROUGE_BAS_MANILLA = registerBlock("papier_peint_rouge_bas_manilla",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_ROUGE_HAUT_MANILLA = registerBlock("papier_peint_rouge_haut_manilla",
            CustomBlock::new);

    public static final RegistryObject<Block> PAPIER_PEINT_ROUGE_BAS_PRISE_MANILLA = registerBlock("papier_peint_rouge_bas_prise_manilla",
            CustomBlock::new);

    public static final RegistryObject<Block> PARQUET = registerBlock("parquet",
            CustomBlock::new);

    public static final RegistryObject<Block> TABLE_MANILLA = registerBlock("table_manilla",
            TableManilla::new);

    public static final RegistryObject<Block> CHAISE_MANILLA = registerBlock("chaise_manilla",
            ChaiseManilla::new);

    public static final RegistryObject<Block> LUSTRE_MANILLA = registerBlock("lustre_manilla",
            LustreManilla::new);

    public static final RegistryObject<Block> BETON_ETAGE1 = registerBlock("beton_etage1",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .strength(-1.0F, 3600000.0F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RAMPE_EN_BETON0_ETAGE1 = registerBlock("rampe_en_beton0_etage1",
            RampeBlock0::new);

    public static final RegistryObject<Block> RAMPE_EN_BETON1_ETAGE1 = registerBlock("rampe_en_beton1_etage1",
            RampeBlock1::new);

    public static final RegistryObject<Block> RAMPE_EN_BETON2_ETAGE1 = registerBlock("rampe_en_beton2_etage1",
            RampeBlock2::new);

    public static final RegistryObject<Block> RAMPE_EN_BETON3_ETAGE1 = registerBlock("rampe_en_beton3_etage1",
            RampeBlock3::new);

    public static final RegistryObject<Block> RAMPE_EN_BETON4_ETAGE1 = registerBlock("rampe_en_beton4_etage1",
            RampeBlock4::new);

    public static final RegistryObject<Block> RAMPE_EN_BETON5_ETAGE1 = registerBlock("rampe_en_beton5_etage1",
            RampeBlock5::new);

    public static final RegistryObject<Block> BORDURE_EN_BETON0_ETAGE1 = registerBlock("bordure_en_beton0_etage1",
            BordRampeBlock0::new);

    public static final RegistryObject<Block> BORDURE_EN_BETON1_ETAGE1 = registerBlock("bordure_en_beton1_etage1",
            BordRampeBlock1::new);

    public static final RegistryObject<Block> BORDURE_EN_BETON2_ETAGE1 = registerBlock("bordure_en_beton2_etage1",
            BordRampeBlock2::new);

    public static final RegistryObject<Block> BORDURE_EN_BETON0INV_ETAGE1 = registerBlock("bordure_en_beton0inv_etage1",
            BordRampeBlock0inv::new);

    public static final RegistryObject<Block> BORDURE_EN_BETON1INV_ETAGE1 = registerBlock("bordure_en_beton1inv_etage1",
            BordRampeBlock1inv::new);

    public static final RegistryObject<Block> BORDURE_EN_BETON2INV_ETAGE1 = registerBlock("bordure_en_beton2inv_etage1",
            BordRampeBlock2inv::new);

    public static final RegistryObject<Block> BORD_POTEAUX_ETAGE1 = registerBlock("bord_poteaux_etage1",
            CustomBlock::new);

    public static final RegistryObject<Block> PLACE0_ETAGE1 = registerBlock("place0_etage1",
            PlaceBlock0::new);

    public static final RegistryObject<Block> PLACE1_ETAGE1 = registerBlock("place1_etage1",
            PlaceBlock1::new);

    public static final RegistryObject<Block> PLACE2_ETAGE1 = registerBlock("place2_etage1",
            PlaceBlock2::new);

    public static final RegistryObject<Block> PLACE3_ETAGE1 = registerBlock("place3_etage1",
            PlaceBlock3::new);

    public static final RegistryObject<Block> PETIT_POTEAU0_ETAGE1 = registerBlock("petit_poteau0_etage1",
            PetitPoteauBlock::new);

    public static final RegistryObject<Block> PETIT_POTEAU1_ETAGE1 = registerBlock("petit_poteau1_etage1",
            PetitPoteauBlock::new);

    public static final RegistryObject<Block> PANNEAU_STOP = registerBlock("panneau_stop",
            PanneauBlock::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        item_mod.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
