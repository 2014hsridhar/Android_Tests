package org.wikipedia.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.EditText;
import android.widget.TextView;

public class TestWikipedia_hhs382_2 extends ActivityInstrumentationTestCase2<Activity> {

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
	public TestWikipedia_hhs382_2() {
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
			solo.sleep(7300);
			assertTrue(
					"Wait for text (id: org.wikipedia.R.id.onboarding_skip_link) failed.",
					solo.waitForTextById(
							"org.wikipedia.R.id.onboarding_skip_link", 20000));
			solo.clickOnText((TextView) solo
					.findViewById("org.wikipedia.R.id.onboarding_skip_link"));
			solo.waitForActivity("PageActivity");
			solo.sleep(24100);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(15300);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"kanye west");
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(1, 0);
			solo.sleep(16300);
			solo.drag(solo.toScreenX(0.060f), solo.toScreenX(1.000f),
					solo.toScreenY(0.545f), solo.toScreenY(0.495f), 25);
			solo.sleep(27600);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(17500);
			solo.drag(solo.toScreenX(0.054f), solo.toScreenX(0.975f),
					solo.toScreenY(0.569f), solo.toScreenY(0.503f), 7);
			solo.sleep(12600);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(30000);
			solo.drag(solo.toScreenX(0.046f), solo.toScreenX(0.975f),
					solo.toScreenY(0.567f), solo.toScreenY(0.534f), 7);
			solo.sleep(4200);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_history) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_history",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_history"));
			solo.sleep(25900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(4, 0);
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Test1.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Test1.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
