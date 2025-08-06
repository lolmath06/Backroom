package com.dolmen.backroom.shaders;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@OnlyIn(Dist.CLIENT)
public class CustomShader {

    private static final Logger LOGGER = LogManager.getLogger();
    private static ShaderInstance shaderInstance;

    public static void init() {
        ResourceLocation shaderLocation = ResourceLocation.fromNamespaceAndPath("backroom", "shaders/post/custom");
        try {
            shaderInstance = new ShaderInstance(Minecraft.getInstance().getResourceManager(), shaderLocation, DefaultVertexFormat.POSITION) {
                protected void onApply() {
                    // Configuration de vos uniforms ici
                }
            };
        } catch (Exception e) {
            LOGGER.error("Erreur lors de l'initialisation du shader custom", e);
        }
    }

    public static void bind() {
        if (shaderInstance != null) {
            shaderInstance.apply();
        }
    }

    public static void unbind() {
        RenderSystem.setShader(null);
    }

    public static ShaderInstance getShaderInstance() {
        return shaderInstance;
    }
}
