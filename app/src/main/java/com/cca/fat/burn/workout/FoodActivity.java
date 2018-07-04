package com.cca.fat.burn.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import Data.FoodAdapter;
import Utils.utility;

public class FoodActivity extends AppCompatActivity {

    Toolbar mToolbar;

    RecyclerView mRecyclerView;
    FoodAdapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    utility mUtility;


    public static final String PREFS_PRIVATE = "PREFS_PRIVATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_new);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Healthy Foods");

        // For Back Arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mUtility = new utility();


        mRecyclerView = findViewById(R.id.recyclerView_food);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Populating and initializing List
        mAdapter = new FoodAdapter(mUtility.getDataForFood(this));
        mRecyclerView.setAdapter(mAdapter);


    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        Intent intent = new Intent(getBaseContext(), StartActivity.class);
        finish();
        startActivity(intent);
    }



    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }



}
