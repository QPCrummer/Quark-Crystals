package net.fluffybumblebee.quarkcrystals.util;

import net.fluffybumblebee.quarkcrystals.block.QCBlocks;
import net.fluffybumblebee.quarkcrystals.block.custom.*;

public class ArrayDiscriminatorUtil {
    public static final String[] colourType = {
            null,
            "black",
            "blue",
            "green",
            "indigo",
            "orange",
            "red",
            "pink",
            "white",
            "yellow",
            "cyan"
    };

    public static String getCorundum(int i) {
       return colourType[i]+"_corundum";
    }
    public static String getCorundumPane(int i) {
        return colourType[i]+"_corundum_pane";
    }
    public static String getCorundumCluster(int i) {
        return colourType[i]+"_corundum_cluster";
    }
    public static String getCrystal(int i) {
        return colourType[i]+"_crystal";
    }
    public static String getCrystalPane(int i) {
        return colourType[i]+"_crystal_pane";
    }
    public static String getGeode(int i) {
        return colourType[i]+"_geode";
    }
    public static String getWaxedCorundum(int i) {return "waxed_"+colourType[i]+"_corundum";}
    public static final CorundumBlock[] getCorundum = {
            null,
            QCBlocks.BLACK_CORUNDUM,
            QCBlocks.BLUE_CORUNDUM,
            QCBlocks.GREEN_CORUNDUM,
            QCBlocks.INDIGO_CORUNDUM,
            QCBlocks.ORANGE_CORUNDUM,
            QCBlocks.RED_CORUNDUM,
            QCBlocks.PINK_CORUNDUM,
            QCBlocks.WHITE_CORUNDUM,
            QCBlocks.YELLOW_CORUNDUM,
            QCBlocks.CYAN_CORUNDUM
    };
    public static final CorundumBlock[] getWaxedCorundum = {
            null,
            QCBlocks.WAXED_BLACK_CORUNDUM,
            QCBlocks.WAXED_BLUE_CORUNDUM,
            QCBlocks.WAXED_GREEN_CORUNDUM,
            QCBlocks.WAXED_INDIGO_CORUNDUM,
            QCBlocks.WAXED_ORANGE_CORUNDUM,
            QCBlocks.WAXED_RED_CORUNDUM,
            QCBlocks.WAXED_PINK_CORUNDUM,
            QCBlocks.WAXED_WHITE_CORUNDUM,
            QCBlocks.WAXED_YELLOW_CORUNDUM,
            QCBlocks.WAXED_CYAN_CORUNDUM
    };
    public static final CorundumCrystalPane[] getCorundumPane = {
            null,
            QCBlocks.BLACK_CORUNDUM_PANE,
            QCBlocks.BLUE_CORUNDUM_PANE,
            QCBlocks.GREEN_CORUNDUM_PANE,
            QCBlocks.INDIGO_CORUNDUM_PANE,
            QCBlocks.ORANGE_CORUNDUM_PANE,
            QCBlocks.RED_CORUNDUM_PANE,
            QCBlocks.VIOLET_CORUNDUM_PANE,
            QCBlocks.WHITE_CORUNDUM_PANE,
            QCBlocks.YELLOW_CORUNDUM_PANE,
            QCBlocks.CYAN_CORUNDUM_PANE
    };
    public static final CorundumCluster[] getCorundumCluster = {
            null,
            QCBlocks.BLACK_CLUSTER,
            QCBlocks.BLUE_CLUSTER,
            QCBlocks.GREEN_CLUSTER,
            QCBlocks.INDIGO_CLUSTER,
            QCBlocks.ORANGE_CLUSTER,
            QCBlocks.RED_CLUSTER,
            QCBlocks.PINK_CLUSTER,
            QCBlocks.WHITE_CLUSTER,
            QCBlocks.YELLOW_CLUSTER,
            QCBlocks.CYAN_CLUSTER
    };
    public static final CrystalBlock[] getCrystal = {
            null,
            QCBlocks.BLACK_CRYSTAL,
            QCBlocks.BLUE_CRYSTAL,
            QCBlocks.GREEN_CRYSTAL,
            QCBlocks.INDIGO_CRYSTAL,
            QCBlocks.ORANGE_CRYSTAL,
            QCBlocks.RED_CRYSTAL,
            QCBlocks.PINK_CRYSTAL,
            QCBlocks.WHITE_CRYSTAL,
            QCBlocks.YELLOW_CRYSTAL,
            QCBlocks.CYAN_CRYSTAL
    };
    public static final CorundumCrystalPane[] getCrystalPane = {
            null,
            QCBlocks.BLACK_CRYSTAL_PANE,
            QCBlocks.BLUE_CRYSTAL_PANE,
            QCBlocks.GREEN_CRYSTAL_PANE,
            QCBlocks.INDIGO_CRYSTAL_PANE,
            QCBlocks.ORANGE_CRYSTAL_PANE,
            QCBlocks.RED_CRYSTAL_PANE,
            QCBlocks.PINK_CRYSTAL_PANE,
            QCBlocks.WHITE_CRYSTAL_PANE,
            QCBlocks.YELLOW_CRYSTAL_PANE,
            QCBlocks.CYAN_CRYSTAL_PANE
    };
}
