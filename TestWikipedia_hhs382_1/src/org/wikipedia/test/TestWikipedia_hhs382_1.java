package org.wikipedia.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.EditText;
import android.widget.TextView;

public class TestWikipedia_hhs382_1 extends ActivityInstrumentationTestCase2<Activity> {

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
	public TestWikipedia_hhs382_1() {
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
			solo.sleep(4000);
			assertTrue(
					"Wait for text (id: org.wikipedia.R.id.onboarding_skip_link) failed.",
					solo.waitForTextById(
							"org.wikipedia.R.id.onboarding_skip_link", 20000));
			solo.clickOnText((TextView) solo
					.findViewById("org.wikipedia.R.id.onboarding_skip_link"));
			solo.waitForActivity("PageActivity");
			solo.sleep(6800);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(2600);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"Wikipedia");
			solo.sendKey(ExtSolo.ENTER);
			solo.sleep(3300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(1, 0);
			solo.sleep(22100);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(12200);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"Recursion");
			solo.sleep(1900);
			assertTrue(
					"Wait for view (id: org.wikipedia.R.id.main_search_bar) failed.",
					solo.waitForViewById("org.wikipedia.R.id.main_search_bar",
							20000));
			solo.clickOnView(solo
					.findViewById("org.wikipedia.R.id.main_search_bar"));
			solo.sleep(12900);
			assertTrue(
					"Wait for edit text (id: org.wikipedia.R.id.search_src_text) failed.",
					solo.waitForEditTextById(
							"org.wikipedia.R.id.search_src_text", 20000));
			solo.enterText((EditText) solo
					.findViewById("org.wikipedia.R.id.search_src_text"),
					"Message Passing Interface");
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(1, 0);
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Test2.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Test2.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
