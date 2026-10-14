package com.oleg.spartakfan.client;

import com.oleg.spartakfan.SpartakFan;
import com.oleg.spartakfan.SpartakFanMod;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SpartakFanRenderer extends MobRenderer<SpartakFan, PlayerModel<SpartakFan>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(SpartakFanMod.MODID, "textures/entity/spartak_fan.png");

    public SpartakFanRenderer(EntityRendererProvider.Context ctx) {
        // false = классические руки (Steve)
        super(ctx, new PlayerModel<>(ctx.bakeLayer(ModelLayers.PLAYER), false), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(SpartakFan entity) {
        return TEXTURE;
    }
}
