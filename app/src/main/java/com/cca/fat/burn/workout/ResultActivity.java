package com.cca.fat.burn.workout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ResultActivity extends Activity {

	private String[] list_array;
	String ft;
	String in;
	
	AdView adView;
	int typeCheck = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_result);
		
		adView = (AdView)this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
		adView.loadAd(adRequest);
		
		Bundle b = getIntent().getExtras(); // getting bundle intents

		// making strings
		final String name = b.getString("name");
		final String gender = b.getString("gender");
		final String w = b.getString("w");
		final String mass = b.getString("mass");
		final String feets = b.getString("feets");
		final String inchs = b.getString("inchs");
		final String age = b.getString("age");
		final Float bmi = b.getFloat("BMI", 0);
		final Float BMR = b.getFloat("BMR", 0);
		String comments = b.getString("comments");
		
		Log.w("result","age is: "+age);

		// Initializing layout widgets
		TextView t1 = (TextView) findViewById(R.id.gender);
		TextView t2 = (TextView) findViewById(R.id.weightUnit);
		TextView t3 = (TextView) findViewById(R.id.heightUnit);
		TextView tv1 = (TextView) findViewById(R.id.weight);
		TextView tv2 = (TextView) findViewById(R.id.height);
		TextView tv3 = (TextView) findViewById(R.id.resultAge);
		TextView tv4 = (TextView) findViewById(R.id.BMI);
		TextView tv5 = (TextView) findViewById(R.id.BMR);
		TextView t4 = (TextView) findViewById(R.id.TextView08);
		final TextView tv6 = (TextView) findViewById(R.id.description);

		final ImageButton recExerImgBtn = (ImageButton) findViewById(R.id.exercise);
		ImageButton trainButton = (ImageButton) findViewById(R.id.train);
		
		// setting text to display
		t4.setText(name);
		t1.setText(gender);
		t2.setText(w);
		tv1.setText(mass);
		tv2.setText(feets + " fts ");
		t3.setText(inchs + " inchs");
		tv3.setText(age);
		tv4.setText(String.valueOf(bmi));
		tv5.setText(String.valueOf(BMR));
		tv6.setText(comments);

		// ******** recommend Exercise ImgBtn ************

		recExerImgBtn.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				String out = null;
				if (typeCheck == 1) {
					if (bmi < 16) {

						out = "Comments: Severely Under weight. Eat Everything!!!Here are a few tips to get you started: Have an extra slice of whole-grain toast with peanut butter at breakfast. Add extra cheese to an omelet. Slice an apple and serve with almond butter. Stir chopped nuts into plain yogurt and top with honey. Carry a bag of trail mix for a convenient snack.Serve yourself larger portions of starchy vegetables like potatoes and sweet corn. Add calories with a healthy beverage such as milk, 100% fruit juices, or vegetable juice.";

					}// end if
					else if (bmi >= 16 && bmi < 18.5) {
						out = "Comments: Under weight. Drink 6-8 glasses of distilled water a day. Eat frequent but small meals. Eat lots of raw fruits and vegetables (green leafy vegetables are great). Do not drink coffee, alcohol, soda pop,... Do not eat processed foods; white sugar, white flower,... Avoid red meat and animal fats. Reduce intake of dairy products. Do not smoke and avoid second hand smoke.";
					}

					else if (bmi >= 18.5 && bmi < 25) {
						out = "Comments: Normal. You are Normal. Keep your current diet.";
					} else if (bmi >= 25 && bmi < 30) {
						out = "Comments: Overweight. Eliminate Red Meat. Cut out fried foods. Start with a soup or a salad. Stop Cola consumption. Drink water";
					} else if (bmi >= 30) {
						out = "Comments: Obese. You must improve your eating habits. Eat a variety of foods, especially pasta, rice, wholemeal bread, and other whole-grain foods. Reduce your fat-intake. You should also eat lots of fruits and vegetables. Try to do at least 30 minutes of physical activity a day on most days of the week.";
					}
					
					recExerImgBtn.setImageResource(R.drawable.exercise_calculator_menu_btn);
					tv6.setText(out);
					typeCheck = 0;
				} else {
					// classification of exercises

					if (bmi < 16) {
						out = "Comments: Severely Under weight. Eat Everything!!!Here are a few tips to get you started: Have an extra slice of whole-grain toast with peanut butter at breakfast. Add extra cheese to an omelet. Slice an apple and serve with almond butter. Stir chopped nuts into plain yogurt and top with honey. Carry a bag of trail mix for a convenient snack.Serve yourself larger portions of starchy vegetables like potatoes and sweet corn. Add calories with a healthy beverage such as milk, 100% fruit juices, or vegetable juice.";
					}// end if
					else if (bmi >= 16 && bmi < 18.5) {
						out = "Comments: Under weight. In order to have a healthy body and mind, exercise is a key component to daily life, regardless of what your weight is. Although exercise is important for everyone, if you'd like to gain weight, you'll want to do moderate cardiovascular exercise instead of intense e.g Walking or biking at a moderate to brisk pace, Recreational swimming, Playing golf, Playing team sports that don't require a lot of running (such as volleyball or baseball on a large team). In addition, bulking up on your muscles can help you gain weight that is healthy.Note: Also take your diet precisely.";
					}
					else if (bmi >= 18.5 && bmi < 25) {
						out = "Comments: Normal. You are Normal. Exercise can help you maintain a healthy weight. It can delay or prevent diabetes, some cancers and heart problems.So, schedule at least 30 minutes of moderate physical activity at least five days per week. Examples include walking briskly, mowing the lawn, swimming for recreation or bicycling. Stretching and weight training can also strengthen your body and improve your fitness level. Note: Also take your diet precisely.";
					} else if (bmi >= 25 && bmi < 30) {
						out = "Comments: Overweight. Your recommended exercises are: V-Ups,  2-4 sets of 15-50 [On your back, legs straight, arms extended straight over your head. Bring your finger tips to your toes, making your body form a 'V' shape, keep legs and arms straight, do this exercise in a fast, explosive manner, STEADY MOVEMENT THROUGHOUT!]. Supermans,  3 sets of 15 [Lay on your stomach and raise both your arms and your legs off the ground simultaneously, like you're flying through the air - like Superman! STEADY MOVEMENT THROUGHOUT]. Weighted Decline Sit-ups, 3 sets of 10-15 [Get on the decline bench, grab a weight and put it across your chest and hold tight, go ALL the way down, and ALL the way up, at a decently high incline SLOW MOVEMENT ON THE WAY DOWN, FAST & EXPLOSIVE ON THE WAY UP]. Knee Hugs,  2-4 sets of 15-50 [Similar to the V-Ups, except this time, with your legs extended, and your arms extended straight over your head, focus on touching both knees to your chest, simultaneously, FAST MOVEMENT THROUGHOUT]. Russian Twists. 3 sets of 20-60 [Get yourself into a semi-crunch position on a decline bend and hold. Extend your arms out in front of you, and put your hands together, now twist to all the way to the left, and then twist all the way to the right, all while in the semi-crunch position. This should really put a burn on your midsection, as well as work the obliques very well. FAST, YET STEADY MOVEMENT THROUGHOUT]. Note: Also take your diet precisely.";
					} else if (bmi >= 30) {
						out = "Comments: Obese. It is recommended to consult trainer/doctor before beginning an exercise routine. After that, there are some safe exercises for obese and overweight people outlined below.Swimming, better option around the year. Walking, the best way to start exercise. Plan a 30 mint walk daily atleast. Waist and leg Execise, arm raises and bend and jumps. It will help you to build up strength.15 mint daily. Ball exercise,to build up your stability, balance and abdominal strength.Other Cardio exercises, rowing, bicycling, kickboxing etc. Note: Also take your diet precisely.";
					}
					
					recExerImgBtn.setImageResource(R.drawable.diet_calculator_menu_btn);
					tv6.setText(out);
					typeCheck = 1;
				}

			}
		});
		
		trainButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(), MainActivity.class);
				finish();
				startActivity(intent);
			}
		});
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		adView.destroy();
		Intent intent = new Intent(getBaseContext(), CalculatorActivity.class);
		finish();
		startActivity(intent);
	}

}
