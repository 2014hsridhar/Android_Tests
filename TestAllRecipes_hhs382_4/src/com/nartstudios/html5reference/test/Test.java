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
			solo.sleep(5900);
			assertTrue(
					"Wait for button (id: com.allrecipes.spinner.free.R.id.bGotIt) failed.",
					solo.waitForButtonById(
							"com.allrecipes.spinner.free.R.id.bGotIt", 20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.allrecipes.spinner.free.R.id.bGotIt"));
			solo.sleep(2400);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout"));
			solo.waitForActivity("SignInActivity");
			solo.sleep(15200);
			assertTrue(
					"Wait for edit text (id: com.allrecipes.spinner.free.R.id.signin_edittext_email) failed.",
					solo.waitForEditTextById(
							"com.allrecipes.spinner.free.R.id.signin_edittext_email",
							20000));
			solo.enterText(
					(EditText) solo
							.findViewById("com.allrecipes.spinner.free.R.id.signin_edittext_email"),
					"hari.srdhr@gmail.com");
			solo.sleep(5200);
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
			solo.sleep(11900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(6, 0);
			solo.sleep(3600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 2);
			solo.sleep(13000);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 6);
			solo.sleep(9700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 10);
			solo.sleep(6400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(3, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(18700);
			solo.clickOnScreen(solo.toScreenX(0.124f), solo.toScreenY(0.061f));
			solo.sleep(8500);
			solo.drag(solo.toScreenX(0.304f), solo.toScreenX(0.190f),
					solo.toScreenY(0.680f), solo.toScreenY(0.223f), 28);
			solo.sleep(5500);
			assertTrue("Wait for view (index: 14) failed.",
					solo.waitForView(14, 20000));
			solo.clickOnView(14);
			solo.sleep(13800);
			solo.drag(solo.toScreenX(0.464f), solo.toScreenX(0.363f),
					solo.toScreenY(0.737f), solo.toScreenY(0.182f), 33);
			solo.sleep(7800);
			solo.drag(solo.toScreenX(0.410f), solo.toScreenX(0.363f),
					solo.toScreenY(0.864f), solo.toScreenY(0.449f), 34);
			solo.sleep(8800);
			solo.drag(solo.toScreenX(0.456f), solo.toScreenX(0.258f),
					solo.toScreenY(0.783f), solo.toScreenY(0.053f), 57);
			solo.sleep(11100);
			solo.drag(solo.toScreenX(0.451f), solo.toScreenX(0.406f),
					solo.toScreenY(0.802f), solo.toScreenY(0.062f), 25);
			solo.sleep(7700);
			solo.drag(solo.toScreenX(0.528f), solo.toScreenX(0.497f),
					solo.toScreenY(0.285f), solo.toScreenY(0.832f), 15);
			solo.sleep(4300);
			solo.drag(solo.toScreenX(0.779f), solo.toScreenX(0.712f),
					solo.toScreenY(0.220f), solo.toScreenY(0.683f), 19);
			solo.sleep(2100);
			assertTrue(
					"Wait for text (id: com.allrecipes.spinner.free.R.id.recipe_menu_item_save) failed.",
					solo.waitForTextById(
							"com.allrecipes.spinner.free.R.id.recipe_menu_item_save",
							20000));
			solo.clickOnText((TextView) solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_menu_item_save"));
			solo.sleep(10500);
			solo.drag(solo.toScreenX(0.494f), solo.toScreenX(0.476f),
					solo.toScreenY(0.841f), solo.toScreenY(0.182f), 20);
			solo.sleep(1200);
			assertTrue("Wait for view (index: 12) failed.",
					solo.waitForView(12, 20000));
			solo.clickOnView(12);
			solo.sleep(1400);
			solo.drag(solo.toScreenX(0.474f), solo.toScreenX(0.410f),
					solo.toScreenY(0.788f), solo.toScreenY(0.232f), 17);
			solo.sleep(1000);
			solo.drag(solo.toScreenX(0.474f), solo.toScreenX(0.378f),
					solo.toScreenY(0.712f), solo.toScreenY(0.315f), 18);
			solo.sleep(800);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.recipe_add_all_button) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.recipe_add_all_button",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_add_all_button"));
			solo.sleep(4000);
			solo.drag(solo.toScreenX(0.367f), solo.toScreenX(0.314f),
					solo.toScreenY(0.333f), solo.toScreenY(0.827f), 21);
			solo.sleep(2400);
			assertTrue("Wait for view (index: 112) failed.",
					solo.waitForView(112, 20000));
			solo.clickOnView(112);
			solo.goBack();
			solo.waitForActivity("MainActivity");
			solo.sleep(2400);
			assertTrue("Wait for view (index: 51) failed.",
					solo.waitForView(51, 20000));
			solo.clickOnView(51);
			solo.sleep(2500);
			assertTrue("Wait for list (index: 1) failed.",
					solo.waitForList(1, 20000));
			solo.clickInList(4, 1);
			solo.sleep(16700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 5);
			solo.sleep(3500);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 11);
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
