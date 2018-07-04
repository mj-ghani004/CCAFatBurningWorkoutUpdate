package com.cca.fat.burn.workout;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

import Data.ExerciseAdapter;
import Data.FoodProvider;
import Utils.utility;

public class MainActivity extends AppCompatActivity {

    ImageView button1;
    ImageView button2;
    ImageView button3;
    ImageView button4;
    ImageView button5;
    ImageView button6;
    ImageView button7;


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







    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
