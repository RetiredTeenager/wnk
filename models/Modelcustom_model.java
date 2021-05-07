// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		textureWidth = 1024;
		textureHeight = 1024;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-151.5F, -150.0F, 0.0F, 150.0F, 150.0F, 150.0F, 0.0F, false);
		bb_main.setTextureOffset(498, 366).addBox(-140.0F, -138.5F, 40.5F, 125.0F, 125.0F, 125.0F, 0.0F, false);
		bb_main.setTextureOffset(249, 449).addBox(-140.0F, -138.5F, -15.0F, 125.0F, 125.0F, 125.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 366).addBox(-138.5F, -162.5F, 12.0F, 125.0F, 125.0F, 125.0F, 0.0F, false);
		bb_main.setTextureOffset(317, 117).addBox(-138.5F, -114.5F, 12.0F, 125.0F, 125.0F, 125.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 233).addBox(-162.5F, -140.0F, 13.5F, 125.0F, 125.0F, 125.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 200).addBox(-114.5F, -137.0F, 12.0F, 125.0F, 125.0F, 125.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bb_main.rotateAngleY = f2;
	}
}