package com.oleg.spartakfan;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public class SpartakFanMod implements ModInitializer {
    public static final String MODID = "spartakfan";

    public static final EntityType<SpartakFan> SPARTAK_FAN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(MODID, "spartak_fan"),
            EntityType.Builder.of(SpartakFan::new, MobCategory.CREATURE)
                    .sized(0.6F, 1.8F)
                    .clientTrackingRange(8)
                    .build("spartak_fan"));

    public static final Item SPARTAK_FAN_EGG = Registry.register(
            BuiltInRegistries.ITEM,
            new ResourceLocation(MODID, "spartak_fan_spawn_egg"),
            new SpawnEggItem(SPARTAK_FAN, 0xD41F26, 0xFFFFFF, new Item.Properties()));

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(SPARTAK_FAN, SpartakFan.createAttributes());
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS)
                .register(entries -> entries.accept(SPARTAK_FAN_EGG));
    }
}
