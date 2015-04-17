package com.nartstudios.html5reference.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;

import com.bitbar.recorder.extensions.ExtSolo;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class TestAllRecipes_hhs382_1 extends ActivityInstrumentationTestCase2<Activity> {

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
	public TestAllRecipes_hhs382_1() {
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

	private void gestureGroup_3() throws Exception {
		float points[][] = { { 0.8028f, 0.8391f }, { 0.8028f, 0.8320f },
				{ 0.8028f, 0.8250f }, { 0.8028f, 0.8188f },
				{ 0.8028f, 0.8094f }, { 0.8028f, 0.8062f },
				{ 0.8028f, 0.8000f }, { 0.8028f, 0.7945f },
				{ 0.8028f, 0.7906f }, { 0.8028f, 0.7867f },
				{ 0.8028f, 0.7844f }, { 0.8028f, 0.7805f },
				{ 0.8028f, 0.7758f }, { 0.8028f, 0.7727f },
				{ 0.8028f, 0.7680f }, { 0.8028f, 0.7648f },
				{ 0.8028f, 0.7625f }, { 0.8028f, 0.7602f },
				{ 0.8028f, 0.7578f }, { 0.8014f, 0.7563f },
				{ 0.8014f, 0.7523f }, { 0.8014f, 0.7484f },
				{ 0.8014f, 0.7461f }, { 0.8000f, 0.7422f },
				{ 0.8000f, 0.7398f }, { 0.7972f, 0.7273f },
				{ 0.7972f, 0.7188f }, { 0.7972f, 0.7141f },
				{ 0.7958f, 0.7102f }, { 0.7958f, 0.7063f },
				{ 0.7931f, 0.7016f }, { 0.7917f, 0.6984f },
				{ 0.7903f, 0.6898f }, { 0.7875f, 0.6812f },
				{ 0.7861f, 0.6742f }, { 0.7861f, 0.6727f },
				{ 0.7847f, 0.6695f }, { 0.7819f, 0.6617f },
				{ 0.7819f, 0.6563f }, { 0.7792f, 0.6469f },
				{ 0.7764f, 0.6375f }, { 0.7736f, 0.6305f },
				{ 0.7736f, 0.6258f }, { 0.7736f, 0.6219f },
				{ 0.7722f, 0.6203f }, { 0.7722f, 0.6180f },
				{ 0.7722f, 0.6172f }, { 0.7722f, 0.6156f },
				{ 0.7722f, 0.6141f }, { 0.7694f, 0.6117f },
				{ 0.7708f, 0.6102f }, { 0.7708f, 0.6070f },
				{ 0.7681f, 0.6039f }, { 0.7667f, 0.6008f },
				{ 0.7625f, 0.5938f }, { 0.7625f, 0.5930f },
				{ 0.7625f, 0.5930f }, { 0.3431f, 0.5930f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_4() throws Exception {
		float points[][] = { { 0.8042f, 0.8781f }, { 0.8042f, 0.8641f },
				{ 0.8014f, 0.8523f }, { 0.7986f, 0.8344f },
				{ 0.7944f, 0.8148f }, { 0.7875f, 0.7844f },
				{ 0.7847f, 0.7727f }, { 0.7847f, 0.7617f },
				{ 0.7778f, 0.7273f }, { 0.7722f, 0.7063f },
				{ 0.7694f, 0.6984f }, { 0.7694f, 0.6945f },
				{ 0.7694f, 0.6914f }, { 0.7667f, 0.6906f },
				{ 0.7681f, 0.6891f }, { 0.7681f, 0.6867f },
				{ 0.7681f, 0.6859f }, { 0.7681f, 0.6828f },
				{ 0.7681f, 0.6797f }, { 0.7681f, 0.6680f },
				{ 0.7681f, 0.6656f }, { 0.7681f, 0.6625f },
				{ 0.7681f, 0.6602f }, { 0.7681f, 0.6586f },
				{ 0.7681f, 0.6453f }, { 0.7681f, 0.6406f },
				{ 0.7681f, 0.6398f }, { 0.7681f, 0.6375f },
				{ 0.7681f, 0.6359f }, { 0.7681f, 0.6328f },
				{ 0.7681f, 0.6305f }, { 0.7681f, 0.6289f },
				{ 0.7667f, 0.6266f }, { 0.7667f, 0.6242f },
				{ 0.7667f, 0.6234f }, { 0.7667f, 0.6227f },
				{ 0.7667f, 0.6211f }, { 0.7667f, 0.6164f },
				{ 0.7667f, 0.6133f }, { 0.7667f, 0.6109f },
				{ 0.7653f, 0.6078f }, { 0.7653f, 0.6047f },
				{ 0.7653f, 0.6008f }, { 0.7653f, 0.5992f },
				{ 0.7653f, 0.5992f }, { 0.7639f, 0.5969f },
				{ 0.7639f, 0.5953f }, { 0.7639f, 0.5859f },
				{ 0.7597f, 0.5648f }, { 0.7583f, 0.5383f },
				{ 0.7583f, 0.5203f }, { 0.7583f, 0.5094f },
				{ 0.7583f, 0.5000f }, { 0.7583f, 0.4992f },
				{ 0.7583f, 0.4969f }, { 0.7583f, 0.4945f },
				{ 0.7583f, 0.4906f }, { 0.7583f, 0.4906f },
				{ 0.7583f, 0.4867f }, { 0.7583f, 0.4836f },
				{ 0.7583f, 0.4805f }, { 0.7583f, 0.4758f },
				{ 0.7583f, 0.4719f }, { 0.7569f, 0.4680f },
				{ 0.7569f, 0.4656f }, { 0.7556f, 0.4570f },
				{ 0.7556f, 0.4531f }, { 0.7556f, 0.4484f },
				{ 0.7556f, 0.4406f }, { 0.7556f, 0.4359f },
				{ 0.7556f, 0.4336f }, { 0.7556f, 0.4313f },
				{ 0.7542f, 0.4289f }, { 0.7528f, 0.4234f },
				{ 0.7514f, 0.4148f }, { 0.7514f, 0.4016f },
				{ 0.7514f, 0.3930f }, { 0.7500f, 0.3867f },
				{ 0.7500f, 0.3758f }, { 0.7486f, 0.3727f },
				{ 0.7486f, 0.3703f }, { 0.7486f, 0.3672f },
				{ 0.7486f, 0.3609f }, { 0.7486f, 0.3586f },
				{ 0.7486f, 0.3570f }, { 0.7486f, 0.3547f },
				{ 0.7486f, 0.3516f }, { 0.7472f, 0.3484f },
				{ 0.7472f, 0.3469f }, { 0.7472f, 0.3422f },
				{ 0.7472f, 0.3398f }, { 0.7458f, 0.3375f },
				{ 0.7458f, 0.3352f }, { 0.7458f, 0.3320f },
				{ 0.7458f, 0.3289f }, { 0.7458f, 0.3250f },
				{ 0.7444f, 0.3172f }, { 0.7417f, 0.3133f },
				{ 0.7403f, 0.3055f }, { 0.7403f, 0.2914f },
				{ 0.7403f, 0.2828f }, { 0.7403f, 0.2805f },
				{ 0.7403f, 0.2789f }, { 0.7403f, 0.2766f },
				{ 0.7403f, 0.2734f }, { 0.7403f, 0.2734f },
				{ 0.7403f, 0.2672f }, { 0.7375f, 0.2602f },
				{ 0.7361f, 0.2508f }, { 0.7361f, 0.2492f },
				{ 0.7361f, 0.2492f }, { 0.3778f, 0.2492f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.5569f, 0.6914f }, { 0.5681f, 0.6805f },
				{ 0.5694f, 0.6734f }, { 0.5750f, 0.6687f },
				{ 0.5792f, 0.6633f }, { 0.5778f, 0.6625f },
				{ 0.5778f, 0.6617f }, { 0.5819f, 0.6578f },
				{ 0.5861f, 0.6531f }, { 0.5917f, 0.6484f },
				{ 0.5903f, 0.6453f }, { 0.5903f, 0.6430f },
				{ 0.5903f, 0.6422f }, { 0.5903f, 0.6414f },
				{ 0.5931f, 0.6414f }, { 0.5931f, 0.6406f },
				{ 0.5931f, 0.6391f }, { 0.5931f, 0.6367f },
				{ 0.5931f, 0.6344f }, { 0.5931f, 0.6320f },
				{ 0.5944f, 0.6320f }, { 0.5958f, 0.6305f },
				{ 0.5958f, 0.6281f }, { 0.5986f, 0.6273f },
				{ 0.6014f, 0.6258f }, { 0.6028f, 0.6258f },
				{ 0.6014f, 0.6289f }, { 0.6028f, 0.6367f },
				{ 0.6028f, 0.6430f }, { 0.6028f, 0.6492f },
				{ 0.6028f, 0.6555f }, { 0.6028f, 0.6633f },
				{ 0.6028f, 0.6687f }, { 0.6028f, 0.6750f },
				{ 0.6028f, 0.6820f }, { 0.6014f, 0.6891f },
				{ 0.6014f, 0.6969f }, { 0.6014f, 0.7070f },
				{ 0.6014f, 0.7148f }, { 0.5972f, 0.7203f },
				{ 0.5931f, 0.7273f }, { 0.5889f, 0.7336f },
				{ 0.5875f, 0.7344f }, { 0.5875f, 0.7375f },
				{ 0.5875f, 0.7414f }, { 0.5875f, 0.7469f },
				{ 0.5875f, 0.7547f }, { 0.5875f, 0.7703f },
				{ 0.5875f, 0.7836f }, { 0.5833f, 0.7961f },
				{ 0.5792f, 0.8039f }, { 0.5806f, 0.8047f },
				{ 0.5806f, 0.8055f }, { 0.5806f, 0.8062f },
				{ 0.5806f, 0.8070f }, { 0.5806f, 0.8117f },
				{ 0.5806f, 0.8172f }, { 0.5806f, 0.8250f },
				{ 0.5806f, 0.8383f }, { 0.5806f, 0.8492f },
				{ 0.5806f, 0.8594f }, { 0.5806f, 0.8703f },
				{ 0.5806f, 0.8758f }, { 0.5806f, 0.8797f },
				{ 0.5806f, 0.8813f }, { 0.5806f, 0.8828f },
				{ 0.5806f, 0.8867f }, { 0.5806f, 0.8883f },
				{ 0.5806f, 0.8891f }, { 0.5806f, 0.8844f },
				{ 0.5806f, 0.8766f }, { 0.5806f, 0.8695f },
				{ 0.5806f, 0.8531f }, { 0.5889f, 0.8281f },
				{ 0.5944f, 0.7984f }, { 0.6069f, 0.7609f },
				{ 0.6208f, 0.7383f }, { 0.6278f, 0.7258f },
				{ 0.6292f, 0.7164f }, { 0.6292f, 0.7094f },
				{ 0.6292f, 0.6992f }, { 0.6292f, 0.6734f },
				{ 0.6375f, 0.6039f }, { 0.6569f, 0.5445f },
				{ 0.6847f, 0.4547f }, { 0.7153f, 0.3906f },
				{ 0.7375f, 0.3445f }, { 0.7583f, 0.3148f },
				{ 0.7667f, 0.3078f }, { 0.7708f, 0.3016f },
				{ 0.7708f, 0.2992f }, { 0.7708f, 0.2992f },
				{ 0.7708f, 0.2945f }, { 0.7708f, 0.2937f },
				{ 0.7736f, 0.2914f }, { 0.7736f, 0.2836f },
				{ 0.7778f, 0.2750f }, { 0.7806f, 0.2664f },
				{ 0.7806f, 0.2617f }, { 0.7875f, 0.2500f },
				{ 0.7917f, 0.2430f }, { 0.7972f, 0.2398f },
				{ 0.7972f, 0.2305f }, { 0.8069f, 0.2234f },
				{ 0.8097f, 0.2172f }, { 0.8111f, 0.2109f },
				{ 0.8111f, 0.2086f }, { 0.8139f, 0.2078f },
				{ 0.8139f, 0.2062f }, { 0.8139f, 0.2062f },
				{ 0.8167f, 0.2062f }, { 0.8167f, 0.2062f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_2() throws Exception {
		float points[][] = { { 0.8097f, 0.7117f }, { 0.8083f, 0.7070f },
				{ 0.8083f, 0.7063f }, { 0.8083f, 0.6992f },
				{ 0.8056f, 0.6930f }, { 0.8042f, 0.6883f },
				{ 0.8042f, 0.6828f }, { 0.8042f, 0.6820f },
				{ 0.8028f, 0.6797f }, { 0.8028f, 0.6781f },
				{ 0.8028f, 0.6742f }, { 0.7986f, 0.6695f },
				{ 0.7986f, 0.6656f }, { 0.7972f, 0.6625f },
				{ 0.7958f, 0.6578f }, { 0.7944f, 0.6563f },
				{ 0.7931f, 0.6555f }, { 0.7944f, 0.6531f },
				{ 0.7931f, 0.6508f }, { 0.7931f, 0.6477f },
				{ 0.7931f, 0.6461f }, { 0.7931f, 0.6445f },
				{ 0.7931f, 0.6414f }, { 0.7917f, 0.6367f },
				{ 0.7889f, 0.6320f }, { 0.7875f, 0.6258f },
				{ 0.7833f, 0.6211f }, { 0.7819f, 0.6195f },
				{ 0.7819f, 0.6148f }, { 0.7792f, 0.6125f },
				{ 0.7806f, 0.6109f }, { 0.7792f, 0.6086f },
				{ 0.7792f, 0.6062f }, { 0.7792f, 0.6062f },
				{ 0.7792f, 0.6016f }, { 0.7792f, 0.5922f },
				{ 0.7792f, 0.5867f }, { 0.7792f, 0.5813f },
				{ 0.7778f, 0.5789f }, { 0.7778f, 0.5766f },
				{ 0.7736f, 0.5695f }, { 0.7736f, 0.5672f },
				{ 0.7694f, 0.5562f }, { 0.7694f, 0.5547f },
				{ 0.7681f, 0.5516f }, { 0.7681f, 0.5508f },
				{ 0.7667f, 0.5516f }, { 0.7653f, 0.5516f },
				{ 0.7639f, 0.5492f }, { 0.7625f, 0.5500f },
				{ 0.7597f, 0.5500f }, { 0.7597f, 0.5492f },
				{ 0.7569f, 0.5437f }, { 0.7569f, 0.5406f },
				{ 0.7556f, 0.5391f }, { 0.7556f, 0.5375f },
				{ 0.7542f, 0.5375f }, { 0.7542f, 0.5344f },
				{ 0.7528f, 0.5328f }, { 0.7528f, 0.5227f },
				{ 0.7528f, 0.5133f }, { 0.7486f, 0.4953f },
				{ 0.7486f, 0.4789f }, { 0.7486f, 0.4617f },
				{ 0.7486f, 0.4500f }, { 0.7486f, 0.4492f },
				{ 0.7486f, 0.4453f }, { 0.7486f, 0.4406f },
				{ 0.7486f, 0.4344f }, { 0.7486f, 0.4336f },
				{ 0.7486f, 0.4320f }, { 0.7486f, 0.4297f },
				{ 0.7486f, 0.4219f }, { 0.7486f, 0.4172f },
				{ 0.7472f, 0.4109f }, { 0.7458f, 0.4031f },
				{ 0.7458f, 0.3945f }, { 0.7458f, 0.3914f },
				{ 0.7431f, 0.3914f }, { 0.7444f, 0.3906f },
				{ 0.7444f, 0.3906f }, { 0.7444f, 0.3906f },
				{ 0.3750f, 0.3906f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_7() throws Exception {
		float points[][] = { { 0.7625f, 0.7891f }, { 0.7625f, 0.7750f },
				{ 0.7625f, 0.7617f }, { 0.7625f, 0.7492f },
				{ 0.7625f, 0.7430f }, { 0.7611f, 0.7297f },
				{ 0.7597f, 0.7188f }, { 0.7569f, 0.7078f },
				{ 0.7556f, 0.6891f }, { 0.7472f, 0.6563f },
				{ 0.7472f, 0.6508f }, { 0.7472f, 0.6445f },
				{ 0.7472f, 0.6391f }, { 0.7472f, 0.6352f },
				{ 0.7431f, 0.6211f }, { 0.7431f, 0.6187f },
				{ 0.7403f, 0.6148f }, { 0.7389f, 0.6094f },
				{ 0.7361f, 0.6023f }, { 0.7347f, 0.5977f },
				{ 0.7319f, 0.5789f }, { 0.7306f, 0.5742f },
				{ 0.7292f, 0.5695f }, { 0.7264f, 0.5617f },
				{ 0.7194f, 0.5391f }, { 0.7153f, 0.5234f },
				{ 0.7069f, 0.5047f }, { 0.7000f, 0.4836f },
				{ 0.6944f, 0.4672f }, { 0.6903f, 0.4570f },
				{ 0.6889f, 0.4500f }, { 0.6889f, 0.4484f },
				{ 0.6889f, 0.4445f }, { 0.6889f, 0.4375f },
				{ 0.6889f, 0.4313f }, { 0.6889f, 0.4203f },
				{ 0.6889f, 0.4164f }, { 0.6889f, 0.4125f },
				{ 0.6889f, 0.4055f }, { 0.6889f, 0.3914f },
				{ 0.6889f, 0.3828f }, { 0.6889f, 0.3750f },
				{ 0.6889f, 0.3688f }, { 0.6889f, 0.3656f },
				{ 0.6889f, 0.3648f }, { 0.6889f, 0.3641f },
				{ 0.6889f, 0.3617f }, { 0.6889f, 0.3594f },
				{ 0.6889f, 0.3555f }, { 0.6889f, 0.3531f },
				{ 0.6889f, 0.3516f }, { 0.6889f, 0.3500f },
				{ 0.6889f, 0.3484f }, { 0.6889f, 0.3469f },
				{ 0.6889f, 0.3453f }, { 0.6889f, 0.3438f },
				{ 0.6889f, 0.3406f }, { 0.6889f, 0.3383f },
				{ 0.6889f, 0.3367f }, { 0.6889f, 0.3422f },
				{ 0.6889f, 0.3461f }, { 0.6889f, 0.3523f },
				{ 0.6889f, 0.3695f }, { 0.6889f, 0.3961f },
				{ 0.6889f, 0.4352f }, { 0.6889f, 0.5367f },
				{ 0.6889f, 0.5719f }, { 0.6889f, 0.5977f },
				{ 0.6889f, 0.6023f }, { 0.6889f, 0.6039f },
				{ 0.6889f, 0.6039f }, { 0.3361f, 0.6039f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_8() throws Exception {
		float points[][] = { { 0.9125f, 0.3945f }, { 0.9139f, 0.4578f },
				{ 0.9167f, 0.5086f }, { 0.9194f, 0.5508f },
				{ 0.9194f, 0.5844f }, { 0.9222f, 0.6086f },
				{ 0.9222f, 0.6250f }, { 0.9236f, 0.6289f },
				{ 0.9236f, 0.6289f }, { 0.3958f, 0.6289f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_5() throws Exception {
		float points[][] = { { 0.8097f, 0.7234f }, { 0.8056f, 0.7016f },
				{ 0.8028f, 0.6867f }, { 0.7931f, 0.6430f },
				{ 0.7889f, 0.6258f }, { 0.7889f, 0.6195f },
				{ 0.7861f, 0.6148f }, { 0.7847f, 0.6078f },
				{ 0.7833f, 0.6062f }, { 0.7819f, 0.6008f },
				{ 0.7819f, 0.5977f }, { 0.7778f, 0.5906f },
				{ 0.7792f, 0.5914f }, { 0.7792f, 0.5891f },
				{ 0.7764f, 0.5836f }, { 0.7764f, 0.5766f },
				{ 0.7750f, 0.5695f }, { 0.7736f, 0.5586f },
				{ 0.7736f, 0.5539f }, { 0.7736f, 0.5484f },
				{ 0.7736f, 0.5398f }, { 0.7736f, 0.5320f },
				{ 0.7722f, 0.5258f }, { 0.7708f, 0.5180f },
				{ 0.7708f, 0.5133f }, { 0.7681f, 0.5023f },
				{ 0.7681f, 0.4977f }, { 0.7667f, 0.4922f },
				{ 0.7667f, 0.4875f }, { 0.7667f, 0.4836f },
				{ 0.7667f, 0.4805f }, { 0.7653f, 0.4789f },
				{ 0.7653f, 0.4766f }, { 0.7653f, 0.4766f },
				{ 0.3542f, 0.4766f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_6() throws Exception {
		float points[][] = { { 0.7528f, 0.7805f }, { 0.7528f, 0.7773f },
				{ 0.7500f, 0.7719f }, { 0.7500f, 0.7688f },
				{ 0.7500f, 0.7641f }, { 0.7500f, 0.7594f },
				{ 0.7500f, 0.7555f }, { 0.7500f, 0.7484f },
				{ 0.7486f, 0.7391f }, { 0.7472f, 0.7367f },
				{ 0.7458f, 0.7312f }, { 0.7431f, 0.7125f },
				{ 0.7417f, 0.7023f }, { 0.7375f, 0.6781f },
				{ 0.7347f, 0.6539f }, { 0.7347f, 0.6359f },
				{ 0.7319f, 0.6227f }, { 0.7292f, 0.6055f },
				{ 0.7208f, 0.5797f }, { 0.7194f, 0.5711f },
				{ 0.7181f, 0.5594f }, { 0.7167f, 0.5570f },
				{ 0.7167f, 0.5539f }, { 0.7167f, 0.5516f },
				{ 0.7167f, 0.5508f }, { 0.7167f, 0.5508f },
				{ 0.2917f, 0.5508f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_9() throws Exception {
		float points[][] = { { 0.9472f, 0.5313f }, { 0.9472f, 0.6266f },
				{ 0.9472f, 0.7156f }, { 0.9486f, 0.7727f },
				{ 0.9486f, 0.8125f }, { 0.9514f, 0.8352f },
				{ 0.9528f, 0.8422f }, { 0.9542f, 0.8438f },
				{ 0.9542f, 0.8453f }, { 0.9556f, 0.8461f },
				{ 0.9556f, 0.8461f }, { 0.4389f, 0.8461f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_12() throws Exception {
		float points[][] = { { 0.8597f, 0.4961f }, { 0.8500f, 0.5680f },
				{ 0.8458f, 0.6047f }, { 0.8417f, 0.6336f },
				{ 0.8375f, 0.6734f }, { 0.8292f, 0.7289f },
				{ 0.8264f, 0.7500f }, { 0.8208f, 0.7937f },
				{ 0.8139f, 0.8422f }, { 0.7986f, 0.9320f },
				{ 0.7903f, 0.9688f }, { 0.7875f, 0.9852f },
				{ 0.7847f, 0.9984f }, { 0.7847f, 0.9984f },
				{ 0.4569f, 0.9984f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_13() throws Exception {
		float points[][] = { { 0.5556f, 0.2820f }, { 0.5556f, 0.2844f },
				{ 0.5556f, 0.2937f }, { 0.5472f, 0.3063f },
				{ 0.5431f, 0.3187f }, { 0.5319f, 0.3352f },
				{ 0.5236f, 0.3547f }, { 0.5125f, 0.3719f },
				{ 0.4944f, 0.4227f }, { 0.4833f, 0.4609f },
				{ 0.4833f, 0.5234f }, { 0.4778f, 0.5617f },
				{ 0.4722f, 0.5813f }, { 0.4681f, 0.5977f },
				{ 0.4639f, 0.6219f }, { 0.4639f, 0.6266f },
				{ 0.4569f, 0.6289f }, { 0.4583f, 0.6313f },
				{ 0.4583f, 0.6375f }, { 0.4583f, 0.6445f },
				{ 0.4583f, 0.6500f }, { 0.4583f, 0.6555f },
				{ 0.4583f, 0.6570f }, { 0.4583f, 0.6617f },
				{ 0.4583f, 0.6625f }, { 0.4583f, 0.6641f },
				{ 0.4583f, 0.6664f }, { 0.4583f, 0.6695f },
				{ 0.4597f, 0.6586f }, { 0.4653f, 0.6445f },
				{ 0.4722f, 0.6305f }, { 0.4736f, 0.6227f },
				{ 0.4792f, 0.6125f }, { 0.4875f, 0.6023f },
				{ 0.4931f, 0.5898f }, { 0.5000f, 0.5781f },
				{ 0.5069f, 0.5727f }, { 0.5069f, 0.5688f },
				{ 0.5069f, 0.5688f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_10() throws Exception {
		float points[][] = { { 0.9611f, 0.7234f }, { 0.9639f, 0.7992f },
				{ 0.9681f, 0.8602f }, { 0.9708f, 0.9055f },
				{ 0.9750f, 0.9367f }, { 0.9750f, 0.9531f },
				{ 0.9750f, 0.9594f }, { 0.9750f, 0.9633f },
				{ 0.9750f, 0.9633f }, { 0.4139f, 0.9633f } };
		solo.multiDrag(points);
	}

	private void gestureGroup_11() throws Exception {
		float points[][] = { { 0.9292f, 0.7352f }, { 0.9292f, 0.8180f },
				{ 0.9292f, 0.8586f }, { 0.9292f, 0.8750f },
				{ 0.9292f, 0.8828f }, { 0.9292f, 0.8859f },
				{ 0.9292f, 0.8859f }, { 0.4292f, 0.8859f } };
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
			solo.sleep(1700);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.navigation_signInOut_buttonRelativeLayout"));
			solo.waitForActivity("SignInActivity");
			solo.sleep(9400);
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
			solo.sleep(28200);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 2);
			solo.sleep(2700);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 6);
			solo.sleep(2900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 10);
			solo.sleep(2900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 14);
			solo.sleep(2400);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 14);
			solo.sleep(2000);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.clickInList(3, 0);
			solo.waitForActivity("RecipeActivity");
			solo.sleep(30400);
			solo.drag(solo.toScreenX(0.657f), solo.toScreenX(0.819f),
					solo.toScreenY(0.772f), solo.toScreenY(0.284f), 25);
			solo.sleep(3700);
			gestureGroup_1();
			solo.sleep(2700);
			solo.drag(solo.toScreenX(0.489f), solo.toScreenX(0.881f),
					solo.toScreenY(0.726f), solo.toScreenY(0.084f), 26);
			solo.sleep(5500);
			solo.drag(solo.toScreenX(0.514f), solo.toScreenX(0.690f),
					solo.toScreenY(0.707f), solo.toScreenY(0.270f), 149);
			solo.sleep(3000);
			solo.drag(solo.toScreenX(0.463f), solo.toScreenX(0.561f),
					solo.toScreenY(0.768f), solo.toScreenY(0.573f), 70);
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.497f), solo.toScreenX(0.538f),
					solo.toScreenY(0.754f), solo.toScreenY(0.591f), 22);
			solo.sleep(2800);
			solo.drag(solo.toScreenX(0.608f), solo.toScreenX(0.412f),
					solo.toScreenY(0.341f), solo.toScreenY(0.845f), 46);
			solo.sleep(800);
			solo.drag(solo.toScreenX(0.606f), solo.toScreenX(0.547f),
					solo.toScreenY(0.462f), solo.toScreenY(0.583f), 9);
			solo.sleep(1000);
			solo.clickOnScreen(solo.toScreenX(0.565f), solo.toScreenY(0.550f));
			solo.sleep(1200);
			assertTrue("Wait for view (index: 18) failed.",
					solo.waitForView(18, 20000));
			solo.clickOnView(18);
			solo.sleep(9200);
			gestureGroup_2();
			solo.sleep(2200);
			gestureGroup_3();
			solo.sleep(6500);
			gestureGroup_4();
			solo.sleep(1800);
			gestureGroup_5();
			solo.sleep(2000);
			gestureGroup_6();
			solo.sleep(5900);
			gestureGroup_7();
			solo.sleep(600);
			gestureGroup_8();
			solo.sleep(600);
			solo.clickOnScreen(solo.toScreenX(0.435f), solo.toScreenY(0.716f));
			solo.sleep(900);
			gestureGroup_9();
			solo.sleep(900);
			gestureGroup_10();
			solo.sleep(800);
			gestureGroup_11();
			solo.sleep(1200);
			gestureGroup_12();
			solo.sleep(2100);
			gestureGroup_13();
			solo.sleep(2000);
			assertTrue("Wait for view (index: 51) failed.",
					solo.waitForView(51, 20000));
			solo.clickOnView(51);
			solo.sleep(1300);
			solo.drag(solo.toScreenX(0.336f), solo.toScreenX(0.571f),
					solo.toScreenY(0.795f), solo.toScreenY(0.180f), 12);
			solo.sleep(1300);
			assertTrue(
					"Wait for view (id: com.allrecipes.spinner.free.R.id.recipe_add_all_button) failed.",
					solo.waitForViewById(
							"com.allrecipes.spinner.free.R.id.recipe_add_all_button",
							20000));
			solo.clickOnView(solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_add_all_button"));
			solo.sleep(700);
			solo.drag(solo.toScreenX(0.581f), solo.toScreenX(0.454f),
					solo.toScreenY(0.379f), solo.toScreenY(0.930f), 9);
			solo.sleep(800);
			solo.drag(solo.toScreenX(0.461f), solo.toScreenX(0.578f),
					solo.toScreenY(0.895f), solo.toScreenY(0.230f), 12);
			solo.sleep(800);
			solo.drag(solo.toScreenX(0.551f), solo.toScreenX(0.440f),
					solo.toScreenY(0.349f), solo.toScreenY(0.843f), 12);
			solo.sleep(1200);
			solo.drag(solo.toScreenX(0.582f), solo.toScreenX(0.440f),
					solo.toScreenY(0.484f), solo.toScreenY(0.991f), 11);
			solo.sleep(1100);
			solo.drag(solo.toScreenX(0.568f), solo.toScreenX(0.468f),
					solo.toScreenY(0.427f), solo.toScreenY(0.798f), 12);
			solo.sleep(1500);
			assertTrue(
					"Wait for text (id: com.allrecipes.spinner.free.R.id.recipe_menu_item_save) failed.",
					solo.waitForTextById(
							"com.allrecipes.spinner.free.R.id.recipe_menu_item_save",
							20000));
			solo.clickOnText((TextView) solo
					.findViewById("com.allrecipes.spinner.free.R.id.recipe_menu_item_save"));
			solo.sleep(2300);
			solo.clickOnScreen(solo.toScreenX(0.118f), solo.toScreenY(0.222f));
			solo.sleep(2600);
			assertTrue("Wait for view (index: 91) failed.",
					solo.waitForView(91, 20000));
			solo.clickOnView(91);
			solo.goBack();
			solo.waitForActivity("MainActivity");
			solo.sleep(6500);
			assertTrue("Wait for view (index: 52) failed.",
					solo.waitForView(52, 20000));
			solo.clickOnView(52);
			solo.sleep(2400);
			assertTrue("Wait for list (index: 1) failed.",
					solo.waitForList(1, 20000));
			solo.clickInList(4, 1);
			solo.sleep(8500);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 6);
			solo.sleep(900);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 15);
			solo.sleep(800);
			assertTrue("Wait for list (index: 0) failed.",
					solo.waitForList(0, 20000));
			solo.scrollListToLine(0, 15);
			solo.sleep(4700);
			assertTrue("Wait for view (index: 71) failed.",
					solo.waitForView(71, 20000));
			solo.clickOnView(71);
			solo.sleep(3900);
			assertTrue("Wait for list (index: 1) failed.",
					solo.waitForList(1, 20000));
			solo.clickInList(1, 1);
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
