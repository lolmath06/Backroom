package com.dolmen.backroom.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class DeadMothAnimations {

	public static final AnimationDefinition IDLE_GROUND = AnimationDefinition.Builder.withLength(5f).looping()
			.addAnimation("pate1_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen3",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen4",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen5",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen6",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen7",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.75f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen8",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen9",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen10",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("antenne1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("antenne2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(-1f, -1f, 1.58f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(25f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(1f, -3f, 1.58f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(25f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(-1f, 1.75f, -1.57f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(-25f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(1f, -3f, -1.57f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(-25f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition IDLE_WALL = AnimationDefinition.Builder.withLength(5f).looping()
			.addAnimation("pate1_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen3",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen4",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen5",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen6",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen7",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.75f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen8",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(1.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen9",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("abdomen10",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.75f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("antenne1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("antenne2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(-1f, -1f, 1.58f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(25f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(1f, -3f, 1.58f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(25f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(-1f, 1.75f, -1.57f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(-25f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.posVec(1f, -3f, -1.57f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(-25f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(8f, 8f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -90f),
									AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(0.5f)
			.addAnimation("pate1_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(-1f, -4f, 2f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(67.5f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(1f, -3f, 3.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(67.5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_1",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(-1f, 4f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(-1f, -1f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(-67.5f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(1f, -3f, -3f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(1f, -3f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(-67.5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(16f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 0f, -67.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition FLY = AnimationDefinition.Builder.withLength(1.5f).looping()
			.addAnimation("pate1_1", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_2", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_3", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_4", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_5", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-40f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate1_6", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(40f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_1", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_2", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_3", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_4", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_5", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate2_6", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-30f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_1", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_2", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_3", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_4", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_5", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(80f, -10f, -1.75f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("pate3_6", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(-80f, 10f, 1.75f), AnimationChannel.Interpolations.LINEAR)))

			.addAnimation("aile1_1", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0f, KeyframeAnimations.posVec(-1f, -1f, -2f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.posVec(-1f, 1.5f, 3f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f, KeyframeAnimations.posVec(-1f, -1f, -2f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0f, KeyframeAnimations.degreeVec(-25f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.degreeVec(60f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f, KeyframeAnimations.degreeVec(-25f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0f, KeyframeAnimations.posVec(1f, -3f, -2f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.posVec(1f, 1f, 3f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f, KeyframeAnimations.posVec(1f, -3f, -2f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile1_2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0f, KeyframeAnimations.degreeVec(-25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.degreeVec(60f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f, KeyframeAnimations.degreeVec(-25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))


			.addAnimation("aile2_1", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0f,    KeyframeAnimations.posVec(-1f, -3.1f, 2.95f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.posVec(-1f, 6.85f, -1.2f), AnimationChannel.Interpolations.LINEAR), // <--- Essaie un Z plus proche du corps ici !
					new Keyframe(1.5f,  KeyframeAnimations.posVec(-1f, -3.1f, 2.95f), AnimationChannel.Interpolations.LINEAR)))

			.addAnimation("aile2_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0f,    KeyframeAnimations.degreeVec(25f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.degreeVec(-60f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f,  KeyframeAnimations.degreeVec(25f, 0f, -2.5f), AnimationChannel.Interpolations.LINEAR)))


			.addAnimation("aile2_2", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0f, KeyframeAnimations.posVec(1f, -2f, 2f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.posVec(1f, 0.5f, -3f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f, KeyframeAnimations.posVec(1f, -2f, 2f), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("aile2_2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0f, KeyframeAnimations.degreeVec(25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75f, KeyframeAnimations.degreeVec(-60f, 0f, 0f), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5f, KeyframeAnimations.degreeVec(25f, 0f, 0f), AnimationChannel.Interpolations.LINEAR)))
			.build();

}
