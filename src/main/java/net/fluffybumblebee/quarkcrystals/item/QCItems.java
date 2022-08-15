package net.fluffybumblebee.quarkcrystals.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fluffybumblebee.quarkcrystals.util.ArrayDiscriminatorUtil;
import net.fluffybumblebee.quarkcrystals.util.IdentifierUtil;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class QCItems {
    public static void registerItems() {}
    public static final ItemGroup QUARK_CRYSTALS = FabricItemGroupBuilder.create(
            new Identifier(IdentifierUtil.ID, IdentifierUtil.ID))
                .icon(() -> new ItemStack(ArrayDiscriminatorUtil.getCorundum[4]))
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[1]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[2]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[3]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[4]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[5]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[6]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[7]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[8]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[9]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundum[10]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[1]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[2]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[3]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[4]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[5]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[6]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[7]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[8]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[9]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getWaxedCorundum[10]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[1]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[2]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[3]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[4]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[5]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[6]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[7]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[8]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[9]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumPane[10]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[1]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[2]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[3]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[4]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[5]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[6]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[7]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[8]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[9]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCorundumCluster[10]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[1]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[2]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[3]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[4]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[5]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[6]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[7]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[8]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[9]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystal[10]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[1]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[2]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[3]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[4]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[5]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[6]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[7]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[8]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[9]));
                    stacks.add(new ItemStack(ArrayDiscriminatorUtil.getCrystalPane[10]));
            })
            .build();
}
