package net.fluffybumblebee.quarkcrystals.world.gen.feature;

import net.fluffybumblebee.quarkcrystals.util.ArrayDiscriminatorUtil;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.UndergroundPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class QCUndergroundPlacedFeatures extends UndergroundPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> BLACK_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(1),
            QCUndergroundConfiguredFeatures.BLACK_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> BLUE_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(2),
            QCUndergroundConfiguredFeatures.BLUE_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> GREEN_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(3),
            QCUndergroundConfiguredFeatures.GREEN_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> INDIGO_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(4),
            QCUndergroundConfiguredFeatures.INDIGO_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> ORANGE_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(5),
            QCUndergroundConfiguredFeatures.ORANGE_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> RED_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(6),
            QCUndergroundConfiguredFeatures.RED_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> PINK_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(7),
            QCUndergroundConfiguredFeatures.PINK_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> WHITE_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(8),
            QCUndergroundConfiguredFeatures.WHITE_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature> YELLOW_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(9),
            QCUndergroundConfiguredFeatures.YELLOW_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
    public static final RegistryEntry<PlacedFeature>  CYAN_GEODE = PlacedFeatures.register(
            ArrayDiscriminatorUtil.getGeode(10),
            QCUndergroundConfiguredFeatures.CYAN_GEODE,
            RarityFilterPlacementModifier.of(80),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                    YOffset.fixed(30)),
            BiomePlacementModifier.of()
    );
}
