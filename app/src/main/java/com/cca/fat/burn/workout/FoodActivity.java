package com.cca.fat.burn.workout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import Data.FoodAdapter;
import Data.FoodProvider;

public class FoodActivity extends AppCompatActivity {

    private String[] titles =
            {"Broccoli", "Eggs", "Almonds", "Grapefruit", "WheatGerm",
                    "Tea", "Sweet Potato", "Mushrooms", "Low Fat Yogurt"};

    private String[] desc =
            {
                    "Broccoli is a great source of vitamins K and C, a good source of folate (folic acid) and also provides potassium, fiber. Vitamin C – builds collagen"
                    , "Eggs are a very good source of inexpensive, high quality protein. More than half the protein of an egg is found in the egg white along with vitamin B2 and lower amounts of fat and cholesterol than the yolk. The whites are rich sources of selenium,"
                    , "Almonds contain lots of healthy fats, fiber, protein, magnesium and vitamin E. The health benefits of almonds include lower blood sugar levels"
                    , "A glass of chilled grapefruit juice, especially in summer, helps boost levels of vitamin C in your body, which makes them the most nutritious fruit amongst various citrus fruits"
                    , "It's a great source of vegetable proteins, along with fiber and healthy fats. It's also a good source of magnesium, zinc, thiamin, folate, potassium, and phosphorus. Wheat germ is high in vitamin E, an essential nutrient with antioxidant"
                    , "Tea is a name given to a lot of brews, but purists consider only green tea, black tea, white tea, oolong tea, and pu-erh tea the real thing. They are all derived from the Camellia sinensis plant"
                    , "Sweet potatoes are an excellent source of vitamin A (in the form of beta-carotene). They are also a very good source of vitamin C, manganese, copper, pantothenic acid and vitamin B6. Additionally, they are a good source of potassium, dietary fiber, niacin, vitamin B1, vitamin B2 and phosphorus."
                    , "These ordinary mushrooms are super dense with nutrients, including having more copper, potassium, protein and selenium than either oyster or shiitake mushrooms. They're also a good source of phosphorus, zinc, niacin and pantothenic acid, "
                    , "Calcium has been shown to have beneficial effects on bone mass in people of all ages, although the results are not always consistent, says Nieves, also an assistant professor of clinical epidemiology at Columbia University"
            };



    Toolbar mToolbar;

    Drawable[] img_src;
    ArrayList<FoodProvider> arrayList = new ArrayList<FoodProvider>();
    RecyclerView mRecyclerView;
    FoodAdapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    ImageView button1;
    ImageView button2;
    ImageView button3;
    ImageView button4;
    ImageView button5;
    ImageView button6;
    ImageView button7;
    ImageView button8;
    ImageView button9;



    private AlertDialog rateUsDialog;
    private InterstitialAd interstitial;

    AdView adView;
    SharedPreferences pref;
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

        img_src = getImageResources(this);
        setArrayList(img_src , titles , desc);




        mRecyclerView = findViewById(R.id.recyclerView_food);
        mAdapter = new FoodAdapter(arrayList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

//
//        button1 = findViewById(R.id.list11);
//        button2 = findViewById(R.id.list12);
//        button3 = findViewById(R.id.list13);
//        button4 = findViewById(R.id.list14);
//        button5 = findViewById(R.id.list15);
//        button6 = findViewById(R.id.list16);
//        button7 = findViewById(R.id.list17);
//        button8 = findViewById(R.id.list18);
//        button9 = findViewById(R.id.list19);
//
//        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
//
//        button1.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 1).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button2.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 2).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button3.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 3).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button4.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 4).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button5.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 5).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button6.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 6).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button7.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 7).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button8.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 8).commit();
//                finish();
//                startActivity(intent);
//            }
//        });
//
//        button9.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
//                pref.edit().putInt("main", 8).commit();
//                pref.edit().putInt("list", 9).commit();
//                finish();
//                startActivity(intent);
//            }
//        });

        // Look up the AdView as a resource and load a request.
//        adView = (AdView) this.findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice(
//                "39D2CA637D78D46DABA54D4AB9F15E29").build();
//        adView.loadAd(adRequest);
        // ads();
        /*
         * button6.setOnClickListener(new OnClickListener() {
         *
         * @Override public void onClick(View arg0) { // TODO Auto-generated
         * method stub
         *
         * } });
         */

    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
       // adView.destroy();
        Intent intent = new Intent(getBaseContext(), StartActivity.class);
        finish();
        startActivity(intent);
    }

    /*
     * // for interstitial ads public void ads() { interstitial = new
     * InterstitialAd(this);
     * interstitial.setAdUnitId("ca-app-pub-7241082100261031/4968000903");
     * AdRequest adRequest = new
     * AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29"
     * ).build(); interstitial.loadAd(adRequest); }
     *
     *
     * public void displayInterstitial() { if (interstitial.isLoaded()) {
     * interstitial.show(); } }
     *
     * @Override public void onBackPressed() { // TODO Auto-generated method
     * stub
     *
     *
     * try { // // for interstitial ads displayInterstitial(); ads();
     *
     * AlertDialog.Builder rateUsDialogBuilder = new
     * AlertDialog.Builder(ListActivity.this);
     * rateUsDialogBuilder.setCancelable(false);
     * rateUsDialogBuilder.setTitle("Daily Workout In 7 Miuntes");
     * rateUsDialogBuilder.setMessage("Are you sure you want to exit?");
     * rateUsDialogBuilder.setIcon(R.drawable.ic_launcher);
     * rateUsDialogBuilder.setPositiveButton("Yes", new
     * DialogInterface.OnClickListener() {
     *
     * @Override public void onClick(DialogInterface dialog, int which) {
     * finish(); System.exit(0); } });
     * rateUsDialogBuilder.setNeutralButton("Rate Us", new
     * DialogInterface.OnClickListener() {
     *
     * @Override public void onClick(DialogInterface dialog, int which) { String
     * url = "market://details?id="+ ListActivity.this.getPackageName(); Intent
     * i = new Intent(Intent.ACTION_VIEW); i.setData(Uri.parse(url));
     * ListActivity.this.startActivity(i); } }) .setNegativeButton("Cancel",new
     * DialogInterface.OnClickListener() {
     *
     * @Override public void onClick(DialogInterface dialog, int which) {
     * rateUsDialog.dismiss(); } }); rateUsDialog =
     * rateUsDialogBuilder.create(); rateUsDialog.show();
     *
     * Intent intent = new Intent(getBaseContext(), MainActivity.class);
     * finish(); startActivity(intent);
     *
     * } catch (Exception e) {
     *
     * }
     *
     * //finish();
     *
     *
     * }
     */

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    private void setArrayList(Drawable[] img_src , String[] titles , String[] desc)
    {
        arrayList.clear();

        for(int i = 0 ; i< titles.length ; i++)
        {
            arrayList.add(new FoodProvider(img_src[i] , titles[i] , desc[i]));
        }
    }

    private Drawable[] getImageResources(Context context)
    {

     Drawable[] drawables =
            {
                    context.getResources().getDrawable(R.drawable.broccoli),
                    context.getResources().getDrawable(R.drawable.eggs),
                    context.getResources().getDrawable(R.drawable.almonds),
                    context.getResources().getDrawable(R.drawable.grapefruit),
                    context.getResources().getDrawable(R.drawable.wheat_germ),
                    context.getResources().getDrawable(R.drawable.tea),
                    context.getResources().getDrawable(R.drawable.sweetpotato),
                    context.getResources().getDrawable(R.drawable.mushrooms),
                    context.getResources().getDrawable(R.drawable.low_fat_yogurt),


            };

    return  drawables;
    }

}
