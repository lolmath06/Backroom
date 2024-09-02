package com.dolmen.backroom.block;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.block.etage0.*;
import com.dolmen.backroom.block.etage0.conduit.*;
import com.dolmen.backroom.block.etage1.*;
import com.dolmen.backroom.block.etage1.panneau.PanneauRondBlock;
import com.dolmen.backroom.block.etage1.panneau.PanneauTriangleBlock;
import com.dolmen.backroom.block.etage1.panneau.Panneau_Limitation_10000000000000000000000Block;
import com.dolmen.backroom.block.etage1.place.PlaceBlock0;
import com.dolmen.backroom.block.etage1.place.PlaceBlock1;
import com.dolmen.backroom.block.etage1.place.PlaceBlock2;
import com.dolmen.backroom.block.etage1.place.PlaceBlock3;
import com.dolmen.backroom.block.etage1.rampe.*;
import com.dolmen.backroom.block.etage1.tuyau.*;
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

    public static final RegistryObject<Block> GRILLE_DAERATION1 = registerBlock("grille_daeration1",
            VentBlock1::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION = registerBlock("conduit_daeration",
            conduit_daeration::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION1 = registerBlock("conduit_daeration1",
            conduit_daeration1::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION2 = registerBlock("conduit_daeration2",
            conduit_daeration2::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION3 = registerBlock("conduit_daeration3",
            conduit_daeration3::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION3_1 = registerBlock("conduit_daeration3_1",
            conduit_daeration3_1::new);

    public static final RegistryObject<Block> CONDUIT_DAERATION3_2 = registerBlock("conduit_daeration3_2",
            conduit_daeration3_1::new);

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

    public static final RegistryObject<Block> BETON_BLANC_ETAGE1 = registerBlock("beton_blanc_etage1",
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

    public static final RegistryObject<Block> PORTE_NOIRE = registerBlock("porte_noire",
            CustomDoorBlock::new);

    public static final RegistryObject<Block> LAMPE_ETAGE1 = registerBlock("lampe_etage1",
            lampe_etage1::new);

    public static final RegistryObject<Block> LAMPE_ETEINTE_ETAGE1 = registerBlock("lampe_eteinte_etage1",
            lampe_eteinte_etage1::new);

    public static final RegistryObject<Block> PANNEAU_STOP = registerBlock("panneau_stop",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_CEDEZ_LE_PASSAGE = registerBlock("panneau_cedez_le_passage",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_FIN_INTERDICTION = registerBlock("panneau_fin_interdiction",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_INTERDICTION_DE_DEPASSER = registerBlock("panneau_interdiction_de_depasser",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_INTERDICTION_DE_PASSAGE = registerBlock("panneau_interdiction_de_passage",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_INTERDICTION_DE_STATIONNER = registerBlock("panneau_interdiction_de_stationner",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_0 = registerBlock("panneau_limitation_0",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_10 = registerBlock("panneau_limitation_10",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_20 = registerBlock("panneau_limitation_20",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_30 = registerBlock("panneau_limitation_30",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_40 = registerBlock("panneau_limitation_40",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_50 = registerBlock("panneau_limitation_50",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_60 = registerBlock("panneau_limitation_60",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_70 = registerBlock("panneau_limitation_70",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_80 = registerBlock("panneau_limitation_80",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_90 = registerBlock("panneau_limitation_90",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_100 = registerBlock("panneau_limitation_100",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_110 = registerBlock("panneau_limitation_110",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_120 = registerBlock("panneau_limitation_120",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_130 = registerBlock("panneau_limitation_130",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_140 = registerBlock("panneau_limitation_140",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_150 = registerBlock("panneau_limitation_150",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_LIMITATION_10000000000000000000000 = registerBlock("panneau_limitation_10000000000000000000000",
            Panneau_Limitation_10000000000000000000000Block::new);

    public static final RegistryObject<Block> PANNEAU_PARKING = registerBlock("panneau_parking",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_SENS_INTERDIT = registerBlock("panneau_sens_interdit",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_SENS_OBLIGATOIRE_DROIT = registerBlock("panneau_sens_obligatoire_droit",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_SENS_OBLIGATOIRE_GAUCHE = registerBlock("panneau_sens_obligatoire_gauche",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_SENS_OBLIGATOIRE_HAUT = registerBlock("panneau_sens_obligatoire_haut",
            PanneauRondBlock::new);

    public static final RegistryObject<Block> PANNEAU_ENTITE = registerBlock("panneau_entite",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_ATTENTION_ENFANT = registerBlock("panneau_attention_enfant",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_AVION = registerBlock("panneau_avion",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_CHUTE_PIERRE = registerBlock("panneau_chute_pierre",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_CIERF = registerBlock("panneau_cierf",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_DANGER = registerBlock("panneau_danger",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_DOUBLE_SENS = registerBlock("panneau_double_sens",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_PIETON = registerBlock("panneau_pieton",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_PRIORITE_DROITE = registerBlock("panneau_priorite_droite",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_PRIORITE_PONCTUELLE = registerBlock("panneau_priorite_ponctuelle",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_RALENTISSEUR = registerBlock("panneau_ralentisseur",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_ROND_POINT = registerBlock("panneau_rond_point",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> PANNEAU_VIERGE = registerBlock("panneau_vierge",
            PanneauTriangleBlock::new);

    public static final RegistryObject<Block> BARRE_PANNEAU = registerBlock("barre_panneau",
            BarrePanneauBlock::new);

    public static final RegistryObject<Block> CABLE1_ETAGE1 = registerBlock("cable1_etage1",
            Cable1Block::new);

    public static final RegistryObject<Block> CABLE2_ETAGE1 = registerBlock("cable2_etage1",
            Cable2Block::new);

    public static final RegistryObject<Block> CABLE3_ETAGE1 = registerBlock("cable3_etage1",
            Cable3Block::new);

    public static final RegistryObject<Block> CABLE4_ETAGE1 = registerBlock("cable4_etage1",
            Cable4Block::new);

    public static final RegistryObject<Block> CABLE5_ETAGE1 = registerBlock("cable5_etage1",
            Cable5Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU1_ETAGE1 = registerBlock("tuyau_bleu1_etage1",
            TuyauBleu1Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU2_ETAGE1 = registerBlock("tuyau_bleu2_etage1",
            TuyauBleu2Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU3_ETAGE1 = registerBlock("tuyau_bleu3_etage1",
            TuyauBleu3Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU4_ETAGE1 = registerBlock("tuyau_bleu4_etage1",
            TuyauBleu4Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU5_ETAGE1 = registerBlock("tuyau_bleu5_etage1",
            TuyauBleu4Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU6_ETAGE1 = registerBlock("tuyau_bleu6_etage1",
            TuyauBleu1Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU7_ETAGE1 = registerBlock("tuyau_bleu7_etage1",
            TuyauBleu5Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU8_ETAGE1 = registerBlock("tuyau_bleu8_etage1",
            TuyauBleu5Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU9_ETAGE1 = registerBlock("tuyau_bleu9_etage1",
            TuyauBleu5Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU10_ETAGE1 = registerBlock("tuyau_bleu10_etage1",
            TuyauBleu4Block::new);

    public static final RegistryObject<Block> TUYAU_BLEU11_ETAGE1 = registerBlock("tuyau_bleu11_etage1",
            TuyauBleu4Block::new);

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
