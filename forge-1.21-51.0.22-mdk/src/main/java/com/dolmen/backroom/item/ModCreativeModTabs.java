package com.dolmen.backroom.item;

import com.dolmen.backroom.BackroomMod;
import com.dolmen.backroom.block.blocs_mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BackroomMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BACKROOM_TAB = CREATIVE_MODE_TABS.register("backroom_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(blocs_mod.LUMIERE_ETAGE0.get()))
                    .title(Component.translatable("itemGroup.backroom_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(blocs_mod.LUMIERE_ETAGE0.get());
                        pOutput.accept(blocs_mod.LUMIERE_ETEINTE_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_NOCLIP_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_BAS_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_HAUT_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_BAS_PRISE_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_FLECHE_DROITE_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_FLECHE_GAUCHE_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_TACHE1_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_TACHE2_ETAGE0.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_JAUNE_TACHE3_ETAGE0.get());
                        pOutput.accept(blocs_mod.CRACKED_PAPIER_PEINT_JAUNE_ETAGE0.get());
                        pOutput.accept(blocs_mod.CRACKED_PAPIER_PEINT_JAUNE_BAS_ETAGE0.get());
                        pOutput.accept(blocs_mod.CRACKED_PAPIER_PEINT_JAUNE_HAUT_ETAGE0.get());
                        pOutput.accept(blocs_mod.PLAFOND_ETAGE0.get());
                        pOutput.accept(blocs_mod.SOL_JAUNE_ETAGE0.get());
                        pOutput.accept(blocs_mod.CAMERA.get());
                        pOutput.accept(item_mod.EAU_DAMANDE.get());
                        pOutput.accept(blocs_mod.PORTE_EXITE.get());
                        pOutput.accept(blocs_mod.BOX.get());
                        pOutput.accept(blocs_mod.ETAGERE.get());
                        pOutput.accept(item_mod.ENDER_PERLE_NOIRE.get());
                        pOutput.accept(item_mod.OEIL_OMNISCIENT.get());
                        pOutput.accept(item_mod.POUDRE_DE_NETHER_STAR.get());
                        pOutput.accept(item_mod.CATALYSTE_DIMENSIONNEL.get());
                        pOutput.accept(blocs_mod.GRILLE_DAERATION.get());
                        pOutput.accept(blocs_mod.GRILLE_DAERATION1.get());
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION.get());
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION1.get());
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION2.get());
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION3.get());
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION3_1.get());
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION3_2.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_BAS_MANILLA.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_HAUT_MANILLA.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_MANILLA.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_BAS_PRISE_MANILLA.get());
                        pOutput.accept(blocs_mod.PARQUET.get());
                        pOutput.accept(blocs_mod.TABLE_MANILLA.get());
                        pOutput.accept(blocs_mod.CHAISE_MANILLA.get());
                        pOutput.accept(blocs_mod.LUSTRE_MANILLA.get());
                        pOutput.accept(blocs_mod.BETON_ETAGE1.get());
                        pOutput.accept(blocs_mod.BETON_BLANC_ETAGE1.get());
                        pOutput.accept(blocs_mod.RAMPE_EN_BETON0_ETAGE1.get());
                        pOutput.accept(blocs_mod.RAMPE_EN_BETON1_ETAGE1.get());
                        pOutput.accept(blocs_mod.RAMPE_EN_BETON2_ETAGE1.get());
                        pOutput.accept(blocs_mod.RAMPE_EN_BETON3_ETAGE1.get());
                        pOutput.accept(blocs_mod.RAMPE_EN_BETON4_ETAGE1.get());
                        pOutput.accept(blocs_mod.RAMPE_EN_BETON5_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORDURE_EN_BETON0_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORDURE_EN_BETON1_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORDURE_EN_BETON2_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORDURE_EN_BETON0INV_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORDURE_EN_BETON1INV_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORDURE_EN_BETON2INV_ETAGE1.get());
                        pOutput.accept(blocs_mod.BORD_POTEAUX_ETAGE1.get());
                        pOutput.accept(blocs_mod.PLACE0_ETAGE1.get());
                        pOutput.accept(blocs_mod.PLACE1_ETAGE1.get());
                        pOutput.accept(blocs_mod.PLACE2_ETAGE1.get());
                        pOutput.accept(blocs_mod.PLACE3_ETAGE1.get());
                        pOutput.accept(blocs_mod.PETIT_POTEAU0_ETAGE1.get());
                        pOutput.accept(blocs_mod.PETIT_POTEAU1_ETAGE1.get());
                        pOutput.accept(blocs_mod.PORTE_NOIRE.get());
                        pOutput.accept(blocs_mod.LAMPE_ETAGE1.get());
                        pOutput.accept(blocs_mod.LAMPE_ETEINTE_ETAGE1.get());
                        pOutput.accept(blocs_mod.PANNEAU_CEDEZ_LE_PASSAGE.get());
                        pOutput.accept(blocs_mod.PANNEAU_FIN_INTERDICTION.get());
                        pOutput.accept(blocs_mod.PANNEAU_INTERDICTION_DE_DEPASSER.get());
                        pOutput.accept(blocs_mod.PANNEAU_INTERDICTION_DE_PASSAGE.get());
                        pOutput.accept(blocs_mod.PANNEAU_INTERDICTION_DE_STATIONNER.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_0.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_10.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_20.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_30.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_40.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_50.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_60.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_70.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_80.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_90.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_100.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_110.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_120.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_130.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_140.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_150.get());
                        pOutput.accept(blocs_mod.PANNEAU_LIMITATION_10000000000000000000000.get());
                        pOutput.accept(blocs_mod.PANNEAU_PARKING.get());
                        pOutput.accept(blocs_mod.PANNEAU_SENS_INTERDIT.get());
                        pOutput.accept(blocs_mod.PANNEAU_SENS_OBLIGATOIRE_DROIT.get());
                        pOutput.accept(blocs_mod.PANNEAU_SENS_OBLIGATOIRE_GAUCHE.get());
                        pOutput.accept(blocs_mod.PANNEAU_SENS_OBLIGATOIRE_HAUT.get());
                        pOutput.accept(blocs_mod.PANNEAU_STOP.get());
                        pOutput.accept(blocs_mod.PANNEAU_VIERGE.get());
                        pOutput.accept(blocs_mod.PANNEAU_ATTENTION_ENFANT.get());
                        pOutput.accept(blocs_mod.PANNEAU_AVION.get());
                        pOutput.accept(blocs_mod.PANNEAU_CHUTE_PIERRE.get());
                        pOutput.accept(blocs_mod.PANNEAU_CIERF.get());
                        pOutput.accept(blocs_mod.PANNEAU_DANGER.get());
                        pOutput.accept(blocs_mod.PANNEAU_DOUBLE_SENS.get());
                        pOutput.accept(blocs_mod.PANNEAU_PIETON.get());
                        pOutput.accept(blocs_mod.PANNEAU_PRIORITE_DROITE.get());
                        pOutput.accept(blocs_mod.PANNEAU_PRIORITE_PONCTUELLE.get());
                        pOutput.accept(blocs_mod.PANNEAU_RALENTISSEUR.get());
                        pOutput.accept(blocs_mod.PANNEAU_ROND_POINT.get());
                        pOutput.accept(blocs_mod.PANNEAU_ENTITE.get());
                        pOutput.accept(blocs_mod.BARRE_PANNEAU.get());
                        pOutput.accept(blocs_mod.CABLE1_ETAGE1.get());
                        pOutput.accept(blocs_mod.CABLE2_ETAGE1.get());
                        pOutput.accept(blocs_mod.CABLE3_ETAGE1.get());
                        pOutput.accept(blocs_mod.CABLE4_ETAGE1.get());
                        pOutput.accept(blocs_mod.CABLE5_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU1_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU2_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU3_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU4_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU5_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU6_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU7_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU8_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU9_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU10_ETAGE1.get());
                        pOutput.accept(blocs_mod.TUYAU_BLEU11_ETAGE1.get());
                        pOutput.accept(item_mod.DEATH_MOTH_SPAWN_EGG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
