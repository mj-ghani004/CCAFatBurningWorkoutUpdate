package com.cca.fat.burn.workout;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
public class ListActivity extends Activity {
	
	ImageView button1;
	ImageView button2;
	ImageView button3;
	ImageView button4;
	ImageView button5;
	ImageView button6;
	ImageView button7;
	ImageView button8;
	ImageView button9;
	ImageView button10;
	ImageView button11;
	ImageView button12;
	
	private AlertDialog rateUsDialog;
	private InterstitialAd interstitial;
	
	AdView adView;
	
	SharedPreferences pref;
	public static final String PREFS_PRIVATE = "PREFS_PRIVATE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
		int mainVariable =  pref.getInt("main", 0);
		
		Log.v("Main", "variable from main: "+mainVariable);
		
		
					
		switch (mainVariable) {
		
		case 1:
			setContentView(R.layout.activity_list1);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list21);
			button5 = (ImageView) findViewById(R.id.list22);
			button6 = (ImageView) findViewById(R.id.list23);
			button7 = (ImageView) findViewById(R.id.list31);
			button8 = (ImageView) findViewById(R.id.list32);

			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button5.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 5).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 7).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button8.setOnClickListener(new OnClickListener() {
							
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 8).commit();
					finish();
					startActivity(intent);
				}
			});			
			
			
			break;

		case 2:
			setContentView(R.layout.activity_list2);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list14);
			button5 = (ImageView) findViewById(R.id.list15);
			button6 = (ImageView) findViewById(R.id.list16);
			button7 = (ImageView) findViewById(R.id.list17);
			button8 = (ImageView) findViewById(R.id.list18);
			button9 = (ImageView) findViewById(R.id.list19);
			button10 = (ImageView) findViewById(R.id.list111);
			button11 = (ImageView) findViewById(R.id.list112);
			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 5).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button7.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 7).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 8).commit();
					finish();
					startActivity(intent);
				}
			});
			
			
			button9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 9).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 10).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 11).commit();
					finish();
					startActivity(intent);
				}
			});
			
			break;
		
			case 3:
			setContentView(R.layout.activity_list3);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list14);
			button5 = (ImageView) findViewById(R.id.list15);
			button6 = (ImageView) findViewById(R.id.list16);
			button7 = (ImageView) findViewById(R.id.list17);
			button8 = (ImageView) findViewById(R.id.list18);
			button9 = (ImageView) findViewById(R.id.list19);
			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 5).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 7).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 8).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 9).commit();
					finish();
					startActivity(intent);
				}
			});
			
			break;
		
			case 4:
			setContentView(R.layout.activity_list4);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list14);
			button5 = (ImageView) findViewById(R.id.list15);
			button6 = (ImageView) findViewById(R.id.list16);
			button7 = (ImageView) findViewById(R.id.list17);
			button8 = (ImageView) findViewById(R.id.list18);
			button9 = (ImageView) findViewById(R.id.list19);
			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 5).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 7).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button8.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
								Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
								pref.edit().putInt("list", 8).commit();
								finish();
								startActivity(intent);
							}
						});
			
			button9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 9).commit();
					finish();
					startActivity(intent);
				}
			});
			
			break;
		
			case 5:
			setContentView(R.layout.activity_list5);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list14);
			button5 = (ImageView) findViewById(R.id.list15);
			button6 = (ImageView) findViewById(R.id.list16);
			button7 = (ImageView) findViewById(R.id.list17);
			button8 = (ImageView) findViewById(R.id.list18);
			button9 = (ImageView) findViewById(R.id.list19);
			button10 = (ImageView) findViewById(R.id.list111);
			button11 = (ImageView) findViewById(R.id.list112);
			button12 = (ImageView) findViewById(R.id.list113);
			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 5).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button7.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 7).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 8).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 9).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 10).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 11).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 12).commit();
					finish();
					startActivity(intent);
				}
			});
			
			break;
			
			case 6:
			setContentView(R.layout.activity_list6);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list14);
			button5 = (ImageView) findViewById(R.id.list15);
			button6 = (ImageView) findViewById(R.id.list16);
			button7 = (ImageView) findViewById(R.id.list17);
			button8 = (ImageView) findViewById(R.id.list18);
			button9 = (ImageView) findViewById(R.id.list19);
			button10 = (ImageView) findViewById(R.id.list111);
			button11= (ImageView) findViewById(R.id.list112);
			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 5).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button6.setOnClickListener(new OnClickListener() {
							
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 7).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 8).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 9).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 10).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 11).commit();
					finish();
					startActivity(intent);
				}
			});
			
			break;
		
			case 7:
			setContentView(R.layout.activity_list7);
			
			button1 = (ImageView) findViewById(R.id.list11);
			button2 = (ImageView) findViewById(R.id.list12);
			button3 = (ImageView) findViewById(R.id.list13);
			button4 = (ImageView) findViewById(R.id.list14);
			button5 = (ImageView) findViewById(R.id.list15);
			button6 = (ImageView) findViewById(R.id.list16);
			button7 = (ImageView) findViewById(R.id.list17);
			button8 = (ImageView) findViewById(R.id.list18);
			
			
			button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 1).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button2.setOnClickListener(new OnClickListener() {
							
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
						pref.edit().putInt("list", 2).commit();
						finish();
						startActivity(intent);
					}
				});
			
			button3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 3).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 4).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 5).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 6).commit();
					finish();
					startActivity(intent);
				}
			});
			
			button7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 7).commit();
					finish();
					startActivity(intent);
				}
			});
		
			button8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getBaseContext(), DescriptionActivity.class);
					pref.edit().putInt("list", 8).commit();
					finish();
					startActivity(intent);
				}
			});
		
		default:
			break;
		}
		
		// Look up the AdView as a resource and load a request.
		adView = (AdView)this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
		adView.loadAd(adRequest);
		//ads();
/*		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});*/
		
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		adView.destroy();
		Intent intent = new Intent(getBaseContext(), MainActivity.class);
		finish();
		startActivity(intent);
	}
	
	
/*	// for interstitial ads  
			public void ads()
			{
				interstitial = new InterstitialAd(this);
				interstitial.setAdUnitId("ca-app-pub-7241082100261031/4968000903");
				AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
				interstitial.loadAd(adRequest);
			}


			public void displayInterstitial() {
				if (interstitial.isLoaded()) 
				{
					interstitial.show();
				}
			}

			@Override
			public void onBackPressed() {
				// TODO Auto-generated method stub


				try 
				{
					// // for interstitial ads 
					displayInterstitial();
					ads();

					AlertDialog.Builder rateUsDialogBuilder = new AlertDialog.Builder(ListActivity.this);
					rateUsDialogBuilder.setCancelable(false);
					rateUsDialogBuilder.setTitle("Daily Workout In 7 Miuntes");
					rateUsDialogBuilder.setMessage("Are you sure you want to exit?");
					rateUsDialogBuilder.setIcon(R.drawable.ic_launcher);
					rateUsDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) 
						{
							finish();
							System.exit(0);
						}
					});
					rateUsDialogBuilder.setNeutralButton("Rate Us", new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) 
						{
							String url = "market://details?id="+ ListActivity.this.getPackageName();
							Intent i = new Intent(Intent.ACTION_VIEW);
							i.setData(Uri.parse(url));
							ListActivity.this.startActivity(i);
						}
					})
					.setNegativeButton("Cancel",new DialogInterface.OnClickListener() 
					{

						@Override
						public void onClick(DialogInterface dialog, int which)
						{
							rateUsDialog.dismiss();
						}
					});
					rateUsDialog = rateUsDialogBuilder.create();
					rateUsDialog.show();
					
					Intent intent = new Intent(getBaseContext(), MainActivity.class);
					finish();
					startActivity(intent);
					
				} catch (Exception e)
				{

				}	

				//finish();


			}*/
			

}
