package net.fluffybumblebee.quarkcrystals;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fluffybumblebee.quarkcrystals.util.ArrayDiscriminatorUtil;
import net.minecraft.client.render.RenderLayer;

public class QuarkCrystalsClient implements ClientModInitializer {

    @Override public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ArrayDiscriminatorUtil.getCorundum[1],
                ArrayDiscriminatorUtil.getCorundum[2],
                ArrayDiscriminatorUtil.getCorundum[3],
                ArrayDiscriminatorUtil.getCorundum[4],
                ArrayDiscriminatorUtil.getCorundum[5],
                ArrayDiscriminatorUtil.getCorundum[6],
                ArrayDiscriminatorUtil.getCorundum[7],
                ArrayDiscriminatorUtil.getCorundum[8],
                ArrayDiscriminatorUtil.getCorundum[9],
                ArrayDiscriminatorUtil.getCorundum[10],
                ArrayDiscriminatorUtil.getCorundumPane[1],
                ArrayDiscriminatorUtil.getCorundumPane[2],
                ArrayDiscriminatorUtil.getCorundumPane[3],
                ArrayDiscriminatorUtil.getCorundumPane[4],
                ArrayDiscriminatorUtil.getCorundumPane[5],
                ArrayDiscriminatorUtil.getCorundumPane[6],
                ArrayDiscriminatorUtil.getCorundumPane[7],
                ArrayDiscriminatorUtil.getCorundumPane[8],
                ArrayDiscriminatorUtil.getCorundumPane[9],
                ArrayDiscriminatorUtil.getCorundumPane[10],
                ArrayDiscriminatorUtil.getCrystal[1],
                ArrayDiscriminatorUtil.getCrystal[2],
                ArrayDiscriminatorUtil.getCrystal[3],
                ArrayDiscriminatorUtil.getCrystal[4],
                ArrayDiscriminatorUtil.getCrystal[5],
                ArrayDiscriminatorUtil.getCrystal[6],
                ArrayDiscriminatorUtil.getCrystal[7],
                ArrayDiscriminatorUtil.getCrystal[8],
                ArrayDiscriminatorUtil.getCrystal[9],
                ArrayDiscriminatorUtil.getCrystal[10],
                ArrayDiscriminatorUtil.getCrystalPane[1],
                ArrayDiscriminatorUtil.getCrystalPane[2],
                ArrayDiscriminatorUtil.getCrystalPane[3],
                ArrayDiscriminatorUtil.getCrystalPane[4],
                ArrayDiscriminatorUtil.getCrystalPane[5],
                ArrayDiscriminatorUtil.getCrystalPane[6],
                ArrayDiscriminatorUtil.getCrystalPane[7],
                ArrayDiscriminatorUtil.getCrystalPane[8],
                ArrayDiscriminatorUtil.getCrystalPane[9],
                ArrayDiscriminatorUtil.getCrystalPane[10],
                ArrayDiscriminatorUtil.getCorundumCluster[1],
                ArrayDiscriminatorUtil.getCorundumCluster[2],
                ArrayDiscriminatorUtil.getCorundumCluster[3],
                ArrayDiscriminatorUtil.getCorundumCluster[4],
                ArrayDiscriminatorUtil.getCorundumCluster[5],
                ArrayDiscriminatorUtil.getCorundumCluster[6],
                ArrayDiscriminatorUtil.getCorundumCluster[7],
                ArrayDiscriminatorUtil.getCorundumCluster[8],
                ArrayDiscriminatorUtil.getCorundumCluster[9],
                ArrayDiscriminatorUtil.getCorundumCluster[10],
                ArrayDiscriminatorUtil.getWaxedCorundum[1],
                ArrayDiscriminatorUtil.getWaxedCorundum[2],
                ArrayDiscriminatorUtil.getWaxedCorundum[3],
                ArrayDiscriminatorUtil.getWaxedCorundum[4],
                ArrayDiscriminatorUtil.getWaxedCorundum[5],
                ArrayDiscriminatorUtil.getWaxedCorundum[6],
                ArrayDiscriminatorUtil.getWaxedCorundum[7],
                ArrayDiscriminatorUtil.getWaxedCorundum[8],
                ArrayDiscriminatorUtil.getWaxedCorundum[9],
                ArrayDiscriminatorUtil.getWaxedCorundum[10]
        );
    }
}
