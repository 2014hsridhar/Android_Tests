package org.wikipedia.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.EditText;
import android.widget.TextView;

public class TestWikipedia_hs382_4 extends ActivityInstrumentationTestCase2<Activity> {

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
	public TestWikipedia_hs382_4() {
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
			solo.sleep(5500);
			assertTrue(
					"Wait for text (id: org.wikipedia.R.id.onboarding_skip_link) failed.",
					solo.waitForTextById(
							"org.wikipedia.R.id.onboarding_skip_link", 20000));
			solo.clickOnText((TextView) solo
					.findViewById("org.wikipedia.R.id.onboarding_skip_link"));
			solo.waitForActivity("PageActivity");
			solo.sleep(3200);
			solo.drag(solo.toScreenX(0.144f), solo.toScreenX(0.801f),
					solo.toScreenY(0.169f), solo.toScreenY(0.165f), 9);
			solo.sleep(700);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(42200);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(28700);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"alpha centauri system");
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(1, 0);
			solo.sleep(36100);
			solo.clickOnScreen(solo.toScreenX(0.049f), solo.toScreenY(0.583f));
			solo.sleep(4300);
			solo.drag(solo.toScreenX(0.087f), solo.toScreenX(0.747f),
					solo.toScreenY(0.572f), solo.toScreenY(0.576f), 37);
			solo.sleep(900);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.nav_item_random) failed.",
					solo.waitForViewById("org.wikipedia.R.id.nav_item_random",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.nav_item_random"));
			solo.sleep(37900);
			solo.drag(solo.toScreenX(0.083f), solo.toScreenX(0.940f),
					solo.toScreenY(0.591f), solo.toScreenY(0.549f), 24);
			solo.sleep(21100);
			solo.drag(solo.toScreenX(0.935f), solo.toScreenX(0.015f),
					solo.toScreenY(0.555f), solo.toScreenY(0.533f), 37);
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
