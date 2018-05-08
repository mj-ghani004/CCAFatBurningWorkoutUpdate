package com.cca.fat.burn.workout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class CalculatorActivity extends Activity {
	ImageButton nextButton;
	EditText usernameField;
	EditText ageField;
	EditText weightField;
	RadioButton radioField;
	String genderCheck = "male";
	String weightCheck;
	TextView textForTypeface;
	double waterRequired;
	int ageNum;
	int weightNum;
	
	AdView adView;

	String ft;
	String in;
	private String[] list_array;

	private AlertDialog rateUsDialog;
	private InterstitialAd interstitial;
	
	SharedPreferences pref;
	public static final String PREFS_PRIVATE = "PREFS_PRIVATE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);

		// Look up the AdView as a resource and load a request.
		/*
		 * AdView adView = (AdView)this.findViewById(R.id.adView); AdRequest
		 * adRequest = new
		 * AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29"
		 * ).build(); adView.loadAd(adRequest);
		 */
		// for interstitial ads
		// ads();
		// nextButton = (ImageButton) findViewById(R.id.exercise);
		adView = (AdView)this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
		adView.loadAd(adRequest);
		
		pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
		
		final String name2 = pref.getString("name", null);
		// making strings
		
		final String gender = pref.getString("gender",null);
		final String w = pref.getString("w", null);
		final String mass = pref.getString("mass", null);
		final String age = pref.getString("age", null);

		final String foots = pref.getString("feets", null);
		final String inches = pref.getString("inchs", null);
		
		Typeface font = Typeface.createFromAsset(getAssets(),
				"fonts/ufonts.ttf");

		textForTypeface = (TextView) findViewById(R.id.nameText);
		textForTypeface.setTypeface(font);

		textForTypeface = (TextView) findViewById(R.id.genderText);
		textForTypeface.setTypeface(font);

		textForTypeface = (TextView) findViewById(R.id.ageText);
		textForTypeface.setTypeface(font);

		textForTypeface = (TextView) findViewById(R.id.ageText2);
		textForTypeface.setTypeface(font);

		textForTypeface = (TextView) findViewById(R.id.weightText);
		textForTypeface.setTypeface(font);

		final EditText weightText = (EditText) findViewById(R.id.weight);
		final RadioButton m = (RadioButton) findViewById(R.id.maleRadio);
		final RadioButton f = (RadioButton) findViewById(R.id.femaleRadio);
		final EditText ageText = (EditText) findViewById(R.id.age);
		final RadioButton lb = (RadioButton) findViewById(R.id.LBS);
		final RadioButton kg = (RadioButton) findViewById(R.id.KG);
		final EditText name = (EditText) findViewById(R.id.username);
		ImageButton calcDietImgBtn = (ImageButton) findViewById(R.id.ImageButton01);
		
		weightText.setText(mass);
		
		if (gender == "Female") {
			f.setChecked(true);
		} else {
			m.setChecked(true);
		}
		
		ageText.setText(age);
		
		name.setText(name2);
		
		if (w == "lbs") {
			lb.setChecked(true);
		} else {
			kg.setChecked(true);
		}
		

		final String[] feet = new String[] { "1", "2", "3", "4", "5", "6", "7",
				"8" };
		final String[] inch = new String[] { "0", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12" };

		// ******** feet spinner ************
		ArrayAdapter ad1 = new ArrayAdapter(this,
				android.R.layout.simple_spinner_item, feet);
		ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Spinner feetSpinner = (Spinner) findViewById(R.id.spinner1);
		feetSpinner.setAdapter(ad1);

		feetSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView arg0, View arg1, int arg2,
					long arg3) {

				TextView temp1 = (TextView) arg1;
				ft = (temp1.getText().toString());
			}

			public void onNothingSelected(AdapterView arg0) {
				// TODO Auto-generated method stub

			}

		});
		
		feetSpinner.setPrompt(foots);
		
		feetSpinner.setSelection(ad1.getPosition(foots));

		// ******** inch spinner ************
		ArrayAdapter ad2 = new ArrayAdapter(this,
				android.R.layout.simple_spinner_item, inch);
		ad2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Spinner inchSpinner = (Spinner) findViewById(R.id.spinner2);
		inchSpinner.setAdapter(ad2);

		inchSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView arg0, View arg1, int arg2,
					long arg3) {

				TextView temp2 = (TextView) arg1;
				in = (temp2.getText().toString());
			}

			public void onNothingSelected(AdapterView arg0) {
				// TODO Auto-generated method stub

			}

		});
		
		inchSpinner.setPrompt(inches);
		inchSpinner.setSelection(ad2.getPosition(inches));
		
		calcDietImgBtn.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String weightStr = weightText.getText().toString();
				String ageStr = ageText.getText().toString();
				if (weightStr.length() == 0 || ageStr.length() == 0) {
					Context context = getApplicationContext();
					CharSequence text = "ERROR!! Please Fill the Empty Fields!!";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.setGravity(Gravity.CENTER_VERTICAL
							| Gravity.CENTER_HORIZONTAL, 0, 50);
					toast.show();
				} else {
					float bmi = 0;
					float masslb;
					float masskg;
					float height;
					// float h1;
					float hightInches;
					float age;
					float bmr = 0;
					String out = null;

					if (lb.isChecked()) {

						masslb = Float.parseFloat(weightText.getText()
								.toString());
						hightInches = (Float.parseFloat(ft) * 12)
								+ (Float.parseFloat(in));
						age = Float.parseFloat(ageText.getText().toString());
						height = hightInches * hightInches;
						bmi = ((masslb * 703) / height);

						if (m.isChecked()) {
							bmr = (float) ((66 + (6.23 * masslb)
									+ (12.7 * hightInches) - (6.8 * age)));

							f.setChecked(false);
							m.setChecked(true);
						} else {
							bmr = (float) ((665 + (4.35 * masslb)
									+ (4.7 * hightInches) - (4.7 * age)));

							m.setChecked(false);
							f.setChecked(true);
						}

						lb.setChecked(true);
						kg.setChecked(false);

					}// end if outer
					else if (kg.isChecked()) {

						masskg = Float.parseFloat(weightText.getText()
								.toString());
						float c = 2.2046f; // ponds in 1 Kg
						float massPound = masskg * c;
						float hightMeter;

						hightInches = (Float.parseFloat(ft) * 12)
								+ (Float.parseFloat(in));
						hightMeter = (float) (hightInches * 0.0254);
						age = Float.parseFloat(ageText.getText().toString());
						height = hightMeter * hightMeter;
						bmi = masskg / height;

						if (m.isChecked()) {
							bmr = (float) ((66 + (6.23 * massPound)
									+ (12.7 * hightInches) - (6.8 * age)));

							f.setChecked(false);
							m.setChecked(true);
						} else {
							bmr = (float) ((665 + (4.35 * massPound)
									+ (4.7 * hightInches) - (4.7 * age)));

							m.setChecked(false);
							f.setChecked(true);

						}

						lb.setChecked(false);
						kg.setChecked(true);
					}// end else if

					// classification of diets
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

					Intent intent = new Intent(CalculatorActivity.this,
							ResultActivity.class);
					Bundle b = new Bundle();

					String g = null;
					String w = null;
					if (m.isChecked()) {
						g = "Male";
					} else
						g = "Female";
					
					
					
					b.putString("gender", g);
					
					pref.edit().putString("gender", g).commit();

					if (lb.isChecked()) {
						w = "lbs";
					} else
						w = "kgs";
					b.putString("w", w);
					pref.edit().putString("w", name.getText().toString()).commit();
					
					b.putString("mass", weightText.getText().toString());
					b.putString("name", name.getText().toString());
					
					pref.edit().putString("name", name.getText().toString()).commit();
					pref.edit().putString("mass", weightText.getText().toString()).commit();
					
					b.putString("feets", ft);
					pref.edit().putString("feets", ft.toString()).commit();
					b.putString("inchs", in);
					pref.edit().putString("inchs", in.toString()).commit();

					b.putString("age", ageText.getText().toString());
					
					pref.edit().putString("age", ageText.getText().toString()).commit();
					b.putFloat("BMI", bmi);
					b.putFloat("BMR", bmr);
					b.putString("comments", out);
					intent.putExtras(b);

					finish();
					startActivity(intent);

				}
			}
		}); // end calcDietImgBtnListener

	}

	public void onRadioButtonClicked(View view) {
		// Is the button now checked?
		boolean checked = ((RadioButton) view).isChecked();

		// Check which radio button was clicked
		switch (view.getId()) {
		case R.id.maleRadio:
			if (checked)
				genderCheck = "male";
			break;
		case R.id.femaleRadio:
			if (checked)
				genderCheck = "female";
			break;
		}
	}

	public void onWeightClicked(View view) {
		// Is the button now checked?
		boolean checked2 = ((RadioButton) view).isChecked();

		// Check which radio button was clicked
		switch (view.getId()) {
		case R.id.KG:
			if (checked2)
				weightCheck = "kg";
			break;
		case R.id.LBS:
			if (checked2)
				weightCheck = "lbs";
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		adView.destroy();
		Intent intent = new Intent(getBaseContext(), StartActivity.class);
		finish();
		startActivity(intent);
	}
}
