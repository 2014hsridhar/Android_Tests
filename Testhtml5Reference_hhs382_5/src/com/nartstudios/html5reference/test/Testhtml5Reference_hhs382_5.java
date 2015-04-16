package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

public class Testhtml5Reference_hhs382_5 extends ActivityInstrumentationTestCase2<Activity> {

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
	public Testhtml5Reference_hhs382_5() {
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
		float points[][] = { { 0.8472f, 0.4656f }, { 0.8472f, 0.4633f },
				{ 0.8431f, 0.4539f }, { 0.8389f, 0.4453f },
				{ 0.8375f, 0.4391f }, { 0.8375f, 0.4328f },
				{ 0.8375f, 0.4258f }, { 0.8375f, 0.4078f },
				{ 0.8375f, 0.3992f }, { 0.8375f, 0.3938f },
				{ 0.8375f, 0.3805f }, { 0.8583f, 0.3422f },
				{ 0.8806f, 0.2977f }, { 0.8806f, 0.2914f },
				{ 0.8833f, 0.2898f }, { 0.8833f, 0.2859f },
				{ 0.8833f, 0.2859f }, { 0.8833f, 0.2844f },
				{ 0.8833f, 0.2828f }, { 0.8833f, 0.2820f },
				{ 0.8833f, 0.2805f }, { 0.8833f, 0.2750f },
				{ 0.8833f, 0.2664f }, { 0.8806f, 0.2555f },
				{ 0.8778f, 0.2508f }, { 0.8722f, 0.2492f },
				{ 0.8778f, 0.2477f }, { 0.8778f, 0.2461f },
				{ 0.8792f, 0.2461f }, { 0.8806f, 0.2461f },
				{ 0.8806f, 0.2813f }, { 0.8931f, 0.3664f },
				{ 0.9083f, 0.4961f }, { 0.9208f, 0.6570f },
				{ 0.9583f, 0.8172f }, { 0.9722f, 0.9203f },
				{ 0.9764f, 0.9375f }, { 0.9764f, 0.9492f },
				{ 0.9764f, 0.9492f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.5167f, 0.3500f }, { 0.5167f, 0.3492f },
				{ 0.5167f, 0.3469f }, { 0.5167f, 0.3453f },
				{ 0.5167f, 0.3445f }, { 0.5167f, 0.3414f },
				{ 0.5167f, 0.3406f }, { 0.5167f, 0.3406f },
				{ 0.5167f, 0.3375f }, { 0.5167f, 0.3359f },
				{ 0.5167f, 0.3336f }, { 0.5167f, 0.3313f },
				{ 0.5167f, 0.3172f }, { 0.5167f, 0.3148f },
				{ 0.5167f, 0.3133f }, { 0.5167f, 0.3055f },
				{ 0.5167f, 0.3023f }, { 0.5167f, 0.2984f },
				{ 0.5167f, 0.2977f }, { 0.5167f, 0.2961f },
				{ 0.5167f, 0.2977f }, { 0.5167f, 0.2992f },
				{ 0.5167f, 0.3000f }, { 0.5167f, 0.3016f },
				{ 0.5167f, 0.3000f }, { 0.5139f, 0.3000f },
				{ 0.5125f, 0.3000f }, { 0.5125f, 0.2992f },
				{ 0.5125f, 0.2961f }, { 0.5125f, 0.2937f },
				{ 0.5125f, 0.2930f }, { 0.5125f, 0.2906f },
				{ 0.5125f, 0.2891f }, { 0.5125f, 0.2875f },
				{ 0.5125f, 0.2852f }, { 0.5125f, 0.2828f },
				{ 0.5125f, 0.2820f }, { 0.5139f, 0.2805f },
				{ 0.5139f, 0.2789f }, { 0.5139f, 0.2773f },
				{ 0.5167f, 0.2766f }, { 0.5194f, 0.2742f },
				{ 0.5194f, 0.2727f }, { 0.5194f, 0.2711f },
				{ 0.5222f, 0.2688f }, { 0.5250f, 0.2641f },
				{ 0.5278f, 0.2594f }, { 0.5292f, 0.2578f },
				{ 0.5319f, 0.2539f }, { 0.5319f, 0.2523f },
				{ 0.5319f, 0.2516f }, { 0.5319f, 0.2500f },
				{ 0.5319f, 0.2492f }, { 0.5319f, 0.2477f },
				{ 0.5319f, 0.2445f }, { 0.5319f, 0.2430f },
				{ 0.5319f, 0.2406f }, { 0.5292f, 0.2406f },
				{ 0.5264f, 0.2344f }, { 0.5278f, 0.2344f },
				{ 0.5278f, 0.2391f }, { 0.5278f, 0.2406f },
				{ 0.5278f, 0.2469f }, { 0.5278f, 0.2500f },
				{ 0.5278f, 0.2539f }, { 0.5278f, 0.2562f },
				{ 0.5278f, 0.2570f }, { 0.5278f, 0.2594f },
				{ 0.5278f, 0.2617f }, { 0.5278f, 0.2625f },
				{ 0.5278f, 0.2633f }, { 0.5278f, 0.2648f },
				{ 0.5278f, 0.2672f }, { 0.5278f, 0.2695f },
				{ 0.5278f, 0.2656f }, { 0.5278f, 0.2625f },
				{ 0.5250f, 0.2539f }, { 0.5222f, 0.2469f },
				{ 0.5167f, 0.2336f }, { 0.5167f, 0.2258f },
				{ 0.5167f, 0.2078f }, { 0.5167f, 0.2000f },
				{ 0.5167f, 0.1898f }, { 0.5167f, 0.1891f },
				{ 0.5139f, 0.1891f }, { 0.5139f, 0.1891f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_2() throws Exception {
		float points[][] = { { 0.6167f, 0.5719f }, { 0.6167f, 0.5672f },
				{ 0.6167f, 0.5578f }, { 0.6167f, 0.5508f },
				{ 0.6292f, 0.5211f }, { 0.6528f, 0.4859f },
				{ 0.6708f, 0.4641f }, { 0.6806f, 0.4563f },
				{ 0.6819f, 0.4500f }, { 0.6875f, 0.4391f },
				{ 0.6944f, 0.4328f }, { 0.7000f, 0.4289f },
				{ 0.7000f, 0.4266f }, { 0.7000f, 0.4258f },
				{ 0.7000f, 0.4289f }, { 0.7000f, 0.4305f },
				{ 0.7000f, 0.4328f }, { 0.7000f, 0.4328f },
				{ 0.7000f, 0.4375f }, { 0.7000f, 0.4398f },
				{ 0.7000f, 0.4453f }, { 0.7000f, 0.4563f },
				{ 0.7000f, 0.4570f }, { 0.7000f, 0.4625f },
				{ 0.7000f, 0.4664f }, { 0.7000f, 0.4695f },
				{ 0.7000f, 0.4711f }, { 0.7000f, 0.4727f },
				{ 0.7000f, 0.4734f }, { 0.7000f, 0.4742f },
				{ 0.7000f, 0.4758f }, { 0.7000f, 0.4797f },
				{ 0.7000f, 0.4828f }, { 0.6972f, 0.4852f },
				{ 0.6972f, 0.4898f }, { 0.6917f, 0.4945f },
				{ 0.6917f, 0.5000f }, { 0.6903f, 0.5016f },
				{ 0.6903f, 0.5063f }, { 0.6903f, 0.5086f },
				{ 0.6903f, 0.5102f }, { 0.6875f, 0.5125f },
				{ 0.6875f, 0.5148f }, { 0.6875f, 0.5156f },
				{ 0.6875f, 0.5156f }, { 0.6875f, 0.5203f },
				{ 0.6875f, 0.5219f }, { 0.6875f, 0.5242f },
				{ 0.6847f, 0.5273f }, { 0.6847f, 0.5289f },
				{ 0.6847f, 0.5344f }, { 0.6847f, 0.5391f },
				{ 0.6806f, 0.5445f }, { 0.6806f, 0.5469f },
				{ 0.6792f, 0.5516f }, { 0.6792f, 0.5586f },
				{ 0.6792f, 0.5664f }, { 0.6764f, 0.5742f },
				{ 0.6764f, 0.5797f }, { 0.6722f, 0.5852f },
				{ 0.6694f, 0.5914f }, { 0.6694f, 0.5953f },
				{ 0.6667f, 0.5969f }, { 0.6625f, 0.5992f },
				{ 0.6583f, 0.6000f }, { 0.6611f, 0.6078f },
				{ 0.6611f, 0.6172f }, { 0.6583f, 0.6289f },
				{ 0.6569f, 0.6422f }, { 0.6569f, 0.6664f },
				{ 0.6569f, 0.6875f }, { 0.6542f, 0.7055f },
				{ 0.6458f, 0.7234f }, { 0.6417f, 0.7430f },
				{ 0.6417f, 0.7578f }, { 0.6417f, 0.7648f },
				{ 0.6417f, 0.7758f }, { 0.6417f, 0.7797f },
				{ 0.6417f, 0.7883f }, { 0.6417f, 0.7961f },
				{ 0.6417f, 0.8000f }, { 0.6417f, 0.8016f },
				{ 0.6417f, 0.8047f }, { 0.6417f, 0.8055f },
				{ 0.6417f, 0.8062f }, { 0.6389f, 0.8062f },
				{ 0.6389f, 0.8023f }, { 0.6389f, 0.8000f },
				{ 0.6389f, 0.7977f }, { 0.6333f, 0.7844f },
				{ 0.6306f, 0.7805f }, { 0.6306f, 0.7766f },
				{ 0.6236f, 0.7695f }, { 0.6208f, 0.7586f },
				{ 0.6181f, 0.7516f }, { 0.6167f, 0.7391f },
				{ 0.6139f, 0.7148f }, { 0.6139f, 0.7078f },
				{ 0.6139f, 0.7063f }, { 0.6139f, 0.7055f },
				{ 0.6139f, 0.7039f }, { 0.6139f, 0.7070f },
				{ 0.6139f, 0.7094f }, { 0.6139f, 0.7141f },
				{ 0.6139f, 0.7203f }, { 0.6111f, 0.7336f },
				{ 0.5889f, 0.7891f }, { 0.5708f, 0.8305f },
				{ 0.5444f, 0.9148f }, { 0.5194f, 0.9945f },
				{ 0.5194f, 0.9945f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainList");
			solo.sleep(3100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 9);
			solo.sleep(1300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 17);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 28);
			solo.sleep(1600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 36);
			solo.sleep(600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 43);
			solo.sleep(1300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 49);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 54);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 58);
			solo.sleep(1200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 62);
			solo.sleep(1100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 70);
			solo.sleep(1100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 70);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(6, 0);
			solo.waitForActivity("TagDefinition76");
			solo.sleep(10200);
			solo.drag(solo.toScreenX(0.397f), solo.toScreenX(0.486f),
					solo.toScreenY(0.441f), solo.toScreenY(0.300f), 75);
			solo.sleep(12900);
			gestureGroup_1();
			solo.sleep(5900);
			solo.drag(solo.toScreenX(0.565f), solo.toScreenX(0.586f),
					solo.toScreenY(0.424f), solo.toScreenY(0.739f), 102);
			solo.sleep(1300);
			solo.drag(solo.toScreenX(0.522f), solo.toScreenX(0.514f),
					solo.toScreenY(0.534f), solo.toScreenY(0.627f), 33);
			solo.sleep(9700);
			solo.drag(solo.toScreenX(0.494f), solo.toScreenX(0.492f),
					solo.toScreenY(0.479f), solo.toScreenY(0.626f), 13);
			solo.sleep(1500);
			assertTrue("Wait for view (index: 27) failed.",
					solo.waitForView(27, 20000));
			solo.clickOnView(27);
			solo.waitForActivity("MainList");
			solo.sleep(2100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 77);
			solo.sleep(2200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 86);
			solo.sleep(1800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(4, 0);
			solo.waitForActivity("TagDefinition90");
			solo.sleep(2600);
			solo.drag(solo.toScreenX(0.626f), solo.toScreenX(0.908f),
					solo.toScreenY(0.633f), solo.toScreenY(0.002f), 15);
			solo.sleep(5400);
			gestureGroup_2();
			solo.sleep(22600);
			assertTrue("Wait for view (index: 17) failed.",
					solo.waitForView(17, 20000));
			solo.clickOnView(17);
			solo.waitForActivity("MainList");
			solo.sleep(1800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 91);
			solo.sleep(1000);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 91);
			solo.sleep(1300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(13, 0);
			solo.waitForActivity("TagDefinition104");
			solo.sleep(6100);
			solo.drag(solo.toScreenX(0.446f), solo.toScreenX(0.590f),
					solo.toScreenY(0.372f), solo.toScreenY(0.172f), 35);
			solo.sleep(4400);
			solo.drag(solo.toScreenX(0.596f), solo.toScreenX(0.601f),
					solo.toScreenY(0.530f), solo.toScreenY(0.373f), 77);
			solo.sleep(3800);
			solo.drag(solo.toScreenX(0.586f), solo.toScreenX(0.974f),
					solo.toScreenY(0.648f), solo.toScreenY(0.003f), 84);
			solo.sleep(2900);
			gestureGroup_3();
			solo.sleep(1700);
			solo.drag(solo.toScreenX(0.869f), solo.toScreenX(0.946f),
					solo.toScreenY(0.484f), solo.toScreenY(0.991f), 30);
			solo.sleep(900);
			solo.drag(solo.toScreenX(0.943f), solo.toScreenX(0.997f),
					solo.toScreenY(0.622f), solo.toScreenY(0.889f), 14);
			solo.sleep(700);
			solo.drag(solo.toScreenX(0.896f), solo.toScreenX(0.997f),
					solo.toScreenY(0.886f), solo.toScreenY(0.517f), 11);
			solo.sleep(2700);
			solo.drag(solo.toScreenX(0.676f), solo.toScreenX(0.826f),
					solo.toScreenY(0.645f), solo.toScreenY(0.486f), 68);
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.456f), solo.toScreenX(0.575f),
					solo.toScreenY(0.876f), solo.toScreenY(0.725f), 33);
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.339f), solo.toScreenX(0.585f),
					solo.toScreenY(0.957f), solo.toScreenY(0.786f), 34);
			solo.sleep(2500);
			solo.drag(solo.toScreenX(0.286f), solo.toScreenX(0.410f),
					solo.toScreenY(0.927f), solo.toScreenY(0.821f), 41);
			solo.sleep(2000);
			solo.drag(solo.toScreenX(0.174f), solo.toScreenX(0.456f),
					solo.toScreenY(0.903f), solo.toScreenY(0.714f), 38);
			solo.sleep(2500);
			solo.drag(solo.toScreenX(0.210f), solo.toScreenX(0.347f),
					solo.toScreenY(0.832f), solo.toScreenY(0.720f), 42);
			solo.sleep(5900);
			solo.drag(solo.toScreenX(0.311f), solo.toScreenX(0.449f),
					solo.toScreenY(0.596f), solo.toScreenY(0.417f), 47);
			solo.sleep(3000);
			solo.drag(solo.toScreenX(0.601f), solo.toScreenX(0.378f),
					solo.toScreenY(0.362f), solo.toScreenY(0.970f), 43);
			solo.sleep(3200);
			solo.drag(solo.toScreenX(0.385f), solo.toScreenX(0.474f),
					solo.toScreenY(0.296f), solo.toScreenY(0.500f), 14);
			solo.sleep(2400);
			assertTrue("Wait for view (index: 28) failed.",
					solo.waitForView(28, 20000));
			solo.clickOnView(28);
			solo.waitForActivity("MainList");
			solo.sleep(3600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 77);
			solo.sleep(1200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 70);
			solo.sleep(1800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 62);
			solo.sleep(1100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 56);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 51);
			solo.sleep(1600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(12, 0);
			solo.waitForActivity("TagDefinition63");
			solo.sleep(11700);
			solo.drag(solo.toScreenX(0.412f), solo.toScreenX(0.557f),
					solo.toScreenY(0.562f), solo.toScreenY(0.197f), 93);
			solo.sleep(5500);
			solo.drag(solo.toScreenX(0.078f), solo.toScreenX(0.347f),
					solo.toScreenY(0.743f), solo.toScreenY(0.536f), 18);
			solo.sleep(5200);
			solo.drag(solo.toScreenX(0.443f), solo.toScreenX(0.188f),
					solo.toScreenY(0.295f), solo.toScreenY(0.945f), 31);
			solo.sleep(1700);
			assertTrue("Wait for view (index: 21) failed.",
					solo.waitForView(21, 20000));
			solo.clickOnView(21);
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
