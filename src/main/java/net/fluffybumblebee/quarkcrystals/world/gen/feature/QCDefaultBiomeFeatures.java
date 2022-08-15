package net.fluffybumblebee.quarkcrystals.world.gen.feature;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class QCDefaultBiomeFeatures extends DefaultBiomeFeatures {
    public static void addQCGeodes(GenerationSettings.Builder builder) {
        addBlackGeode(builder);
        addBlueGeode(builder);
        addGreenGeode(builder);
        addIndigoGeode(builder);
        addOrangeGeode(builder);
        addRedGeode(builder);
        addPinkGeode(builder);
        addWhiteGeode(builder);
        addYellowGeode(builder);
        addCyanGeode(builder);
    }
    public static void addBlackGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.BLACK_GEODE
        );
    }
    public static void addBlueGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.BLUE_GEODE
        );
    }
    public static void addGreenGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.GREEN_GEODE
        );
    }
    public static void addIndigoGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.INDIGO_GEODE
        );
    }
    public static void addOrangeGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.ORANGE_GEODE
        );
    }
    public static void addRedGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.RED_GEODE
        );
    }
    public static void addPinkGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.PINK_GEODE
        );
    }
    public static void addWhiteGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.WHITE_GEODE
        );
    }
    public static void addYellowGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.YELLOW_GEODE
        );
    }
    public static void addCyanGeode(GenerationSettings.Builder builder) {
        builder.feature(
                GenerationStep.Feature.LOCAL_MODIFICATIONS,
                QCUndergroundPlacedFeatures.CYAN_GEODE
        );
    }
}
