package net.fluffybumblebee.quarkcrystals.world.gen.feature;

import net.fluffybumblebee.quarkcrystals.util.ArrayDiscriminatorUtil;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class QCUndergroundConfiguredFeatures extends UndergroundConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> BLACK_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(1),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[1]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[1]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[1].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> BLUE_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(2),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[2]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[2]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[2].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> GREEN_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(3),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[3]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[3]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[3].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> INDIGO_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(4),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[4]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[4]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[4].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> ORANGE_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(5),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[5]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[5]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[5].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> RED_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(6),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[6]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[6]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[6].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> PINK_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(7),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[7]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[7]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[7].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> WHITE_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(8),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[8]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[8]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[8].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> YELLOW_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(9),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[9]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[9]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[9].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> CYAN_GEODE = ConfiguredFeatures.register(
            ArrayDiscriminatorUtil.getGeode(10),
            Feature.GEODE,
            new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCrystal[10]),
                    BlockStateProvider.of(ArrayDiscriminatorUtil.getCorundum[10]),
                    BlockStateProvider.of(Blocks.BASALT),
                    BlockStateProvider.of(Blocks.TUFF),
                    List.of(ArrayDiscriminatorUtil.getCorundumCluster[10].getDefaultState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                    new GeodeCrackConfig(0.95, 2.0, 2), 0.35, 0.083, true,
                    UniformIntProvider.create(4, 6),
                    UniformIntProvider.create(3, 4),
                    UniformIntProvider.create(1, 2),
                    -16,
                    16,
                    0.05,
                    1)
    );
}