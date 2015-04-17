package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Test extends ActivityInstrumentationTestCase2<Activity> {

	private static final String LAUNCHER_ACTIVITY_CLASSNAME = "com.allrecipes.spinner.free.MainActivity";
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
	public Test() {
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
			solo.waitForActivity("MainActivity");
			solo.sleep(7000);
			assertTrue(
					"Wait for button (id: com.allrecipes.spinner.free.R.id.bGotIt) failed.",
					solo.waitForButtonById(
							"com.allrecipes.spinner.free.R.id.bGotIt", 20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.allrecipes.spinner.free.R.id.bGotIt"));
			solo.sleep(3100);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout"));
			solo.waitForActivity("SignInActivity");
			solo.sleep(14100);
			assertTrue(
					"Wait for edit text (id: com.allrecipes.spinner.free.R.id.signin_edittext_email) failed.",
					solo.waitForEditTextById(
							"com.allrecipes.spinner.free.R.id.signin_edittext_email",
							20000));
			solo.enterText(
					(EditText) solo
							.findViewById("com.allrecipes.spinner.free.R.id.signin_edittext_email"),
					"hari.srdhr@gmail.com");
			solo.sleep(4100);
			assertTrue(
					"Wait for edit text (id: com.allrecipes.spinner.free.R.id.signin_edittext_password) failed.",
					solo.waitForEditTextById(
							"com.allrecipes.spinner.free.R.id.signin_edittext_password",
							20000));
			solo.enterText(
					(EditText) solo
							.findViewById("com.allrecipes.spinner.free.R.id.signin_edittext_password"),
					"password");
			assertTrue(
					"Wait for button (id: com.allrecipes.spinner.free.R.id.signin_btnsignin) failed.",
					solo.waitForButtonById(
							"com.allrecipes.spinner.free.R.id.signin_btnsignin",
							20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.allrecipes.spinner.free.R.id.signin_btnsignin"));
			solo.waitForActivity("MainActivity");
			solo.sleep(26600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 2);
			solo.sleep(9200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 6);
			solo.sleep(9100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 10);
			solo.sleep(3400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(5, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(19800);
			solo.drag(solo.toScreenX(0.572f), solo.toScreenX(0.514f),
					solo.toScreenY(0.855f), solo.toScreenY(0.269f), 31);
			solo.sleep(1200);
			assertTrue("Wait for view (index: 34) failed.",
					solo.waitForView(34, 20000));
			solo.clickOnView(34);
			solo.sleep(6200);
			solo.clickOnScreen(solo.toScreenX(0.482f), solo.toScreenY(0.182f));
			solo.sleep(5500);
			solo.drag(solo.toScreenX(0.629f), solo.toScreenX(0.565f),
					solo.toScreenY(0.804f), solo.toScreenY(0.263f), 52);
			solo.sleep(16500);
			solo.drag(solo.toScreenX(0.467f), solo.toScreenX(0.497f),
					solo.toScreenY(0.848f), solo.toScreenY(0.140f), 37);
			solo.sleep(1400);
			solo.drag(solo.toScreenX(0.519f), solo.toScreenX(0.543f),
					solo.toScreenY(0.658f), solo.toScreenY(0.482f), 27);
			solo.sleep(11400);
			solo.drag(solo.toScreenX(0.551f), solo.toScreenX(0.499f),
					solo.toScreenY(0.809f), solo.toScreenY(0.123f), 38);
			solo.sleep(4700);
			solo.drag(solo.toScreenX(0.637f), solo.toScreenX(0.614f),
					solo.toScreenY(0.435f), solo.toScreenY(0.941f), 10);
			solo.sleep(800);
			solo.drag(solo.toScreenX(0.636f), solo.toScreenX(0.603f),
					solo.toScreenY(0.323f), solo.toScreenY(0.812f), 9);
			solo.sleep(4000);
			assertTrue(
					"Wait for text (id: com.allrecipes.spinner.free.R.id.recipe_menu_item_save) failed.",
					solo.waitForTextById(
							"com.allrecipes.spinner.free.R.id.recipe_menu_item_save",
							20000));
			solo.clickOnText((TextView) solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_menu_item_save"));
			solo.sleep(3200);
			solo.clickOnScreen(solo.toScreenX(0.081f), solo.toScreenY(0.232f));
			solo.sleep(2100);
			assertTrue("Wait for view (index: 198) failed.",
					solo.waitForView(198, 20000));
			solo.clickOnView(198);
			solo.goBack();
			solo.waitForActivity("MainActivity");
			solo.sleep(7800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 12);
			solo.sleep(1900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(2, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(23000);
			assertTrue("Wait for view (index: 103) failed.",
					solo.waitForView(103, 20000));
			solo.clickOnView(103);
			solo.goBack();
			solo.waitForActivity("MainActivity");
			solo.sleep(3300);
			assertTrue("Wait for view (index: 46) failed.",
					solo.waitForView(46, 20000));
			solo.clickOnView(46);
			solo.sleep(1700);
			assertTrue("Wait for list (index: 1) failed.",
					solo.waitForList(1, 20000));
			solo.clickInList(1, 1);
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
