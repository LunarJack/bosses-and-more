package net.lunarjack.bossesandmore;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class BossesAndMoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAST_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LAST_ROSE, RenderLayer.getCutout());
    }
}
