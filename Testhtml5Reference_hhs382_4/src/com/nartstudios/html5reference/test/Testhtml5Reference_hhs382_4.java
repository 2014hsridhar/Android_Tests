package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

public class Testhtml5Reference_hhs382_4 extends ActivityInstrumentationTestCase2<Activity> {

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
	public Testhtml5Reference_hhs382_4() {
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

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.5958f, 0.9344f }, { 0.5958f, 0.9148f },
				{ 0.5958f, 0.8969f }, { 0.5958f, 0.8680f },
				{ 0.5861f, 0.7969f }, { 0.5653f, 0.7000f },
				{ 0.5264f, 0.6102f }, { 0.5042f, 0.5516f },
				{ 0.4875f, 0.5125f }, { 0.4792f, 0.5000f },
				{ 0.4694f, 0.4836f }, { 0.4597f, 0.4664f },
				{ 0.4556f, 0.4570f }, { 0.4458f, 0.4375f },
				{ 0.4264f, 0.4117f }, { 0.4097f, 0.3977f },
				{ 0.3958f, 0.3766f }, { 0.3903f, 0.3688f },
				{ 0.3903f, 0.3641f }, { 0.3903f, 0.3609f },
				{ 0.3806f, 0.3539f }, { 0.3750f, 0.3477f },
				{ 0.3597f, 0.3289f }, { 0.3306f, 0.3102f },
				{ 0.3278f, 0.3102f }, { 0.3264f, 0.3172f },
				{ 0.3264f, 0.3250f }, { 0.3361f, 0.3508f },
				{ 0.3722f, 0.4234f }, { 0.3875f, 0.4773f },
				{ 0.5236f, 0.7820f }, { 0.5875f, 0.8914f },
				{ 0.6111f, 0.9484f }, { 0.6181f, 0.9953f },
				{ 0.6181f, 0.9953f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_2() throws Exception {
		float points[][] = { { 0.3236f, 0.3828f }, { 0.3236f, 0.3734f },
				{ 0.3194f, 0.3523f }, { 0.3167f, 0.3359f },
				{ 0.3167f, 0.3148f }, { 0.3167f, 0.2883f },
				{ 0.3167f, 0.2680f }, { 0.3208f, 0.2398f },
				{ 0.3208f, 0.2281f }, { 0.3222f, 0.2188f },
				{ 0.3236f, 0.2133f }, { 0.3278f, 0.2039f },
				{ 0.3292f, 0.2023f }, { 0.3292f, 0.2016f },
				{ 0.3292f, 0.2102f }, { 0.3292f, 0.2211f },
				{ 0.3292f, 0.2383f }, { 0.3125f, 0.3227f },
				{ 0.2875f, 0.4656f }, { 0.2736f, 0.5766f },
				{ 0.2736f, 0.6336f }, { 0.2736f, 0.6430f },
				{ 0.2736f, 0.6453f }, { 0.2722f, 0.6406f },
				{ 0.2653f, 0.6375f }, { 0.2653f, 0.6375f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainList");
			solo.sleep(4400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 5);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 12);
			solo.sleep(1200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 20);
			solo.sleep(1600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 42);
			solo.sleep(600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 50);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 58);
			solo.sleep(1200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 69);
			solo.sleep(1700);
			gestureGroup_1();
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 67);
			solo.drag(solo.toScreenX(0.471f), solo.toScreenX(0.614f),
					solo.toScreenY(0.352f), solo.toScreenY(0.974f), 12);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 50);
			solo.sleep(1100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 43);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(11, 0);
			solo.waitForActivity("TagDefinition54");
			solo.sleep(9200);
			solo.drag(solo.toScreenX(0.538f), solo.toScreenX(0.419f),
					solo.toScreenY(0.736f), solo.toScreenY(0.366f), 84);
			solo.sleep(3500);
			solo.drag(solo.toScreenX(0.231f), solo.toScreenX(0.350f),
					solo.toScreenY(0.438f), solo.toScreenY(0.917f), 28);
			solo.sleep(13900);
			assertTrue("Wait for view (index: 27) failed.",
					solo.waitForView(27, 20000));
			solo.clickOnView(27);
			solo.waitForActivity("MainList");
			solo.sleep(2200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 54);
			solo.sleep(5700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(12, 0);
			solo.waitForActivity("TagDefinition66");
			solo.sleep(3600);
			solo.drag(solo.toScreenX(0.336f), solo.toScreenX(0.692f),
					solo.toScreenY(0.829f), solo.toScreenY(0.117f), 33);
			solo.sleep(4300);
			solo.drag(solo.toScreenX(0.568f), solo.toScreenX(0.543f),
					solo.toScreenY(0.330f), solo.toScreenY(0.902f), 23);
			solo.sleep(26700);
			assertTrue("Wait for view (index: 20) failed.",
					solo.waitForView(20, 20000));
			solo.clickOnView(20);
			solo.waitForActivity("MainList");
			solo.sleep(2800);
			solo.drag(solo.toScreenX(0.468f), solo.toScreenX(0.393f),
					solo.toScreenY(0.202f), solo.toScreenY(0.915f), 25);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 43);
			solo.sleep(2300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(7, 0);
			solo.waitForActivity("TagDefinition50");
			solo.sleep(18000);
			solo.drag(solo.toScreenX(0.192f), solo.toScreenX(0.390f),
					solo.toScreenY(0.523f), solo.toScreenY(0.005f), 24);
			solo.sleep(1500);
			solo.drag(solo.toScreenX(0.394f), solo.toScreenX(0.410f),
					solo.toScreenY(0.453f), solo.toScreenY(0.395f), 15);
			solo.sleep(10200);
			solo.drag(solo.toScreenX(0.410f), solo.toScreenX(0.514f),
					solo.toScreenY(0.395f), solo.toScreenY(0.709f), 21);
			solo.sleep(1300);
			assertTrue("Wait for view (index: 23) failed.",
					solo.waitForView(23, 20000));
			solo.clickOnView(23);
			solo.waitForActivity("MainList");
			solo.sleep(1800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 51);
			solo.sleep(2000);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 56);
			solo.sleep(4300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(5, 0);
			solo.waitForActivity("TagDefinition61");
			solo.sleep(17500);
			solo.drag(solo.toScreenX(0.646f), solo.toScreenX(0.646f),
					solo.toScreenY(0.688f), solo.toScreenY(0.110f), 37);
			solo.sleep(14100);
			solo.drag(solo.toScreenX(0.661f), solo.toScreenX(0.718f),
					solo.toScreenY(0.365f), solo.toScreenY(0.049f), 27);
			solo.sleep(1500);
			solo.drag(solo.toScreenX(0.440f), solo.toScreenX(0.540f),
					solo.toScreenY(0.716f), solo.toScreenY(0.444f), 27);
			solo.sleep(3500);
			assertTrue("Wait for view (index: 33) failed.",
					solo.waitForView(33, 20000));
			solo.clickOnView(33);
			solo.waitForActivity("MainList");
			solo.sleep(2500);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 53);
			solo.sleep(1200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 49);
			solo.sleep(2800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(9, 0);
			solo.waitForActivity("TagDefinition58");
			solo.sleep(5000);
			gestureGroup_2();
			solo.sleep(3400);
			assertTrue("Wait for view (index: 31) failed.",
					solo.waitForView(31, 20000));
			solo.clickOnView(31);
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
