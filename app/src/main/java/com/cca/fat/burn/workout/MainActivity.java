package com.cca.fat.burn.workout;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import Data.ExerciseAdapter;
import Data.FoodProvider;
import Utils.Constants;
import Utils.utility;

public class MainActivity extends AppCompatActivity {

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

    private android.support.v7.widget.Toolbar mToolbar;
    private ArrayList<FoodProvider> arrayList = new ArrayList<>();

    private RecyclerView mRecyclerView;
    private ExerciseAdapter mAdapter;
    private RecyclerView.LayoutManager mLayout;

    private utility mUtility;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.training);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Exercise List");

        // For Back Arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //Populating Custom Data

        mUtility = new utility();
        arrayList = mUtility.getDataForExercises(getApplicationContext());
        mRecyclerView = findViewById(R.id.recyclerView_training);
        mLayout = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayout);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new ExerciseAdapter(arrayList , this);
        mRecyclerView.setAdapter(mAdapter);

        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);






//        button1 = findViewById(R.id.button1);
//        button2 = findViewById(R.id.button2);
//        button3 = findViewById(R.id.button3);
//        button4 = findViewById(R.id.button4);
//        button5 = findViewById(R.id.button5);
//        button6 = findViewById(R.id.button6);
//        button7 = findViewById(R.id.button7);

        // Look up the AdView as a resource and load a request.
		/*AdView adView = (AdView)this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
		adView.loadAd(adRequest);
*/


//        button1.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 1).apply();
//                pref.edit().putString("exercise", Constants.CHEST).apply();
//                startActivity(intent);
//            }
//        });
//
//        button2.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 2).apply();
//                pref.edit().putString("exercise", Constants.BICEPS).apply();
//
//                startActivity(intent);
//            }
//        });
//
//        button3.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 3).commit();
//                pref.edit().putString("exercise", Constants.SHOULDER).apply();
//
//                ;
//                startActivity(intent);
//            }
//        });
//
//
//        button4.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 4).apply();
//                pref.edit().putString("exercise", Constants.THIGH).apply();
//
//                startActivity(intent);
//            }
//        });
//
//        button5.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 5).commit();
//                pref.edit().putString("exercise", Constants.THIGH).apply();
//
//
//                startActivity(intent);
//            }
//        });
//
//        button6.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 6).apply();
//                pref.edit().putString("exercise", Constants.WINGS).apply();
//
//                startActivity(intent);
//            }
//        });
//
//        button7.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), ExerciseList.class);
//                pref.edit().putInt("main", 7).apply();
//                pref.edit().putString("exercise", Constants.ABDOMINAL).apply();
//
//
//                startActivity(intent);
//            }
//        });
//        adView =  this.findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
//        adView.loadAd(adRequest);
//
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
      //  adView.destroy();
      //  Intent intent = new Intent(getBaseContext(), StartActivity.class);
      //  finish();

       // startActivity(intent);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
