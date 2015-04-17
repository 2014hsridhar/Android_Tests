  package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

public class Testhtml5Reference_hhs382_1 extends ActivityInstrumentationTestCase2<Activity> {

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
	public Testhtml5Reference_hhs382_1() {
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
		float points[][] = { { 0.3667f, 0.5148f }, { 0.3667f, 0.5109f },
				{ 0.3667f, 0.5039f }, { 0.3722f, 0.4961f },
				{ 0.3722f, 0.4883f }, { 0.3750f, 0.4812f },
				{ 0.3750f, 0.4703f }, { 0.3778f, 0.4586f },
				{ 0.3792f, 0.4445f }, { 0.3847f, 0.4133f },
				{ 0.3944f, 0.3766f }, { 0.4028f, 0.3438f },
				{ 0.4097f, 0.3117f }, { 0.4167f, 0.2898f },
				{ 0.4208f, 0.2797f }, { 0.4264f, 0.2711f },
				{ 0.4306f, 0.2664f }, { 0.4333f, 0.2617f },
				{ 0.4375f, 0.2594f }, { 0.4361f, 0.2695f },
				{ 0.4361f, 0.2813f }, { 0.4347f, 0.3070f },
				{ 0.4264f, 0.3469f }, { 0.4097f, 0.4203f },
				{ 0.3861f, 0.5125f }, { 0.3819f, 0.5930f },
				{ 0.3833f, 0.6750f }, { 0.3931f, 0.7391f },
				{ 0.3931f, 0.7891f }, { 0.4042f, 0.8391f },
				{ 0.4111f, 0.8828f }, { 0.4083f, 0.9117f },
				{ 0.4083f, 0.9328f }, { 0.4236f, 0.9531f },
				{ 0.4389f, 0.9781f }, { 0.4472f, 0.9930f },
				{ 0.4486f, 0.9961f }, { 0.4486f, 0.9961f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_4() throws Exception {
		float points[][] = { { 0.6389f, 0.4773f }, { 0.6389f, 0.4695f },
				{ 0.6403f, 0.4633f }, { 0.6458f, 0.4539f },
				{ 0.6500f, 0.4414f }, { 0.6597f, 0.4133f },
				{ 0.7208f, 0.2438f }, { 0.7792f, 0.1500f },
				{ 0.8375f, 0.0562f }, { 0.8361f, 0.0711f },
				{ 0.7042f, 0.3578f }, { 0.6972f, 0.3883f },
				{ 0.6861f, 0.4203f }, { 0.6722f, 0.4805f },
				{ 0.6639f, 0.4961f }, { 0.6639f, 0.5102f },
				{ 0.6611f, 0.5211f }, { 0.6611f, 0.5250f },
				{ 0.6611f, 0.5320f }, { 0.6611f, 0.5422f },
				{ 0.6611f, 0.5586f }, { 0.6611f, 0.6023f },
				{ 0.6611f, 0.6250f }, { 0.6611f, 0.6383f },
				{ 0.6611f, 0.6469f }, { 0.6611f, 0.6484f },
				{ 0.6611f, 0.6531f }, { 0.6611f, 0.6531f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.9792f, 0.3945f }, { 0.9792f, 0.4133f },
				{ 0.9792f, 0.4172f }, { 0.9792f, 0.4234f },
				{ 0.9792f, 0.4242f }, { 0.9792f, 0.4258f },
				{ 0.9819f, 0.4258f }, { 0.9819f, 0.4281f },
				{ 0.9819f, 0.4289f }, { 0.9819f, 0.4313f },
				{ 0.9833f, 0.4367f }, { 0.9847f, 0.4391f },
				{ 0.9847f, 0.4406f }, { 0.9847f, 0.4422f },
				{ 0.9875f, 0.4437f }, { 0.9875f, 0.4461f },
				{ 0.9875f, 0.4469f }, { 0.9875f, 0.4484f },
				{ 0.9875f, 0.4531f }, { 0.9875f, 0.4672f },
				{ 0.9875f, 0.4734f }, { 0.9875f, 0.4781f },
				{ 0.9875f, 0.4797f }, { 0.9875f, 0.4836f },
				{ 0.9875f, 0.4859f }, { 0.9875f, 0.4867f },
				{ 0.9875f, 0.4883f }, { 0.9875f, 0.4891f },
				{ 0.9875f, 0.4906f }, { 0.9875f, 0.4922f },
				{ 0.9875f, 0.4906f }, { 0.9875f, 0.4891f },
				{ 0.9875f, 0.4867f }, { 0.9875f, 0.4852f },
				{ 0.9875f, 0.4828f }, { 0.9875f, 0.4828f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_2() throws Exception {
		float points[][] = { { 0.9639f, 0.4844f }, { 0.9639f, 0.4828f },
				{ 0.9639f, 0.4797f }, { 0.9639f, 0.4758f },
				{ 0.9639f, 0.4703f }, { 0.9639f, 0.4672f },
				{ 0.9639f, 0.4617f }, { 0.9639f, 0.4531f },
				{ 0.9639f, 0.4437f }, { 0.9639f, 0.4344f },
				{ 0.9639f, 0.4250f }, { 0.9639f, 0.4039f },
				{ 0.9611f, 0.3938f }, { 0.9569f, 0.3844f },
				{ 0.9569f, 0.3750f }, { 0.9569f, 0.3594f },
				{ 0.9569f, 0.3453f }, { 0.9569f, 0.3367f },
				{ 0.9569f, 0.3242f }, { 0.9569f, 0.3195f },
				{ 0.9569f, 0.3172f }, { 0.9569f, 0.3156f },
				{ 0.9569f, 0.3141f }, { 0.9569f, 0.3055f },
				{ 0.9542f, 0.2953f }, { 0.9542f, 0.2891f },
				{ 0.9542f, 0.2805f }, { 0.9542f, 0.2625f },
				{ 0.9542f, 0.2539f }, { 0.9542f, 0.2484f },
				{ 0.9542f, 0.2445f }, { 0.9542f, 0.2359f },
				{ 0.9542f, 0.2359f }, { 0.9542f, 0.2273f },
				{ 0.9542f, 0.2250f }, { 0.9542f, 0.2289f },
				{ 0.9542f, 0.2320f }, { 0.9542f, 0.2398f },
				{ 0.9542f, 0.2594f }, { 0.9542f, 0.2977f },
				{ 0.9542f, 0.3406f }, { 0.9542f, 0.4898f },
				{ 0.9542f, 0.5594f }, { 0.9542f, 0.6039f },
				{ 0.9736f, 0.7203f }, { 0.9889f, 0.8086f },
				{ 0.9889f, 0.8086f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_5() throws Exception {
		float points[][] = { { 0.5319f, 0.6563f }, { 0.5319f, 0.6531f },
				{ 0.5319f, 0.6500f }, { 0.5319f, 0.6469f },
				{ 0.5319f, 0.6398f }, { 0.5319f, 0.6359f },
				{ 0.5319f, 0.6336f }, { 0.5319f, 0.6320f },
				{ 0.5319f, 0.6297f }, { 0.5319f, 0.6281f },
				{ 0.5319f, 0.6258f }, { 0.5319f, 0.6234f },
				{ 0.5319f, 0.6234f }, { 0.5319f, 0.6219f },
				{ 0.5319f, 0.6187f }, { 0.5319f, 0.6180f },
				{ 0.5319f, 0.6172f }, { 0.5319f, 0.6156f },
				{ 0.5333f, 0.6141f }, { 0.5347f, 0.6117f },
				{ 0.5347f, 0.6094f }, { 0.5347f, 0.6078f },
				{ 0.5389f, 0.6062f }, { 0.5375f, 0.6047f },
				{ 0.5375f, 0.6016f }, { 0.5375f, 0.5969f },
				{ 0.5403f, 0.5953f }, { 0.5403f, 0.5945f },
				{ 0.5403f, 0.5930f }, { 0.5403f, 0.5891f },
				{ 0.5431f, 0.5891f }, { 0.5431f, 0.5867f },
				{ 0.5431f, 0.5859f }, { 0.5444f, 0.5836f },
				{ 0.5444f, 0.5820f }, { 0.5444f, 0.5805f },
				{ 0.5444f, 0.5766f }, { 0.5472f, 0.5750f },
				{ 0.5472f, 0.5734f }, { 0.5472f, 0.5727f },
				{ 0.5472f, 0.5719f }, { 0.5500f, 0.5703f },
				{ 0.5500f, 0.5688f }, { 0.5500f, 0.5672f },
				{ 0.5528f, 0.5648f }, { 0.5556f, 0.5633f },
				{ 0.5556f, 0.5617f }, { 0.5556f, 0.5602f },
				{ 0.5569f, 0.5562f }, { 0.5569f, 0.5562f },
				{ 0.5569f, 0.5531f }, { 0.5569f, 0.5516f },
				{ 0.5597f, 0.5500f }, { 0.5597f, 0.5469f },
				{ 0.5597f, 0.5445f }, { 0.5597f, 0.5445f },
				{ 0.5597f, 0.5430f }, { 0.5597f, 0.5406f },
				{ 0.5597f, 0.5391f }, { 0.5597f, 0.5344f },
				{ 0.5597f, 0.5336f }, { 0.5597f, 0.5320f },
				{ 0.5625f, 0.5297f }, { 0.5625f, 0.5281f },
				{ 0.5625f, 0.5242f }, { 0.5694f, 0.5141f },
				{ 0.5708f, 0.5102f }, { 0.5722f, 0.5086f },
				{ 0.5722f, 0.5086f }, { 0.5722f, 0.5070f },
				{ 0.5722f, 0.5055f }, { 0.5722f, 0.5039f },
				{ 0.5722f, 0.5031f }, { 0.5750f, 0.4961f },
				{ 0.5750f, 0.4945f }, { 0.5750f, 0.4938f },
				{ 0.5750f, 0.4930f }, { 0.5778f, 0.4906f },
				{ 0.5778f, 0.4898f }, { 0.5778f, 0.4883f },
				{ 0.5778f, 0.4875f }, { 0.5806f, 0.4867f },
				{ 0.5806f, 0.4828f }, { 0.5806f, 0.4805f },
				{ 0.5833f, 0.4797f }, { 0.5833f, 0.4781f },
				{ 0.5833f, 0.4773f }, { 0.5833f, 0.4742f },
				{ 0.5875f, 0.4734f }, { 0.5861f, 0.4711f },
				{ 0.5861f, 0.4703f }, { 0.5875f, 0.4703f },
				{ 0.5875f, 0.4688f }, { 0.5875f, 0.4664f },
				{ 0.5875f, 0.4648f }, { 0.5875f, 0.4633f },
				{ 0.5903f, 0.4633f }, { 0.5903f, 0.4617f },
				{ 0.5903f, 0.4602f }, { 0.5903f, 0.4563f },
				{ 0.5903f, 0.4547f }, { 0.5931f, 0.4523f },
				{ 0.5931f, 0.4508f }, { 0.5958f, 0.4492f },
				{ 0.5958f, 0.4477f }, { 0.5958f, 0.4461f },
				{ 0.5958f, 0.4437f }, { 0.5986f, 0.4445f },
				{ 0.5986f, 0.4430f }, { 0.5986f, 0.4414f },
				{ 0.5986f, 0.4406f }, { 0.6028f, 0.4383f },
				{ 0.6014f, 0.4375f }, { 0.6014f, 0.4359f },
				{ 0.6014f, 0.4344f }, { 0.6014f, 0.4328f },
				{ 0.6014f, 0.4297f }, { 0.6014f, 0.4266f },
				{ 0.6014f, 0.4234f }, { 0.6014f, 0.4195f },
				{ 0.6014f, 0.4180f }, { 0.6014f, 0.4148f },
				{ 0.6014f, 0.4133f }, { 0.6014f, 0.4109f },
				{ 0.6014f, 0.4063f }, { 0.6056f, 0.4039f },
				{ 0.6056f, 0.4008f }, { 0.6083f, 0.4008f },
				{ 0.6083f, 0.3992f }, { 0.6083f, 0.3984f },
				{ 0.6083f, 0.3969f }, { 0.6111f, 0.3922f },
				{ 0.6111f, 0.3906f }, { 0.6111f, 0.3906f },
				{ 0.6139f, 0.3883f }, { 0.6139f, 0.3867f },
				{ 0.6139f, 0.3852f }, { 0.6139f, 0.3844f },
				{ 0.6167f, 0.3812f }, { 0.6181f, 0.3789f },
				{ 0.6181f, 0.3781f }, { 0.6181f, 0.3766f },
				{ 0.6181f, 0.3758f }, { 0.6194f, 0.3742f },
				{ 0.6208f, 0.3742f }, { 0.6208f, 0.3734f },
				{ 0.6208f, 0.3719f }, { 0.6250f, 0.3703f },
				{ 0.6236f, 0.3688f }, { 0.6236f, 0.3656f },
				{ 0.6236f, 0.3648f }, { 0.6250f, 0.3648f },
				{ 0.6264f, 0.3633f }, { 0.6264f, 0.3617f },
				{ 0.6278f, 0.3594f }, { 0.6292f, 0.3578f },
				{ 0.6292f, 0.3539f }, { 0.6292f, 0.3500f },
				{ 0.6319f, 0.3445f }, { 0.6333f, 0.3375f },
				{ 0.6333f, 0.3344f }, { 0.6389f, 0.3242f },
				{ 0.6389f, 0.3227f }, { 0.6417f, 0.3180f },
				{ 0.6431f, 0.3156f }, { 0.6444f, 0.3133f },
				{ 0.6444f, 0.3117f }, { 0.6444f, 0.3070f },
				{ 0.6444f, 0.3023f }, { 0.6444f, 0.2969f },
				{ 0.6444f, 0.2937f }, { 0.6444f, 0.2883f },
				{ 0.6486f, 0.2836f }, { 0.6500f, 0.2766f },
				{ 0.6514f, 0.2695f }, { 0.6556f, 0.2625f },
				{ 0.6597f, 0.2547f }, { 0.6611f, 0.2469f },
				{ 0.6639f, 0.2430f }, { 0.6708f, 0.2359f },
				{ 0.6764f, 0.2258f }, { 0.6819f, 0.2172f },
				{ 0.6819f, 0.2148f }, { 0.6819f, 0.2109f },
				{ 0.6847f, 0.2078f }, { 0.6847f, 0.2055f },
				{ 0.6875f, 0.2031f }, { 0.6875f, 0.2000f },
				{ 0.6889f, 0.1992f }, { 0.6903f, 0.1992f },
				{ 0.6903f, 0.1969f }, { 0.6903f, 0.2016f },
				{ 0.6903f, 0.2086f }, { 0.6903f, 0.2156f },
				{ 0.6903f, 0.2227f }, { 0.6861f, 0.2250f },
				{ 0.6833f, 0.2305f }, { 0.6778f, 0.2398f },
				{ 0.6778f, 0.2453f }, { 0.6736f, 0.2531f },
				{ 0.6694f, 0.2672f }, { 0.6639f, 0.2836f },
				{ 0.6583f, 0.2945f }, { 0.6569f, 0.3000f },
				{ 0.6556f, 0.3023f }, { 0.6542f, 0.3039f },
				{ 0.6542f, 0.3063f }, { 0.6542f, 0.3070f },
				{ 0.6542f, 0.3094f }, { 0.6514f, 0.3133f },
				{ 0.6514f, 0.3156f }, { 0.6514f, 0.3164f },
				{ 0.6486f, 0.3219f }, { 0.6486f, 0.3242f },
				{ 0.6486f, 0.3266f }, { 0.6486f, 0.3281f },
				{ 0.6486f, 0.3297f }, { 0.6444f, 0.3289f },
				{ 0.6375f, 0.3414f }, { 0.6292f, 0.3531f },
				{ 0.6222f, 0.3641f }, { 0.6181f, 0.3742f },
				{ 0.6139f, 0.3883f }, { 0.6056f, 0.4039f },
				{ 0.5972f, 0.4281f }, { 0.5958f, 0.4453f },
				{ 0.5958f, 0.4602f }, { 0.5944f, 0.4672f },
				{ 0.5931f, 0.4742f }, { 0.5931f, 0.4805f },
				{ 0.5889f, 0.4820f }, { 0.5875f, 0.4859f },
				{ 0.5875f, 0.4914f }, { 0.5875f, 0.4953f },
				{ 0.5861f, 0.5016f }, { 0.5819f, 0.5078f },
				{ 0.5833f, 0.5078f }, { 0.5833f, 0.5094f },
				{ 0.5903f, 0.4789f }, { 0.6014f, 0.4477f },
				{ 0.6056f, 0.4406f }, { 0.6153f, 0.4297f },
				{ 0.6167f, 0.4203f }, { 0.6236f, 0.4000f },
				{ 0.6597f, 0.3328f }, { 0.6625f, 0.3266f },
				{ 0.6667f, 0.3203f }, { 0.6708f, 0.3117f },
				{ 0.6764f, 0.3023f }, { 0.6792f, 0.2977f },
				{ 0.6875f, 0.2867f }, { 0.6875f, 0.2852f },
				{ 0.6875f, 0.2836f }, { 0.6875f, 0.2820f },
				{ 0.6875f, 0.2758f }, { 0.6875f, 0.2703f },
				{ 0.6875f, 0.2680f }, { 0.6875f, 0.2641f },
				{ 0.6875f, 0.2648f }, { 0.6875f, 0.2602f },
				{ 0.6903f, 0.2539f }, { 0.7042f, 0.2125f },
				{ 0.7069f, 0.2016f }, { 0.7139f, 0.1828f },
				{ 0.7194f, 0.1703f }, { 0.7278f, 0.1617f },
				{ 0.7319f, 0.1531f }, { 0.7361f, 0.1430f },
				{ 0.7403f, 0.1344f }, { 0.7417f, 0.1258f },
				{ 0.7583f, 0.0969f }, { 0.7625f, 0.0859f },
				{ 0.7694f, 0.0758f }, { 0.7764f, 0.0648f },
				{ 0.7806f, 0.0547f }, { 0.7889f, 0.0437f },
				{ 0.7986f, 0.0328f }, { 0.8028f, 0.0258f },
				{ 0.8083f, 0.0188f }, { 0.8111f, 0.0141f },
				{ 0.8111f, 0.0141f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainList");
			solo.sleep(4800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(2, 0);
			solo.waitForActivity("TagDefinition2");
			solo.sleep(6000);
			solo.drag(solo.toScreenX(0.967f), solo.toScreenX(0.985f),
					solo.toScreenY(0.245f), solo.toScreenY(0.396f), 32);
			solo.sleep(2200);
			gestureGroup_1();
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.985f), solo.toScreenX(0.985f),
					solo.toScreenY(0.482f), solo.toScreenY(0.534f), 23);
			solo.sleep(2300);
			solo.drag(solo.toScreenX(0.979f), solo.toScreenX(0.997f),
					solo.toScreenY(0.484f), solo.toScreenY(0.552f), 13);
			solo.sleep(6700);
			solo.drag(solo.toScreenX(0.958f), solo.toScreenX(0.985f),
					solo.toScreenY(0.434f), solo.toScreenY(0.527f), 19);
			solo.sleep(1700);
			solo.drag(solo.toScreenX(0.985f), solo.toScreenX(0.974f),
					solo.toScreenY(0.449f), solo.toScreenY(0.718f), 33);
			solo.clickOnScreen(solo.toScreenX(0.974f), solo.toScreenY(0.717f));
			solo.sleep(1300);
			solo.clickOnScreen(solo.toScreenX(0.988f), solo.toScreenY(0.830f));
			solo.sleep(2100);
			solo.drag(solo.toScreenX(0.219f), solo.toScreenX(0.358f),
					solo.toScreenY(0.365f), solo.toScreenY(0.595f), 13);
			solo.sleep(2300);
			solo.clickOnScreen(solo.toScreenX(0.949f), solo.toScreenY(0.138f));
			solo.sleep(4200);
			solo.drag(solo.toScreenX(0.972f), solo.toScreenX(0.967f),
					solo.toScreenY(0.743f), solo.toScreenY(0.500f), 14);
			solo.sleep(2300);
			gestureGroup_2();
			solo.sleep(2900);
			solo.drag(solo.toScreenX(0.939f), solo.toScreenX(0.946f),
					solo.toScreenY(0.519f), solo.toScreenY(0.073f), 28);
			solo.sleep(2000);
			solo.drag(solo.toScreenX(0.908f), solo.toScreenX(0.939f),
					solo.toScreenY(0.734f), solo.toScreenY(-0.002f), 38);
			solo.sleep(1800);
			solo.drag(solo.toScreenX(0.750f), solo.toScreenX(0.865f),
					solo.toScreenY(0.541f), solo.toScreenY(0.113f), 20);
			solo.sleep(1100);
			solo.drag(solo.toScreenX(0.644f), solo.toScreenX(0.715f),
					solo.toScreenY(0.339f), solo.toScreenY(0.986f), 10);
			solo.sleep(700);
			solo.drag(solo.toScreenX(0.706f), solo.toScreenX(0.835f),
					solo.toScreenY(0.466f), solo.toScreenY(0.906f), 15);
			solo.sleep(1400);
			solo.clickOnScreen(solo.toScreenX(0.946f), solo.toScreenY(0.160f));
			solo.sleep(1600);
			assertTrue(
					"Wait for html element - div(index: 0, class: cbb attrframe1) failed.",
					solo.waitForHtmlElement("div", "", "", "cbb attrframe1", 0,
							20000, null));
			solo.clickOnHtmlElement("div", "", "", "cbb attrframe1", 0, null);
			solo.sleep(1500);
			assertTrue(
					"Wait for html element - div(index: 0, id: back_section, class: back_border) failed.",
					solo.waitForHtmlElement("div", "back_section", "",
							"back_border", 0, 20000, null));
			solo.clickOnHtmlElement("div", "back_section", "", "back_border",
					0, null);
			solo.sleep(1500);
			assertTrue(
					"Wait for html element - div(index: 0, class: cbb attrframe1) failed.",
					solo.waitForHtmlElement("div", "", "", "cbb attrframe1", 0,
							20000, null));
			solo.clickOnHtmlElement("div", "", "", "cbb attrframe1", 0, null);
			solo.sleep(2700);
			solo.drag(solo.toScreenX(0.900f), solo.toScreenX(0.885f),
					solo.toScreenY(0.370f), solo.toScreenY(0.633f), 13);
			solo.sleep(1200);
			assertTrue("Wait for view (index: 15) failed.",
					solo.waitForView(15, 20000));
			solo.clickOnView(15);
			solo.waitForActivity("MainList");
			solo.sleep(2500);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(7, 0);
			solo.waitForActivity("TagDefinition7");
			solo.sleep(11000);
			solo.drag(solo.toScreenX(0.644f), solo.toScreenX(0.789f),
					solo.toScreenY(0.676f), solo.toScreenY(0.045f), 154);
			solo.sleep(2300);
			assertTrue("Wait for view (index: 25) failed.",
					solo.waitForView(25, 20000));
			solo.clickOnView(25);
			solo.waitForActivity("MainList");
			solo.sleep(2800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 10);
			solo.sleep(600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 16);
			solo.sleep(1200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 28);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 41);
			solo.sleep(1400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 91);
			solo.sleep(1900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 84);
			solo.sleep(500);
			solo.drag(solo.toScreenX(0.792f), solo.toScreenX(0.651f),
					solo.toScreenY(0.330f), solo.toScreenY(0.923f), 10);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 75);
			solo.sleep(1100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 74);
			solo.sleep(700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 69);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 63);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 54);
			solo.sleep(700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 48);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 41);
			solo.sleep(700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(6, 0);
			solo.waitForActivity("TagDefinition47");
			solo.sleep(5100);
			solo.drag(solo.toScreenX(0.601f), solo.toScreenX(0.626f),
					solo.toScreenY(0.573f), solo.toScreenY(0.527f), 26);
			solo.sleep(7800);
			solo.drag(solo.toScreenX(0.629f), solo.toScreenX(0.753f),
					solo.toScreenY(0.527f), solo.toScreenY(0.227f), 115);
			solo.sleep(2200);
			solo.drag(solo.toScreenX(0.560f), solo.toScreenX(0.660f),
					solo.toScreenY(0.637f), solo.toScreenY(0.406f), 49);
			solo.sleep(2200);
			solo.drag(solo.toScreenX(0.418f), solo.toScreenX(0.550f),
					solo.toScreenY(0.699f), solo.toScreenY(0.541f), 48);
			solo.sleep(3700);
			solo.drag(solo.toScreenX(0.314f), solo.toScreenX(0.800f),
					solo.toScreenY(0.756f), solo.toScreenY(0.363f), 85);
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.375f), solo.toScreenX(0.749f),
					solo.toScreenY(0.610f), solo.toScreenY(0.206f), 42);
			solo.sleep(1300);
			gestureGroup_3();
			solo.sleep(1900);
			assertTrue("Wait for view (index: 26) failed.",
					solo.waitForView(26, 20000));
			solo.clickOnView(26);
			solo.waitForActivity("MainList");
			solo.sleep(3700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(6, 0);
			solo.waitForActivity("TagDefinition47");
			solo.sleep(16100);
			solo.drag(solo.toScreenX(0.306f), solo.toScreenX(0.754f),
					solo.toScreenY(0.836f), solo.toScreenY(0.169f), 26);
			solo.sleep(7100);
			solo.drag(solo.toScreenX(0.336f), solo.toScreenX(0.464f),
					solo.toScreenY(0.710f), solo.toScreenY(0.297f), 29);
			solo.sleep(6900);
			gestureGroup_4();
			solo.sleep(1200);
			assertTrue("Wait for view (index: 27) failed.",
					solo.waitForView(27, 20000));
			solo.clickOnView(27);
			solo.waitForActivity("MainList");
			solo.sleep(2700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 54);
			solo.sleep(1600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 64);
			solo.sleep(700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(8, 0);
			solo.waitForActivity("TagDefinition72");
			solo.sleep(3400);
			solo.drag(solo.toScreenX(0.532f), solo.toScreenX(0.532f),
					solo.toScreenY(0.707f), solo.toScreenY(0.661f), 18);
			solo.clickOnScreen(solo.toScreenX(0.532f), solo.toScreenY(0.657f));
			solo.sleep(11800);
			gestureGroup_5();
			solo.sleep(4000);
			solo.drag(solo.toScreenX(0.188f), solo.toScreenX(0.200f),
					solo.toScreenY(0.463f), solo.toScreenY(0.270f), 15);
			solo.sleep(1000);
			assertTrue("Wait for view (index: 32) failed.",
					solo.waitForView(32, 20000));
			solo.clickOnView(32);
			solo.waitForActivity("MainList");
			solo.sleep(2200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 75);
			solo.sleep(2500);
			solo.drag(solo.toScreenX(0.311f), solo.toScreenX(0.306f),
					solo.toScreenY(0.382f), solo.toScreenY(0.910f), 19);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 67);
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
