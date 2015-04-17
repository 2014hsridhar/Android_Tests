package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class TestAllRecipes_hhs382_2 extends ActivityInstrumentationTestCase2<Activity> {

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
	public TestAllRecipes_hhs382_2() {
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
		float points[][] = { { 0.7458f, 0.6773f }, { 0.7458f, 0.6625f },
				{ 0.7458f, 0.6453f }, { 0.7458f, 0.6195f },
				{ 0.7458f, 0.5789f }, { 0.7458f, 0.5586f },
				{ 0.7458f, 0.5445f }, { 0.7458f, 0.5297f },
				{ 0.7458f, 0.5070f }, { 0.7458f, 0.4883f },
				{ 0.7403f, 0.4656f }, { 0.7333f, 0.4398f },
				{ 0.7278f, 0.4164f }, { 0.7250f, 0.4023f },
				{ 0.7222f, 0.3820f }, { 0.7222f, 0.3797f },
				{ 0.7222f, 0.3781f }, { 0.7222f, 0.3828f },
				{ 0.7222f, 0.3852f }, { 0.7222f, 0.3867f },
				{ 0.7222f, 0.3883f }, { 0.7222f, 0.3930f },
				{ 0.7222f, 0.4078f }, { 0.7250f, 0.4305f },
				{ 0.7306f, 0.4625f }, { 0.7347f, 0.5070f },
				{ 0.7375f, 0.5641f }, { 0.7500f, 0.6922f },
				{ 0.7708f, 0.8234f }, { 0.7903f, 0.9195f },
				{ 0.8069f, 0.9828f }, { 0.8069f, 0.9828f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainActivity");
			solo.sleep(7600);
			solo.clickOnScreen(solo.toScreenX(0.022f), solo.toScreenY(0.656f));
			solo.sleep(1200);
			assertTrue(
					"Wait for image button (id: com.allrecipes.spinner.free.R.id.ibClose) failed.",
					solo.waitForImageButtonById(
							"com.allrecipes.spinner.free.R.id.ibClose", 20000));
			solo.clickOnImageButton((ImageButton) solo
					.findViewById("com.allrecipes.spinner.free.R.id.ibClose"));
			solo.sleep(1100);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout"));
			solo.waitForActivity("SignInActivity");
			solo.sleep(11300);
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
			solo.sleep(23100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 2);
			solo.sleep(3600);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 4);
			solo.sleep(2900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 8);
			solo.sleep(1700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 10);
			solo.sleep(1800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 10);
			solo.sleep(3300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(3, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(14400);
			solo.drag(solo.toScreenX(0.336f), solo.toScreenX(0.243f),
					solo.toScreenY(0.832f), solo.toScreenY(0.409f), 35);
			solo.sleep(1500);
			solo.drag(solo.toScreenX(0.365f), solo.toScreenX(0.306f),
					solo.toScreenY(0.826f), solo.toScreenY(0.633f), 23);
			solo.sleep(1800);
			solo.drag(solo.toScreenX(0.317f), solo.toScreenX(0.158f),
					solo.toScreenY(0.803f), solo.toScreenY(0.419f), 25);
			solo.sleep(2100);
			solo.drag(solo.toScreenX(0.289f), solo.toScreenX(0.119f),
					solo.toScreenY(0.760f), solo.toScreenY(0.341f), 20);
			solo.sleep(1200);
			solo.drag(solo.toScreenX(0.397f), solo.toScreenX(0.240f),
					solo.toScreenY(0.798f), solo.toScreenY(0.484f), 23);
			solo.sleep(1400);
			solo.drag(solo.toScreenX(0.329f), solo.toScreenX(0.188f),
					solo.toScreenY(0.767f), solo.toScreenY(0.476f), 31);
			solo.sleep(3700);
			solo.drag(solo.toScreenX(0.278f), solo.toScreenX(0.235f),
					solo.toScreenY(0.674f), solo.toScreenY(0.441f), 41);
			solo.sleep(1900);
			solo.drag(solo.toScreenX(0.260f), solo.toScreenX(0.225f),
					solo.toScreenY(0.470f), solo.toScreenY(0.291f), 20);
			solo.sleep(8200);
			solo.drag(solo.toScreenX(0.431f), solo.toScreenX(0.519f),
					solo.toScreenY(0.590f), solo.toScreenY(0.000f), 20);
			solo.sleep(1300);
			solo.drag(solo.toScreenX(0.587f), solo.toScreenX(0.735f),
					solo.toScreenY(0.438f), solo.toScreenY(0.993f), 10);
			solo.sleep(700);
			solo.drag(solo.toScreenX(0.711f), solo.toScreenX(0.792f),
					solo.toScreenY(0.507f), solo.toScreenY(0.929f), 9);
			solo.sleep(1400);
			solo.clickOnScreen(solo.toScreenX(0.660f), solo.toScreenY(0.965f));
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.474f), solo.toScreenX(0.524f),
					solo.toScreenY(0.832f), solo.toScreenY(0.555f), 14);
			solo.sleep(1400);
			solo.drag(solo.toScreenX(0.606f), solo.toScreenX(0.651f),
					solo.toScreenY(0.308f), solo.toScreenY(0.410f), 17);
			solo.sleep(900);
			assertTrue("Wait for view (index: 10) failed.",
					solo.waitForView(10, 20000));
			solo.clickOnView(10);
			solo.sleep(12300);
			solo.drag(solo.toScreenX(0.590f), solo.toScreenX(0.715f),
					solo.toScreenY(0.723f), solo.toScreenY(0.291f), 80);
			solo.sleep(10500);
			solo.drag(solo.toScreenX(0.657f), solo.toScreenX(0.718f),
					solo.toScreenY(0.750f), solo.toScreenY(0.237f), 151);
			solo.sleep(900);
			solo.drag(solo.toScreenX(0.771f), solo.toScreenX(0.715f),
					solo.toScreenY(0.600f), solo.toScreenY(0.316f), 17);
			solo.sleep(2300);
			gestureGroup_1();
			solo.sleep(2200);
			assertTrue(
					"Wait for text (id: com.allrecipes.spinner.free.R.id.recipe_menu_item_save) failed.",
					solo.waitForTextById(
							"com.allrecipes.spinner.free.R.id.recipe_menu_item_save",
							20000));
			solo.clickOnText((TextView) solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_menu_item_save"));
			solo.sleep(3700);
			solo.clickOnScreen(solo.toScreenX(0.397f), solo.toScreenY(0.693f));
			solo.sleep(2700);
			assertTrue("Wait for view (index: 338) failed.",
					solo.waitForView(338, 20000));
			solo.clickOnView(338);
			solo.goBack();
			solo.waitForActivity("MainActivity");
			solo.sleep(3500);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 14);
			solo.sleep(2100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 16);
			solo.sleep(1900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 18);
			solo.sleep(2100);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 18);
			solo.sleep(1300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 18);
			solo.sleep(2300);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(5, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(15900);
			solo.clickOnScreen(solo.toScreenX(0.514f), solo.toScreenY(0.756f));
			solo.sleep(5900);
			solo.drag(solo.toScreenX(0.700f), solo.toScreenX(0.657f),
					solo.toScreenY(0.856f), solo.toScreenY(0.250f), 21);
			solo.sleep(1300);
			assertTrue("Wait for view (index: 11) failed.",
					solo.waitForView(11, 20000));
			solo.clickOnView(11);
			solo.sleep(8000);
			solo.clickOnScreen(solo.toScreenX(0.672f), solo.toScreenY(0.371f));
			solo.sleep(6000);
			solo.drag(solo.toScreenX(0.512f), solo.toScreenX(0.489f),
					solo.toScreenY(0.608f), solo.toScreenY(0.283f), 20);
			solo.sleep(1800);
			solo.drag(solo.toScreenX(0.433f), solo.toScreenX(0.428f),
					solo.toScreenY(0.681f), solo.toScreenY(0.206f), 9);
			solo.sleep(1400);
			solo.drag(solo.toScreenX(0.392f), solo.toScreenX(0.461f),
					solo.toScreenY(0.227f), solo.toScreenY(0.933f), 9);
			solo.sleep(1500);
			solo.clickOnScreen(solo.toScreenX(0.556f), solo.toScreenY(0.934f));
			solo.sleep(2000);
			assertTrue("Wait for view (index: 338) failed.",
					solo.waitForView(338, 20000));
			solo.clickOnView(338);
			solo.goBack();
			solo.waitForActivity("MainActivity");
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
