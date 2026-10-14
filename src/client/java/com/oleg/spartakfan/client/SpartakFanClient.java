package com.oleg.spartakfan.client;

import com.oleg.spartakfan.SpartakFanMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SpartakFanClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(SpartakFanMod.SPARTAK_FAN, SpartakFanRenderer::new);
    }
}
