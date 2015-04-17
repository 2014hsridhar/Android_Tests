package org.wikipedia.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.EditText;
import android.widget.TextView;

public class TestWikipedia_hhs382_5 extends ActivityInstrumentationTestCase2<Activity> {

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
	public TestWikipedia_hhs382_5() {
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
			solo.sleep(22600);
			assertTrue(
					"Wait for text (id: org.wikipedia.R.id.onboarding_skip_link) failed.",
					solo.waitForTextById(
							"org.wikipedia.R.id.onboarding_skip_link", 20000));
			solo.clickOnText((TextView) solo
					.findViewById("org.wikipedia.R.id.onboarding_skip_link"));
			solo.waitForActivity("PageActivity");
			solo.sleep(31200);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(9200);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"Guardians of the Galaxy (film)");
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(1, 0);
			solo.sleep(35300);
			solo.clickOnScreen(solo.toScreenX(0.128f), solo.toScreenY(0.517f));
			solo.sleep(5700);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(13100);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"The Lego Movie");
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(1, 0);
			solo.sleep(8200);
			solo.clickOnScreen(solo.toScreenX(0.107f), solo.toScreenY(0.572f));
			solo.sleep(22400);
			solo.drag(solo.toScreenX(0.143f), solo.toScreenX(0.928f),
					solo.toScreenY(0.552f), solo.toScreenY(0.570f), 10);
			solo.sleep(29100);
			solo.drag(solo.toScreenX(0.983f), solo.toScreenX(0.251f),
					solo.toScreenY(0.350f), solo.toScreenY(0.350f), 31);
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
