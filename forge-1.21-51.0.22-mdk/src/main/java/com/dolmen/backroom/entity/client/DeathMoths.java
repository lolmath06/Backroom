package com.dolmen.backroom.entity.client;

import com.dolmen.backroom.entity.custom.DeathMothsEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class DeathMoths<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart bone;
	private final ModelPart pate3;
	private final ModelPart pate3_1;
	private final ModelPart pate3_2;
	private final ModelPart pate3_3;
	private final ModelPart pate3_4;
	private final ModelPart pate3_5;
	private final ModelPart pate3_6;
	private final ModelPart pate2;
	private final ModelPart pate2_1;
	private final ModelPart pate2_2;
	private final ModelPart pate2_3;
	private final ModelPart pate2_4;
	private final ModelPart pate2_5;
	private final ModelPart pate2_6;
	private final ModelPart pate1;
	private final ModelPart pate1_1;
	private final ModelPart pate1_2;
	private final ModelPart pate1_3;
	private final ModelPart pate1_4;
	private final ModelPart pate1_5;
	private final ModelPart pate1_6;
	private final ModelPart aile2;
	private final ModelPart aile2_1;
	private final ModelPart aile2_2;
	private final ModelPart aile1;
	private final ModelPart aile1_1;
	private final ModelPart aile1_2;
	private final ModelPart antenne;
	private final ModelPart antenne1;
	private final ModelPart antenne2;
	private final ModelPart tete;
	private final ModelPart tete1;
	private final ModelPart tete2;
	private final ModelPart abdomen;
	private final ModelPart abdomen1;
	private final ModelPart abdomen2;
	private final ModelPart abdomen3;
	private final ModelPart abdomen4;
	private final ModelPart abdomen5;
	private final ModelPart abdomen6;
	private final ModelPart abdomen7;
	private final ModelPart abdomen8;
	private final ModelPart abdomen9;
	private final ModelPart abdomen10;

	public DeathMoths(ModelPart root) {
		this.bone = root.getChild("bone");
		this.pate3 = this.bone.getChild("pate3");
		this.pate3_1 = this.pate3.getChild("pate3_1");
		this.pate3_2 = this.pate3.getChild("pate3_2");
		this.pate3_3 = this.pate3.getChild("pate3_3");
		this.pate3_4 = this.pate3.getChild("pate3_4");
		this.pate3_5 = this.pate3.getChild("pate3_5");
		this.pate3_6 = this.pate3.getChild("pate3_6");

		this.pate2 = this.bone.getChild("pate2");
		this.pate2_1 = this.pate2.getChild("pate2_1");
		this.pate2_2 = this.pate2.getChild("pate2_2");
		this.pate2_3 = this.pate2.getChild("pate2_3");
		this.pate2_4 = this.pate2.getChild("pate2_4");
		this.pate2_5 = this.pate2.getChild("pate2_5");
		this.pate2_6 = this.pate2.getChild("pate2_6");

		this.pate1 = this.bone.getChild("pate1");
		this.pate1_1 = this.pate1.getChild("pate1_1");
		this.pate1_2 = this.pate1.getChild("pate1_2");
		this.pate1_3 = this.pate1.getChild("pate1_3");
		this.pate1_4 = this.pate1.getChild("pate1_4");
		this.pate1_5 = this.pate1.getChild("pate1_5");
		this.pate1_6 = this.pate1.getChild("pate1_6");

		this.aile2 = this.bone.getChild("aile2");
		this.aile2_1 = this.aile2.getChild("aile2_1");
		this.aile2_2 = this.aile2.getChild("aile2_2");

		this.aile1 = this.bone.getChild("aile1");
		this.aile1_1 = this.aile1.getChild("aile1_1");
		this.aile1_2 = this.aile1.getChild("aile1_2");

		this.antenne = this.bone.getChild("antenne");
		this.antenne1 = this.antenne.getChild("antenne1");
		this.antenne2 = this.antenne.getChild("antenne2");

		this.tete = this.bone.getChild("tete");
		this.tete1 = this.tete.getChild("tete1");
		this.tete2 = this.tete.getChild("tete2");

		this.abdomen = this.bone.getChild("abdomen");
		this.abdomen1 = this.abdomen.getChild("abdomen1");
		this.abdomen2 = this.abdomen.getChild("abdomen2");
		this.abdomen3 = this.abdomen.getChild("abdomen3");
		this.abdomen4 = this.abdomen.getChild("abdomen4");
		this.abdomen5 = this.abdomen.getChild("abdomen5");
		this.abdomen6 = this.abdomen.getChild("abdomen6");
		this.abdomen7 = this.abdomen.getChild("abdomen7");
		this.abdomen8 = this.abdomen.getChild("abdomen8");
		this.abdomen9 = this.abdomen.getChild("abdomen9");
		this.abdomen10 = this.abdomen.getChild("abdomen10");
	}


	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pate3 = bone.addOrReplaceChild("pate3", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition pate3_1 = pate3.addOrReplaceChild("pate3_1", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.25F, -5.5F, -3.5F));

		PartDefinition pate3_2 = pate3.addOrReplaceChild("pate3_2", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.25F, -5.5F, 3.5F));

		PartDefinition pate3_3 = pate3.addOrReplaceChild("pate3_3", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.75F, -5.5F, -3.5F));

		PartDefinition pate3_4 = pate3.addOrReplaceChild("pate3_4", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.75F, -5.5F, 3.5F));

		PartDefinition pate3_5 = pate3.addOrReplaceChild("pate3_5", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.25F, -5.5F, -3.5F));

		PartDefinition pate3_6 = pate3.addOrReplaceChild("pate3_6", CubeListBuilder.create().texOffs(20, 10).addBox(-0.75F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -5.5F, 3.5F));

		PartDefinition pate2 = bone.addOrReplaceChild("pate2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition pate2_1 = pate2.addOrReplaceChild("pate2_1", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.5F, -3.5F, -5.5F));

		PartDefinition pate2_2 = pate2.addOrReplaceChild("pate2_2", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(10.5F, -3.5F, 5.5F));

		PartDefinition pate2_3 = pate2.addOrReplaceChild("pate2_3", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -3.5F, -5.5F));

		PartDefinition pate2_4 = pate2.addOrReplaceChild("pate2_4", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -3.5F, 5.5F));

		PartDefinition pate2_5 = pate2.addOrReplaceChild("pate2_5", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -3.5F, -5.5F));

		PartDefinition pate2_6 = pate2.addOrReplaceChild("pate2_6", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -3.5F, 5.5F));

		PartDefinition pate1 = bone.addOrReplaceChild("pate1", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition pate1_1 = pate1.addOrReplaceChild("pate1_1", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(10.499F, -5.5F, -5.5F));

		PartDefinition pate1_2 = pate1.addOrReplaceChild("pate1_2", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(10.499F, -5.5F, 5.5F));

		PartDefinition pate1_3 = pate1.addOrReplaceChild("pate1_3", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -5.5F, -5.5F));

		PartDefinition pate1_4 = pate1.addOrReplaceChild("pate1_4", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -5.5F, 5.5F));

		PartDefinition pate1_5 = pate1.addOrReplaceChild("pate1_5", CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.501F, -5.5F, -5.5F));

		PartDefinition pate1_6 = pate1.addOrReplaceChild("pate1_6", CubeListBuilder.create().texOffs(18, 9).addBox(-0.999F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -5.5F, 5.5F));

		PartDefinition aile2 = bone.addOrReplaceChild("aile2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -51.0F));

		PartDefinition aile2_1 = aile2.addOrReplaceChild("aile2_1", CubeListBuilder.create(), PartPose.offset(42.5F, -10.0F, 40.0F));

		PartDefinition cube_r1 = aile2_1.addOrReplaceChild("cube_r1", CubeListBuilder.create()
						.texOffs(0, 72).mirror()
						.addBox(-36.0F, 0.0F, -36.0F, 72.0F, 0.01F, 72.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1754F, -4.9507F, -30.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition aile2_2 = aile2.addOrReplaceChild("aile2_2", CubeListBuilder.create(), PartPose.offset(-29.5F, -10.0F, 45.0F));

		PartDefinition cube_r2 = aile2_2.addOrReplaceChild("cube_r2", CubeListBuilder.create()
						.texOffs(0, 0).mirror()
						.addBox(-36.0F, 0.0F, -36.0F, 72.0F, 0.01F, 72.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.0F, -35.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition aile1 = bone.addOrReplaceChild("aile1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition aile1_1 = aile1.addOrReplaceChild("aile1_1", CubeListBuilder.create(), PartPose.offset(42.5F, -10.0F, 6.0F));

		PartDefinition cube_r3 = aile1_1.addOrReplaceChild("cube_r3", CubeListBuilder.create()
						.texOffs(144, 0)
						.addBox(-36.0F, 0.0F, -36.0F, 72.0F, 0.01F, 72.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1754F, -4.9507F, 35.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition aile1_2 = aile1.addOrReplaceChild("aile1_2", CubeListBuilder.create(), PartPose.offset(-29.5F, -10.0F, 6.0F));

		PartDefinition cube_r4 = aile1_2.addOrReplaceChild("cube_r4", CubeListBuilder.create()
						.texOffs(0, 144)
						.addBox(-36.0F, 0.0F, -36.0F, 72.0F, 0.01F, 72.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 35.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition antenne = bone.addOrReplaceChild("antenne", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition antenne1 = antenne.addOrReplaceChild("antenne1", CubeListBuilder.create(), PartPose.offset(12.0F, -10.5F, 0.0F));

		PartDefinition cube_r5 = antenne1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -3.0F, -0.9727F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0085F, -4.9414F, -3.0273F, 0.4243F, 0.1096F, -0.2382F));

		PartDefinition antenne2 = antenne.addOrReplaceChild("antenne2", CubeListBuilder.create(), PartPose.offset(12.0F, -10.5F, 0.0F));

		PartDefinition cube_r6 = antenne2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 20).addBox(-0.25F, -3.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -5.0F, 3.0F, -0.4232F, -0.1096F, -0.2382F));

		PartDefinition tete = bone.addOrReplaceChild("tete", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tete1 = tete.addOrReplaceChild("tete1", CubeListBuilder.create().texOffs(0, 0).addBox(-8.5F, -17.0F, -2.5F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 2.0F, -3.0F));

		PartDefinition tete2 = tete.addOrReplaceChild("tete2", CubeListBuilder.create().texOffs(12, 4).addBox(-9.5F, -14.0F, -4.5F, 3.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(54, 37).addBox(-8.0F, -14.5F, -5.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 37).addBox(-8.0F, -14.5F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(21.0F, 1.0F, 1.0F));

		PartDefinition abdomen = bone.addOrReplaceChild("abdomen", CubeListBuilder.create(), PartPose.offsetAndRotation(-22.0F, 4.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition abdomen1 = abdomen.addOrReplaceChild("abdomen1", CubeListBuilder.create().texOffs(45, 14).addBox(-8.5F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 1.0F, 0.0F));

		PartDefinition abdomen2 = abdomen.addOrReplaceChild("abdomen2", CubeListBuilder.create().texOffs(35, 15).addBox(-9.0F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, 0.0F));

		PartDefinition abdomen3 = abdomen.addOrReplaceChild("abdomen3", CubeListBuilder.create().texOffs(35, 15).addBox(-10.5F, -1.5F, -1.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, -2.0F));

		PartDefinition abdomen4 = abdomen.addOrReplaceChild("abdomen4", CubeListBuilder.create().texOffs(35, 15).addBox(-11.0F, -2.5F, -0.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, -3.0F));

		PartDefinition abdomen5 = abdomen.addOrReplaceChild("abdomen5", CubeListBuilder.create().texOffs(35, 15).addBox(-11.5F, -3.5F, -1.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -1.0F, -3.0F));

		PartDefinition abdomen6 = abdomen.addOrReplaceChild("abdomen6", CubeListBuilder.create().texOffs(24, 49).addBox(-11.5F, -5.5F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(35, 13).addBox(-12.0F, -4.5F, -1.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -3.0F, -3.0F));

		PartDefinition abdomen7 = abdomen.addOrReplaceChild("abdomen7", CubeListBuilder.create().texOffs(24, 49).addBox(-11.5F, -6.0F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(35, 13).addBox(-12.0F, -5.0F, -1.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -6.0F, -3.0F));

		PartDefinition abdomen8 = abdomen.addOrReplaceChild("abdomen8", CubeListBuilder.create().texOffs(35, 13).addBox(-12.0F, -0.5F, -1.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(24, 49).addBox(-11.5F, -1.5F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -14.0F, -3.0F));

		PartDefinition abdomen9 = abdomen.addOrReplaceChild("abdomen9", CubeListBuilder.create().texOffs(24, 49).addBox(-11.5F, -5.0F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(35, 13).addBox(-12.0F, -4.0F, -1.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -14.0F, -3.0F));

		PartDefinition abdomen10 = abdomen.addOrReplaceChild("abdomen10", CubeListBuilder.create().texOffs(35, 13).addBox(-12.0F, -0.5F, -1.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(24, 49).addBox(-11.5F, -1.5F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -21.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach((ModelPart::resetPose));

		if (entity instanceof DeathMothsEntity mothEntity) {
			// Obtenir l'état d'animation de l'entité
			String animationState = mothEntity.getAnimationState();

			// Forcer l'animation à "rester_immobile_sol"
			animationState = "rester_immobile_sol";

			switch (animationState) {
				case "rester_immobile_sol":
					// Appliquer l'animation immobile sur le sol
					this.aile1.xRot = 0;
					this.aile2.xRot = 0;
					// Ajouter d'autres transformations nécessaires pour cette animation
					break;
				default:
					// Si vous avez d'autres états d'animation, gérez-les ici
					break;
			}
		}
	}

	@Override
	public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, int pColor) {
		super.renderToBuffer(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pColor);
	}

	@Override
	public ModelPart root() {
		return this.bone;
	}

}