package org.wikipedia.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.TextView;

public class TestWikipedia_hhs382_3 extends ActivityInstrumentationTestCase2<Activity> {

	private static final String LAUNCHER_ACTIVITY_CLASSNAME = "org.wikipedia.page.PageActivity";
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
	public TestWikipedia_hhs382_3() {
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

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("PageActivity");
			solo.waitForActivity("OnboardingActivity");
			solo.sleep(31100);
			assertTrue(
					"Wait for text (id: org.wikipedia.R.id.onboarding_skip_link) failed.",
					solo.waitForTextById(
							"org.wikipedia.R.id.onboarding_skip_link", 20000));
			solo.clickOnText((TextView) solo
					.findViewById("org.wikipedia.R.id.onboarding_skip_link"));
			solo.waitForActivity("PageActivity");
			solo.sleep(8000);
			solo.clickOnScreen(solo.toScreenX(0.637f), solo.toScreenY(0.163f));
			solo.sleep(1700);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(55200);
			solo.drag(solo.toScreenX(0.067f), solo.toScreenX(0.962f),
					solo.toScreenY(0.237f), solo.toScreenY(0.203f), 16);
			solo.sleep(1100);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(22400);
			solo.drag(solo.toScreenX(0.064f), solo.toScreenX(0.944f),
					solo.toScreenY(0.622f), solo.toScreenY(0.526f), 13);
			solo.sleep(1300);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(16500);
			solo.drag(solo.toScreenX(0.036f), solo.toScreenX(0.972f),
					solo.toScreenY(0.460f), solo.toScreenY(0.410f), 12);
			solo.sleep(1400);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(47400);
			solo.drag(solo.toScreenX(0.011f), solo.toScreenX(0.831f),
					solo.toScreenY(0.491f), solo.toScreenY(0.446f), 17);
			solo.sleep(1100);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_history) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_history",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_history"));
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
