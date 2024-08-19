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
                        pOutput.accept(blocs_mod.CONDUIT_DAERATION.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_BAS_MANILLA.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_HAUT_MANILLA.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_MANILLA.get());
                        pOutput.accept(blocs_mod.PAPIER_PEINT_ROUGE_BAS_PRISE_MANILLA.get());
                        pOutput.accept(blocs_mod.PARQUET.get());
                        pOutput.accept(blocs_mod.TABLE_MANILLA.get());
                        pOutput.accept(blocs_mod.CHAISE_MANILLA.get());
                        pOutput.accept(blocs_mod.LUSTRE_MANILLA.get());
                        pOutput.accept(blocs_mod.BETON_ETAGE1.get());
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
                        pOutput.accept(blocs_mod.PANNEAU_STOP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
