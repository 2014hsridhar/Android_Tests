package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
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

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.5264f, 0.4891f }, { 0.5194f, 0.4703f },
				{ 0.5194f, 0.4875f }, { 0.5194f, 0.5055f },
				{ 0.5278f, 0.5273f }, { 0.5278f, 0.5273f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainActivity");
			solo.sleep(9300);
			assertTrue(
					"Wait for image button (id: com.allrecipes.spinner.free.R.id.ibClose) failed.",
					solo.waitForImageButtonById(
							"com.allrecipes.spinner.free.R.id.ibClose", 20000));
			solo.clickOnImageButton((ImageButton) solo
					.findViewById("com.allrecipes.spinner.free.R.id.ibClose"));
			solo.sleep(1600);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout"));
			solo.waitForActivity("SignInActivity");
			solo.sleep(13200);
			assertTrue(
					"Wait for edit text (id: com.allrecipes.spinner.free.R.id.signin_edittext_email) failed.",
					solo.waitForEditTextById(
							"com.allrecipes.spinner.free.R.id.signin_edittext_email",
							20000));
			solo.enterText(
					(EditText) solo
							.findViewById("com.allrecipes.spinner.free.R.id.signin_edittext_email"),
					"hari.srdhr@gmail.com");
			solo.sleep(6500);
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
			solo.sleep(28500);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 2);
			solo.sleep(3600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 6);
			solo.sleep(3200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 8);
			solo.sleep(1600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(4, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(31500);
			solo.drag(solo.toScreenX(0.529f), solo.toScreenX(0.299f),
					solo.toScreenY(0.909f), solo.toScreenY(0.173f), 30);
			solo.sleep(1400);
			solo.drag(solo.toScreenX(0.436f), solo.toScreenX(0.336f),
					solo.toScreenY(0.723f), solo.toScreenY(0.329f), 20);
			solo.sleep(1200);
			assertTrue("Wait for view (index: 16) failed.",
					solo.waitForView(16, 20000));
			solo.clickOnView(16);
			solo.sleep(6900);
			solo.drag(solo.toScreenX(0.549f), solo.toScreenX(0.375f),
					solo.toScreenY(0.849f), solo.toScreenY(0.100f), 31);
			solo.sleep(22700);
			solo.drag(solo.toScreenX(0.676f), solo.toScreenX(0.182f),
					solo.toScreenY(0.867f), solo.toScreenY(0.000f), 33);
			solo.sleep(2200);
			solo.drag(solo.toScreenX(0.360f), solo.toScreenX(0.313f),
					solo.toScreenY(0.726f), solo.toScreenY(0.671f), 27);
			solo.sleep(10300);
			solo.drag(solo.toScreenX(0.519f), solo.toScreenX(0.237f),
					solo.toScreenY(0.919f), solo.toScreenY(0.024f), 56);
			solo.sleep(11000);
			gestureGroup_1();
			solo.sleep(1400);
			solo.clickOnScreen(solo.toScreenX(0.517f), solo.toScreenY(0.490f));
			solo.sleep(900);
			solo.clickOnScreen(solo.toScreenX(0.517f), solo.toScreenY(0.616f));
			solo.sleep(1000);
			solo.clickOnScreen(solo.toScreenX(0.474f), solo.toScreenY(0.472f));
			solo.sleep(1500);
			solo.drag(solo.toScreenX(0.463f), solo.toScreenX(0.593f),
					solo.toScreenY(0.502f), solo.toScreenY(0.926f), 11);
			solo.sleep(800);
			solo.drag(solo.toScreenX(0.675f), solo.toScreenX(0.682f),
					solo.toScreenY(0.359f), solo.toScreenY(0.645f), 8);
			solo.sleep(800);
			solo.drag(solo.toScreenX(0.707f), solo.toScreenX(0.721f),
					solo.toScreenY(0.380f), solo.toScreenY(0.583f), 10);
			solo.sleep(1000);
			solo.drag(solo.toScreenX(0.728f), solo.toScreenX(0.779f),
					solo.toScreenY(0.355f), solo.toScreenY(0.722f), 9);
			solo.sleep(1000);
			assertTrue(
					"Wait for text (id: com.allrecipes.spinner.free.R.id.recipe_menu_item_save) failed.",
					solo.waitForTextById(
							"com.allrecipes.spinner.free.R.id.recipe_menu_item_save",
							20000));
			solo.clickOnText((TextView) solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_menu_item_save"));
			solo.sleep(6400);
			solo.drag(solo.toScreenX(0.471f), solo.toScreenX(0.439f),
					solo.toScreenY(0.743f), solo.toScreenY(0.435f), 23);
			solo.sleep(1900);
			assertTrue("Wait for view (index: 37) failed.",
					solo.waitForView(37, 20000));
			solo.clickOnView(37);
			solo.sleep(3300);
			solo.drag(solo.toScreenX(0.319f), solo.toScreenX(0.387f),
					solo.toScreenY(0.657f), solo.toScreenY(0.256f), 12);
			solo.sleep(1700);
			solo.drag(solo.toScreenX(0.481f), solo.toScreenX(0.501f),
					solo.toScreenY(0.630f), solo.toScreenY(0.304f), 27);
			solo.sleep(2300);
			solo.drag(solo.toScreenX(0.501f), solo.toScreenX(0.603f),
					solo.toScreenY(0.834f), solo.toScreenY(0.273f), 26);
			solo.sleep(3000);
			solo.drag(solo.toScreenX(0.481f), solo.toScreenX(0.587f),
					solo.toScreenY(0.823f), solo.toScreenY(0.147f), 23);
			solo.sleep(1500);
			solo.drag(solo.toScreenX(0.497f), solo.toScreenX(0.578f),
					solo.toScreenY(0.396f), solo.toScreenY(0.932f), 17);
			solo.sleep(1700);
			assertTrue("Wait for view (index: 9) failed.",
					solo.waitForView(9, 20000));
			solo.clickOnView(9);
			solo.sleep(1800);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.recipe_add_all_button) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.recipe_add_all_button",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_add_all_button"));
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
