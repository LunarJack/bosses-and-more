package net.lunarjack.bossesandmore.entity.client;

import net.lunarjack.bossesandmore.BossesAndMore;
import net.lunarjack.bossesandmore.entity.custom.PillarEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PillarRenderer extends MobEntityRenderer<PillarEntity, PillarModel<PillarEntity>> {
    private static Identifier TEXTURE = new Identifier(BossesAndMore.MOD_ID, "textures/entity/pillar.png");
    public PillarRenderer(EntityRendererFactory.Context context) {
        super(context, new PillarModel<>(context.getPart(ModModelLayers.PILLAR)), 0f);
    }

    @Override
    public Identifier getTexture(PillarEntity entity) {
        return TEXTURE;
    }
}
