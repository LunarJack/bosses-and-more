package net.lunarjack.bossesandmore;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lunarjack.bossesandmore.block.ModBlocks;
import net.lunarjack.bossesandmore.entity.ModEntities;
import net.lunarjack.bossesandmore.entity.client.ModModelLayers;
import net.lunarjack.bossesandmore.entity.client.PillarModel;
import net.lunarjack.bossesandmore.entity.client.PillarRenderer;
import net.minecraft.client.render.RenderLayer;


public class BossesAndMoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAST_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LAST_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_ROSE, RenderLayer.getCutout());
        EntityRendererRegistry.register(ModEntities.PILLAR, PillarRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PILLAR, PillarModel::getTexturedModelData);
    }
}
