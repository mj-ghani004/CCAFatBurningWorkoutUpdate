package com.cca.fat.burn.workout;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import Utils.Constants;

public class MainActivity extends Activity {

    ImageView button1;
    ImageView button2;
    ImageView button3;
    ImageView button4;
    ImageView button5;
    ImageView button6;
    ImageView button7;

    private AlertDialog rateUsDialog;
    private InterstitialAd interstitial;
    AdView adView;

    SharedPreferences pref;
    public static final String PREFS_PRIVATE = "PREFS_PRIVATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        // Look up the AdView as a resource and load a request.
		/*AdView adView = (AdView)this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
		adView.loadAd(adRequest);
*/
        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 1).apply();
                pref.edit().putString("exercise", Constants.CHEST).apply();
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 2).apply();
                pref.edit().putString("exercise", Constants.BICEPS).apply();

                startActivity(intent);
            }
        });

        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 3).commit();
                pref.edit().putString("exercise", Constants.SHOULDER).apply();

                ;
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 4).apply();
                pref.edit().putString("exercise", Constants.THIGH).apply();

                startActivity(intent);
            }
        });

        button5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 5).commit();
                pref.edit().putString("exercise", Constants.THIGH).apply();


                startActivity(intent);
            }
        });

        button6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 6).apply();
                pref.edit().putString("exercise", Constants.WINGS).apply();

                startActivity(intent);
            }
        });

        button7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
                pref.edit().putInt("main", 7).apply();
                pref.edit().putString("exercise", Constants.ABDOMINAL).apply();


                startActivity(intent);
            }
        });

        adView =  this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
        adView.loadAd(adRequest);

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
