// Made with Blockbench 3.6.6

public static class Modelattack_titan extends AnimatedEntityModel {

	private final AnimatedModelRenderer all;
	private final AnimatedModelRenderer rightleg;
	private final AnimatedModelRenderer upperrightleg;
	private final AnimatedModelRenderer rihgtlowerlegs;
	private final AnimatedModelRenderer rfoot;
	private final AnimatedModelRenderer rfoot_r1;
	private final AnimatedModelRenderer rfoot_r2;
	private final AnimatedModelRenderer rfoot_r3;
	private final AnimatedModelRenderer rfoot_r4;
	private final AnimatedModelRenderer leftleg;
	private final AnimatedModelRenderer upperleftleg;
	private final AnimatedModelRenderer leftlowerlegs;
	private final AnimatedModelRenderer lfoot;
	private final AnimatedModelRenderer lfoot_r1;
	private final AnimatedModelRenderer lfoot_r2;
	private final AnimatedModelRenderer lfoot_r3;
	private final AnimatedModelRenderer lfoot_r4;
	private final AnimatedModelRenderer torso;
	private final AnimatedModelRenderer movy;
	private final AnimatedModelRenderer movy_r1;
	private final AnimatedModelRenderer movy_r2;
	private final AnimatedModelRenderer yes_r1;
	private final AnimatedModelRenderer yes_r2;
	private final AnimatedModelRenderer yes_r3;
	private final AnimatedModelRenderer yes_r4;
	private final AnimatedModelRenderer yes_r5;
	private final AnimatedModelRenderer yes_r6;
	private final AnimatedModelRenderer yes_r7;
	private final AnimatedModelRenderer yes_r8;
	private final AnimatedModelRenderer movy2;
	private final AnimatedModelRenderer movy_r3;
	private final AnimatedModelRenderer movy_r4;
	private final AnimatedModelRenderer yes_r9;
	private final AnimatedModelRenderer yes_r10;
	private final AnimatedModelRenderer yes_r11;
	private final AnimatedModelRenderer yes_r12;
	private final AnimatedModelRenderer yes_r13;
	private final AnimatedModelRenderer yes_r14;
	private final AnimatedModelRenderer yes_r15;
	private final AnimatedModelRenderer yes_r16;
	private final AnimatedModelRenderer yesr_17;
	private final AnimatedModelRenderer MAMADISIMOMOMENTO;
	private final AnimatedModelRenderer MAMADOTE0;
	private final AnimatedModelRenderer MAMADISIMO9_r1;
	private final AnimatedModelRenderer MAMADISIMO8_r1;
	private final AnimatedModelRenderer MAMADISIMO7_r1;
	private final AnimatedModelRenderer MAMADISIMO6_r1;
	private final AnimatedModelRenderer MAMADISIMO5_r1;
	private final AnimatedModelRenderer MAMADISIMO4_r1;
	private final AnimatedModelRenderer MAMADISIMO3_r1;
	private final AnimatedModelRenderer MAMADISIMO2_r1;
	private final AnimatedModelRenderer MAMADISIMO1_r1;
	private final AnimatedModelRenderer MAMADISIMO10_r1;
	private final AnimatedModelRenderer MAMADISIMO9_r2;
	private final AnimatedModelRenderer MAMADISIMO8_r2;
	private final AnimatedModelRenderer MAMADISIMO7_r2;
	private final AnimatedModelRenderer MAMADISIMO6_r2;
	private final AnimatedModelRenderer MAMADISIMO5_r2;
	private final AnimatedModelRenderer MAMADISIMO4_r2;
	private final AnimatedModelRenderer MAMADOTE1;
	private final AnimatedModelRenderer MAMADISIMO4_r3;
	private final AnimatedModelRenderer MAMADISIMO3_r2;
	private final AnimatedModelRenderer MAMADISIMO2_r2;
	private final AnimatedModelRenderer MAMADISIMO5_r3;
	private final AnimatedModelRenderer MINIMAMADISIMO;
	private final AnimatedModelRenderer MAMADISIMO7_r3;
	private final AnimatedModelRenderer MAMADISIMO12_r1;
	private final AnimatedModelRenderer MAMADISIMO10_r2;
	private final AnimatedModelRenderer MAMADISIMO8_r3;
	private final AnimatedModelRenderer MAMADISIMO6_r3;
	private final AnimatedModelRenderer MAMADISIMO5_r4;
	private final AnimatedModelRenderer shoulders;
	private final AnimatedModelRenderer shoulderarea2;
	private final AnimatedModelRenderer cube_r1;
	private final AnimatedModelRenderer cube_r2;
	private final AnimatedModelRenderer cube_r20;
	private final AnimatedModelRenderer cube_r13_r1;
	private final AnimatedModelRenderer cube_r12_r1;
	private final AnimatedModelRenderer cube_r13;
	private final AnimatedModelRenderer cube_r20_r1;
	private final AnimatedModelRenderer cube_r20_r2;
	private final AnimatedModelRenderer cube_r19_r1;
	private final AnimatedModelRenderer cube_r18_r1;
	private final AnimatedModelRenderer cube_r17_r1;
	private final AnimatedModelRenderer cube_r11;
	private final AnimatedModelRenderer cube_r21_r1;
	private final AnimatedModelRenderer cube_r21_r2;
	private final AnimatedModelRenderer cube_r20_r3;
	private final AnimatedModelRenderer cube_r20_r4;
	private final AnimatedModelRenderer cube_r19_r2;
	private final AnimatedModelRenderer cube_r18_r2;
	private final AnimatedModelRenderer cube_r12;
	private final AnimatedModelRenderer cube_r22_r1;
	private final AnimatedModelRenderer cube_r22_r2;
	private final AnimatedModelRenderer cube_r21_r3;
	private final AnimatedModelRenderer cube_r21_r4;
	private final AnimatedModelRenderer cube_r20_r5;
	private final AnimatedModelRenderer cube_r19_r3;
	private final AnimatedModelRenderer cube_r14;
	private final AnimatedModelRenderer cube_r23_r1;
	private final AnimatedModelRenderer cube_r23_r2;
	private final AnimatedModelRenderer cube_r22_r3;
	private final AnimatedModelRenderer cube_r21_r5;
	private final AnimatedModelRenderer cube_r20_r6;
	private final AnimatedModelRenderer arms;
	private final AnimatedModelRenderer rarm;
	private final AnimatedModelRenderer rshoulderarm;
	private final AnimatedModelRenderer cube_r5;
	private final AnimatedModelRenderer cube_r3;
	private final AnimatedModelRenderer rforearm;
	private final AnimatedModelRenderer lforearm_r2;
	private final AnimatedModelRenderer lforearm_r3;
	private final AnimatedModelRenderer lforearm_r4;
	private final AnimatedModelRenderer larm;
	private final AnimatedModelRenderer lshoulderarm;
	private final AnimatedModelRenderer cube_r4;
	private final AnimatedModelRenderer cube_r6;
	private final AnimatedModelRenderer lforearm;
	private final AnimatedModelRenderer lforearm_r5;
	private final AnimatedModelRenderer lforearm_r6;
	private final AnimatedModelRenderer lforearm_r7;
	private final AnimatedModelRenderer headthing;
	private final AnimatedModelRenderer bone5;
	private final AnimatedModelRenderer face;

	public Modelattack_titan() {
		textureWidth = 256;
		textureHeight = 256;
		all = new AnimatedModelRenderer(this);
		all.setRotationPoint(0.0F, -16.3011F, 0.5F);

		all.setModelRendererName("all");
		this.registerModelRenderer(all);

		rightleg = new AnimatedModelRenderer(this);
		rightleg.setRotationPoint(-15.0F, -79.6989F, -0.5F);
		all.addChild(rightleg);

		rightleg.setModelRendererName("rightleg");
		this.registerModelRenderer(rightleg);

		upperrightleg = new AnimatedModelRenderer(this);
		upperrightleg.setRotationPoint(-0.3728F, -4.1613F, 5.8027F);
		rightleg.addChild(upperrightleg);
		setRotationAngle(upperrightleg, 0.0F, 0.0F, 0.0873F);
		upperrightleg.setTextureOffset(0, 135).addBox(-11.992F, 4.9113F, -8.0728F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperrightleg.setTextureOffset(74, 132).addBox(9.008F, 4.9113F, -8.0728F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperrightleg.setTextureOffset(55, 163).addBox(9.758F, 4.9113F, -7.3228F, 3.0F, 27.0F, 14.0F, 0.0F, false);
		upperrightleg.setTextureOffset(129, 169).addBox(-6.3976F, 7.9113F, -11.4376F, 12.0F, 33.0F, 3.0F, 0.0F, false);
		upperrightleg.setTextureOffset(168, 0).addBox(-7.1476F, 16.1613F, 6.5624F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		upperrightleg.setTextureOffset(45, 161).addBox(-13.0968F, 9.4596F, -6.5728F, 3.0F, 27.0F, 12.0F, 0.0F, false);
		upperrightleg.setTextureOffset(152, 44).addBox(-8.6476F, 4.9113F, 5.0624F, 18.0F, 45.0F, 3.0F, 0.0F, false);
		upperrightleg.setTextureOffset(128, 99).addBox(-10.492F, 46.1613F, -8.0728F, 21.0F, 9.0F, 15.0F, 0.0F, false);
		upperrightleg.setTextureOffset(28, 57).addBox(-10.492F, 1.1613F, -9.5728F, 21.0F, 45.0F, 15.0F, 0.0F, false);
		upperrightleg.setModelRendererName("upperrightleg");
		this.registerModelRenderer(upperrightleg);

		rihgtlowerlegs = new AnimatedModelRenderer(this);
		rihgtlowerlegs.setRotationPoint(-5.0F, 53.0F, 0.0F);
		rightleg.addChild(rihgtlowerlegs);
		rihgtlowerlegs.setTextureOffset(39, 143).addBox(-11.8648F, 12.25F, -2.2296F, 3.0F, 39.0F, 15.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(62, 130).addBox(9.1352F, 10.0F, -2.2296F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(107, 158).addBox(9.8852F, 20.5F, -2.2296F, 3.0F, 27.0F, 15.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(164, 50).addBox(-7.0204F, 25.0F, -4.8648F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(86, 132).addBox(-12.6148F, 18.25F, -0.7296F, 3.0F, 27.0F, 12.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(131, 155).addBox(-8.5204F, 12.25F, -3.3648F, 18.0F, 39.0F, 3.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(128, 90).addBox(-10.3648F, 7.0F, -2.2701F, 21.0F, 9.0F, 15.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(116, 0).addBox(-10.3648F, -5.0F, -5.2701F, 21.0F, 12.0F, 18.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(92, 2).addBox(-10.3648F, 16.0F, -2.2701F, 21.0F, 41.0F, 15.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(86, 145).addBox(-8.5204F, 10.75F, 10.8651F, 18.0F, 45.0F, 3.0F, 0.0F, false);
		rihgtlowerlegs.setTextureOffset(75, 171).addBox(-7.0204F, 15.25F, 12.3852F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		rihgtlowerlegs.setModelRendererName("rihgtlowerlegs");
		this.registerModelRenderer(rihgtlowerlegs);

		rfoot = new AnimatedModelRenderer(this);
		rfoot.setRotationPoint(0.0F, 56.0F, 3.0F);
		rihgtlowerlegs.addChild(rfoot);
		rfoot.setTextureOffset(104, 104).addBox(-10.3648F, 1.0F, -5.2701F, 21.0F, 10.0F, 15.0F, 0.0F, false);
		rfoot.setTextureOffset(141, 69).addBox(-10.3648F, 2.0F, -21.0201F, 21.0F, 9.0F, 18.0F, 0.0F, false);
		rfoot.setTextureOffset(162, 93).addBox(10.6352F, 5.0F, -26.2701F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		rfoot.setTextureOffset(162, 93).addBox(-10.3648F, 5.0F, -24.7701F, 0.0F, 3.0F, 6.0F, 0.0F, false);
		rfoot.setTextureOffset(161, 122).addBox(-10.3648F, 8.0F, -21.0201F, 21.0F, 3.0F, 6.0F, 0.0F, false);
		rfoot.setTextureOffset(157, 80).addBox(-1.3648F, 8.0F, -27.0201F, 12.0F, 3.0F, 6.0F, 0.0F, false);
		rfoot.setTextureOffset(155, 37).addBox(-10.3648F, 8.0F, -30.0201F, 21.0F, 3.0F, 9.0F, 0.0F, false);
		rfoot.setTextureOffset(155, 37).addBox(-1.3648F, 8.0F, -33.0201F, 12.0F, 3.0F, 6.0F, 0.0F, false);
		rfoot.setModelRendererName("rfoot");
		this.registerModelRenderer(rfoot);

		rfoot_r1 = new AnimatedModelRenderer(this);
		rfoot_r1.setRotationPoint(-11.1148F, 9.5F, -29.2701F);
		rfoot.addChild(rfoot_r1);
		setRotationAngle(rfoot_r1, 0.0F, 0.3491F, 0.0F);
		rfoot_r1.setTextureOffset(155, 37).addBox(1.5F, -1.5F, 0.0F, 9.0F, 3.0F, 3.0F, 0.0F, false);
		rfoot_r1.setModelRendererName("rfoot_r1");
		this.registerModelRenderer(rfoot_r1);

		rfoot_r2 = new AnimatedModelRenderer(this);
		rfoot_r2.setRotationPoint(0.1352F, 6.5F, -26.2701F);
		rfoot.addChild(rfoot_r2);
		setRotationAngle(rfoot_r2, 0.5672F, 0.0F, 0.0F);
		rfoot_r2.setTextureOffset(145, 57).addBox(-1.5F, -1.5F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
		rfoot_r2.setModelRendererName("rfoot_r2");
		this.registerModelRenderer(rfoot_r2);

		rfoot_r3 = new AnimatedModelRenderer(this);
		rfoot_r3.setRotationPoint(9.1352F, 6.5F, -30.0F);
		rfoot.addChild(rfoot_r3);
		setRotationAngle(rfoot_r3, 0.5672F, 0.3491F, 0.0F);
		rfoot_r3.setTextureOffset(145, 57).addBox(-16.5F, -1.5F, -6.0201F, 9.0F, 3.0F, 12.0F, 0.0F, false);
		rfoot_r3.setModelRendererName("rfoot_r3");
		this.registerModelRenderer(rfoot_r3);

		rfoot_r4 = new AnimatedModelRenderer(this);
		rfoot_r4.setRotationPoint(0.1352F, 6.5F, -24.7701F);
		rfoot.addChild(rfoot_r4);
		setRotationAngle(rfoot_r4, 0.5672F, 0.0F, 0.0F);
		rfoot_r4.setTextureOffset(145, 57).addBox(-10.5F, -1.5F, -6.0F, 6.0F, 3.0F, 12.0F, 0.0F, false);
		rfoot_r4.setModelRendererName("rfoot_r4");
		this.registerModelRenderer(rfoot_r4);

		leftleg = new AnimatedModelRenderer(this);
		leftleg.setRotationPoint(15.0F, -79.6989F, -0.5F);
		all.addChild(leftleg);

		leftleg.setModelRendererName("leftleg");
		this.registerModelRenderer(leftleg);

		upperleftleg = new AnimatedModelRenderer(this);
		upperleftleg.setRotationPoint(-10.076F, -4.1613F, 1.5447F);
		leftleg.addChild(upperleftleg);
		setRotationAngle(upperleftleg, 0.0F, 0.0F, -0.0873F);
		upperleftleg.setTextureOffset(52, 57).addBox(-0.7888F, 1.1613F, -5.3148F, 21.0F, 45.0F, 15.0F, 0.0F, false);
		upperleftleg.setTextureOffset(12, 138).addBox(-2.2888F, 4.9113F, -3.8148F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperleftleg.setTextureOffset(99, 172).addBox(2.5556F, 7.9113F, -7.1796F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		upperleftleg.setTextureOffset(172, 85).addBox(-3.0388F, 4.9113F, -3.0648F, 3.0F, 27.0F, 14.0F, 0.0F, false);
		upperleftleg.setTextureOffset(119, 166).addBox(19.4515F, 22.2264F, -2.3148F, 3.0F, 27.0F, 12.0F, 0.0F, false);
		upperleftleg.setTextureOffset(87, 172).addBox(2.5556F, 10.1613F, 10.8204F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		upperleftleg.setTextureOffset(24, 148).addBox(1.0556F, 4.9113F, 9.3204F, 18.0F, 45.0F, 3.0F, 0.0F, false);
		upperleftleg.setTextureOffset(139, 31).addBox(18.7112F, 4.9113F, -3.8148F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		upperleftleg.setTextureOffset(107, 95).addBox(-0.7888F, 46.1613F, -4.8148F, 21.0F, 9.0F, 16.0F, 0.0F, false);
		upperleftleg.setTextureOffset(139, 171).addBox(2.5556F, 7.9113F, -7.1796F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		upperleftleg.setModelRendererName("upperleftleg");
		this.registerModelRenderer(upperleftleg);

		leftlowerlegs = new AnimatedModelRenderer(this);
		leftlowerlegs.setRotationPoint(5.0F, 53.0F, 0.0F);
		leftleg.addChild(leftlowerlegs);
		leftlowerlegs.setTextureOffset(100, 145).addBox(-12.8648F, 12.25F, -2.2296F, 3.0F, 39.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(112, 135).addBox(8.1352F, 10.0F, -2.2296F, 3.0F, 45.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(33, 161).addBox(8.8852F, 20.5F, -2.2296F, 3.0F, 27.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(75, 171).addBox(-8.0204F, 15.25F, 12.3852F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(0, 171).addBox(-8.0204F, 19.0F, -4.8648F, 15.0F, 27.0F, 3.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(65, 166).addBox(-13.6148F, 18.25F, -0.7296F, 3.0F, 27.0F, 12.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(172, 100).addBox(-9.5204F, 12.25F, -3.3648F, 18.0F, 39.0F, 3.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(130, 31).addBox(-11.3648F, 7.0F, -2.2701F, 21.0F, 9.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(96, 117).addBox(-11.3648F, -5.0F, -5.2701F, 21.0F, 12.0F, 18.0F, 0.0F, false);
		leftlowerlegs.setTextureOffset(80, 100).addBox(-10.6148F, 16.0F, -2.2701F, 21.0F, 42.0F, 15.0F, 0.0F, false);
		leftlowerlegs.setModelRendererName("leftlowerlegs");
		this.registerModelRenderer(leftlowerlegs);

		lfoot = new AnimatedModelRenderer(this);
		lfoot.setRotationPoint(0.0F, 56.0F, 3.0F);
		leftlowerlegs.addChild(lfoot);
		lfoot.setTextureOffset(104, 104).addBox(-10.6352F, 1.0F, -5.2701F, 21.0F, 10.0F, 15.0F, 0.0F, true);
		lfoot.setTextureOffset(141, 69).addBox(-10.6352F, 2.0F, -21.0201F, 21.0F, 9.0F, 18.0F, 0.0F, true);
		lfoot.setTextureOffset(162, 93).addBox(-10.6352F, 5.0F, -26.2701F, 0.0F, 3.0F, 6.0F, 0.0F, true);
		lfoot.setTextureOffset(162, 93).addBox(10.3648F, 5.0F, -24.7701F, 0.0F, 3.0F, 6.0F, 0.0F, true);
		lfoot.setTextureOffset(160, 127).addBox(-10.6352F, 8.0F, -21.0201F, 21.0F, 3.0F, 6.0F, 0.0F, true);
		lfoot.setTextureOffset(157, 80).addBox(-10.6352F, 8.0F, -27.0201F, 12.0F, 3.0F, 6.0F, 0.0F, true);
		lfoot.setTextureOffset(155, 37).addBox(-10.6352F, 8.0F, -30.0201F, 21.0F, 3.0F, 9.0F, 0.0F, true);
		lfoot.setTextureOffset(155, 37).addBox(-10.6352F, 8.0F, -33.0201F, 12.0F, 3.0F, 6.0F, 0.0F, true);
		lfoot.setModelRendererName("lfoot");
		this.registerModelRenderer(lfoot);

		lfoot_r1 = new AnimatedModelRenderer(this);
		lfoot_r1.setRotationPoint(11.1148F, 9.5F, -29.2701F);
		lfoot.addChild(lfoot_r1);
		setRotationAngle(lfoot_r1, 0.0F, -0.3491F, 0.0F);
		lfoot_r1.setTextureOffset(155, 37).addBox(-10.5F, -1.5F, 0.0F, 9.0F, 3.0F, 3.0F, 0.0F, true);
		lfoot_r1.setModelRendererName("lfoot_r1");
		this.registerModelRenderer(lfoot_r1);

		lfoot_r2 = new AnimatedModelRenderer(this);
		lfoot_r2.setRotationPoint(-0.1352F, 6.5F, -26.2701F);
		lfoot.addChild(lfoot_r2);
		setRotationAngle(lfoot_r2, 0.5672F, 0.0F, 0.0F);
		lfoot_r2.setTextureOffset(145, 57).addBox(-10.5F, -1.5F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, true);
		lfoot_r2.setModelRendererName("lfoot_r2");
		this.registerModelRenderer(lfoot_r2);

		lfoot_r3 = new AnimatedModelRenderer(this);
		lfoot_r3.setRotationPoint(-9.1352F, 6.5F, -30.0F);
		lfoot.addChild(lfoot_r3);
		setRotationAngle(lfoot_r3, 0.5672F, -0.3491F, 0.0F);
		lfoot_r3.setTextureOffset(145, 57).addBox(7.5F, -1.5F, -6.0201F, 9.0F, 3.0F, 12.0F, 0.0F, true);
		lfoot_r3.setModelRendererName("lfoot_r3");
		this.registerModelRenderer(lfoot_r3);

		lfoot_r4 = new AnimatedModelRenderer(this);
		lfoot_r4.setRotationPoint(-0.1352F, 6.5F, -24.7701F);
		lfoot.addChild(lfoot_r4);
		setRotationAngle(lfoot_r4, 0.5672F, 0.0F, 0.0F);
		lfoot_r4.setTextureOffset(145, 57).addBox(4.5F, -1.5F, -6.0F, 6.0F, 3.0F, 12.0F, 0.0F, true);
		lfoot_r4.setModelRendererName("lfoot_r4");
		this.registerModelRenderer(lfoot_r4);

		torso = new AnimatedModelRenderer(this);
		torso.setRotationPoint(0.0F, -79.6989F, -0.5F);
		all.addChild(torso);
		torso.setTextureOffset(64, 45).addBox(-37.5F, -97.0F, -6.0F, 75.0F, 49.0F, 21.0F, 0.0F, false);
		torso.setTextureOffset(0, 23).addBox(-28.5F, -48.0F, -6.0F, 57.0F, 48.0F, 21.0F, 0.0F, false);
		torso.setModelRendererName("torso");
		this.registerModelRenderer(torso);

		movy = new AnimatedModelRenderer(this);
		movy.setRotationPoint(-3.0F, 71.5F, -4.75F);
		torso.addChild(movy);
		movy.setTextureOffset(0, 57).addBox(-14.25F, -168.5F, -7.25F, 36.0F, 49.0F, 6.0F, 0.0F, false);
		movy.setTextureOffset(50, 127).addBox(-1.3963F, -122.0305F, 16.75F, 8.0F, 50.0F, 10.0F, 0.0F, false);
		movy.setTextureOffset(50, 127).addBox(-1.5F, -122.5F, -8.25F, 9.0F, 51.0F, 9.0F, 0.0F, false);
		movy.setModelRendererName("movy");
		this.registerModelRenderer(movy);

		movy_r1 = new AnimatedModelRenderer(this);
		movy_r1.setRotationPoint(29.25F, -143.5F, 0.25F);
		movy.addChild(movy_r1);
		setRotationAngle(movy_r1, 0.0F, -0.2618F, 0.0F);
		movy_r1.setTextureOffset(115, 77).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);
		movy_r1.setModelRendererName("movy_r1");
		this.registerModelRenderer(movy_r1);

		movy_r2 = new AnimatedModelRenderer(this);
		movy_r2.setRotationPoint(-23.25F, -143.5F, 0.25F);
		movy.addChild(movy_r2);
		setRotationAngle(movy_r2, 0.0F, 0.2618F, 0.0F);
		movy_r2.setTextureOffset(0, 117).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);
		movy_r2.setModelRendererName("movy_r2");
		this.registerModelRenderer(movy_r2);

		yes_r1 = new AnimatedModelRenderer(this);
		yes_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		movy.addChild(yes_r1);
		setRotationAngle(yes_r1, 0.0F, 0.1309F, -0.1745F);
		yes_r1.setTextureOffset(96, 127).addBox(-4.018F, -120.9001F, -4.9741F, 24.0F, 45.0F, 2.0F, 0.0F, false);
		yes_r1.setModelRendererName("yes_r1");
		this.registerModelRenderer(yes_r1);

		yes_r2 = new AnimatedModelRenderer(this);
		yes_r2.setRotationPoint(4.75F, -0.25F, 0.0F);
		movy.addChild(yes_r2);
		setRotationAngle(yes_r2, 0.0F, -0.1309F, 0.1745F);
		yes_r2.setTextureOffset(34, 119).addBox(-17.6818F, -120.5182F, -3.7865F, 15.0F, 48.0F, 9.0F, 0.0F, false);
		yes_r2.setTextureOffset(34, 119).addBox(-19.4347F, -120.8709F, -5.7626F, 26.0F, 46.0F, 9.0F, 0.0F, false);
		yes_r2.setModelRendererName("yes_r2");
		this.registerModelRenderer(yes_r2);

		yes_r3 = new AnimatedModelRenderer(this);
		yes_r3.setRotationPoint(5.75F, -1.25F, 6.25F);
		movy.addChild(yes_r3);
		setRotationAngle(yes_r3, 0.0F, 0.0F, 0.1745F);
		yes_r3.setTextureOffset(40, 77).addBox(4.9109F, -122.5182F, -7.5F, 9.0F, 48.0F, 21.0F, 0.0F, false);
		yes_r3.setModelRendererName("yes_r3");
		this.registerModelRenderer(yes_r3);

		yes_r4 = new AnimatedModelRenderer(this);
		yes_r4.setRotationPoint(10.75F, 0.0F, 1.25F);
		movy.addChild(yes_r4);
		setRotationAngle(yes_r4, 0.0F, -0.2618F, 0.1745F);

		yes_r4.setModelRendererName("yes_r4");
		this.registerModelRenderer(yes_r4);

		yes_r5 = new AnimatedModelRenderer(this);
		yes_r5.setRotationPoint(-4.75F, 0.0F, 1.25F);
		movy.addChild(yes_r5);
		setRotationAngle(yes_r5, 0.0F, 0.2618F, -0.1745F);

		yes_r5.setModelRendererName("yes_r5");
		this.registerModelRenderer(yes_r5);

		yes_r6 = new AnimatedModelRenderer(this);
		yes_r6.setRotationPoint(-4.75F, -0.25F, 6.25F);
		movy.addChild(yes_r6);
		setRotationAngle(yes_r6, 0.0F, 0.0F, -0.1745F);
		yes_r6.setTextureOffset(20, 77).addBox(-8.5637F, -122.4878F, -7.5F, 9.0F, 48.0F, 21.0F, 0.0F, false);
		yes_r6.setModelRendererName("yes_r6");
		this.registerModelRenderer(yes_r6);

		yes_r7 = new AnimatedModelRenderer(this);
		yes_r7.setRotationPoint(8.0F, 7.5F, 2.75F);
		movy.addChild(yes_r7);
		setRotationAngle(yes_r7, 0.0F, -0.2618F, 0.0F);
		yes_r7.setTextureOffset(140, 135).addBox(-3.5F, -85.0F, -8.5F, 27.0F, 6.0F, 9.0F, 0.0F, false);
		yes_r7.setModelRendererName("yes_r7");
		this.registerModelRenderer(yes_r7);

		yes_r8 = new AnimatedModelRenderer(this);
		yes_r8.setRotationPoint(-2.0F, 7.5F, 2.75F);
		movy.addChild(yes_r8);
		setRotationAngle(yes_r8, 0.0F, 0.2618F, 0.0F);
		yes_r8.setTextureOffset(140, 52).addBox(-23.5F, -85.0F, -8.5F, 27.0F, 6.0F, 9.0F, 0.0F, false);
		yes_r8.setModelRendererName("yes_r8");
		this.registerModelRenderer(yes_r8);

		movy2 = new AnimatedModelRenderer(this);
		movy2.setRotationPoint(15.0F, 71.5F, 37.25F);
		torso.addChild(movy2);
		setRotationAngle(movy2, 0.0F, 3.1416F, 0.0F);
		movy2.setTextureOffset(172, 3).addBox(-2.25F, -168.5F, 16.75F, 36.0F, 49.0F, 6.0F, 0.0F, false);
		movy2.setTextureOffset(33, 77).addBox(10.5F, -77.3713F, 40.799F, 9.0F, 6.0F, 9.0F, 0.0F, false);
		movy2.setTextureOffset(87, 161).addBox(10.5F, -122.3713F, 40.049F, 9.0F, 24.0F, 9.0F, 0.0F, false);
		movy2.setModelRendererName("movy2");
		this.registerModelRenderer(movy2);

		movy_r3 = new AnimatedModelRenderer(this);
		movy_r3.setRotationPoint(41.25F, -143.5F, 24.25F);
		movy2.addChild(movy_r3);
		setRotationAngle(movy_r3, 0.0F, -0.2618F, 0.0F);
		movy_r3.setTextureOffset(60, 112).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);
		movy_r3.setModelRendererName("movy_r3");
		this.registerModelRenderer(movy_r3);

		movy_r4 = new AnimatedModelRenderer(this);
		movy_r4.setRotationPoint(-11.25F, -143.5F, 24.25F);
		movy2.addChild(movy_r4);
		setRotationAngle(movy_r4, 0.0F, 0.2618F, 0.0F);
		movy_r4.setTextureOffset(78, 114).addBox(-10.5F, -25.0F, -4.5F, 21.0F, 49.0F, 6.0F, 0.0F, false);
		movy_r4.setModelRendererName("movy_r4");
		this.registerModelRenderer(movy_r4);

		yes_r9 = new AnimatedModelRenderer(this);
		yes_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		movy2.addChild(yes_r9);
		setRotationAngle(yes_r9, 0.0F, 0.1309F, -0.1745F);
		yes_r9.setTextureOffset(122, 122).addBox(16.1864F, -118.0758F, 19.0255F, 13.0F, 44.0F, 8.0F, 0.0F, false);
		yes_r9.setModelRendererName("yes_r9");
		this.registerModelRenderer(yes_r9);

		yes_r10 = new AnimatedModelRenderer(this);
		yes_r10.setRotationPoint(4.75F, -0.25F, 0.0F);
		movy2.addChild(yes_r10);
		setRotationAngle(yes_r10, 0.0F, -0.1309F, 0.1745F);
		yes_r10.setTextureOffset(18, 119).addBox(-4.7259F, -122.4739F, 15.5813F, 14.0F, 47.0F, 8.0F, 0.0F, false);
		yes_r10.setModelRendererName("yes_r10");
		this.registerModelRenderer(yes_r10);

		yes_r11 = new AnimatedModelRenderer(this);
		yes_r11.setRotationPoint(5.75F, -1.25F, 6.25F);
		movy2.addChild(yes_r11);
		setRotationAngle(yes_r11, 0.0F, 0.0F, 0.1745F);
		yes_r11.setTextureOffset(0, 75).addBox(16.5637F, -124.4878F, 16.5F, 9.0F, 48.0F, 21.0F, 0.0F, false);
		yes_r11.setModelRendererName("yes_r11");
		this.registerModelRenderer(yes_r11);

		yes_r12 = new AnimatedModelRenderer(this);
		yes_r12.setRotationPoint(10.75F, 0.0F, 1.25F);
		movy2.addChild(yes_r12);
		setRotationAngle(yes_r12, 0.0F, -0.2618F, 0.1745F);
		yes_r12.setTextureOffset(0, 98).addBox(5.0049F, -124.9435F, 15.3564F, 20.0F, 49.0F, 8.0F, 0.0F, false);
		yes_r12.setModelRendererName("yes_r12");
		this.registerModelRenderer(yes_r12);

		yes_r13 = new AnimatedModelRenderer(this);
		yes_r13.setRotationPoint(-4.75F, 0.0F, 1.25F);
		movy2.addChild(yes_r13);
		setRotationAngle(yes_r13, 0.0F, 0.2618F, -0.1745F);
		yes_r13.setTextureOffset(60, 93).addBox(-2.43F, -120.7768F, 21.4737F, 20.0F, 48.0F, 7.0F, 0.0F, false);
		yes_r13.setModelRendererName("yes_r13");
		this.registerModelRenderer(yes_r13);

		yes_r14 = new AnimatedModelRenderer(this);
		yes_r14.setRotationPoint(-4.75F, -0.25F, 6.25F);
		movy2.addChild(yes_r14);
		setRotationAngle(yes_r14, 0.0F, 0.0F, -0.1745F);
		yes_r14.setTextureOffset(69, 70).addBox(3.7527F, -120.3445F, 16.5F, 9.0F, 48.0F, 20.0F, 0.0F, false);
		yes_r14.setModelRendererName("yes_r14");
		this.registerModelRenderer(yes_r14);

		yes_r15 = new AnimatedModelRenderer(this);
		yes_r15.setRotationPoint(8.0F, 7.5F, 2.75F);
		movy2.addChild(yes_r15);
		setRotationAngle(yes_r15, 0.0F, -0.2618F, 0.0F);
		yes_r15.setTextureOffset(136, 0).addBox(14.1347F, -85.0F, 8.7199F, 19.0F, 6.0F, 9.0F, 0.0F, false);
		yes_r15.setModelRendererName("yes_r15");
		this.registerModelRenderer(yes_r15);

		yes_r16 = new AnimatedModelRenderer(this);
		yes_r16.setRotationPoint(-2.0F, 7.5F, 2.75F);
		movy2.addChild(yes_r16);
		setRotationAngle(yes_r16, 0.0F, 0.2618F, 0.0F);
		yes_r16.setTextureOffset(135, 17).addBox(-11.5F, -85.0F, 14.9046F, 20.0F, 6.0F, 9.0F, 0.0F, false);
		yes_r16.setModelRendererName("yes_r16");
		this.registerModelRenderer(yes_r16);

		yesr_17 = new AnimatedModelRenderer(this);
		yesr_17.setRotationPoint(23.0F, -69.5F, 28.75F);
		movy2.addChild(yesr_17);

		yesr_17.setModelRendererName("yesr_17");
		this.registerModelRenderer(yesr_17);

		MAMADISIMOMOMENTO = new AnimatedModelRenderer(this);
		MAMADISIMOMOMENTO.setRotationPoint(0.0F, 79.6989F, 0.5F);
		torso.addChild(MAMADISIMOMOMENTO);

		MAMADISIMOMOMENTO.setModelRendererName("MAMADISIMOMOMENTO");
		this.registerModelRenderer(MAMADISIMOMOMENTO);

		MAMADOTE0 = new AnimatedModelRenderer(this);
		MAMADOTE0.setRotationPoint(-0.7329F, -26.5F, -3.4885F);
		MAMADISIMOMOMENTO.addChild(MAMADOTE0);
		MAMADOTE0.setTextureOffset(89, 68).addBox(-32.2671F, -144.1023F, -10.5115F, 30.0F, 21.0F, 12.0F, 0.0F, false);
		MAMADOTE0.setModelRendererName("MAMADOTE0");
		this.registerModelRenderer(MAMADOTE0);

		MAMADISIMO9_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO9_r1.setRotationPoint(-24.0685F, -88.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO9_r1);
		setRotationAngle(MAMADISIMO9_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO9_r1.setTextureOffset(177, 14).addBox(-7.4486F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO9_r1.setModelRendererName("MAMADISIMO9_r1");
		this.registerModelRenderer(MAMADISIMO9_r1);

		MAMADISIMO8_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO8_r1.setRotationPoint(-18.0685F, -70.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO8_r1);
		setRotationAngle(MAMADISIMO8_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO8_r1.setTextureOffset(177, 132).addBox(-7.4486F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO8_r1.setModelRendererName("MAMADISIMO8_r1");
		this.registerModelRenderer(MAMADISIMO8_r1);

		MAMADISIMO7_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO7_r1.setRotationPoint(2.9315F, -70.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO7_r1);
		setRotationAngle(MAMADISIMO7_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO7_r1.setTextureOffset(178, 18).addBox(-7.4486F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO7_r1.setModelRendererName("MAMADISIMO7_r1");
		this.registerModelRenderer(MAMADISIMO7_r1);

		MAMADISIMO6_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO6_r1.setRotationPoint(2.9315F, -88.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO6_r1);
		setRotationAngle(MAMADISIMO6_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO6_r1.setTextureOffset(178, 22).addBox(-7.4486F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO6_r1.setModelRendererName("MAMADISIMO6_r1");
		this.registerModelRenderer(MAMADISIMO6_r1);

		MAMADISIMO5_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO5_r1.setRotationPoint(2.9315F, -109.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO5_r1);
		setRotationAngle(MAMADISIMO5_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO5_r1.setTextureOffset(178, 35).addBox(-7.4486F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO5_r1.setModelRendererName("MAMADISIMO5_r1");
		this.registerModelRenderer(MAMADISIMO5_r1);

		MAMADISIMO4_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO4_r1.setRotationPoint(-27.0685F, -109.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO4_r1);
		setRotationAngle(MAMADISIMO4_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO4_r1.setTextureOffset(178, 76).addBox(-7.4486F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO4_r1.setModelRendererName("MAMADISIMO4_r1");
		this.registerModelRenderer(MAMADISIMO4_r1);

		MAMADISIMO3_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO3_r1.setRotationPoint(-33.0685F, -133.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO3_r1);
		setRotationAngle(MAMADISIMO3_r1, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO3_r1.setTextureOffset(173, 10).addBox(-10.4486F, -4.4966F, -0.7844F, 21.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO3_r1.setModelRendererName("MAMADISIMO3_r1");
		this.registerModelRenderer(MAMADISIMO3_r1);

		MAMADISIMO2_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO2_r1.setRotationPoint(-17.2671F, -117.8523F, -3.0115F);
		MAMADOTE0.addChild(MAMADISIMO2_r1);
		setRotationAngle(MAMADISIMO2_r1, 0.9599F, 0.0F, 0.0F);
		MAMADISIMO2_r1.setTextureOffset(152, 76).addBox(-15.0F, -9.0F, 0.0F, 30.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO2_r1.setModelRendererName("MAMADISIMO2_r1");
		this.registerModelRenderer(MAMADISIMO2_r1);

		MAMADISIMO1_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO1_r1.setRotationPoint(-17.2671F, -144.1023F, -10.5115F);
		MAMADOTE0.addChild(MAMADISIMO1_r1);
		setRotationAngle(MAMADISIMO1_r1, -0.9599F, 0.0F, 0.0F);
		MAMADISIMO1_r1.setTextureOffset(153, 125).addBox(-15.0F, -9.0F, 0.0F, 30.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO1_r1.setModelRendererName("MAMADISIMO1_r1");
		this.registerModelRenderer(MAMADISIMO1_r1);

		MAMADISIMO10_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO10_r1.setRotationPoint(28.5342F, -106.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO10_r1);
		setRotationAngle(MAMADISIMO10_r1, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO10_r1.setTextureOffset(126, 62).addBox(-4.5514F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO10_r1.setModelRendererName("MAMADISIMO10_r1");
		this.registerModelRenderer(MAMADISIMO10_r1);

		MAMADISIMO9_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO9_r2.setRotationPoint(25.5342F, -85.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO9_r2);
		setRotationAngle(MAMADISIMO9_r2, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO9_r2.setTextureOffset(158, 129).addBox(-4.5514F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO9_r2.setModelRendererName("MAMADISIMO9_r2");
		this.registerModelRenderer(MAMADISIMO9_r2);

		MAMADISIMO8_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO8_r2.setRotationPoint(19.5342F, -67.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO8_r2);
		setRotationAngle(MAMADISIMO8_r2, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO8_r2.setTextureOffset(173, 149).addBox(-4.5514F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO8_r2.setModelRendererName("MAMADISIMO8_r2");
		this.registerModelRenderer(MAMADISIMO8_r2);

		MAMADISIMO7_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO7_r2.setRotationPoint(-1.4658F, -67.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO7_r2);
		setRotationAngle(MAMADISIMO7_r2, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO7_r2.setTextureOffset(175, 31).addBox(-4.5514F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO7_r2.setModelRendererName("MAMADISIMO7_r2");
		this.registerModelRenderer(MAMADISIMO7_r2);

		MAMADISIMO6_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO6_r2.setRotationPoint(-1.4658F, -85.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO6_r2);
		setRotationAngle(MAMADISIMO6_r2, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO6_r2.setTextureOffset(187, 91).addBox(-4.5514F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO6_r2.setModelRendererName("MAMADISIMO6_r2");
		this.registerModelRenderer(MAMADISIMO6_r2);

		MAMADISIMO5_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO5_r2.setRotationPoint(-1.4658F, -106.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO5_r2);
		setRotationAngle(MAMADISIMO5_r2, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO5_r2.setTextureOffset(176, 55).addBox(-4.5514F, -4.4966F, -0.7844F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO5_r2.setModelRendererName("MAMADISIMO5_r2");
		this.registerModelRenderer(MAMADISIMO5_r2);

		MAMADISIMO4_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO4_r2.setRotationPoint(-1.4658F, -133.6023F, -5.9771F);
		MAMADOTE0.addChild(MAMADISIMO4_r2);
		setRotationAngle(MAMADISIMO4_r2, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO4_r2.setTextureOffset(170, 27).addBox(-10.5514F, -4.4966F, -0.7844F, 21.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO4_r2.setModelRendererName("MAMADISIMO4_r2");
		this.registerModelRenderer(MAMADISIMO4_r2);

		MAMADOTE1 = new AnimatedModelRenderer(this);
		MAMADOTE1.setRotationPoint(11.2671F, -26.5F, -3.4885F);
		MAMADISIMOMOMENTO.addChild(MAMADOTE1);
		MAMADOTE1.setTextureOffset(85, 89).addBox(-8.2671F, -144.1023F, -10.5115F, 30.0F, 21.0F, 12.0F, 0.0F, false);
		MAMADOTE1.setModelRendererName("MAMADOTE1");
		this.registerModelRenderer(MAMADOTE1);

		MAMADISIMO4_r3 = new AnimatedModelRenderer(this);
		MAMADISIMO4_r3.setRotationPoint(-9.0685F, -133.6023F, -5.9771F);
		MAMADOTE1.addChild(MAMADISIMO4_r3);
		setRotationAngle(MAMADISIMO4_r3, 1.2217F, 0.0F, 1.5708F);
		MAMADISIMO4_r3.setTextureOffset(53, 77).addBox(-10.4486F, -4.4966F, -0.7844F, 21.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO4_r3.setModelRendererName("MAMADISIMO4_r3");
		this.registerModelRenderer(MAMADISIMO4_r3);

		MAMADISIMO3_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO3_r2.setRotationPoint(6.7329F, -117.8523F, -3.0115F);
		MAMADOTE1.addChild(MAMADISIMO3_r2);
		setRotationAngle(MAMADISIMO3_r2, 0.9599F, 0.0F, 0.0F);
		MAMADISIMO3_r2.setTextureOffset(116, 118).addBox(-15.0F, -9.0F, 0.0F, 30.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO3_r2.setModelRendererName("MAMADISIMO3_r2");
		this.registerModelRenderer(MAMADISIMO3_r2);

		MAMADISIMO2_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO2_r2.setRotationPoint(6.7329F, -144.1023F, -10.5115F);
		MAMADOTE1.addChild(MAMADISIMO2_r2);
		setRotationAngle(MAMADISIMO2_r2, -0.9599F, 0.0F, 0.0F);
		MAMADISIMO2_r2.setTextureOffset(145, 140).addBox(-15.0F, -9.0F, 0.0F, 30.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO2_r2.setModelRendererName("MAMADISIMO2_r2");
		this.registerModelRenderer(MAMADISIMO2_r2);

		MAMADISIMO5_r3 = new AnimatedModelRenderer(this);
		MAMADISIMO5_r3.setRotationPoint(22.5342F, -133.6023F, -5.9771F);
		MAMADOTE1.addChild(MAMADISIMO5_r3);
		setRotationAngle(MAMADISIMO5_r3, 1.2217F, 0.0F, -1.5708F);
		MAMADISIMO5_r3.setTextureOffset(167, 96).addBox(-10.5514F, -4.4966F, -0.7844F, 21.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO5_r3.setModelRendererName("MAMADISIMO5_r3");
		this.registerModelRenderer(MAMADISIMO5_r3);

		MINIMAMADISIMO = new AnimatedModelRenderer(this);
		MINIMAMADISIMO.setRotationPoint(0.0F, 40.3011F, -0.5F);
		MAMADISIMOMOMENTO.addChild(MINIMAMADISIMO);
		MINIMAMADISIMO.setTextureOffset(100, 57).addBox(3.0F, -183.9034F, -13.5F, 24.0F, 15.0F, 15.0F, 0.0F, false);
		MINIMAMADISIMO.setTextureOffset(89, 79).addBox(-27.0F, -183.9034F, -13.5F, 24.0F, 15.0F, 15.0F, 0.0F, false);
		MINIMAMADISIMO.setTextureOffset(121, 52).addBox(-24.0F, -162.9034F, -13.5F, 21.0F, 15.0F, 15.0F, 0.0F, false);
		MINIMAMADISIMO.setTextureOffset(117, 67).addBox(3.0F, -162.9034F, -13.5F, 21.0F, 15.0F, 15.0F, 0.0F, false);
		MINIMAMADISIMO.setTextureOffset(138, 125).addBox(3.0F, -144.9034F, -13.5F, 15.0F, 15.0F, 15.0F, 0.0F, false);
		MINIMAMADISIMO.setTextureOffset(24, 138).addBox(-18.0F, -144.9034F, -13.5F, 15.0F, 15.0F, 15.0F, 0.0F, false);
		MINIMAMADISIMO.setModelRendererName("MINIMAMADISIMO");
		this.registerModelRenderer(MINIMAMADISIMO);

		MAMADISIMO7_r3 = new AnimatedModelRenderer(this);
		MAMADISIMO7_r3.setRotationPoint(-3.0F, -124.6534F, -6.0F);
		MINIMAMADISIMO.addChild(MAMADISIMO7_r3);
		setRotationAngle(MAMADISIMO7_r3, 0.9599F, 0.0F, 0.0F);
		MAMADISIMO7_r3.setTextureOffset(178, 90).addBox(-15.0F, -9.0F, 0.0F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO7_r3.setTextureOffset(63, 179).addBox(6.0F, -9.0F, 0.0F, 15.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO7_r3.setModelRendererName("MAMADISIMO7_r3");
		this.registerModelRenderer(MAMADISIMO7_r3);

		MAMADISIMO12_r1 = new AnimatedModelRenderer(this);
		MAMADISIMO12_r1.setRotationPoint(12.0F, -189.0F, -6.0F);
		MINIMAMADISIMO.addChild(MAMADISIMO12_r1);
		setRotationAngle(MAMADISIMO12_r1, -0.9599F, 0.0F, 0.0F);
		MAMADISIMO12_r1.setTextureOffset(202, 12).addBox(-9.0F, 6.0F, 0.0F, 24.0F, 3.0F, 3.0F, 0.0F, false);
		MAMADISIMO12_r1.setTextureOffset(87, 0).addBox(-39.0F, 6.0F, 0.0F, 24.0F, 3.0F, 3.0F, 0.0F, false);
		MAMADISIMO12_r1.setModelRendererName("MAMADISIMO12_r1");
		this.registerModelRenderer(MAMADISIMO12_r1);

		MAMADISIMO10_r2 = new AnimatedModelRenderer(this);
		MAMADISIMO10_r2.setRotationPoint(-15.0F, -168.0F, -6.0F);
		MINIMAMADISIMO.addChild(MAMADISIMO10_r2);
		setRotationAngle(MAMADISIMO10_r2, -0.9599F, 0.0F, 0.0F);
		MAMADISIMO10_r2.setTextureOffset(76, 68).addBox(-9.0F, 6.0F, 0.0F, 21.0F, 3.0F, 3.0F, 0.0F, false);
		MAMADISIMO10_r2.setTextureOffset(105, 0).addBox(18.0F, 6.0F, 0.0F, 21.0F, 3.0F, 3.0F, 0.0F, false);
		MAMADISIMO10_r2.setModelRendererName("MAMADISIMO10_r2");
		this.registerModelRenderer(MAMADISIMO10_r2);

		MAMADISIMO8_r3 = new AnimatedModelRenderer(this);
		MAMADISIMO8_r3.setRotationPoint(12.0F, -150.0F, -6.0F);
		MINIMAMADISIMO.addChild(MAMADISIMO8_r3);
		setRotationAngle(MAMADISIMO8_r3, -0.9599F, 0.0F, 0.0F);
		MAMADISIMO8_r3.setTextureOffset(33, 82).addBox(-9.0F, 6.0F, 0.0F, 15.0F, 3.0F, 3.0F, 0.0F, false);
		MAMADISIMO8_r3.setTextureOffset(148, 50).addBox(-30.0F, 6.0F, 0.0F, 15.0F, 3.0F, 3.0F, 0.0F, false);
		MAMADISIMO8_r3.setModelRendererName("MAMADISIMO8_r3");
		this.registerModelRenderer(MAMADISIMO8_r3);

		MAMADISIMO6_r3 = new AnimatedModelRenderer(this);
		MAMADISIMO6_r3.setRotationPoint(-9.0F, -142.6534F, -6.0F);
		MINIMAMADISIMO.addChild(MAMADISIMO6_r3);
		setRotationAngle(MAMADISIMO6_r3, 0.9599F, 0.0F, 0.0F);
		MAMADISIMO6_r3.setTextureOffset(53, 81).addBox(-15.0F, -9.0F, 0.0F, 21.0F, 6.0F, 3.0F, 0.0F, false);
		MAMADISIMO6_r3.setTextureOffset(70, 152).addBox(12.0F, -9.0F, 0.0F, 21.0F, 6.0F, 3.0F, 0.0F, false);
		MAMADISIMO6_r3.setModelRendererName("MAMADISIMO6_r3");
		this.registerModelRenderer(MAMADISIMO6_r3);

		MAMADISIMO5_r4 = new AnimatedModelRenderer(this);
		MAMADISIMO5_r4.setRotationPoint(-12.0F, -163.6534F, -6.0F);
		MINIMAMADISIMO.addChild(MAMADISIMO5_r4);
		setRotationAngle(MAMADISIMO5_r4, 0.9599F, 0.0F, 0.0F);
		MAMADISIMO5_r4.setTextureOffset(103, 40).addBox(-15.0F, -9.0F, 0.0F, 24.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO5_r4.setTextureOffset(111, 23).addBox(15.0F, -9.0F, 0.0F, 24.0F, 9.0F, 3.0F, 0.0F, false);
		MAMADISIMO5_r4.setModelRendererName("MAMADISIMO5_r4");
		this.registerModelRenderer(MAMADISIMO5_r4);

		shoulders = new AnimatedModelRenderer(this);
		shoulders.setRotationPoint(0.0F, 80.0F, 0.0F);
		torso.addChild(shoulders);

		shoulders.setModelRendererName("shoulders");
		this.registerModelRenderer(shoulders);

		shoulderarea2 = new AnimatedModelRenderer(this);
		shoulderarea2.setRotationPoint(0.0F, -180.0F, 0.0F);
		shoulders.addChild(shoulderarea2);
		shoulderarea2.setTextureOffset(148, 20).addBox(-18.75F, -6.5F, -6.0F, 36.0F, 3.0F, 18.0F, 0.0F, false);
		shoulderarea2.setModelRendererName("shoulderarea2");
		this.registerModelRenderer(shoulderarea2);

		cube_r1 = new AnimatedModelRenderer(this);
		cube_r1.setRotationPoint(26.25F, -0.5F, 3.0F);
		shoulderarea2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.setTextureOffset(117, 40).addBox(-10.5F, -1.5F, -9.0F, 21.0F, 3.0F, 18.0F, 0.0F, false);
		cube_r1.setModelRendererName("cube_r1");
		this.registerModelRenderer(cube_r1);

		cube_r2 = new AnimatedModelRenderer(this);
		cube_r2.setRotationPoint(-27.75F, -0.5F, 3.0F);
		shoulderarea2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.setTextureOffset(122, 111).addBox(-10.5F, -1.5F, -9.0F, 21.0F, 3.0F, 18.0F, 0.0F, false);
		cube_r2.setModelRendererName("cube_r2");
		this.registerModelRenderer(cube_r2);

		cube_r20 = new AnimatedModelRenderer(this);
		cube_r20.setRotationPoint(-2.4F, 105.975F, 6.15F);
		shoulderarea2.addChild(cube_r20);
		setRotationAngle(cube_r20, -2.3126F, 0.0F, 0.0F);

		cube_r20.setModelRendererName("cube_r20");
		this.registerModelRenderer(cube_r20);

		cube_r13_r1 = new AnimatedModelRenderer(this);
		cube_r13_r1.setRotationPoint(3.6F, -280.597F, 113.735F);
		cube_r20.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 1.7453F, 0.0F, 0.0F);
		cube_r13_r1.setTextureOffset(122, 47).addBox(-18.75F, -249.5206F, -326.4897F, 36.0F, 12.0F, 3.0F, 0.0F, false);
		cube_r13_r1.setModelRendererName("cube_r13_r1");
		this.registerModelRenderer(cube_r13_r1);

		cube_r12_r1 = new AnimatedModelRenderer(this);
		cube_r12_r1.setRotationPoint(1.2F, -307.3075F, 104.5539F);
		cube_r20.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.1745F, 0.0F, 0.0F);
		cube_r12_r1.setTextureOffset(133, 84).addBox(-18.0F, 393.6891F, -122.9028F, 36.0F, 12.0F, 3.0F, 0.0F, false);
		cube_r12_r1.setModelRendererName("cube_r12_r1");
		this.registerModelRenderer(cube_r12_r1);

		cube_r13 = new AnimatedModelRenderer(this);
		cube_r13.setRotationPoint(-8.2634F, 144.5247F, 5.2993F);
		shoulderarea2.addChild(cube_r13);

		cube_r13.setModelRendererName("cube_r13");
		this.registerModelRenderer(cube_r13);

		cube_r20_r1 = new AnimatedModelRenderer(this);
		cube_r20_r1.setRotationPoint(-14.1062F, -143.2409F, -10.2907F);
		cube_r13.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, -0.4363F, 0.2618F, 0.0F);
		cube_r20_r1.setTextureOffset(57, 2).addBox(1.5508F, -6.1685F, -2.623F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20_r1.setTextureOffset(57, 4).addBox(-0.9132F, -4.4553F, -2.6392F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20_r1.setModelRendererName("cube_r20_r1");
		this.registerModelRenderer(cube_r20_r1);

		cube_r20_r2 = new AnimatedModelRenderer(this);
		cube_r20_r2.setRotationPoint(-23.8562F, -137.2409F, -10.2907F);
		cube_r13.addChild(cube_r20_r2);
		setRotationAngle(cube_r20_r2, -0.4363F, 0.2618F, 0.0F);
		cube_r20_r2.setTextureOffset(57, 0).addBox(-0.9132F, -4.4553F, -2.6392F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20_r2.setModelRendererName("cube_r20_r2");
		this.registerModelRenderer(cube_r20_r2);

		cube_r19_r1 = new AnimatedModelRenderer(this);
		cube_r19_r1.setRotationPoint(-14.8562F, -143.2409F, -9.5407F);
		cube_r13.addChild(cube_r19_r1);
		setRotationAngle(cube_r19_r1, -0.4363F, 0.2618F, 0.0F);
		cube_r19_r1.setTextureOffset(47, 60).addBox(-3.5323F, -2.7164F, -2.575F, 9.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r19_r1.setModelRendererName("cube_r19_r1");
		this.registerModelRenderer(cube_r19_r1);

		cube_r18_r1 = new AnimatedModelRenderer(this);
		cube_r18_r1.setRotationPoint(-12.6062F, -143.9909F, -10.2907F);
		cube_r13.addChild(cube_r18_r1);
		setRotationAngle(cube_r18_r1, -0.4363F, 0.2618F, 0.0F);
		cube_r18_r1.setTextureOffset(66, 41).addBox(-3.5323F, -2.7164F, -2.575F, 9.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r18_r1.setModelRendererName("cube_r18_r1");
		this.registerModelRenderer(cube_r18_r1);

		cube_r17_r1 = new AnimatedModelRenderer(this);
		cube_r17_r1.setRotationPoint(-14.1062F, -142.4909F, -10.2907F);
		cube_r13.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, -0.4363F, 0.2618F, 0.0F);
		cube_r17_r1.setTextureOffset(220, 53).addBox(-8.2881F, -0.9984F, -2.7889F, 15.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r17_r1.setModelRendererName("cube_r17_r1");
		this.registerModelRenderer(cube_r17_r1);

		cube_r11 = new AnimatedModelRenderer(this);
		cube_r11.setRotationPoint(8.2634F, 144.5247F, 5.2993F);
		shoulderarea2.addChild(cube_r11);

		cube_r11.setModelRendererName("cube_r11");
		this.registerModelRenderer(cube_r11);

		cube_r21_r1 = new AnimatedModelRenderer(this);
		cube_r21_r1.setRotationPoint(13.3562F, -143.2409F, -9.5407F);
		cube_r11.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, -0.4363F, -0.2618F, 0.0F);
		cube_r21_r1.setTextureOffset(45, 25).addBox(-7.5508F, -6.1685F, -2.623F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r21_r1.setModelRendererName("cube_r21_r1");
		this.registerModelRenderer(cube_r21_r1);

		cube_r21_r2 = new AnimatedModelRenderer(this);
		cube_r21_r2.setRotationPoint(23.8562F, -137.2409F, -10.2907F);
		cube_r11.addChild(cube_r21_r2);
		setRotationAngle(cube_r21_r2, -0.4363F, -0.2618F, 0.0F);
		cube_r21_r2.setTextureOffset(45, 27).addBox(-5.0868F, -4.4553F, -2.6392F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r21_r2.setModelRendererName("cube_r21_r2");
		this.registerModelRenderer(cube_r21_r2);

		cube_r20_r3 = new AnimatedModelRenderer(this);
		cube_r20_r3.setRotationPoint(13.3562F, -143.2409F, -10.2907F);
		cube_r11.addChild(cube_r20_r3);
		setRotationAngle(cube_r20_r3, -0.4363F, -0.2618F, 0.0F);
		cube_r20_r3.setTextureOffset(26, 57).addBox(-5.0868F, -4.4553F, -2.6392F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20_r3.setModelRendererName("cube_r20_r3");
		this.registerModelRenderer(cube_r20_r3);

		cube_r20_r4 = new AnimatedModelRenderer(this);
		cube_r20_r4.setRotationPoint(14.1062F, -143.2409F, -9.5407F);
		cube_r11.addChild(cube_r20_r4);
		setRotationAngle(cube_r20_r4, -0.4363F, -0.2618F, 0.0F);
		cube_r20_r4.setTextureOffset(35, 49).addBox(-5.4677F, -2.7164F, -2.575F, 9.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20_r4.setModelRendererName("cube_r20_r4");
		this.registerModelRenderer(cube_r20_r4);

		cube_r19_r2 = new AnimatedModelRenderer(this);
		cube_r19_r2.setRotationPoint(12.6062F, -143.9909F, -10.2907F);
		cube_r11.addChild(cube_r19_r2);
		setRotationAngle(cube_r19_r2, -0.4363F, -0.2618F, 0.0F);
		cube_r19_r2.setTextureOffset(47, 57).addBox(-5.4677F, -2.7164F, -2.575F, 9.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r19_r2.setModelRendererName("cube_r19_r2");
		this.registerModelRenderer(cube_r19_r2);

		cube_r18_r2 = new AnimatedModelRenderer(this);
		cube_r18_r2.setRotationPoint(13.3562F, -142.4909F, -10.2907F);
		cube_r11.addChild(cube_r18_r2);
		setRotationAngle(cube_r18_r2, -0.4363F, -0.2618F, 0.0F);
		cube_r18_r2.setTextureOffset(149, 33).addBox(-6.7119F, -0.9984F, -2.7889F, 15.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r18_r2.setModelRendererName("cube_r18_r2");
		this.registerModelRenderer(cube_r18_r2);

		cube_r12 = new AnimatedModelRenderer(this);
		cube_r12.setRotationPoint(7.4914F, 146.8996F, 4.0022F);
		shoulderarea2.addChild(cube_r12);

		cube_r12.setModelRendererName("cube_r12");
		this.registerModelRenderer(cube_r12);

		cube_r22_r1 = new AnimatedModelRenderer(this);
		cube_r22_r1.setRotationPoint(14.1282F, -145.6158F, 6.9893F);
		cube_r12.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, 0.4363F, 0.2618F, 0.0F);
		cube_r22_r1.setTextureOffset(0, 48).addBox(-4.5508F, -6.1685F, -0.377F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r22_r1.setModelRendererName("cube_r22_r1");
		this.registerModelRenderer(cube_r22_r1);

		cube_r22_r2 = new AnimatedModelRenderer(this);
		cube_r22_r2.setRotationPoint(24.6282F, -139.6158F, 6.9893F);
		cube_r12.addChild(cube_r22_r2);
		setRotationAngle(cube_r22_r2, 0.4363F, 0.2618F, 0.0F);
		cube_r22_r2.setTextureOffset(122, 19).addBox(-5.0868F, -4.4553F, -0.3608F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r22_r2.setModelRendererName("cube_r22_r2");
		this.registerModelRenderer(cube_r22_r2);

		cube_r21_r3 = new AnimatedModelRenderer(this);
		cube_r21_r3.setRotationPoint(11.1282F, -147.1158F, 6.9893F);
		cube_r12.addChild(cube_r21_r3);
		setRotationAngle(cube_r21_r3, 0.4363F, 0.2618F, 0.0F);
		cube_r21_r3.setTextureOffset(0, 25).addBox(-5.0868F, -4.4553F, -0.3608F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r21_r3.setModelRendererName("cube_r21_r3");
		this.registerModelRenderer(cube_r21_r3);

		cube_r21_r4 = new AnimatedModelRenderer(this);
		cube_r21_r4.setRotationPoint(17.8782F, -145.6158F, 6.2393F);
		cube_r12.addChild(cube_r21_r4);
		setRotationAngle(cube_r21_r4, 0.4363F, 0.2618F, 0.0F);
		cube_r21_r4.setTextureOffset(0, 27).addBox(-5.4677F, -2.7164F, -0.425F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r21_r4.setModelRendererName("cube_r21_r4");
		this.registerModelRenderer(cube_r21_r4);

		cube_r20_r5 = new AnimatedModelRenderer(this);
		cube_r20_r5.setRotationPoint(14.1282F, -146.3658F, 6.9893F);
		cube_r12.addChild(cube_r20_r5);
		setRotationAngle(cube_r20_r5, 0.4363F, 0.2618F, 0.0F);
		cube_r20_r5.setTextureOffset(0, 0).addBox(-5.4677F, -2.7164F, -0.425F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r20_r5.setModelRendererName("cube_r20_r5");
		this.registerModelRenderer(cube_r20_r5);

		cube_r19_r3 = new AnimatedModelRenderer(this);
		cube_r19_r3.setRotationPoint(14.8782F, -144.1158F, 6.9893F);
		cube_r12.addChild(cube_r19_r3);
		setRotationAngle(cube_r19_r3, 0.4363F, 0.2618F, 0.0F);
		cube_r19_r3.setTextureOffset(109, 127).addBox(-6.7119F, -0.9984F, -0.2111F, 15.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r19_r3.setModelRendererName("cube_r19_r3");
		this.registerModelRenderer(cube_r19_r3);

		cube_r14 = new AnimatedModelRenderer(this);
		cube_r14.setRotationPoint(-8.2634F, 144.5247F, -3.0493F);
		shoulderarea2.addChild(cube_r14);

		cube_r14.setModelRendererName("cube_r14");
		this.registerModelRenderer(cube_r14);

		cube_r23_r1 = new AnimatedModelRenderer(this);
		cube_r23_r1.setRotationPoint(-14.1062F, -143.2409F, 14.7907F);
		cube_r14.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 0.4363F, -0.2618F, 0.0F);
		cube_r23_r1.setTextureOffset(0, 46).addBox(1.5508F, -6.1685F, -0.377F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r23_r1.setTextureOffset(0, 5).addBox(-0.9132F, -4.4553F, -0.3608F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r23_r1.setModelRendererName("cube_r23_r1");
		this.registerModelRenderer(cube_r23_r1);

		cube_r23_r2 = new AnimatedModelRenderer(this);
		cube_r23_r2.setRotationPoint(-23.8562F, -137.2409F, 14.7907F);
		cube_r14.addChild(cube_r23_r2);
		setRotationAngle(cube_r23_r2, 0.4363F, -0.2618F, 0.0F);
		cube_r23_r2.setTextureOffset(0, 3).addBox(-0.9132F, -4.4553F, -0.3608F, 6.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r23_r2.setModelRendererName("cube_r23_r2");
		this.registerModelRenderer(cube_r23_r2);

		cube_r22_r3 = new AnimatedModelRenderer(this);
		cube_r22_r3.setRotationPoint(-14.8562F, -143.2409F, 14.0407F);
		cube_r14.addChild(cube_r22_r3);
		setRotationAngle(cube_r22_r3, 0.4363F, -0.2618F, 0.0F);
		cube_r22_r3.setTextureOffset(45, 23).addBox(-3.5323F, -2.7164F, -0.425F, 9.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r22_r3.setModelRendererName("cube_r22_r3");
		this.registerModelRenderer(cube_r22_r3);

		cube_r21_r5 = new AnimatedModelRenderer(this);
		cube_r21_r5.setRotationPoint(-12.6062F, -143.9909F, 14.7907F);
		cube_r14.addChild(cube_r21_r5);
		setRotationAngle(cube_r21_r5, 0.4363F, -0.2618F, 0.0F);
		cube_r21_r5.setTextureOffset(35, 46).addBox(-3.5323F, -2.7164F, -0.425F, 9.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r21_r5.setModelRendererName("cube_r21_r5");
		this.registerModelRenderer(cube_r21_r5);

		cube_r20_r6 = new AnimatedModelRenderer(this);
		cube_r20_r6.setRotationPoint(-14.1062F, -142.4909F, 14.7907F);
		cube_r14.addChild(cube_r20_r6);
		setRotationAngle(cube_r20_r6, 0.4363F, -0.2618F, 0.0F);
		cube_r20_r6.setTextureOffset(47, 119).addBox(-8.2881F, -0.9984F, -0.2111F, 15.0F, 6.0F, 3.0F, 0.0F, false);
		cube_r20_r6.setModelRendererName("cube_r20_r6");
		this.registerModelRenderer(cube_r20_r6);

		arms = new AnimatedModelRenderer(this);
		arms.setRotationPoint(0.0F, 31.0F, 0.0F);
		shoulders.addChild(arms);

		arms.setModelRendererName("arms");
		this.registerModelRenderer(arms);

		rarm = new AnimatedModelRenderer(this);
		rarm.setRotationPoint(-32.0F, -208.0F, 0.0F);
		arms.addChild(rarm);

		rarm.setModelRendererName("rarm");
		this.registerModelRenderer(rarm);

		rshoulderarm = new AnimatedModelRenderer(this);
		rshoulderarm.setRotationPoint(13.0F, -1.0F, 0.8324F);
		rarm.addChild(rshoulderarm);
		setRotationAngle(rshoulderarm, 0.0F, 0.0F, 0.0873F);
		rshoulderarm.setTextureOffset(63, 150).addBox(-41.1726F, 31.9662F, -4.1025F, 3.0F, 33.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(148, 102).addBox(-20.1726F, 31.9662F, -4.1025F, 3.0F, 33.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(172, 36).addBox(-19.4226F, 30.4662F, -3.3525F, 3.0F, 21.0F, 14.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(30, 175).addBox(-35.5782F, 34.2162F, -7.4673F, 12.0F, 24.0F, 3.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(174, 100).addBox(-36.3282F, 38.9037F, 10.5327F, 15.0F, 21.0F, 3.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(178, 84).addBox(-42.0813F, 37.2559F, -2.6025F, 3.0F, 21.0F, 12.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(177, 59).addBox(-37.8282F, 31.9662F, 9.0327F, 18.0F, 33.0F, 3.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(135, 10).addBox(-39.6726F, 62.9037F, -4.1025F, 21.0F, 6.0F, 15.0F, 0.0F, false);
		rshoulderarm.setTextureOffset(76, 52).addBox(-39.6726F, 29.1537F, -5.6025F, 21.0F, 33.0F, 15.0F, 0.0F, false);
		rshoulderarm.setModelRendererName("rshoulderarm");
		this.registerModelRenderer(rshoulderarm);

		cube_r5 = new AnimatedModelRenderer(this);
		cube_r5.setRotationPoint(0.5398F, 5.2154F, 6.6676F);
		rshoulderarm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.2182F);
		cube_r5.setTextureOffset(0, 46).addBox(-32.973F, -7.3622F, -14.2701F, 21.0F, 17.0F, 19.0F, 0.0F, false);
		cube_r5.setModelRendererName("cube_r5");
		this.registerModelRenderer(cube_r5);

		cube_r3 = new AnimatedModelRenderer(this);
		cube_r3.setRotationPoint(-26.6453F, 28.6746F, 8.1676F);
		rshoulderarm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.309F);
		cube_r3.setTextureOffset(136, 11).addBox(-3.8344F, -12.4594F, -15.7701F, 24.0F, 22.0F, 19.0F, 0.0F, false);
		cube_r3.setModelRendererName("cube_r3");
		this.registerModelRenderer(cube_r3);

		rforearm = new AnimatedModelRenderer(this);
		rforearm.setRotationPoint(-23.0F, 67.0F, 0.0F);
		rarm.addChild(rforearm);
		rforearm.setTextureOffset(75, 156).addBox(-10.8648F, 0.2841F, -3.2296F, 3.0F, 30.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(51, 147).addBox(10.1352F, 0.0966F, -3.2296F, 3.0F, 33.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(195, 57).addBox(10.8852F, 6.4716F, -1.7296F, 3.0F, 21.0F, 12.0F, 0.0F, false);
		rforearm.setTextureOffset(174, 68).addBox(-6.0204F, 9.2841F, 11.3852F, 15.0F, 21.0F, 3.0F, 0.0F, false);
		rforearm.setTextureOffset(174, 60).addBox(-6.0204F, 9.8466F, -5.8648F, 15.0F, 21.0F, 3.0F, 0.0F, false);
		rforearm.setTextureOffset(20, 169).addBox(-11.6148F, 4.7841F, -1.7296F, 3.0F, 21.0F, 12.0F, 0.0F, false);
		rforearm.setTextureOffset(160, 62).addBox(-7.5204F, 0.2841F, -4.3648F, 18.0F, 30.0F, 3.0F, 0.0F, false);
		rforearm.setTextureOffset(133, 77).addBox(-9.3648F, -2.1534F, -3.2701F, 21.0F, 6.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(111, 11).addBox(-9.3648F, 3.0966F, -3.2701F, 21.0F, 21.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(154, 41).addBox(-9.3852F, 32.8824F, -3.2701F, 12.0F, 12.0F, 15.0F, 0.0F, false);
		rforearm.setTextureOffset(125, 23).addBox(-9.3852F, 23.8824F, -3.2701F, 21.0F, 9.0F, 15.0F, 0.0F, false);
		rforearm.setModelRendererName("rforearm");
		this.registerModelRenderer(rforearm);

		lforearm_r2 = new AnimatedModelRenderer(this);
		lforearm_r2.setRotationPoint(2.6148F, 38.1324F, 5.2299F);
		rforearm.addChild(lforearm_r2);
		setRotationAngle(lforearm_r2, 0.0F, 0.0F, 0.4363F);
		lforearm_r2.setTextureOffset(161, 28).addBox(-3.0F, -6.0F, -8.5F, 6.0F, 12.0F, 15.0F, 0.0F, false);
		lforearm_r2.setModelRendererName("lforearm_r2");
		this.registerModelRenderer(lforearm_r2);

		lforearm_r3 = new AnimatedModelRenderer(this);
		lforearm_r3.setRotationPoint(114.3852F, 30.8824F, 5.2299F);
		rforearm.addChild(lforearm_r3);
		setRotationAngle(lforearm_r3, 0.0F, 0.0F, -1.0036F);

		lforearm_r3.setModelRendererName("lforearm_r3");
		this.registerModelRenderer(lforearm_r3);

		lforearm_r4 = new AnimatedModelRenderer(this);
		lforearm_r4.setRotationPoint(4.8648F, 33.6324F, 5.2299F);
		rforearm.addChild(lforearm_r4);
		setRotationAngle(lforearm_r4, 0.0F, 0.0F, 1.0036F);
		lforearm_r4.setTextureOffset(13, 75).addBox(-3.0F, -6.0F, -8.5F, 6.0F, 6.0F, 15.0F, 0.0F, false);
		lforearm_r4.setModelRendererName("lforearm_r4");
		this.registerModelRenderer(lforearm_r4);

		larm = new AnimatedModelRenderer(this);
		larm.setRotationPoint(32.5F, -208.0F, 0.0F);
		arms.addChild(larm);

		larm.setModelRendererName("larm");
		this.registerModelRenderer(larm);

		lshoulderarm = new AnimatedModelRenderer(this);
		lshoulderarm.setRotationPoint(0.5F, 0.0F, 0.0F);
		larm.addChild(lshoulderarm);
		setRotationAngle(lshoulderarm, 0.0F, 0.0F, -0.0873F);
		lshoulderarm.setTextureOffset(63, 150).addBox(24.6726F, 29.9662F, -3.2701F, 3.0F, 33.0F, 15.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(148, 102).addBox(3.6726F, 29.9662F, -3.2701F, 3.0F, 33.0F, 15.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(172, 36).addBox(2.9226F, 28.4662F, -2.5201F, 3.0F, 21.0F, 14.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(30, 175).addBox(10.0782F, 32.2162F, -6.6349F, 12.0F, 24.0F, 3.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(174, 100).addBox(7.8282F, 36.9037F, 11.3651F, 15.0F, 21.0F, 3.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(152, 84).addBox(25.5813F, 35.2559F, -1.7701F, 3.0F, 21.0F, 12.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(172, 86).addBox(6.3282F, 29.9662F, 9.8651F, 18.0F, 33.0F, 3.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(135, 10).addBox(5.1726F, 60.9037F, -3.2701F, 21.0F, 6.0F, 15.0F, 0.0F, true);
		lshoulderarm.setTextureOffset(76, 52).addBox(5.1726F, 27.1537F, -4.7701F, 21.0F, 33.0F, 15.0F, 0.0F, true);
		lshoulderarm.setModelRendererName("lshoulderarm");
		this.registerModelRenderer(lshoulderarm);

		cube_r4 = new AnimatedModelRenderer(this);
		cube_r4.setRotationPoint(-14.0398F, 3.2154F, 7.5F);
		lshoulderarm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2182F);
		cube_r4.setTextureOffset(0, 46).addBox(11.1248F, -7.3622F, -14.2701F, 21.0F, 17.0F, 19.0F, 0.0F, true);
		cube_r4.setModelRendererName("cube_r4");
		this.registerModelRenderer(cube_r4);

		cube_r6 = new AnimatedModelRenderer(this);
		cube_r6.setRotationPoint(13.1453F, 26.6746F, 9.0F);
		lshoulderarm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.309F);
		cube_r6.setTextureOffset(125, 3).addBox(-21.0F, -12.4594F, -15.7701F, 24.0F, 22.0F, 19.0F, 0.0F, true);
		cube_r6.setModelRendererName("cube_r6");
		this.registerModelRenderer(cube_r6);

		lforearm = new AnimatedModelRenderer(this);
		lforearm.setRotationPoint(22.5F, 67.0F, 0.0F);
		larm.addChild(lforearm);
		lforearm.setTextureOffset(75, 156).addBox(8.3648F, 0.2841F, -3.2296F, 3.0F, 30.0F, 15.0F, 0.0F, true);
		lforearm.setTextureOffset(51, 147).addBox(-12.6352F, 0.0966F, -3.2296F, 3.0F, 33.0F, 15.0F, 0.0F, true);
		lforearm.setTextureOffset(182, 58).addBox(-13.3852F, 6.4716F, -1.7296F, 3.0F, 21.0F, 12.0F, 0.0F, true);
		lforearm.setTextureOffset(174, 68).addBox(-8.4796F, 9.2841F, 11.3852F, 15.0F, 21.0F, 3.0F, 0.0F, true);
		lforearm.setTextureOffset(174, 60).addBox(-8.4796F, 9.8466F, -5.8648F, 15.0F, 21.0F, 3.0F, 0.0F, true);
		lforearm.setTextureOffset(20, 169).addBox(9.1148F, 4.7841F, -1.7296F, 3.0F, 21.0F, 12.0F, 0.0F, true);
		lforearm.setTextureOffset(160, 62).addBox(-9.9796F, 0.2841F, -4.3648F, 18.0F, 30.0F, 3.0F, 0.0F, true);
		lforearm.setTextureOffset(133, 77).addBox(-11.1352F, -2.1534F, -3.2701F, 21.0F, 6.0F, 15.0F, 0.0F, true);
		lforearm.setTextureOffset(111, 11).addBox(-11.1352F, 3.0966F, -3.2701F, 21.0F, 21.0F, 15.0F, 0.0F, true);
		lforearm.setTextureOffset(154, 41).addBox(-2.1148F, 32.8824F, -3.2701F, 12.0F, 12.0F, 15.0F, 0.0F, true);
		lforearm.setTextureOffset(125, 23).addBox(-11.1148F, 23.8824F, -3.2701F, 21.0F, 9.0F, 15.0F, 0.0F, true);
		lforearm.setModelRendererName("lforearm");
		this.registerModelRenderer(lforearm);

		lforearm_r5 = new AnimatedModelRenderer(this);
		lforearm_r5.setRotationPoint(-2.1148F, 38.1324F, 5.2299F);
		lforearm.addChild(lforearm_r5);
		setRotationAngle(lforearm_r5, 0.0F, 0.0F, -0.4363F);
		lforearm_r5.setTextureOffset(161, 28).addBox(-3.0F, -6.0F, -8.5F, 6.0F, 12.0F, 15.0F, 0.0F, true);
		lforearm_r5.setModelRendererName("lforearm_r5");
		this.registerModelRenderer(lforearm_r5);

		lforearm_r6 = new AnimatedModelRenderer(this);
		lforearm_r6.setRotationPoint(-113.8852F, 30.8824F, 5.2299F);
		lforearm.addChild(lforearm_r6);
		setRotationAngle(lforearm_r6, 0.0F, 0.0F, 1.0036F);

		lforearm_r6.setModelRendererName("lforearm_r6");
		this.registerModelRenderer(lforearm_r6);

		lforearm_r7 = new AnimatedModelRenderer(this);
		lforearm_r7.setRotationPoint(-4.3648F, 33.6324F, 5.2299F);
		lforearm.addChild(lforearm_r7);
		setRotationAngle(lforearm_r7, 0.0F, 0.0F, -1.0036F);
		lforearm_r7.setTextureOffset(13, 75).addBox(-3.0F, -6.0F, -8.5F, 6.0F, 6.0F, 15.0F, 0.0F, true);
		lforearm_r7.setModelRendererName("lforearm_r7");
		this.registerModelRenderer(lforearm_r7);

		headthing = new AnimatedModelRenderer(this);
		headthing.setRotationPoint(154.0F, 2722.0F, 178.0F);
		shoulders.addChild(headthing);
		headthing.setTextureOffset(171, 40).addBox(-158.0F, -2920.0F, -182.0F, 11.0F, 12.0F, 11.0F, 0.0F, false);
		headthing.setModelRendererName("headthing");
		this.registerModelRenderer(headthing);

		bone5 = new AnimatedModelRenderer(this);
		bone5.setRotationPoint(-152.0623F, -2927.2846F, -166.3953F);
		headthing.addChild(bone5);
		setRotationAngle(bone5, 0.2182F, 0.0F, 0.0F);
		bone5.setTextureOffset(166, 162).addBox(-13.0F, -22.1422F, -23.2986F, 25.0F, 31.0F, 20.0F, 0.0F, false);
		bone5.setTextureOffset(0, 0).addBox(-14.0F, -20.1422F, -22.2986F, 27.0F, 27.0F, 18.0F, 0.0F, false);
		bone5.setTextureOffset(20, 207).addBox(-12.0F, -20.1422F, -24.2986F, 23.0F, 27.0F, 22.0F, 0.0F, false);
		bone5.setModelRendererName("bone5");
		this.registerModelRenderer(bone5);

		face = new AnimatedModelRenderer(this);
		face.setRotationPoint(-154.0F, -2682.0F, -178.0F);
		headthing.addChild(face);
		face.setTextureOffset(228, 247).addBox(-6.0F, -247.0F, -15.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		face.setTextureOffset(228, 247).addBox(7.0F, -246.0F, -15.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		face.setTextureOffset(128, 249).addBox(-8.0F, -239.0F, -12.5F, 16.0F, 3.0F, 4.0F, 0.0F, false);
		face.setModelRendererName("face");
		this.registerModelRenderer(face);

		this.rootBones.add(all);
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		return new ResourceLocation("my_titan", "animations/walk.json");
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}