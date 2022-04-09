package com.github.thedeathlycow.moregeodes.features;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> EMERALD_GEODE;

    public static final RegistryEntry<PlacedFeature> QUARTZ_GEODE;


    private static RegistryEntry<PlacedFeature> register(String id, PlacedFeature placedFeature) {
        return BuiltinRegistries.add(BuiltinRegistries.PLACED_FEATURE, new Identifier(MoreGeodes.MODID, id), placedFeature);
    }

    static {
        EMERALD_GEODE = register("emerald_geode", new PlacedFeature(ModConfiguredFeatures.EMERALD_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(24),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
        QUARTZ_GEODE = register("quartz_geode", new PlacedFeature(ModConfiguredFeatures.QUARTZ_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(24),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.belowTop(6)),
                        BiomePlacementModifier.of()
                )));
    }
}
