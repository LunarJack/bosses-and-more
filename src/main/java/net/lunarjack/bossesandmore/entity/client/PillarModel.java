package net.lunarjack.bossesandmore.entity.client;

import net.lunarjack.bossesandmore.entity.custom.PillarEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

   
public class PillarModel<T extends PillarEntity> extends SinglePartEntityModel<T> {
	private final ModelPart pillar;
	private final ModelPart bottom;
	private final ModelPart middle;
	private final ModelPart head;
	private final ModelPart eyelid;
	public PillarModel(ModelPart root) {
		this.pillar = root.getChild("pillar");
		this.bottom = root.getChild("bottom");
		this.middle = root.getChild("middle");
		this.head = root.getChild("head");
		this.eyelid = root.getChild("eyelid");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData pillar = modelPartData.addChild("pillar", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bottom = pillar.addChild("bottom", ModelPartBuilder.create().uv(19, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(37, 74).cuboid(3.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(37, 66).cuboid(-7.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(35, 48).cuboid(-8.0F, -1.0F, -8.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(35, 48).cuboid(7.0F, -1.0F, -8.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(22, 40).cuboid(-7.0F, -1.0F, -8.0F, 14.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(22, 31).cuboid(-7.0F, -1.0F, 2.0F, 14.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(37, 26).cuboid(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(75, 32).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 0.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_pannel_r1 = bottom.addChild("left_pannel_r1", ModelPartBuilder.create().uv(19, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData back_pannel_r1 = bottom.addChild("back_pannel_r1", ModelPartBuilder.create().uv(19, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData front_pannel_r1 = bottom.addChild("front_pannel_r1", ModelPartBuilder.create().uv(19, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData middle = pillar.addChild("middle", ModelPartBuilder.create().uv(54, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(72, 48).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 0.0F, 16.0F, new Dilation(0.0F))
		.uv(72, 74).cuboid(3.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(72, 66).cuboid(-7.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(70, 48).cuboid(-8.0F, -1.0F, -8.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(70, 48).cuboid(7.0F, -1.0F, -8.0F, 1.0F, 1.0F, 16.0F, new Dilation(0.0F))
		.uv(57, 40).cuboid(-7.0F, -1.0F, -8.0F, 14.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(57, 31).cuboid(-7.0F, -1.0F, 2.0F, 14.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(72, 26).cuboid(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -16.0F, 0.0F));

		ModelPartData left_pannel2_r1 = middle.addChild("left_pannel2_r1", ModelPartBuilder.create().uv(54, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData back_pannel2_r1 = middle.addChild("back_pannel2_r1", ModelPartBuilder.create().uv(54, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData front_pannel2_r1 = middle.addChild("front_pannel2_r1", ModelPartBuilder.create().uv(54, 32).cuboid(8.0F, -16.0F, -8.0F, 0.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData head = pillar.addChild("head", ModelPartBuilder.create().uv(0, 99).cuboid(-8.0F, -9.0F, -5.0F, 16.0F, 16.0F, 13.0F, new Dilation(0.0F))
		.uv(10, 89).cuboid(-8.0F, 0.0F, -8.0F, 16.0F, 7.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -9.0F, -8.0F, 5.0F, 9.0F, 3.0F, new Dilation(0.0F))
		.uv(102, 20).cuboid(-1.0F, -5.0F, -6.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(51, 4).cuboid(3.0F, -9.0F, -8.0F, 5.0F, 9.0F, 3.0F, new Dilation(0.0F))
		.uv(9, 29).cuboid(-3.0F, -9.0F, -8.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -39.0F, 0.0F));

		ModelPartData eyelid = pillar.addChild("eyelid", ModelPartBuilder.create().uv(8, 19).cuboid(-3.0F, -46.0F, -8.0F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(PillarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		pillar.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return pillar;
	}
}