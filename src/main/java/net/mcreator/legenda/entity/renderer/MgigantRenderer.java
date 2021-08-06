package net.mcreator.legenda.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.legenda.entity.MgigantEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MgigantRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MgigantEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("legenda:textures/texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer leftleg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer rightleg;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer body;
		private final ModelRenderer cube_r5;
		private final ModelRenderer head;
		private final ModelRenderer cube_r6;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		public Modelcustom_model() {
			textureWidth = 32;
			textureHeight = 32;
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.2F, 17.0F, 0.0F);
			leftleg.setTextureOffset(8, 19).addBox(-0.5F, 3.5F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftleg.setTextureOffset(24, 26).addBox(-1.0F, 6.1F, -1.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0F, 7.0F, 0.0F);
			leftleg.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 27).addBox(1.0F, -3.0F, -0.6F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.2F, 0.0F, 0.0F);
			leftleg.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 21).addBox(-1.2F, -0.0266F, -0.6899F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.2F, 17.0F, 0.0F);
			rightleg.setTextureOffset(8, 19).addBox(-0.5F, 3.5F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rightleg.setTextureOffset(24, 26).addBox(-1.0F, 6.1F, -1.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.0F, 7.0F, 0.0F);
			rightleg.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 27).addBox(1.0F, -3.0F, -0.6F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			rightleg.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 21).addBox(-1.0F, -0.0266F, -0.6899F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 2.8F, 0.0F);
			body.addChild(cube_r5);
			setRotationAngle(cube_r5, 3.098F, 0.0F, 3.1416F);
			cube_r5.setTextureOffset(0, 6).addBox(-2.0F, -4.8069F, -1.3359F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 12.0F, 0.0F);
			head.setTextureOffset(10, 13).addBox(-0.5F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 0).addBox(-1.5F, -3.5614F, -1.7234F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(3.0F, 13.0F, 0.0F);
			leftarm.setTextureOffset(10, 13).addBox(0.5F, 4.7F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(1.4F, 4.2F, -2.1F);
			leftarm.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.6149F, -0.0376F, -0.3022F);
			cube_r7.setTextureOffset(0, 19).addBox(-0.7F, -0.3F, -1.1F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(1.0F, 3.0F, 0.0F);
			leftarm.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.4608F, -0.1393F, -0.2727F);
			cube_r8.setTextureOffset(8, 13).addBox(-1.0F, -1.7F, -1.6F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-0.25F, 0.5F, 0.0F);
			leftarm.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.4363F);
			cube_r9.setTextureOffset(12, 5).addBox(-0.75F, -1.75F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-3.0F, 13.0F, 0.1F);
			rightarm.setTextureOffset(2, 13).addBox(-1.6F, 4.9F, -1.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-1.4F, 4.2F, -2.1F);
			rightarm.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.5277F, 0.0376F, 0.3022F);
			cube_r10.setTextureOffset(0, 19).addBox(-1.2F, -0.35F, -1.05F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-1.0F, 3.0F, 0.0F);
			rightarm.addChild(cube_r11);
			setRotationAngle(cube_r11, -0.4608F, 0.1393F, 0.2727F);
			cube_r11.setTextureOffset(0, 13).addBox(-1.0F, -1.7F, -1.6F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.25F, 0.5F, 0.0F);
			rightarm.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
			cube_r12.setTextureOffset(12, 0).addBox(-1.25F, -1.75F, -0.9F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
