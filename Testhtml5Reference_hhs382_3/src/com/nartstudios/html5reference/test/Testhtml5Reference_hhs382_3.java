package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

public class Testhtml5Reference_hhs382_3 extends ActivityInstrumentationTestCase2<Activity> {

	private static final String LAUNCHER_ACTIVITY_CLASSNAME = "com.nartstudios.html5reference.MainList";
	private static Class<?> launchActivityClass;
	static {
		try {
			launchActivityClass = Class.forName(LAUNCHER_ACTIVITY_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	private ExtSolo solo; // ExtSolo is an extension of Robotium Solo that helps collecting better test execution data during test runs

	@SuppressWarnings("unchecked")
	public Testhtml5Reference_hhs382_3() {
		super((Class<Activity>) launchActivityClass);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		solo = new ExtSolo(getInstrumentation(), getActivity(), this.getClass()
				.getCanonicalName(), getName());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
		solo.tearDown();
		super.tearDown();
	}

	private void gestureGroup_3() throws Exception {
		float points[][] = { { 0.5431f, 0.8914f }, { 0.5403f, 0.8883f },
				{ 0.5403f, 0.8859f }, { 0.5403f, 0.8828f },
				{ 0.5403f, 0.8820f }, { 0.5403f, 0.8797f },
				{ 0.5375f, 0.8719f }, { 0.5375f, 0.8609f },
				{ 0.5375f, 0.8477f }, { 0.5306f, 0.8258f },
				{ 0.5306f, 0.8148f }, { 0.5264f, 0.8023f },
				{ 0.5194f, 0.7742f }, { 0.5167f, 0.7648f },
				{ 0.5028f, 0.7375f }, { 0.4986f, 0.7188f },
				{ 0.4639f, 0.6672f }, { 0.4431f, 0.6344f },
				{ 0.4042f, 0.5641f }, { 0.3889f, 0.5367f },
				{ 0.3681f, 0.5039f }, { 0.3583f, 0.4930f },
				{ 0.3458f, 0.4703f }, { 0.3403f, 0.4641f },
				{ 0.3333f, 0.4539f }, { 0.3250f, 0.4406f },
				{ 0.3208f, 0.4281f }, { 0.3208f, 0.4250f },
				{ 0.3208f, 0.4313f }, { 0.3292f, 0.4469f },
				{ 0.3403f, 0.4625f }, { 0.4306f, 0.6383f },
				{ 0.4417f, 0.6664f }, { 0.4611f, 0.7203f },
				{ 0.5083f, 0.8633f }, { 0.5222f, 0.9172f },
				{ 0.5319f, 0.9828f }, { 0.5319f, 0.9945f },
				{ 0.5319f, 0.9945f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_4() throws Exception {
		float points[][] = { { 0.4153f, 0.6945f }, { 0.4153f, 0.7125f },
				{ 0.4236f, 0.7266f }, { 0.4250f, 0.7336f },
				{ 0.4250f, 0.7406f }, { 0.4250f, 0.7461f },
				{ 0.4250f, 0.7617f }, { 0.4361f, 0.8148f },
				{ 0.4542f, 0.8445f }, { 0.4639f, 0.8836f },
				{ 0.4708f, 0.9195f }, { 0.4833f, 0.9555f },
				{ 0.4917f, 0.9812f }, { 0.4917f, 0.9797f },
				{ 0.4861f, 0.9469f }, { 0.4597f, 0.8562f },
				{ 0.4069f, 0.6664f }, { 0.2736f, 0.3047f },
				{ 0.2319f, 0.2305f }, { 0.2319f, 0.2266f },
				{ 0.2333f, 0.2352f }, { 0.2347f, 0.2406f },
				{ 0.2375f, 0.2422f }, { 0.2403f, 0.2484f },
				{ 0.2403f, 0.2531f }, { 0.2431f, 0.2586f },
				{ 0.2458f, 0.2633f }, { 0.2486f, 0.2750f },
				{ 0.2528f, 0.2820f }, { 0.2583f, 0.3023f },
				{ 0.2667f, 0.3172f }, { 0.2736f, 0.3281f },
				{ 0.2944f, 0.3727f }, { 0.3042f, 0.4063f },
				{ 0.3194f, 0.4508f }, { 0.3708f, 0.6094f },
				{ 0.4083f, 0.7133f }, { 0.4472f, 0.8148f },
				{ 0.4611f, 0.9047f }, { 0.4639f, 0.9234f },
				{ 0.4639f, 0.9406f }, { 0.4639f, 0.9438f },
				{ 0.4639f, 0.9438f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.3111f, 0.5828f }, { 0.3111f, 0.5805f },
				{ 0.3167f, 0.5750f }, { 0.3208f, 0.5656f },
				{ 0.3292f, 0.5430f }, { 0.3292f, 0.5125f },
				{ 0.3292f, 0.4797f }, { 0.3264f, 0.3891f },
				{ 0.3264f, 0.3492f }, { 0.3153f, 0.2664f },
				{ 0.3139f, 0.2531f }, { 0.3139f, 0.2406f },
				{ 0.3139f, 0.2273f }, { 0.3139f, 0.2195f },
				{ 0.3139f, 0.2023f }, { 0.3125f, 0.1883f },
				{ 0.3042f, 0.1555f }, { 0.3042f, 0.1469f },
				{ 0.3042f, 0.1336f }, { 0.3014f, 0.1273f },
				{ 0.2986f, 0.1156f }, { 0.2986f, 0.1133f },
				{ 0.2931f, 0.1133f }, { 0.2889f, 0.1195f },
				{ 0.2889f, 0.1219f }, { 0.2889f, 0.1266f },
				{ 0.2889f, 0.1305f }, { 0.2889f, 0.1383f },
				{ 0.2889f, 0.1414f }, { 0.2931f, 0.1656f },
				{ 0.3042f, 0.1859f }, { 0.3181f, 0.2656f },
				{ 0.3236f, 0.3133f }, { 0.3292f, 0.4031f },
				{ 0.3444f, 0.4961f }, { 0.3444f, 0.5352f },
				{ 0.3500f, 0.6109f }, { 0.3542f, 0.6398f },
				{ 0.3556f, 0.6508f }, { 0.3625f, 0.6625f },
				{ 0.3639f, 0.6703f }, { 0.3653f, 0.6758f },
				{ 0.3653f, 0.6758f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_2() throws Exception {
		float points[][] = { { 0.3056f, 0.5734f }, { 0.3056f, 0.5664f },
				{ 0.3056f, 0.5641f }, { 0.3056f, 0.5641f },
				{ 0.3056f, 0.5617f }, { 0.3056f, 0.5594f },
				{ 0.3056f, 0.5562f }, { 0.3042f, 0.5500f },
				{ 0.3000f, 0.5406f }, { 0.2986f, 0.5375f },
				{ 0.2986f, 0.5344f }, { 0.2958f, 0.5258f },
				{ 0.2931f, 0.5234f }, { 0.2931f, 0.5211f },
				{ 0.2875f, 0.5078f }, { 0.2861f, 0.5047f },
				{ 0.2833f, 0.5008f }, { 0.2833f, 0.4992f },
				{ 0.2833f, 0.4992f }, { 0.2806f, 0.4984f },
				{ 0.2806f, 0.4945f }, { 0.2778f, 0.4914f },
				{ 0.2736f, 0.4844f }, { 0.2681f, 0.4789f },
				{ 0.2681f, 0.4758f }, { 0.2653f, 0.4727f },
				{ 0.2653f, 0.4695f }, { 0.2625f, 0.4656f },
				{ 0.2597f, 0.4609f }, { 0.2569f, 0.4570f },
				{ 0.2556f, 0.4563f }, { 0.2514f, 0.4516f },
				{ 0.2528f, 0.4516f }, { 0.2500f, 0.4508f },
				{ 0.2472f, 0.4477f }, { 0.2444f, 0.4453f },
				{ 0.2403f, 0.4414f }, { 0.2389f, 0.4391f },
				{ 0.2347f, 0.4328f }, { 0.2319f, 0.4313f },
				{ 0.2236f, 0.4281f }, { 0.2208f, 0.4250f },
				{ 0.2125f, 0.4180f }, { 0.1972f, 0.4078f },
				{ 0.1931f, 0.4055f }, { 0.1889f, 0.4008f },
				{ 0.1889f, 0.4000f }, { 0.1889f, 0.4031f },
				{ 0.1889f, 0.4039f }, { 0.1889f, 0.4086f },
				{ 0.1889f, 0.4102f }, { 0.1889f, 0.4125f },
				{ 0.1944f, 0.4164f }, { 0.1972f, 0.4187f },
				{ 0.2056f, 0.4328f }, { 0.2306f, 0.4625f },
				{ 0.2403f, 0.4719f }, { 0.2806f, 0.5070f },
				{ 0.2847f, 0.5117f }, { 0.2944f, 0.5211f },
				{ 0.2972f, 0.5273f }, { 0.3083f, 0.5430f },
				{ 0.3153f, 0.5484f }, { 0.3278f, 0.5680f },
				{ 0.3458f, 0.5898f }, { 0.3542f, 0.6008f },
				{ 0.3667f, 0.6141f }, { 0.3694f, 0.6203f },
				{ 0.3764f, 0.6281f }, { 0.3792f, 0.6328f },
				{ 0.3833f, 0.6375f }, { 0.3847f, 0.6414f },
				{ 0.3875f, 0.6422f }, { 0.3875f, 0.6453f },
				{ 0.3875f, 0.6461f }, { 0.3875f, 0.6477f },
				{ 0.3903f, 0.6477f }, { 0.3931f, 0.6477f },
				{ 0.3931f, 0.6461f }, { 0.3931f, 0.6406f },
				{ 0.3931f, 0.6383f }, { 0.3931f, 0.6359f },
				{ 0.3931f, 0.6336f }, { 0.3931f, 0.6320f },
				{ 0.3931f, 0.6305f }, { 0.3931f, 0.6273f },
				{ 0.3931f, 0.6234f }, { 0.3931f, 0.6180f },
				{ 0.3931f, 0.6156f }, { 0.3931f, 0.6125f },
				{ 0.3931f, 0.6102f }, { 0.3931f, 0.6016f },
				{ 0.3931f, 0.5977f }, { 0.3903f, 0.5875f },
				{ 0.3778f, 0.5617f }, { 0.3667f, 0.5469f },
				{ 0.3542f, 0.5227f }, { 0.3292f, 0.4789f },
				{ 0.3222f, 0.4586f }, { 0.3056f, 0.4234f },
				{ 0.2875f, 0.3953f }, { 0.2778f, 0.3789f },
				{ 0.2681f, 0.3672f }, { 0.2486f, 0.3492f },
				{ 0.2319f, 0.3336f }, { 0.2278f, 0.3273f },
				{ 0.2167f, 0.3164f }, { 0.2125f, 0.3094f },
				{ 0.2083f, 0.3063f }, { 0.2014f, 0.3016f },
				{ 0.2014f, 0.3008f }, { 0.2014f, 0.3047f },
				{ 0.2014f, 0.3055f }, { 0.2014f, 0.3070f },
				{ 0.2014f, 0.3078f }, { 0.2014f, 0.3109f },
				{ 0.2014f, 0.3133f }, { 0.2014f, 0.3164f },
				{ 0.2014f, 0.3187f }, { 0.2014f, 0.3195f },
				{ 0.2014f, 0.3234f }, { 0.2014f, 0.3250f },
				{ 0.2014f, 0.3320f }, { 0.2042f, 0.3359f },
				{ 0.2069f, 0.3414f }, { 0.2111f, 0.3438f },
				{ 0.2167f, 0.3523f }, { 0.2181f, 0.3570f },
				{ 0.2250f, 0.3648f }, { 0.2250f, 0.3656f },
				{ 0.2250f, 0.3680f }, { 0.2250f, 0.3688f },
				{ 0.2278f, 0.3688f }, { 0.2278f, 0.3711f },
				{ 0.2278f, 0.3719f }, { 0.2278f, 0.3703f },
				{ 0.2306f, 0.3633f }, { 0.2306f, 0.3578f },
				{ 0.2306f, 0.3523f }, { 0.2403f, 0.3414f },
				{ 0.2403f, 0.3336f }, { 0.2403f, 0.3313f },
				{ 0.2417f, 0.3273f }, { 0.2431f, 0.3266f },
				{ 0.2472f, 0.3250f }, { 0.2472f, 0.3234f },
				{ 0.2514f, 0.3219f }, { 0.2528f, 0.3203f },
				{ 0.2528f, 0.3195f }, { 0.2528f, 0.3187f },
				{ 0.2528f, 0.3172f }, { 0.2528f, 0.3172f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_5() throws Exception {
		float points[][] = { { 0.4639f, 0.9430f }, { 0.4639f, 0.9383f },
				{ 0.4639f, 0.9000f }, { 0.4639f, 0.8523f },
				{ 0.4611f, 0.7953f }, { 0.4528f, 0.7453f },
				{ 0.4458f, 0.7086f }, { 0.4389f, 0.6836f },
				{ 0.4361f, 0.6750f }, { 0.4278f, 0.6594f },
				{ 0.4125f, 0.6211f }, { 0.3944f, 0.5859f },
				{ 0.3792f, 0.5586f }, { 0.3694f, 0.5406f },
				{ 0.3347f, 0.4805f }, { 0.2903f, 0.4258f },
				{ 0.2458f, 0.3773f }, { 0.2292f, 0.3555f },
				{ 0.2069f, 0.3359f }, { 0.2028f, 0.3359f },
				{ 0.2042f, 0.3406f }, { 0.2042f, 0.3492f },
				{ 0.2125f, 0.3734f }, { 0.2278f, 0.4086f },
				{ 0.2444f, 0.4344f }, { 0.2597f, 0.4664f },
				{ 0.2681f, 0.5047f }, { 0.2792f, 0.5477f },
				{ 0.2903f, 0.5914f }, { 0.3069f, 0.6578f },
				{ 0.3208f, 0.6883f }, { 0.3278f, 0.7188f },
				{ 0.3292f, 0.7375f }, { 0.3417f, 0.7797f },
				{ 0.3514f, 0.8008f }, { 0.3569f, 0.8195f },
				{ 0.3722f, 0.8484f }, { 0.3722f, 0.8570f },
				{ 0.3778f, 0.8648f }, { 0.4069f, 0.9000f },
				{ 0.4139f, 0.9180f }, { 0.4236f, 0.9312f },
				{ 0.4306f, 0.9453f }, { 0.4333f, 0.9461f },
				{ 0.4333f, 0.9484f }, { 0.4333f, 0.9484f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_6() throws Exception {
		float points[][] = { { 0.2472f, 0.6461f }, { 0.2472f, 0.6477f },
				{ 0.2514f, 0.6477f }, { 0.2500f, 0.6492f },
				{ 0.2500f, 0.6500f }, { 0.2556f, 0.6523f },
				{ 0.2556f, 0.6570f }, { 0.2597f, 0.6641f },
				{ 0.2639f, 0.6664f }, { 0.2653f, 0.6703f },
				{ 0.2694f, 0.6750f }, { 0.2736f, 0.6781f },
				{ 0.2875f, 0.6898f }, { 0.3014f, 0.7016f },
				{ 0.3056f, 0.7063f }, { 0.3097f, 0.7102f },
				{ 0.3194f, 0.7156f }, { 0.3208f, 0.7195f },
				{ 0.3278f, 0.7250f }, { 0.3292f, 0.7266f },
				{ 0.3333f, 0.7312f }, { 0.3361f, 0.7328f },
				{ 0.3361f, 0.7328f }, { 0.3389f, 0.7359f },
				{ 0.3403f, 0.7359f }, { 0.3389f, 0.7375f },
				{ 0.3417f, 0.7375f }, { 0.3472f, 0.7375f },
				{ 0.3514f, 0.7398f }, { 0.3542f, 0.7414f },
				{ 0.3569f, 0.7430f }, { 0.3611f, 0.7477f },
				{ 0.3667f, 0.7547f }, { 0.3694f, 0.7563f },
				{ 0.3778f, 0.7617f }, { 0.3806f, 0.7656f },
				{ 0.3847f, 0.7727f }, { 0.3889f, 0.7797f },
				{ 0.4042f, 0.7937f }, { 0.4208f, 0.8125f },
				{ 0.4292f, 0.8234f }, { 0.4361f, 0.8313f },
				{ 0.4569f, 0.8586f }, { 0.4681f, 0.8695f },
				{ 0.4681f, 0.8734f }, { 0.4736f, 0.8828f },
				{ 0.4875f, 0.8945f }, { 0.4917f, 0.9008f },
				{ 0.4986f, 0.9109f }, { 0.5181f, 0.9289f },
				{ 0.5278f, 0.9383f }, { 0.5278f, 0.9406f },
				{ 0.5278f, 0.9414f }, { 0.5278f, 0.9430f },
				{ 0.5292f, 0.9461f }, { 0.5319f, 0.9500f },
				{ 0.5347f, 0.9531f }, { 0.5375f, 0.9570f },
				{ 0.5431f, 0.9641f }, { 0.5444f, 0.9656f },
				{ 0.5472f, 0.9734f }, { 0.5528f, 0.9789f },
				{ 0.5569f, 0.9812f }, { 0.5583f, 0.9828f },
				{ 0.5569f, 0.9773f }, { 0.5569f, 0.9727f },
				{ 0.5569f, 0.9656f }, { 0.5375f, 0.9328f },
				{ 0.4972f, 0.8914f }, { 0.4778f, 0.8539f },
				{ 0.4667f, 0.8391f }, { 0.4597f, 0.8281f },
				{ 0.4472f, 0.8156f }, { 0.4458f, 0.8055f },
				{ 0.4361f, 0.7875f }, { 0.4278f, 0.7797f },
				{ 0.4278f, 0.7750f }, { 0.4278f, 0.7727f },
				{ 0.4236f, 0.7688f }, { 0.4167f, 0.7609f },
				{ 0.4167f, 0.7555f }, { 0.4125f, 0.7516f },
				{ 0.4069f, 0.7398f }, { 0.4028f, 0.7344f },
				{ 0.3958f, 0.7281f }, { 0.3847f, 0.7156f },
				{ 0.3819f, 0.7117f }, { 0.3722f, 0.7016f },
				{ 0.3694f, 0.6984f }, { 0.3625f, 0.6883f },
				{ 0.3514f, 0.6812f }, { 0.3472f, 0.6758f },
				{ 0.3444f, 0.6734f }, { 0.3444f, 0.6711f },
				{ 0.3389f, 0.6664f }, { 0.3361f, 0.6633f },
				{ 0.3278f, 0.6547f }, { 0.3236f, 0.6492f },
				{ 0.3125f, 0.6414f }, { 0.3028f, 0.6328f },
				{ 0.2972f, 0.6289f }, { 0.2903f, 0.6258f },
				{ 0.2847f, 0.6211f }, { 0.2778f, 0.6164f },
				{ 0.2778f, 0.6148f }, { 0.2778f, 0.6172f },
				{ 0.2806f, 0.6266f }, { 0.2903f, 0.6383f },
				{ 0.2931f, 0.6477f }, { 0.2986f, 0.6633f },
				{ 0.2986f, 0.6656f }, { 0.2986f, 0.6664f },
				{ 0.3000f, 0.6680f }, { 0.3042f, 0.6742f },
				{ 0.3042f, 0.6789f }, { 0.3111f, 0.6938f },
				{ 0.3153f, 0.6992f }, { 0.3194f, 0.7063f },
				{ 0.3208f, 0.7133f }, { 0.3250f, 0.7172f },
				{ 0.3306f, 0.7242f }, { 0.3431f, 0.7398f },
				{ 0.3444f, 0.7477f }, { 0.3514f, 0.7617f },
				{ 0.3542f, 0.7664f }, { 0.3569f, 0.7688f },
				{ 0.3597f, 0.7766f }, { 0.3625f, 0.7789f },
				{ 0.3653f, 0.7813f }, { 0.3653f, 0.7828f },
				{ 0.3667f, 0.7836f }, { 0.3708f, 0.7875f },
				{ 0.3750f, 0.7937f }, { 0.3764f, 0.7953f },
				{ 0.3778f, 0.7969f }, { 0.3778f, 0.7984f },
				{ 0.3792f, 0.8000f }, { 0.3806f, 0.8047f },
				{ 0.3833f, 0.8070f }, { 0.3847f, 0.8086f },
				{ 0.3958f, 0.8234f }, { 0.4056f, 0.8383f },
				{ 0.4139f, 0.8687f }, { 0.4347f, 0.9063f },
				{ 0.4611f, 0.9734f }, { 0.4611f, 0.9734f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainList");
			solo.sleep(4800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 25);
			solo.sleep(700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 34);
			solo.sleep(1900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 64);
			solo.sleep(1000);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 81);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 89);
			solo.sleep(900);
			solo.drag(solo.toScreenX(0.679f), solo.toScreenX(0.733f),
					solo.toScreenY(0.182f), solo.toScreenY(0.982f), 11);
			solo.sleep(1000);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 62);
			solo.sleep(1800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 40);
			solo.sleep(600);
			solo.drag(solo.toScreenX(0.832f), solo.toScreenX(0.794f),
					solo.toScreenY(0.322f), solo.toScreenY(0.924f), 9);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 30);
			solo.sleep(1800);
			solo.drag(solo.toScreenX(0.819f), solo.toScreenX(0.900f),
					solo.toScreenY(0.602f), solo.toScreenY(0.944f), 20);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 25);
			solo.sleep(1300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(11, 0);
			solo.waitForActivity("TagDefinition36");
			solo.sleep(27500);
			solo.drag(solo.toScreenX(0.761f), solo.toScreenX(0.614f),
					solo.toScreenY(0.322f), solo.toScreenY(0.002f), 25);
			solo.sleep(1300);
			solo.drag(solo.toScreenX(0.654f), solo.toScreenX(0.590f),
					solo.toScreenY(0.602f), solo.toScreenY(0.443f), 14);
			solo.sleep(700);
			solo.drag(solo.toScreenX(0.560f), solo.toScreenX(0.590f),
					solo.toScreenY(0.407f), solo.toScreenY(0.986f), 10);
			solo.sleep(1800);
			assertTrue("Wait for view (index: 27) failed.",
					solo.waitForView(27, 20000));
			solo.clickOnView(27);
			solo.waitForActivity("MainList");
			solo.sleep(2700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 38);
			solo.sleep(1400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(8, 0);
			solo.waitForActivity("TagDefinition46");
			solo.sleep(23100);
			gestureGroup_1();
			solo.sleep(1600);
			assertTrue("Wait for view (index: 21) failed.",
					solo.waitForView(21, 20000));
			solo.clickOnView(21);
			solo.waitForActivity("MainList");
			solo.sleep(2100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 91);
			solo.sleep(1800);
			solo.drag(solo.toScreenX(0.311f), solo.toScreenX(0.547f),
					solo.toScreenY(0.283f), solo.toScreenY(0.998f), 12);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 80);
			solo.sleep(2800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(8, 0);
			solo.waitForActivity("TagDefinition88");
			solo.sleep(16200);
			gestureGroup_2();
			solo.sleep(4800);
			gestureGroup_3();
			solo.sleep(2200);
			assertTrue("Wait for view (index: 28) failed.",
					solo.waitForView(28, 20000));
			solo.clickOnView(28);
			solo.waitForActivity("MainList");
			solo.sleep(2200);
			solo.drag(solo.toScreenX(0.261f), solo.toScreenX(0.274f),
					solo.toScreenY(0.484f), solo.toScreenY(0.998f), 8);
			solo.sleep(1300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 40);
			solo.sleep(1400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(11, 0);
			solo.waitForActivity("TagDefinition51");
			solo.sleep(10300);
			solo.drag(solo.toScreenX(0.253f), solo.toScreenX(0.115f),
					solo.toScreenY(0.736f), solo.toScreenY(0.398f), 15);
			solo.sleep(6500);
			assertTrue("Wait for view (index: 31) failed.",
					solo.waitForView(31, 20000));
			solo.clickOnView(31);
			solo.waitForActivity("MainList");
			solo.sleep(1900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 51);
			solo.sleep(1400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(6, 0);
			solo.waitForActivity("TagDefinition57");
			solo.sleep(3500);
			solo.drag(solo.toScreenX(0.385f), solo.toScreenX(0.204f),
					solo.toScreenY(0.559f), solo.toScreenY(0.133f), 18);
			solo.sleep(2400);
			gestureGroup_4();
			solo.sleep(2200);
			gestureGroup_5();
			solo.sleep(10600);
			solo.drag(solo.toScreenX(0.431f), solo.toScreenX(0.247f),
					solo.toScreenY(0.907f), solo.toScreenY(0.646f), 81);
			solo.sleep(8900);
			gestureGroup_6();
			solo.sleep(1300);
			assertTrue("Wait for view (index: 19) failed.",
					solo.waitForView(19, 20000));
			solo.clickOnView(19);
			solo.waitForActivity("MainList");
			solo.sleep(2400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(11, 0);
			solo.waitForActivity("TagDefinition62");
			solo.sleep(11500);
			solo.drag(solo.toScreenX(0.464f), solo.toScreenX(0.306f),
					solo.toScreenY(0.541f), solo.toScreenY(0.195f), 115);
			solo.sleep(2000);
			solo.drag(solo.toScreenX(0.529f), solo.toScreenX(0.474f),
					solo.toScreenY(0.879f), solo.toScreenY(0.700f), 30);
			solo.sleep(7000);
			solo.drag(solo.toScreenX(0.256f), solo.toScreenX(0.342f),
					solo.toScreenY(0.317f), solo.toScreenY(0.491f), 26);
			solo.sleep(1400);
			assertTrue("Wait for view (index: 24) failed.",
					solo.waitForView(24, 20000));
			solo.clickOnView(24);
			solo.waitForActivity("MainList");
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Test.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Test.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
