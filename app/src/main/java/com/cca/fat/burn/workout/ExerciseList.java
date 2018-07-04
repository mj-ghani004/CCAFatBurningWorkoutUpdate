package com.cca.fat.burn.workout;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;


import java.util.ArrayList;

import Data.ExerciseListAdapter;
import Data.FoodProvider;
import Utils.Constants;
import Utils.utility;

import static com.cca.fat.burn.workout.DescriptionActivity.PREFS_PRIVATE;

public class ExerciseList extends AppCompatActivity {


    Toolbar mToolbar;
    private ArrayList<FoodProvider> arrayList = new ArrayList<>();
    RecyclerView mRecyclerView;
    ExerciseListAdapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    private SharedPreferences pref;
    private String mExerciseType;
    private utility mUtility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_list);
        mUtility = new utility();


        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
        mExerciseType = pref.getString("exercise", "");


        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        getSupportActionBar().setTitle(mExerciseType);

        // For Back Arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        arrayList = populateArray(mExerciseType, this);

        // Initializing List Data

        mRecyclerView = findViewById(R.id.recyclerView_food);
        mAdapter = new ExerciseListAdapter(arrayList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }

    private ArrayList<FoodProvider> populateArray(String name, Context context) {

        switch (name) {

            case Constants.CHEST:

                pref.edit().putInt("main", 1).apply();
                return mUtility.getDataForChest(context);

            case Constants.BICEPS:

                pref.edit().putInt("main", 2).apply();
                return mUtility.getDataForBiceps(context);

            case Constants.SHOULDER:

                pref.edit().putInt("main", 3).apply();
                return mUtility.getDataForShoulders(context);

            case Constants.THIGH:

                pref.edit().putInt("main", 4).apply();
                return mUtility.getDataForThigh(context);

            case Constants.TRICEPS:

                pref.edit().putInt("main", 5).apply();
                return mUtility.getDataForTriceps(context);

            case Constants.WINGS:

                pref.edit().putInt("main", 6).apply();
                return mUtility.getDataForWings(context);


            case Constants.ABDOMINAL:

                pref.edit().putInt("main", 7).apply();
                return mUtility.getDataForAbdominal(context);

            default:

                Toast.makeText(context, "Please Select Valid Exercise", Toast.LENGTH_LONG).show();
                break;

        }

        return null;


    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
