package net.fluffybumblebee.quarkcrystals.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fluffybumblebee.quarkcrystals.util.ArrayDiscriminatorUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

@SuppressWarnings({"deprecation"})
public class CorundumCrystalPane extends PaneBlock {
    public CorundumCrystalPane() {
        super(FabricBlockSettings.of(Material.AMETHYST).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque().luminance(10).lightLevel(5).strength(1.2F).requiresTool());
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[1]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[2]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[3]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[4]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[5]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[6]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[7]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[8]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCorundumPane[9]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[1]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[2]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[3]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[4]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[5]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[6]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[7]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[8]) ||
                stateFrom.isOf(ArrayDiscriminatorUtil.getCrystalPane[9]) ||
                super.isSideInvisible(state, stateFrom, direction);
    }

    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient) {
            BlockPos blockPos = hit.getBlockPos();
            world.playSound(null, blockPos, SoundEvents.BLOCK_AMETHYST_BLOCK_HIT, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
            world.playSound(null, blockPos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
        }
    }
}
