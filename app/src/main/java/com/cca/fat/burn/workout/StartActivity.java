package com.cca.fat.burn.workout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class StartActivity extends Activity {

    Button button1;
    Button rateUs;
    Button calculator;
    Button food;

    private AlertDialog rateUsDialog;
    private InterstitialAd interstitial;

    AdView adView;
    SharedPreferences pref;
    public static final String PREFS_PRIVATE = "PREFS_PRIVATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        button1 = findViewById(R.id.imageView1);
        rateUs = findViewById(R.id.imageView01);
        calculator = findViewById(R.id.calculator);
        food = findViewById(R.id.food);



        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        rateUs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String myUrl = "market://details?id="
                        + StartActivity.class.getPackage().getName();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(myUrl)));
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CalculatorActivity.class);
                startActivity(intent);
            }
        });

        food.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FoodActivity.class);
                startActivity(intent);
            }
        });

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        }
    }

    // for interstitial ads
    public void ads() {
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-7241082100261031/2336031303");
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(
                "39D2CA637D78D46DABA54D4AB9F15E29").build();
        interstitial.loadAd(adRequest);
    }



    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub

        try {


            AlertDialog.Builder rateUsDialogBuilder = new AlertDialog.Builder(
                    StartActivity.this);
            rateUsDialogBuilder.setCancelable(false);
            rateUsDialogBuilder.setTitle(StartActivity.this
                    .getString(R.string.app_name));
            rateUsDialogBuilder.setMessage("Are you sure you want to exit?");
            rateUsDialogBuilder.setIcon(R.drawable.ic_launcher);
            rateUsDialogBuilder.setPositiveButton("Yes",
                    new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            adView.destroy();
                            finish();
                            System.exit(0);
                        }
                    });

            rateUsDialogBuilder.setNeutralButton("Rate Us",
                    new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String url = "market://details?id="
                                    + StartActivity.this.getPackageName();
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            StartActivity.this.startActivity(i);
                        }
                    })

                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            rateUsDialog.dismiss();
                        }
                    });

            rateUsDialog = rateUsDialogBuilder.create();
            rateUsDialog.show();

        } catch (Exception e) {

        }

        // finish();

    }
}
