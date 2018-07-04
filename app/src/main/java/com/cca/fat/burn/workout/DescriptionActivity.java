package com.cca.fat.burn.workout;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class DescriptionActivity extends AppCompatActivity {

    ImageView anim;
    TextView heading;
    WebView description;
    TextView header;

    AnimationDrawable anim2;

    private AlertDialog rateUsDialog;
    private InterstitialAd interstitial;

    AdView adView;

    SharedPreferences pref;
    public static final String PREFS_PRIVATE = "PREFS_PRIVATE";

    int mainVariable;
	 Toolbar mToolbar;
	 String mExerciseName;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description11);



        // Look up the AdView as a resource and load a request.
        adView =  this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("39D2CA637D78D46DABA54D4AB9F15E29").build();
        adView.loadAd(adRequest);

        anim =  findViewById(R.id.imageView);
        heading =  findViewById(R.id.heading);
        description =  findViewById(R.id.description);
        header =  findViewById(R.id.descHeading);

        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
        mainVariable = pref.getInt("main", 0);
        int listVariable = pref.getInt("list", 0);
        //mExerciseName = pref.getString("exercise" , "");

        String htmlText;
        final String mimeType = "text/html";
        final String encoding = "UTF-8";

        Log.v("List", "variable from main: " + mainVariable);
        Log.v("List", "variable from List: " + listVariable);

        switch (mainVariable) {

            case 1:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.dumbbell_bench_press_anim);
                        heading.setText(R.string.label_bench_press);
                        header.setText(R.string.label_bench_press);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps</h3><ol>	<li>Lie down on a flat bench with a dumbbell in each hand resting on top of your thighs. The palms of your hands will be facing each other.   <li>Then, using your thighs to help raise the dumbbells up, lift the dumbbells one at a time so that you can hold them in front of you at shoulder width.    <li>Once at shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. The dumbbells should be just to the sides of your chest, with your upper arm and forearm creating a 90 degree angle. Be sure to maintain full control of the dumbbells at all times. This will be your starting position.    <li>Then, as you breathe out, use your chest to push the dumbbells up. Lock your arms at the top of the lift and squeeze your chest, hold for a second and then begin coming down slowly. Tip: Ideally, lowering the weight should take about twice as long as raising it.    <li>Repeat the movement for the prescribed amount of repetitions of your training program.</ol><h3>Caution:</h3>When you are done, do not drop the dumbbells next to you as this is dangerous to your rotator cuff in your shoulders and others working out around you.<br><br>Just lift your legs from the floor bending at the knees, twist your wrists so that the palms of your hands are facing each other and place the dumbbells on top of your thighs. When both dumbbells are touching your thighs simultaneously push your upper torso up (while pressing the dumbbells on your thighs) and also perform a slight kick forward with your legs (keeping the dumbbells on top of the thighs). By doing this combined movement, momentum will help you get back to a sitting position with both dumbbells still on top of your thighs. At this moment you can place the dumbbells on the floor.<h3>Variations:</h3>Another variation of this exercise is to perform it with the palms of the hands facing each other.<br><br>Also, you can perform the exercise with the palms facing each other and then twisting the wrist as you lift the dumbbells so that at the top of the movement the palms are facing away from the body. I personally do not use this variation very often as it seems to be hard on my shoulders.";


                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();

                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.decline_cruch_anim);
                        heading.setText(R.string.label_decline_crunches);
                        header.setText(R.string.label_decline_crunches);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Secure your legs at the end of the decline bench and lie down.	<li>Now place your hands lightly on either side of your head keeping your elbows in. Tip: Don't lock your fingers behind your head.	<li>While pushing the small of your back down in the bench to better isolate your abdominal muscles, begin to roll your shoulders off it.	Continue to push down as hard as you can with your lower back as you contract your abdominals and exhale. Your shoulders should come up <li>off the bench only about four inches, and your lower back should remain on the bench. At the top of the movement, contract your abdominals hard and keep the contraction for a second. Tip: Focus on slow, controlled movement - don't cheat yourself by using momentum.	<li>After the one second contraction, begin to come down slowly again to the starting position as you inhale.	<li>Repeat for the recommended amount of repetitions.</ol><h3>Variations:</h3>There are many variations for the crunch. You can perform the exercise with weights, or on top of an exercise ball or on a flat bench.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();


                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.incline_bench_press_anim);
                        heading.setText(R.string.label_incline_bench_press);
                        header.setText(R.string.label_incline_bench_press);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Lie back on an incline bench with a dumbbell in each hand atop your thighs. The palms of your hands will be facing each other.    <li>Then, using your thighs to help push the dumbbells up, lift the dumbbells one at a time so that you can hold them at shoulder width.    <li>Once you have the dumbbells raised to shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. This will be your starting position.    <li>Be sure to keep full control of the dumbbells at all times. Then breathe out and push the dumbbells up with your chest.    <li>Lock your arms at the top, hold for a second, and then start slowly lowering the weight. Tip Ideally, lowering the weights should take about twice as long as raising them.    <li>Repeat the movement for the prescribed amount of repetitions.    <li>When you are done, place the dumbbells back on your thighs and then on the floor. This is the safest manner to release the dumbbells.</ol><h3>Variations:</h3>    You can use several angles on the incline bench if the bench you are using is adjustable.<br><br>Another variation of this exercise is to perform it with the palms of the hands facing each other.<br><br>Also, you can perform the exercise with the palms facing each other and then twisting the wrist as you lift the dumbbells so that at the top of the movement the palms are facing away from the body. I personally do not use this variation very often as it seems to be hard on my shoulders.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.incline_fly_anim);
                        heading.setText(R.string.label_incline_fly);
                        header.setText(R.string.label_incline_fly);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Hold a dumbbell on each hand and lie on an incline bench that is set to an incline angle of no more than 30 degrees.    <li>Extend your arms above you with a slight bend at the elbows.    <li>Now rotate the wrists so that the palms of your hands are facing you. Tip: The pinky fingers should be next to each other. This will be your starting position.    <li>As you breathe in, start to slowly lower the arms to the side while keeping the arms extended and while rotating the wrists until the palms of the hand are facing each other. Tip: At the end of the movement the arms will be by your side with the palms facing the ceiling.    <li>As you exhale start to bring the dumbbells back up to the starting position by reversing the motion and rotating the hands so that the pinky fingers are next to each other again. Tip: Keep in mind that the movement will only happen at the shoulder joint and at the wrist. There is no motion that happens at the elbow joint.    <li>Repeat for the recommended amount of repetitions.</ol><h3>Variations: </h3>  You can perform regular flyes and also twisting flyes where your initial position starts with the thumbs facing each other instead of the pinky.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.lying_fly_anim);
                        heading.setText(R.string.dumbell_lying_fly);
                        header.setText(R.string.dumbell_lying_fly);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. The palms of your hand will be facing each other.    <li>Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other. Raise the dumbbells up like you're pressing them, but stop and hold just before you lock out. This will be your starting position.    <li>With a slight bend on your elbows in order to prevent stress at the biceps tendon, lower your arms out at both sides in a wide arc until you feel a stretch on your chest. Breathe in as you perform this portion of the movement. Tip: Keep in mind that throughout the movement, the arms should remain stationary; the movement should only occur at the shoulder joint.    <li>Return your arms back to the starting position as you squeeze your chest muscles and breathe out. Tip: Make sure to use the same arc of motion used to lower the weights.    <li>Hold for a second at the contracted position and repeat the movement for the prescribed amount of repetitions.</ol><h3>Variations:</h3> You may want to use a palms facing forward version for different stimulation.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();

                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.dumbbell_flys_anim);
                        heading.setText(R.string.dumbell_fly);
                        header.setText(R.string.dumbell_fly);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps</h3><ol>	<li>Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs. The palms of your hand will be facing each other.<li>Then using your thighs to help raise the dumbbells, lift the dumbbells one at a time so you can hold them in front of you at shoulder width with the palms of your hands facing each other. Raise the dumbbells up like you're pressing them, but stop and hold just before you lock out. This will be your starting position.<li>With a slight bend on your elbows in order to prevent stress at the biceps tendon, lower your arms out at both sides in a wide arc until you feel a stretch on your chest. Breathe in as you perform this portion of the movement. Tip: Keep in mind that throughout the movement, the arms should remain stationary; the movement should only occur at the shoulder joint.<li>Return your arms back to the starting position as you squeeze your chest muscles and breathe out. Tip: Make sure to use the same arc of motion used to lower the weights.<li>Hold for a second at the contracted position and repeat the movement for the prescribed amount of repetitions.</ol><h3>Variations:</h3> You may want to use a palms facing forward version for different stimulation.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.barbell_bench_press_anim);
                        heading.setText(R.string.barbel_bench_press);
                        header.setText(R.string.barbel_bench_press);

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Lie back on a flat bench. Using a medium width grip (a grip that creates a 90-degree angle in the middle of the movement between the forearms and the upper arms), lift the bar from the rack and hold it straight over you with your arms locked. This will be your starting position.		<li>From the starting position, breathe in and begin coming down slowly until the bar touches your middle chest.		<li>After a brief pause, push the bar back to the starting position as you breathe out. Focus on pushing the bar using your chest muscles. Lock your arms and squeeze your chest in the contracted position at the top of the motion, hold for a second and then start coming down slowly again. Tip: Ideally, lowering the weight should take about twice as long as raising it.		<li>Repeat the movement for the prescribed amount of repetitions.		<li>When you are done, place the bar back in the rack.</ol><h3>Caution:</h3>If you are new at this exercise, it is advised that you use a spotter. If no spotter is available, then be conservative with the amount of weight used.<br>Also, beware of letting the bar drift too far forward. You want the bar to touch your middle chest and nowhere else.<br>Don't bounce the weight off your chest. You should be in full control of the barbell at all times.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();

                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.dumbbell_decline_flys_anim);
                        heading.setText(R.string.dumbel_decline_fly);
                        header.setText(R.string.dumbel_decline_fly);


                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps: </h3><ol>	<li>Secure your legs at the end of the decline bench and lie down with a dumbbell on each hand on top of your thighs. The palms of your hand will be facing each other.    <li>Once you are laying down, move the dumbbells in front of you at shoulder width. The palms of the hands should be facing each other and the arms should be perpendicular to the floor and fully extended. This will be your starting position.    <li>With a slight bend on your elbows in order to prevent stress at the biceps tendon, lower your arms out at both sides in a wide arc until you feel a stretch on your chest. Breathe in as you perform this portion of the movement. Tip: Keep in mind that throughout the movement, the arms should remain stationary; the movement should only occur at the shoulder joint.    <li>Return your arms back to the starting position as you squeeze your chest muscles and breathe out. Tip: Make sure to use the same arc of motion used to lower the weights.    <li>Hold for a second at the contracted position and repeat the movement for the prescribed amount of repetitions.</ol><h3>Variation: </h3> You may want to use a palms facing forward version for different stimulation.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    default:
                        break;
                }

                break;

            case 2:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.alternate_biceps_curl_anim);
                        heading.setText("Alternate Biceps Curl");
                        header.setText("Alternate Biceps Curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Stand (torso upright) with a dumbbell in each hand held at arms length. The elbows should be close to the torso and the palms of your hand should be facing your thighs.	<li>While holding the upper arm stationary, curl the right weight as you rotate the palm of the hands until they are facing forward. At this point continue contracting the biceps as you breathe out until your biceps is fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second as you squeeze the biceps. Tip: Only the forearms should move.	<li>Slowly begin to bring the dumbbell back to the starting position as your breathe in. Tip: Remember to twist the palms back to the starting position (facing your thighs) as you come down.	<li>Repeat the movement with the left hand. This equals one repetition.	<li>Continue alternating in this manner for the recommended amount of repetitions.</ol><h3>Variations:</h3>There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it using both arms at the same time. Additionally, you may perform it with a starting position in which both palms are facing forward. In this case, you may alternate the arms as well, or perform at the same time.<br><br>You can also do the exercise starting with both palms of the hands facing the torso and then rotating forward as the movement is performed. At the top of the movement the palms should face forward and the small finger should be higher than the thumb for a peak contraction.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.alternate_hammer_curl_anim);
                        heading.setText("Alternate Hammer Curl");
                        header.setText("Alternate Hammer Curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Stand up with your torso upright and a dumbbell on each hand being held at arms length. The elbows should be close to the torso.	<li>The palms of the hands should be facing your torso. This will be your starting position.	<li>Now, while holding your upper arm stationary, exhale and curl the weight forward while contracting the biceps. Continue to raise the weight until the biceps are fully contracted and the dumbbell is at shoulder level. Hold the contracted position for a brief moment as you squeeze the biceps. Tip: Focus on keeping the elbow stationary and only moving your forearm.	<li>After the brief pause, inhale and slowly begin the lower the dumbbells back down to the starting position.	<li>Repeat for the recommended amount of repetitions.</ol><h3>Variations:</h3>There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by alternating arms; first lift the right arm for one repetition, then the left, then the right, etc.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.alternate_incline_curl_anim);
                        heading.setText("Alternate Incline curl");
                        header.setText("Alternate Incline curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps: </h3><ol>	<li>Sit back on an incline bench with a dumbbell in each hand held at arms length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position.<li>While holding the upper arm stationary, curl the weights forward while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second.<li>Slowly begin to bring the dumbbells back to starting position as your breathe in.Repeat for the recommended amount of repetitions.</ol>";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.seated_dumbbell_biceps_curl_anim);
                        heading.setText("Seated Dumbbell Biceps Curl");
                        header.setText("Seated Dumbbell Biceps Curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Rotate the palms of the hands so that they are facing your torso. This will be your starting position.	<li>While holding the upper arm stationary, curl the weights and start twisting the wrists once the dumbbells pass your thighs so that the palms of your hands face forward at the end of the movement. Make sure that you contract the biceps as you breathe out and make sure that only the forearms move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second as you squeeze the biceps.	<li>Slowly begin to bring the dumbbells back to the starting position as your breathe in and as you rotate the wrists back to a neutral grip.	<li>Repeat for the recommended amount of repetitions.</ol><h3>Variations:</h3>There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by alternating arms; first lift the right arm for one repetition, then the left, then the right, etc.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.barbell_biceps_curl_anim);
                        heading.setText("Barbell Biceps Curl");
                        header.setText("Barbell Biceps Curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Stand up with your torso upright while holding a barbell at a shoulder-width grip. The palm of your hands should be facing forward and the elbows should be close to the torso. This will be your starting position.<li>While holding the upper arms stationary, curl the weights forward while contracting the biceps as you breathe out. Tip: Only the forearms should move.<li>Continue the movement until your biceps are fully contracted and the bar is at shoulder level. Hold the contracted position for a second and squeeze the biceps hard.<li>Slowly begin to bring the bar back to starting position as your breathe in.<li>Repeat for the recommended amount of repetitions.</ol><h3>Variations:</h3>You can also perform this movement using a straight bar attachment hooked to a low pulley. This variation seems to really provide a good contraction at the top of the movement. You may also use the closer grip for variety purposes.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.biceps_hammer_curl_anim);
                        heading.setText("Biceps Hammer Curl");
                        header.setText("Biceps Hammer Curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps: </h3><ol>	<li>Stand up with your torso upright and a dumbbell on each hand being held at arms length. The elbows should be close to the torso.<li>The palms of the hands should be facing your torso. This will be your starting position.<li>Now, while holding your upper arm stationary, exhale and curl the weight forward while contracting the biceps. Continue to raise the weight until the biceps are fully contracted and the dumbbell is at shoulder level. Hold the contracted position for a brief moment as you squeeze the biceps. Tip: Focus on keeping the elbow stationary and only moving your forearm.<li>After the brief pause, inhale and slowly begin the lower the dumbbells back down to the starting position.<li>Repeat for the recommended amount of repetitions.</ol><h3>Variations:</h3>There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by alternating arms; first lift the right arm for one repetition, then the left, then the right, etc.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.dumbbell_biceps_curl_anim);
                        heading.setText("Dumbell Biceps Curl");
                        header.setText("Dumbell Biceps Curl");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3> <ol> <li>Stand up straight with a dumbbell in each hand at arm's length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position. <li>Now, keeping the upper arms stationary, exhale and curl the weights while contracting your biceps. Continue to raise the weights until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a brief pause as you squeeze your biceps. <li>Then, inhale and slowly begin to lower the dumbbells back to the starting position. Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by alternating arms; first lift the right arm for one repetition, then the left, then the right, etc. <br><br> You can also do the exercise starting with both palms of the hands facing the torso and then rotating forward as the movement is performed. At the top of the movement the palms should face forward and the small finger should be higher than the thumb for a peak contraction.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.biceps_curl_reverse_anim);
                        heading.setText("Biceps Curl Reverse");
                        header.setText("Biceps Curl Reverse");


                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3> <ol> <li>To begin, stand straight with a dumbbell in each hand using a pronated grip (palms facing down). Your arms should be fully extended while your feet are shoulder width apart from each other. This is the starting position. <li>While holding the upper arms stationary, curl the weights while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second as you squeeze the muscle. <li>Slowly begin to bring the dumbbells back to starting position as your breathe in. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can also perform this movement using a straight bar or an E-Z attachment hooked to a low pulley. This variation seems to really provide a good contraction at the top of the movement.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 9:
                        anim.setBackgroundResource(R.drawable.lying_biceps_cable_curl_anim);
                        heading.setText("Lying Biceps Cable Curl");
                        header.setText("Lying Biceps Cable Curl");


                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Grab a straight bar or E-Z bar attachment that is attached to the low pulley with both hands, using an underhand (palms facing up) shoulder-width grip. <li>Lie flat on your back on top of an exercise mat in front of the weight stack with your feet flat against the frame of the pulley machine and your legs straight. <li>With your arms extended and your elbows close to your body slightly bend your arms. This will be your starting position. <li>While keeping your upper arms stationary and the elbows close to your body, curl the bar up slowly toward your chest as you breathe out and you squeeze the biceps. <li>After a second squeeze at the top of the movement, slowly return to the starting position. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can also perform this exercise with exercise bands.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 10:
                        anim.setBackgroundResource(R.drawable.prone_incline_biceps_curl_anim);
                        heading.setText("Prone Incline Biceps Curl");
                        header.setText("Prone Incline Biceps Curl");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps</h3> <ol> <li>Lie against an incline bench, with your arms holding a barbell and hanging down in a horizontal line. This will be your starting position. <li>While keeping the upper arms stationary, curl the weight up as high as you can while squeezing the biceps. Breathe out as you perform this portion of the movement. Tip: Only the forearms should move. Do not swing the arms. <li>After a second contraction, slowly go back to the starting position as you inhale. Tip: Make sure that you go all of the way down. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can perform this exercise using an E-Z bar or dumbbells.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 11:
                        anim.setBackgroundResource(R.drawable.standing_biceps_curl_anim);
                        heading.setText("Standing Biceps Curl");
                        header.setText("Standing Biceps Curl");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps</h3> <ol> <li></li> </ol> <li>Stand up with your torso upright while holding a barbell at a shoulder-width grip. The palm of your hands should be facing forward and the elbows should be close to the torso. This will be your starting position. <li>While holding the upper arms stationary, curl the weights forward while contracting the biceps as you breathe out. Tip: Only the forearms should move. <li>Continue the movement until your biceps are fully contracted and the bar is at shoulder level. Hold the contracted position for a second and squeeze the biceps hard. <li>Slowly begin to bring the bar back to starting position as your breathe in. <li>Repeat for the recommended amount of repetitions. <h3>Variations:</h3> You can also perform this movement using a straight bar attachment hooked to a low pulley. This variation seems to really provide a good contraction at the top of the movement. <br><br> You may also use the closer grip for variety purposes.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;


                    default:
                        break;
                }

                break;

            case 3:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.barbell_front_raises_anim);
                        heading.setText("Barbell Front Raises");
                        header.setText("Barbell Front Raises");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Hold the dumbbells in front of your thighs, palms facing your thighs. <li>Keep your arms straight with a slight bend at the elbows but keep them locked. This will be your starting position. <li>Raise the dumbbells in a semicircular motion to arm's length overhead as you exhale. <li>Slowly return to the starting position using the same path as you inhale. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variation:</h3> You can perform this exercise with a barbell or by alternating dumbbells.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.barbell_shrugs_anim);
                        heading.setText("Barbell Shrugs");
                        header.setText("Barbell Shrugs");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Stand up straight with your feet at shoulder width as you hold a barbell with both hands in front of you using a pronated grip (palms facing the thighs). Tip: Your hands should be a little wider than shoulder width apart. You can use wrist wraps for this exercise for a better grip. This will be your starting position. <li>Raise your shoulders up as far as you can go as you breathe out and hold the contraction for a second. Tip: Refrain from trying to lift the barbell by using your biceps. <li>Slowly return to the starting position as you breathe in. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations: </h3> You can also rotate your shoulders as you go up, going in a semicircular motion from front to rear. However this version is not good for people with shoulder problems. In addition, this exercise can be performed with the barbell behind the back, with dumbbells by the side, a smith machine or with a shrug machine.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.barbell_upright_rows_anim);
                        heading.setText("Barbell Upright Rows");
                        header.setText("Barbell Upright Rows");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Grasp a barbell with an overhand grip that is slightly less than shoulder width. The bar should be resting on the top of your thighs with your arms extended and a slight bend in your elbows. Your back should also be straight. This will be your starting position. <li>Now exhale and use the sides of your shoulders to lift the bar, raising your elbows up and to the side. Keep the bar close to your body as you raise it. Continue to lift the bar until it nearly touches your chin. Tip: Your elbows should drive the motion, and should always be higher than your forearms. Remember to keep your torso stationary and pause for a second at the top of the movement. <li>Lower the bar back down slowly to the starting position. Inhale as you perform this portion of the movement. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> This exercise can also be performed using a straight bar attached to a low pulley and it can also be performed using dumbbells, though this later exercise should be reserved by people that are well familiarized with correct execution.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.dumbbell_front_raises_anim);
                        heading.setText("Dumbbell Front Raises");
                        header.setText("Dumbbell Front Raises");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Pick a couple of dumbbells and stand with a straight torso and the dumbbells on front of your thighs at arms length with the palms of the hand facing your thighs. This will be your starting position. <li>While maintaining the torso stationary (no swinging), lift the left dumbbell to the front with a slight bend on the elbow and the palms of the hands always facing down. Continue to go up until you arm is slightly above parallel to the floor. Exhale as you execute this portion of the movement and pause for a second at the top. Inhale after the second pause. <li>Now lower the dumbbell back down slowly to the starting position as you simultaneously lift the right dumbbell. <li>Continue alternating in this fashion until all of the recommended amount of repetitions have been performed for each arm. </ol> <h3>Variations:</h3> This exercise can also be performed both arms at the same time. Also, you could use a barbell as well.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.dumbbell_lateral_raise_anim);
                        heading.setText("Dumbbell Lateral Raises");
                        header.setText("Dumbbell Lateral Raises");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Pick a couple of dumbbells and stand with a straight torso and the dumbbells by your side at arms length with the palms of the hand facing you. This will be your starting position. <li>While maintaining the torso in a stationary position (no swinging), lift the dumbbells to your side with a slight bend on the elbow and the hands slightly tilted forward as if pouring water in a glass. Continue to go up until you arms are parallel to the floor. Exhale as you execute this movement and pause for a second at the top. <li>Lower the dumbbells back down slowly to the starting position as you inhale. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variation:</h3> This exercise can also be performed sitting down.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.lying_one_arm_rear_lateral_raise_anim);
                        heading.setText("Lying One Arm Rear Lateral Raises");
                        header.setText("Lying One Arm Rear Lateral Raises");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>While holding a dumbbell in each hand, lay with your chest down on a slightly inclined (around 15 degrees when measured from the floor) adjustable bench. <li>Position the palms of the hands in a neutral manner (palms facing your torso) as you keep the arms extended with the elbows slightly bent. This will be your starting position. <li>Now raise the arms to the side until your elbows are at shoulder height and your arms are roughly parallel to the floor as you exhale. Tip: Maintain your arms perpendicular to the torso while keeping them extended throughout the movement. Also, keep the contraction at the top for a second. <li>Slowly lower the dumbbells to the starting position as you inhale. <li>Repeat for the recommended amount of repetitions and then switch to the other arm. </ol> <h3Variations:></h3> You can perform this exercise with just one arm and also keeping the palms of the hands facing back as opposed to facing your torso.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.lying_rear_lateral_raise_anim);
                        heading.setText("Lying Rear Lateral Raise");
                        header.setText("Lying Rear Lateral Raise");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>While holding a dumbbell in each hand, lay with your chest down on a slightly inclined (around 15 degrees when measured from the floor) adjustable bench. <li>Position the palms of the hands in a neutral manner (palms facing your torso) as you keep the arms extended with the elbows slightly bent. This will be your starting position. <li>Now raise the arms to the side until your elbows are at shoulder height and your arms are roughly parallel to the floor as you exhale. Tip: Maintain your arms perpendicular to the torso while keeping them extended throughout the movement. Also, keep the contraction at the top for a second. <li>Slowly lower the dumbbells to the starting position as you inhale. <li>Repeat for the recommended amount of repetitions and then switch to the other arm. </ol> <h3>Variations:</h3> You can perform this exercise with just one arm and also keeping the palms of the hands facing back as opposed to facing your torso.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.one_arm_bench_press_anim);
                        heading.setText("One Arm Bench Press");
                        header.setText("One Arm Bench Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie down on a flat bench with a dumbbell in one hand on top of your thigh. <li>By using your thigh to help you get the dumbbell up, clean the dumbbell up so that you can hold it in front of you at shoulder width. Use the hand you are not lifting with to help position the dumbbell over you properly. <li>Once at shoulder width, rotate your wrist forward so that the palm of your hand is facing away from you. This will be your starting position. <li>Bring down the weights slowly to your side as you breathe in. Keep full control of the dumbbell at all times. Tip: Use the hand that you are not lifting with to help keep the dumbbell balance as you may struggle a bit at first. Only use your non-lifting hand if it is needed. Otherwise, keep it resting to the side. <li>As you breathe out, push the dumbbells up using your pectoral muscles. Lock your arms in the contracted position, squeeze your chest, hold for a second and then start coming down slowly. Tip: It should take at least twice as long to go down than to come up. <li>Repeat the movement for the prescribed amount of repetitions of your training program. <li>Switch arms and repeat the movement. </ol> <h3>Caution:</h3> When you are done, do not drop the dumbbell next to you as this is dangerous to your rotator cuff in your shoulders and others working out around you.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 9:
                        anim.setBackgroundResource(R.drawable.one_arm_shoulder_press_anim);
                        heading.setText("One Arm Shoulder Press");
                        header.setText("One Arm Shoulder Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Grab a dumbbell and either sit on a military press bench or a utility bench that has a back support on it as you place the dumbbells upright on top of your thighs or stand up straight. <li>Clean the dumbbell up to bring it to shoulder height. The other hand can be kept fully extended to the side, by the waist or grabbing a fixed surface. <li>Rotate the wrist so that the palm of your hand is facing forward. This is your starting position. <li>As you exhale, push the dumbbell up until your arm is fully extended. <li>After a second pause, slowly come down back to the starting position as you inhale. <li>Repeat for the recommended amount of repetitions and then switch arms. </ol> <h3>Variations:</h3> You can perform the exercise standing or sitting on a regular flat bench. For people with lower back problems, the version described is the recommended one.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    default:
                        break;
                }

                break;

            case 4:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.barbell_full_squat_anim);
                        heading.setText("Barbell Full Squat ");
                        header.setText("Barbell Full Squat ");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>This exercise is best performed inside a squat rack for safety purposes. To begin, first set the bar on a rack just above shoulder level. Once the correct height is chosen and the bar is loaded, step under the bar and place the back of your shoulders (slightly below the neck) across it <li>Hold on to the bar using both arms at each side and lift it off the rack by first pushing with your legs and at the same time straightening your torso. <li>Step away from the rack and position your legs using a shoulder-width medium stance with the toes slightly pointed out. Keep your head up at all times and maintain a straight back. This will be your starting position. <li>Begin to slowly lower the bar by bending the knees and sitting back with your hips as you maintain a straight posture with the head up. <li>Continue down until your hamstrings are on your calves. Inhale as you perform this portion of the movement. <li>Begin to raise the bar as you exhale by pushing the floor with the heel or middle of your foot as you straighten the legs and extend the hips to go back to the starting position. <li>Repeat for the recommended amount of repetitions. </ol> This type of squat allows a greater range of motion, and allows the trunk to maintain a more vertical position than other types of squats, due to foot position and the higher bar position.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.barbell_walking_lunge_anim);
                        heading.setText("Barbell Walking Lunge ");
                        header.setText("Barbell Walking Lunge ");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Begin standing with your feet shoulder width apart and a barbell across your upper back. <li>Step forward with one leg, flexing the knees to drop your hips. Descend until your rear knee nearly touches the ground. Your posture should remain upright, and your front knee should stay above the front foot. <li>Drive through the heel of your lead foot and extend both knees to raise yourself back up. <li>Step forward with your rear foot, repeating the lunge on the opposite leg. </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.bodyweight_walking_lunge_anim);
                        heading.setText("Bodyweight Walking Lunge");
                        header.setText("Bodyweight Walking Lunge");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Begin standing with your feet shoulder width apart and your hands on your hips. <li>Step forward with one leg, flexing the knees to drop your hips. Descend until your rear knee nearly touches the ground. Your posture should remain upright, and your front knee should stay above the front foot. <li>Drive through the heel of your lead foot and extend both knees to raise yourself back up. <li>Step forward with your rear foot, repeating the lunge on the opposite leg. </ol>";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");


                        runAnimation();
                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.dumbbell_squat_anim);
                        heading.setText("Dumbbell Squat ");
                        header.setText("Dumbbell Squat ");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Stand up straight while holding a dumbbell on each hand (palms facing the side of your legs). <li>Position your legs using a shoulder width medium stance with the toes slightly pointed out. Keep your head up at all times as looking down will get you off balance and also maintain a straight back. This will be your starting position. Note: For the purposes of this discussion we will use the medium stance described above which targets overall development; however you can choose any of the three stances discussed in the foot stances section. <li>Begin to slowly lower your torso by bending the knees as you maintain a straight posture with the head up. Continue down until you touch almost the floor. Inhale as you perform this portion of the movement. Tip: If you performed the exercise correctly, the front of the knees should make an imaginary straight line with the toes that is perpendicular to the front. If your knees are past that imaginary line (if they are past your toes) then you are placing undue stress on the knee and the exercise has been performed incorrectly. <li>Begin to raise the bar as you exhale by pushing the floor with the heel of your foot mainly as you straighten the legs again and go back to the starting position. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Caution:</h3> Be cautious with the weight used; in case of doubt, use less weight rather than more. The squat is a very safe exercise but only if performed properly. You may use wrist wraps for this exercise. <h3>Variations: </h3> As previously mentioned, there are various stances that can be used depending on what you want to emphasize.<br> You can also place a small block under the heels to improve balance.<br> You can also use a barbell for this exercise. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.cable_deadlift_anim);
                        heading.setText("Cable Deadlifts");
                        header.setText("Cable Deadlifts");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Move the cables to the bottom of the towers and select an appropriate weight. Stand directly in between the uprights. <li>To begin, squat down be flexing your hips and knees until you can reach the handles. <li>After grasping them, begin your ascent. Driving through your heels extend your hips and knees keeping your hands hanging at your side. Keep your head and chest up throughout the movement. <li>After reaching a full standing position, Return to the starting position and repeat. </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.barbell_squat_anim);
                        heading.setText("Barbell Squat");
                        header.setText("Barbell Squat");

                        htmlText = "<style>html {color: #FFFFFF; }</style><h3>Steps:</h3><ol><li>This exercise is best performed inside a squat rack for safety purposes. To begin, first set the bar on a rack to just below shoulder level. <li>Once the correct height is chosen and the bar is loaded, step under the bar and place the back of your shoulders (slightly below the neck) across it.<li>Hold on to the bar using both arms at each side and lift it off the rack by first pushing with your legs and at the same time straightening your torso.<li>Step away from the rack and position your legs using a shoulder width medium stance with the toes slightly pointed out. Keep your head up at all times and also maintain a straight back. This will be your starting position. (Note: For the purposes of this discussion we will use the medium stance described above which targets overall development; however you can choose any of the three stances discussed in the foot stances section).<li>Begin to slowly lower the bar by bending the knees and hips as you maintain a straight posture with the head up. Continue down until the angle between the upper leg and the calves becomes slightly less than 90-degrees. Inhale as you perform this portion of the movement. Tip: If you performed the exercise correctly, the front of the knees should make an imaginary straight line with the toes that is perpendicular to the front. If your knees are past that imaginary line (if they are past your toes) then you are placing undue stress on the knee and the exercise has been performed incorrectly.<li>Begin to raise the bar as you exhale by pushing the floor with the heel of your foot as you straighten the legs again and go back to the starting position.<li>Repeat for the recommended amount of repetitions.</ol><h3>Caution: </h3>This is not an exercise to be taken lightly. If you have back issues, substitute it with the dumbbell squat variation or a leg press instead. If you have a healthy back, ensure perfect form and never slouch the back forward as this can cause back injury. Be cautious as well with the weight used; in case of doubt, use less weight rather than more. The squat is a very safe exercise but only if performed properly.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.leg_press_anim);
                        heading.setText("Leg Press");
                        header.setText("Leg Press");

                        htmlText = "<style>html {color: #FFFFFF; }</style><h3>Steps:</h3><ol>\t<li>Using a leg press machine, sit down on the machine and place your legs on the platform directly in front of you at a medium (shoulder width) foot stance. (Note: For the purposes of this discussion we will use the medium stance described above which targets overall development; however you can choose any of the three stances described in the foot positioning section).    <li>Lower the safety bars holding the weighted platform in place and press the platform all the way up until your legs are fully extended in front of you. Tip: Make sure that you do not lock your knees. Your torso and the legs should make a perfect 90-degree angle. This will be your starting position.    <li>As you inhale, slowly lower the platform until your upper and lower legs make a 90-degree angle.    <li>Pushing mainly with the heels of your feet and using the quadriceps go back to the starting position as you exhale.    <li>Repeat for the recommended amount of repetitions and ensure to lock the safety pins properly once you are done. You do not want <li>that platform falling on you fully loaded.</li></ol><h3>Caution:</h3> Always check to make sure that when you re-rack the weight the platform is securely locked.<h3>Variations:</h3> All foot stance variations described in the foot stance section.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.leg_lift_anim);
                        heading.setText("Leg Lift");
                        header.setText("Leg Lift");

                        htmlText = "<style>html {color: #FFFFFF; }</style><h3>Steps:</h3><ol><li>While standing up straight with both feet next to each other at around shoulder width, grab a sturdy surface such as the sides of a squat rack or the top of a chair to brace yourself and keep balance.    <li>With or without an ankle weight, lift one leg behind you as if performing a leg curl but standing up while keeping the other leg straight. Breathe out as you perform this movement.    <li>Slowly bring the raised leg back to the floor as you breathe in.    <li>Repeat for the recommended amount of repetitions.    <li>Repeat the movement with the opposite leg.</ol>    <h3>Variations:</h3> You can perform the same movement with a low pulley attached to your ankle using an ankle attachment. Optionally, you can use exercise cables as well.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 9:
                        anim.setBackgroundResource(R.drawable.leg_raise_anim);
                        heading.setText("Leg Raise");
                        header.setText("Leg Raise");

                        htmlText = "<style>html {color: #FFFFFF; }</style><h3>Steps</h3><ol>\t<li>Lie with your back flat on a bench and your legs extended in front of you off the end.    <li>Place your hands either under your glutes with your palms down or by the sides holding on to the bench. This will be your starting position.    <li>As you keep your legs extended, straight as possible with your knees slightly bent but locked raise your legs until they make a 90-degree angle with the floor. Exhale as you perform this portion of the movement and hold the contraction at the top for a second.    <li>Now, as you inhale, slowly lower your legs back down to the starting position.</ol>   <h3>Variations:</h3> You can also perform this exercise on the floor on top of an exercise mat. You can also add weight by holding a dumbbell in between your feet as you get more advanced.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    default:
                        break;
                }

                break;

            case 5:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.bench_dip_anim);
                        heading.setText("Bench Dips");
                      //  header.setText("Bench Dips");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>For this exercise you will need to place a bench behind your back. With the bench perpendicular to your body, and while looking away from it, hold on to the bench on its edge with the hands fully extended, separated at shoulder width. The legs will be extended forward, bent at the waist and perpendicular to your torso. This will be your starting position. <li>Slowly lower your body as you inhale by bending at the elbows until you lower yourself far enough to where there is an angle slightly smaller than 90 degrees between the upper arm and the forearm. Tip: Keep the elbows as close as possible throughout the movement. Forearms should always be pointing down. <li>Using your triceps to bring your torso up again, lift yourself back to the starting position. Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can place your legs on top of another flat bench in front of you in order to make the exercise more challenging. If that variation also becomes easy, then you can have a partner place plates on top of your lap. Make sure that in this case the partner ensures that the weights stay there throughout the movement.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.close_grip_barbell_bench_press_anim);
                        heading.setText("Close-Grip Barbell Bench Press");
                     //   header.setText("Close-Grip Barbell Bench Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie back on a flat bench. Using a close grip (around shoulder width), lift the bar from the rack and hold it straight over you with your arms locked. This will be your starting position. <li>As you breathe in, come down slowly until you feel the bar on your middle chest. Tip:Make sure that - as opposed to a regular bench press - you keep the elbows close to the torso at all times in order to maximize triceps involvement. <li>After a second pause, bring the bar back to the starting position as you breathe out and push the bar using your triceps muscles. Lock your arms in the contracted position, hold for a second and then start coming down slowly again. Tip: It should take at least twice as long to go down than to come up. <li>Repeat the movement for the prescribed amount of repetitions. <li>When you are done, place the bar back in the rack. </ol> <h3>Caution:</h3> If you are new at this exercise, it is advised that you use a spotter. If no spotter is available, then be conservative with the amount of weight used. Also, beware of letting the bar drift too far forward. You want the bar to fall on your middle chest and nowhere else. <h3>Variations:</h3> This exercise can also be performed with an e-z bar using the inner handle as well as dumbbells, in which case the palms of the hands will be facing each other.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.low_cable_triceps_extension_anim);
                        heading.setText("Low Cable Triceps Extension");
                      //  header.setText("Low Cable Triceps Extension");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Select the desired weight and lay down face up on the bench of a seated row machine that has a rope attached to it. Your head should be pointing towards the attachment. <li>Grab the outside of the rope ends with your palms facing each other (neutral grip). <li>Position your elbows so that they are bent at a 90 degree angle and your upper arms are perpendicular (90 degree angle) to your torso. Tip: Keep the elbows in and make sure that the upper arms point to the ceiling while your forearms point towards the pulley above your head. This will be your starting position. <li>As you breathe out, extend your lower arms until they are straight and vertical. The upper arms and elbows remain stationary throughout the movement. Only the forearms should move. Contract the triceps hard for a second. <li>As you breathe in slowly return to the starting position. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can perform the same movement using a flat bench and exercise bands or a low pulley that is set at the same level as your head is.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.dumbbell_incline_triceps_anim);
                        heading.setText("Dumbbell Incline Triceps");
                     //   header.setText("Dumbbell Incline Triceps");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Your upper arms should create around a 25 degree angle when measured from the floor. <li>Keeping the upper arms stationary, extend the arms as you flex the triceps. Breathe out during this portion of the movement and hold the contraction for a second. <li>Slowly go back to the starting position. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can also use an angled attachment or a rope attachment as well. Finally, you can perform one arm at a time by using a single handle attachment.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.lying_close_grip_barbell_triceps_press_anim);
                        heading.setText("Lying Close-Grip Barbell Triceps Press");
                     //   header.setText("Lying Close-Grip Barbell Triceps Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>While holding a barbell or EZ Curl bar with a pronated grip (palms facing forward), lie on your back on a flat bench with your head off the end of the bench. Tip: If you are holding a barbell grab it using a shoulder-width grip and if you are using an E-Z Bar grab it on the inner handles. <li>Extend your arms in front of you as you hold the barbell over your chest. The arms should be perpendicular to your torso (90-degree angle). This will be your starting position. <li>As you inhale, lower the bar in a semi-circular motion by bending at the elbows and while keeping the upper arm stationary and elbows in. Keep lowering the bar until it lightly touches your chin. <li>As you exhale bring the bar back up to the starting position by pushing the bar up in a semi-circular motion. Contract the triceps hard at the top of the movement for a second.Tip: Again, only the forearms should move. The upper arms should remain stationary at all times. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variation:</h3> You can use dumbbells to make the exercise more challenging.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.close_grip_ez_bar_press_anim);
                        heading.setText("Close-Grip EZ-Bar Press");
                      //  header.setText("Close-Grip EZ-Bar Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie on a flat bench with an EZ bar loaded to an appropriate weight. <li>Using a narrow grip lift the bar and hold it straight over your torso with your elbows in. The arms should be perpendicular to the floor. This will be your starting position. <li>Now lower the bar down to your lower chest as you breathe in. Keep the elbows in as you perform this movement. <li>Using the triceps to push the bar back up, press it back to the starting position by extending the elbows as you exhale. <li>Repeat the above steps rhythemically </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.dumbbell_one_arm_triceps_anim);
                        heading.setText("Dumbbell One-Arm Triceps");
                    //    header.setText("Dumbbell One-Arm Triceps");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Grab a dumbbell and either sit on a military press bench or a utility bench that has a back support on it as you place the dumbbells upright on top of your thighs or stand up straight. <li>Clean the dumbbell up to bring it to shoulder height and then extend the arm over your head so that the whole arm is perpendicular to the floor and next to your head. The dumbbell should be on top of you. The other hand can be kept fully extended to the side, by the waist, supporting the upper arm that has the dumbbell or grabbing a fixed surface. <li>Rotate the wrist so that the palm of your hand is facing forward and the pinkie is facing the ceiling. This will be your starting position. <li>Slowly lower the dumbbell behind your head as you hold the upper arm stationary. Inhale as you perform this movement and pause when your triceps are fully stretched. <li>Return to the starting position by flexing your triceps as you breathe out. Tip: It is imperative that only the forearm moves. The upper arm should remain at all times stationary next to your head. <li>Repeat for the recommended amount of repetitions and switch arms. </ol> <h3>Variations:</h3> You can also do this using a rope instead of a dumbbell. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.bent_over_one_arm_dumbbell_triceps_anim);
                        heading.setText("Bent-Over One-Arm Dumbbell Triceps");
                      //  header.setText("Bent-Over One-Arm Dumbbell Triceps");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Sit down at the end of a flat bench with a dumbbell in one arm using a neutral grip (palms of the hand facing you). <li>Bend your knees slightly and bring your torso forward, by bending at the waist, while keeping the back straight until it is almost parallel to the floor. Make sure that you keep the head up. <li>The upper arm with the dumbbell should be close to the torso and aligned with it (lifted up until it is parallel to the floor while the forearms are pointing towards the floor as the hands hold the weights). Tip: There should be a 90-degree angle between the forearms and the upper arm. This is your starting position. <li>Keeping the upper arm stationary, use the triceps to lift the weight as you exhale until the forearm is parallel to the floor and the whole arm is extended. Like many other arm exercises, only the forearm moves. <li>After a second contraction at the top, slowly lower the dumbbell back to the starting position as you inhale. <li>Repeat the movement for the prescribed amount of repetitions. <li>Switch arms and repeat the exercise. </ol> <h3>Variations:</h3> This exercise can be executed also with two arms at a time.<br> Also, if you like the one arm variety, you can use a low pulley handle instead of a dumbbell for better peak contraction. In this case, the palms should be facing up (supinated grip) as opposed to the torso (neutral grip). You can also use a rope attachment however, and in this manner, you can also perform the movement with a neutral grip. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 9:
                        anim.setBackgroundResource(R.drawable.triceps_dumbbell_press_anim);
                        heading.setText("Triceps Dumbbell Press");
                      //  header.setText("Triceps Dumbbell Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Sit down on a bench with back support and grasp a dumbbell with both hands and hold it overhead at arm's length. Tip: a better way is to have somebody hand it to you especially if it is very heavy. The resistance should be resting in the palms of your hands with your thumbs around it. The palm of the hand should be facing inward. This will be your starting position. <li>Keeping your upper arms close to your head (elbows in) and perpendicular to the floor, lower the resistance in a semi-circular motion behind your head until your forearms touch your biceps. Tip: The upper arms should remain stationary and only the forearms should move. Breathe in as you perform this step. <li>Go back to the starting position by using the triceps to raise the dumbbell. Breathe out as you perform this step. Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can perform this exercise standing as well but this puts strain on your back especially if you are using heavy dumbbells like 95 lbs or so.<br> Another variation is to use an EZ or straight bar instead in which case you will be holding the bar from the inside (around 5 inches between both hands) with the palms facing forward (pronated grip).<br> There is also a bar that has parallel bars inside (often referred to as a triceps blaster) and this can also be used for this exercise.<br> Finally, a low pulley cable with a rope attachment or bar (straight or EZ) attachment at the end can be used for variety purposes as well. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 10:
                        anim.setBackgroundResource(R.drawable.tate_press_anim);
                        heading.setText("Tate Press");
                     //   header.setText("Tate Press");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li></li> </ol> <li>Lie down on a flat bench with a dumbbell in each hand on top of your thighs. The palms of your hand will be facing each other. <li>By using your thighs to help you get the dumbbells up, clean the dumbbells one arm at a time so that you can hold them in front of you at shoulder width. Note: when holding the dumbbells in front of you, make sure your arms are wider than shoulder width apart from each other using a pronated (palms forward) grip. Allow your elbows to point out. This is your starting position. <li>Keeping the upper arms stationary, slowly move the dumbbells in and down in a semi circular motion until they touch the upper chest while inhaling. Keep full control of the dumbbells at all times and do not move the upper arms nor rest the dumbbells on the chest. <li>As you breathe out, move the dumbbells up using your triceps and the same semi-circular motion but in reverse. Attempt to keep the dumbbells together as they move up. Lock your arms in the contracted position, hold for a second and then start coming down again slowly again. Tip: It should take at least twice as long to go down than to come up. <li>Repeat the movement for the prescribed amount of repetitions of your training program. <h3>Caution:</h3> When you are done, do not drop the dumbbells next to you as this is dangerous to your rotator cuff in your shoulders and others working out around you. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 11:
                        anim.setBackgroundResource(R.drawable.triceps_dips_anim);
                        heading.setText("Dips - Triceps");
                      //  header.setText("Dips - Triceps");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>To get into the starting position, hold your body at arm's length with your arms nearly locked above the bars. <li>Now, inhale and slowly lower yourself downward. Your torso should remain upright and your elbows should stay close to your body. This helps to better focus on tricep involvement. Lower yourself until there is a 90 degree angle formed between the upper arm and forearm. <li>Then, exhale and push your torso back up using your triceps to bring your body back to the starting position. <li>Repeat the movement for the prescribed amount of repetitions. </ol> <h3>Variations:</h3> If you are new at this exercise and do not have the strength to perform it, use a dip assist machine if available. These machines use weight to help you push your bodyweight.<br> Otherwise, a spotter holding your legs can help.<br> More advanced lifters can add weight to the exercise by using a weight belt that allows the addition of weighted plates. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 12:
                        anim.setBackgroundResource(R.drawable.kneeling_concentration_triceps_extension_anim);
                        heading.setText("Kneeling Concentration Triceps Extension");
                      //  header.setText("Kneeling Concentration Triceps Extension");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Attach a stirrup handle to a cable pulley and adjust the pulley up high. <li>Kneeling on your left knee (with the left side of your body turned towards the machine), keep your right bent and the upper portion of your thigh parallel to the floor. <li>With your right elbow and upper arm pressed against your inner thigh just above your knee, pull the cable down towards the floor in a slight arcing motion. <li>Slowly to return to starting position. <li>Repeat and switch arms. </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    default:
                        break;
                }

                break;

            case 6:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.wide_row_anim);
                        heading.setText("Wide Row");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <p>The wide row is an effective exercise for developing the lats, and is performed by bending at the waist and performing a row. The lats are some of the largest muscles in the back and cover pretty much the whole lower and mid back area and are responsible for generating the power when you pull things towards you</p> <h3>Steps:</h3> <ol> <li>Grab one dumbbell with each hand and flex your knees and hips to bring yourself to a squatting position. <li>Lift both dumbbells straight up without altering the angles at your knees and hips and lower them back after a short pause. <li>Breathe out when lifting the dumbbells and breathe in when returning to starting position. </ol> <h3>Caution: </h3> This exercise is not recommended for people with back problems. A Low Pulley Row is a better choice for people with back issues. Ensure perfect form and never round the back as this can promote back injury. <br>Be cautious with the weight used; in case of doubt, use less weight rather than more. <h3>Variations:</h3> You can perform the same exercise using a low pulley instead with a v-bar or with a barbell. This exercise can also be performed with supinated or neutral grips.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        header.setText("Wide Row");

                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.kneeling_one_arm_row_anim);
                        heading.setText("Kneeling One Arm Row");
                        header.setText("Kneeling One Arm Row");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <p>The one-arm dumbbell row, when performed correctly, is one of the most versatile upper body exercises in your arsenal. The movement involves scapular retraction and depression, along with spinal extension and compression through the thoracolumbar region, and also acts as a core stabilization exercise through anti-rotation and anti-flexion.</p> <h3>Steps:</h3> <ol> <li>Put your knee and hand on a bench and grab a dumbbell with your other hand. <li>Lift the dumbbell straight up without moving anything else than your arm and lower it back down after a short pause. <li>Put your knee and hand on a bench and grab a dumbbell with your other hand. </ol> <h3>Variations: </h3> One-arm rows can also be performed using a high pulley or a low pulley instead of a dumbbell.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.back_fly_anim);
                        heading.setText("Back Fly");
                        header.setText("Back Fly");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps: </h3> <ol> <li>Lie down on your chest on the bench and grab two dumbbells with your hands, elbows at 90 degree angles. <li>Raise the dumbbells until your arms are parallel to the ground and lower them back after a short pause. <li>Breathe out when pulling the dumbbells and breathe in when lowering them back. </ol> <h3>Variations: </h3> You can perform this exercise on a rear delt machine as well or using a pulley machine.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.dead_lift_anim);
                        heading.setText("Dead Lift");
                        header.setText("Dead Lift");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <p>Dead lift refers to the lifting of dead (without momentum) weight, such as weights lying on the ground. It is one of the few standard weight training exercises in which all repetitions begin with dead weight. There are two positions one can approach when doing the deadlift, which include the conventional deadlift and sumo-deadlift. In most other lifts there is an eccentric (lowering of the weight) phase followed by the concentric (lifting of the weight) phase. During these exercises, a small amount of energy is stored in the stretched muscles and tendons in the eccentric phase, if the lifter is not flexible beyond the range of motion.</p> <h3>Steps:</h3> <ol> <li>Stand up and grab a dumbbell with each of your hands. <li>Flex your knees and hips in order to lower the dumbbells straight down and raise yourself back up after a short pause. <li>Breathe in when lowering and breathe out when returning to starting position. </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.stiffed_legged_dead_lift_anim);
                        heading.setText("Stiff Legged Dead Lift");
                        header.setText("Stiff Legged Dead Lift");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <p>Stiff Legged Deadlift refers to the lifting of dead (without momentum) weight, such as weights lying on the ground. It is one of the few standard weight training exercises in which all repetitions begin with dead weight. There are two positions one can approach when doing the deadlift, which include the conventional deadlift and sumo-deadlift. In most other lifts there is an eccentric (lowering of the weight) phase followed by the concentric (lifting of the weight) phase. During these exercises, a small amount of energy is stored in the stretched muscles and tendons in the eccentric phase, if the lifter is not flexible beyond the range of motion.</p> <h3>Steps:</h3> <ol> <li>Stand up and hold one dumbbell in each hand against the sides of your body, palms facing each other. <li>Lower the dumbbells by bending your hips forward and raise yourself back up again after a short pause. <li>Keep your back straight throughout. </ol> <h3>Caution: </h3> This is not an exercise that is recommended for people with lower back problems. Also, it needs to be treated with the utmost respect paying special attention not to round the back forward as you move the torso down; the back should always be straight. <br>Finally, jerking motions or doing too much weight can injure your back. <h3>Variations: </h3> This can be performed with dumbbells, weights and barbells ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.crossover_row_anim);
                        heading.setText("Cross-Over Row");
                        header.setText("Cross-Over Row");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Get a platform of some sort (it can be an aerobics or calf raise platform) that is around 4-6 inches in height. <li>Place it on the seat of the cable row machine. <li>Sit down on the machine and place your feet on the front platform or crossbar provided making sure that your knees are slightly bent and not locked. <li>Lean over as you keep the natural alignment of your back and grab the V-bar handles. <li>With your arms extended pull back until your torso is at a 90-degree angle from your legs. Your back should be slightly arched and your chest should be sticking out. You should be feeling a nice stretch on your lats as you hold the bar in front of you. This is the starting position of the exercise. <li>Keeping the torso stationary, pull the handles back towards your torso while keeping the arms close to it until you touch the abdominals. Breathe out as you perform that movement. At that point you should be squeezing your back muscles hard. Hold that contraction for a second and slowly go back to the original position while breathing in. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Caution: </h3> Avoid swinging your torso back and forth as you can cause lower back injury by doing so. <h3>Variations: </h3> You can use a straight bar instead of a V-Bar and perform with a pronated grip (palms facing down-forward) or a supinated grip (palms facing up-reverse grip). ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.hyper_extension_anim);
                        heading.setText("Hyper-Extension");
                        header.setText("Hyper-Extension");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie face down on a hyperextension bench, tucking your ankles securely under the footpads. <li>Adjust the upper pad if possible so your upper thighs lie flat across the wide pad, leaving enough room for you to bend at the waist without any restriction. <li>With your body straight, cross your arms in front of you (my preference) or behind your head. This will be your starting position. Tip: You can also hold a weight plate for extra resistance in front of you under your crossed arms. <li>Start bending forward slowly at the waist as far as you can while keeping your back flat. Inhale as you perform this movement. Keep moving forward until you feel a nice stretch on the hamstrings and you can no longer keep going without a rounding of the back. Tip: Never round the back as you perform this exercise. Also, some people can go farther than others. The key thing is that you go as far as your body allows you to without rounding the back. <li>Slowly raise your torso back to the initial position as you inhale. Tip: Avoid the temptation to arch your back past a straight line. Also, do not swing the torso at any time in order to protect the back from injury. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations: </h3> This exercise can also be performed without a hyperextension bench, but in this case you will need a spotter. Also, a similar exercise to this one is the good morning and the stiff-legged deadlift. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.kneeling_row_anim);
                        heading.setText("Kneeling Row");
                        header.setText("Kneeling Row");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Choose a flat bench and place a dumbbell on each side of it. <li>Place the right leg on top of the end of the bench, bend your torso forward from the waist until your upper body is parallel to the floor, and place your right hand on the other end of the bench for support. <li>Use the left hand to pick up the dumbbell on the floor and hold the weight while keeping your lower back straight. The palm of the hand should be facing your torso. This will be your starting position. <li>Pull the resistance straight up to the side of your chest, keeping your upper arm close to your side and keeping the torso stationary. Breathe out as you perform this step. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. Also, make sure that the force is performed with the back muscles and not the arms. Finally, the upper torso should remain stationary and only the arms should move. The forearms should do no other work except for holding the dumbbell; therefore do not try to pull the dumbbell up using the forearms. <li>Lower the resistance straight down to the starting position. Breathe in as you perform this step. <li>Repeat the movement for the specified amount of repetitions. <li>Switch sides and repeat again with the other arm. </ol> <h3>Variations: </h3> One-arm rows can also be performed using a high pulley or a low pulley instead of a dumbbell. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 9:
                        anim.setBackgroundResource(R.drawable.lateral_pulldown_anim);
                        heading.setText("Lateral Pulldown");
                        header.setText("Lateral Pulldown");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Sit down on a pull-down machine with a wide bar attached to the top pulley. Make sure that you adjust the knee pad of the machine to fit your height. These pads will prevent your body from being raised by the resistance attached to the bar. <li>Grab the bar with the palms facing forward using the prescribed grip. Note on grips: For a wide grip, your hands need to be spaced out at a distance wider than shoulder width. For a medium grip, your hands need to be spaced out at a distance equal to your shoulder width and for a close grip at a distance smaller than your shoulder width. <li>As you have both arms extended in front of you holding the bar at the chosen grip width, bring your torso back around 30 degrees or so while creating a curvature on your lower back and sticking your chest out. This is your starting position. <li>As you breathe out, bring the bar down until it touches your upper chest by drawing the shoulders and the upper arms down and back. Tip: Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary and only the arms should move. The forearms should do no other work except for holding the bar; therefore do not try to pull down the bar using the forearms. <li>After a second at the contracted position squeezing your shoulder blades together, slowly raise the bar back to the starting position when your arms are fully extended and the lats are fully stretched. Inhale during this portion of the movement. <li>Repeat this motion for the prescribed amount of repetitions. </ol> <h3>Variations: </h3> The behind the neck variation is not recommended as it can be hard on the rotator cuff due to the hyperextension created by bringing the bar behind the neck. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 10:
                        anim.setBackgroundResource(R.drawable.pulldown_with_squat_anim);
                        heading.setText("Pulldown with Squat");
                        header.setText("Pulldown with Squat");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie on your back on the glideboard, feet on the squat stand with your knees bent and hold the handles with your hands above your head, elbows slightly bent. <li>Slide the glideboard up by pulling on the handles towards your abdomen while extending your legs and allow yourself back down after a short pause. <li>Keep the small bend in your elbows constant throughout. </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();

                        break;

                    case 11:
                        anim.setBackgroundResource(R.drawable.rotating_back_fly_anim);
                        heading.setText("Rotating Back Fly");
                        header.setText("Rotating Back Fly");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Sit on the top edge of the glideboard and hold the handles with your hands, arms extended out in front of you. <li>Slide the glideboard up by pulling on one handle towards its side of your body and allow yourself back down after a short pause.<li>Alternate sides between repetitions. <li>Keep your arms fully extended throughout (or keep the small bend in your elbows constant). </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    default:
                        break;
                }

                break;

            case 7:

                switch (listVariable) {

                    case 1:
                        anim.setBackgroundResource(R.drawable.cross_body_crunches_anim);
                        heading.setText("Cross body Crunches");
                        header.setText("Cross body Crunches");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie flat on your back and bend your knees about 60 degrees. <li>Keep your feet flat on the floor and place your hands loosely behind your head. This will be your starting position. <li>Now curl up and bring your right elbow and shoulder across your body while bring your left knee in toward your left shoulder at the same time. Reach with your elbow and try to touch your knee. Exhale as you perform this movement. Tip: Try to bring your shoulder up towards your knee rather than just your elbow and remember that the key is to contract the abs as you perform the movement; not just to move the elbow. <li>Now go back down to the starting position as you inhale and repeat with the left elbow and the right knee. <li>Continue alternating in this manner until all prescribed repetitions are done. </ol> <h3>Variations:</h3> You can also do all of your repetitions for one side and then switch to the other side.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 2:
                        anim.setBackgroundResource(R.drawable.crunches_anim);
                        heading.setText("Crunches");
                        header.setText("Crunches");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie flat on your back with your feet flat on the ground, or resting on a bench with your knees bent at a 90 degree angle. If you are resting your feet on a bench, place them three to four inches apart and point your toes inward so they touch. <li>Now place your hands lightly on either side of your head keeping your elbows in. Tip: Don't lock your fingers behind your head. <li>While pushing the small of your back down in the floor to better isolate your abdominal muscles, begin to roll your shoulders off the floor. <li>Continue to push down as hard as you can with your lower back as you contract your abdominals and exhale. Your shoulders should come up off the floor only about four inches, and your lower back should remain on the floor. At the top of the movement, contract your abdominals hard and keep the contraction for a second. Tip: Focus on slow, controlled movement - don't cheat yourself by using momentum. <li>After the one second contraction, begin to come down slowly again to the starting position as you inhale. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> There are many variations for the crunch. You can perform the exercise with weights, or on top of an exercise ball or on a decline bench. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 3:
                        anim.setBackgroundResource(R.drawable.crunches_legs_on_ball_anim);
                        heading.setText("Crunches - Legs on Ball");
                        header.setText("Crunches - Legs on Ball");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie flat on your back with your feet resting on an exercise ball and your knees bent at a 90 degree angle. <li>Place your feet three to four inches apart and point your toes inward so they touch. <li>Place your hands lightly on either side of your head keeping your elbows in. Tip: Don't lock your fingers behind your head. <li>Push the small of your back down in the floor in order to better isolate your abdominal muscles. This will be your starting position. <li>Begin to roll your shoulders off the floor and continue to push down as hard as you can with your lower back. Your shoulders should come up off the floor only about four inches, and your lower back should remain on the floor. Breathe out as you execute this portion of the movement. Squeeze your abdominals hard at the top of the contraction and hold for a second. Tip: Focus on a slow, controlled movement. Refrain from using momentum at any time. <li>Slowly go back down to the starting position as you inhale. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> For the most advanced lifters, a weighted plate can be held in your hands.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 4:
                        anim.setBackgroundResource(R.drawable.decline_cruch_anim);
                        heading.setText("Decline Crunch");
                        header.setText("Decline Crunch");

                        htmlText = "<style>	html {		color: #FFFFFF;	}</style><h3>Steps:</h3><ol>	<li>Secure your legs at the end of the decline bench and lie down.	<li>Now place your hands lightly on either side of your head keeping your elbows in. Tip: Don't lock your fingers behind your head.	<li>While pushing the small of your back down in the bench to better isolate your abdominal muscles, begin to roll your shoulders off it.	Continue to push down as hard as you can with your lower back as you contract your abdominals and exhale. Your shoulders should come up <li>off the bench only about four inches, and your lower back should remain on the bench. At the top of the movement, contract your abdominals hard and keep the contraction for a second. Tip: Focus on slow, controlled movement - don't cheat yourself by using momentum.	<li>After the one second contraction, begin to come down slowly again to the starting position as you inhale.	<li>Repeat for the recommended amount of repetitions.</ol><h3>Variations:</h3>There are many variations for the crunch. You can perform the exercise with weights, or on top of an exercise ball or on a flat bench.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 5:
                        anim.setBackgroundResource(R.drawable.abdominal_crunches_on_ball_anim);
                        heading.setText("Ball Abdominal Crunch");
                        header.setText("Ball Abdominal Crunch");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie on an exercise ball with your lower back curvature pressed against the spherical surface of the ball. Your feet should be bent at the knee and pressed firmly against the floor. The upper torso should be hanging off the top of the ball. The arms should either be kept alongside the body or crossed on top of your chest as these positions avoid neck strains (as opposed to the hands behind the back of the head position). <li>Lower your torso into a stretch position keeping the neck stationary at all times. This will be your starting position. <li>With the hips stationary, flex the waist by contracting the abdominals and curl the shoulders and trunk upward until you feel a nice contraction on your abdominals. The arms should simply slide up the side of your legs if you have them at the side or just stay on top of your chest if you have them crossed. The lower back should always stay in contact with the ball. Exhale as you perform this movement and hold the contraction for a second. <li>As you inhale, go back to the starting position. <li>Repeat for the recommended amount of repetitions. </ol> <h3>Variations:</h3> You can perform this exercise with a low pulley behind you with a rope attached on its end. In this manner you can go ahead and add resistance easier. For this variation, you will need to hold on to the sides of the rope throughout the movement. I like to bring my arms forward to the point that the upper arms are almost parallel to my torso and the lower arms are facing back holding the rope. <h3>Caution:</h3> Perform this exercise slowly and deliberately as it takes some getting used to. Also, do not be hasty and try to use weights on the first time; you'll have enough on your hands learning how to balance yourself. Also, if balance is an issue I recommend having a spotter next to you and also placing each of your feet under a 100-lb dumbbell for added stability.<br> As you get more advanced you can hold a dumbbell or a weight plate (held at arms length) on top of your chest. However, you have to be very careful when adding weight to this exercise, because if you add too much too quickly you could get a hernia.";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 6:
                        anim.setBackgroundResource(R.drawable.dumbbell_side_bends_anim);
                        heading.setText("Dumbbell Side-Bends");
                        header.setText("Dumbbell Side-Bends");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Stand up straight while holding a dumbbell on the left hand (palms facing the torso) as you have the right hand holding your waist. Your feet should be placed at shoulder width. This will be your starting position. <li>While keeping your back straight and your head up, bend only at the waist to the right as far as possible. Breathe in as you bend to the side. Then hold for a second and come back up to the starting position as you exhale. Tip: Keep the rest of the body stationary. <li>Now repeat the movement but bending to the left instead. Hold for a second and come back to the starting position. <li>Repeat for the recommended amount of repetitions and then change hands. </ol> <h3>Caution: </h3> Refrain from using this exercise if your obliques tend to grow easily as wide obliques take away from your symmetry. <h3>Variations: </h3> You can also do this exercise while seating on a bench or with a barbell. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    case 7:
                        anim.setBackgroundResource(R.drawable.weighted_crunches_anim);
                        heading.setText("Weighted Crunches");
                        header.setText("Weighted Crunches");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie flat on your back on a bench with your feet flat on the ground or resting on a bench with your knees bent at a 90 degree angle. <li>Hold a weight to your chest, or you may hold it extended above your torso. This will be your starting position. <li>Now, exhale and slowly begin to roll your shoulders off the floor. Your shoulders should come up off the floor about 4 inches while your lower back remains on the floor. <li>At the top of the movement, flex your abdominals and hold for a brief pause. <li>Then inhale and slowly lower yourself back down to the starting position. <li>Repeat this Process </ol> ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                        runAnimation();
                        break;

                    case 8:
                        anim.setBackgroundResource(R.drawable.weighted_leg_raises_anim);
                        heading.setText("Weighted Leg Raises");
                        header.setText("Weighted Leg Raises");

                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Steps:</h3> <ol> <li>Lie with your back flat on a bench, hold some weight on your chest and your legs extended in front of you off the end. <li>Place your hands either under the weight or under your glutes or the bench. This will be your starting position. <li>As you keep your legs extended, straight as possible with your knees slightly bent but locked raise your legs until they make a 90-degree angle with the floor. Exhale as you perform this portion of the movement and hold the contraction at the top for a second. <li>Now, as you inhale, slowly lower your legs back down to the starting position. </ol> <h3>Variations: </h3> You can also perform this exercise on the floor on top of an exercise mat. You can also add weight by holding a dumbbell in between your feet as you get more advanced. ";

                        description.setBackgroundColor(0x00000000);

                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                        runAnimation();
                        break;

                    default:
                        break;
                }

                break;

//            case 8:
//                switch (listVariable) {
//                    case 1:
//                        anim.setBackgroundResource(R.drawable.broccoli);
//                        heading.setText("Broccoli");
//                        header.setText("Broccoli");
//
//                        htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Why Broccoli</h3> <p>Broccoli has more <span style='color: red;'>Vitamin C </span>than an orange and contains high amounts of antioxidants that will help to repair your muscles and bulk up your immune system. It also contains <span style='color: red;'>phyto-chemicals</span> which have anti-estrogen properties that help lower estrogen levels, increase testosterone and help fight off body fat storage.</p> <p>Broccoli is high in vitamin C and dietary fiber. It also contains multiple <span style='color: red;'>nutrients with potent anti-cancer properties</span>, such as di-indolylmethane and small amounts of selenium. A single serving provides more than 30 mg of vitamin C and a half-cup provides 52 mg of vitamin C.[10] The 3,3'-Diindolylmethane found in broccoli is a potent modulator of the innate immune response system with anti-viral, anti-bacterial and anti-cancer activity. Broccoli also contains the compound glucora-phanin, which can be processed into an anti-cancer compound sulfo-raphane, though the anti-cancer benefits of broccoli are greatly reduced if the vegetable is boiled. Broccoli is also an excellent source of indole-3-carbinol, a chemical which boosts <span style='color: red;'>DNA repair</span> in cells and appears to block the growth of cancer cells.</p> <h3>Weight Reduction</h3> <p>Boiling broccoli reduces the levels of suspected <span style='color: red;'>anti-carcinogenic compounds</span>, such as sulfo-raphane, with losses of 20�30% after five minutes, 40�50% after ten minutes, and 77% after thirty minutes., However, other preparation methods such as steaming, microwaving, and stir frying had no significant effect on the compounds.</p> <p>Broccoli has the highest levels of carotenoids in the brassica family. It is particularly rich in lutein and also provides a modest amount of beta-carotene.</p> ";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 2:
//                        anim.setBackgroundResource(R.drawable.eggs);
//                        heading.setText("Eggs");
//                        header.setText("Eggs");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Eggs</h3> <p>These quick and easy treats are staples to the any fitness meal regimen. They are loaded with approximately 5 to 6 grams of protein at the very low cost of only 60 calories per medium-sized egg. It's also important to note that eggs are high in <span style='color: red;'>BCAAs</span>, which aids in muscular growth and development</p> <p>With 6 grams of the highest quality protein and 14 key nutrients, eggs provide the energy needed to keep you going. They are a natural choice for a healthy, active lifestyle.</p> <p>Eggs are one of the few foods considered to be a complete protein, because they contain all <span style='color: red;'>9 essential amino acids</span>. Amino acids are considered the 'building blocks for the body' because they help form protein.</p> <p>In addition to giving you energy, your body uses the protein found in eggs to build and repair body tissue and cells, grow strong hair and nails, build and maintain healthy muscles, help fight infections, help keep your body fluids in balance</p> ";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//
//                        break;
//                    case 3:
//                        anim.setBackgroundResource(R.drawable.almonds);
//                        heading.setText("Almonds");
//                        header.setText("Almonds");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Almonds</h3> <p>The almond is a nutritionally dense food and is a rich source of <span style='color: red;'>vitamin E</span>, containing 26 mg per 100 g. They are also rich in <span style='color: red;'>dietary fiber, B vitamins, essential minerals such as magnesium, copper, manganese, calcium, and potassium as well as monounsaturated fats and polyunsaturated fats</span>, fats which potentially may lower LDL cholesterol. Typical of nuts and seeds, almonds also contain phytosterols such as Beta-sitosterol, stigmasterol, campesterol, sitostanol, and campestanol, which have been associated with cholesterol-lowering properties.</p> <p>Preliminary research associates consumption of almonds with elevated blood levels of high density lipoproteins and lower low density lipoproteins.</p> <p>Almonds may cause allergy or intolerance. Cross-reactivity is common with peach allergens (lipid transfer proteins) and tree nut allergens. Symptoms range from local signs and symptoms (e.g., oral allergy syndrome, contact urticaria) to systemic signs and symptoms including anaphylaxis (e.g., urticaria, angioedema, gastrointestinal and respiratory symptoms).</p> <p>During the digestion process in humans, almond flour may be fermented into short-chain <span style='color: red;'>fatty acids</span>, most notably butyrate which is a substrate for cells lining the large intestine.</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 4:
//                        anim.setBackgroundResource(R.drawable.grapefruit);
//                        heading.setText("Grapefruit");
//                        header.setText("Grapefruit");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Grapefruit?</h3> <p>Grapefruit is an excellent source of many <span style='color: red;'>nutrients and phytochemicals</span> that contribute to a healthy diet. Grapefruit is a good source of <span style='color: red;'>vitamin C</span>, contains the <span style='color: red;'>fiber pectin</span>, and the pink and red hues contain the beneficial <span style='color: red;'>antioxidant lycopene</span>. Studies have shown grapefruit helps lower cholesterol,] and there is evidence that the seeds have antioxidant properties, Grapefruit forms a core part of the 'grapefruit diet', the theory being that the fruit's low glycemic index is able to help the body's metabolism burn fat.</p> <p><span style='color: red;'>Grapefruit seed extract (GSE)</span> has been shown to have strong antimicrobial properties against fungi. It is also believed to have antimicrobial properties for bacteria, however there are no known studies that demonstrate its efficacy. Additionally, although GSE is promoted as a highly effective plant-based preservative by some natural personal care manufacturers, studies have shown that the apparent antimicrobial activity associated with GSE preparations is merely due to contamination with synthetic preservatives.</p> <p>There is a popular myth that grapefruits contain high amounts of spermidine, a simple polyamine that may be related to aging. The myth probably relies on the confusion between spermidine and putrescine. While citrus fruits show high amounts of putrescine, they contain very little spermidine.</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 5:
//                        anim.setBackgroundResource(R.drawable.wheat_germ);
//                        heading.setText("Wheat-Germ");
//                        header.setText("Wheat-Germ");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Wheat-Germ?</h3> <p>Wheat germ or wheatgerm is a concentrated source of several essential nutrients including <span style='color: red;'>Vitamin E, folate (folic acid), phosphorus, thiamin, zinc, and magnesium</span>, as well as essential fatty acids and fatty alcohols. It is a good source of fiber. White bread is made using flour that has had the germ and bran removed.</p> <p>Wheat germ can be added to protein shakes, casseroles, muffins, pancakes, cereals, yogurt, smoothies, cookies, and other goods. Wheat germ can become rancid if not properly stored in a refrigerator or freezer, and away from sunlight. Some manufacturers prevent rancidity by storing wheat germ in vacuum sealed glass containers.</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 6:
//                        anim.setBackgroundResource(R.drawable.tea);
//                        heading.setText("Tea");
//                        header.setText("Tea");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Tea?</h3> <p>Black and green teas contain no essential nutrients in significant content, with the exception of the <span style='color: red;'>dietary mineral, manganese</span> at 0.5 mg per cup or 26% of the Daily Value. Tea leaves contain diverse polyphenols, including <span style='color: red;'>flavonoids, epigallocatechin gallate (commonly noted as EGCG)</span> and other catechins.</p> <p>It has been suggested that green and black tea may protect against cancer or other diseases such as obesity or <span style='color: red;'>Alzheimer's disease</span>, but the compounds found in green tea have not been adequately demonstrated to have any effect on human diseases</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 7:
//                        anim.setBackgroundResource(R.drawable.sweetpotato);
//                        heading.setText("Sweet Potato");
//                        header.setText("Sweet Potato");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Sweet Potato?</h3> <p>Besides simple starches, raw sweet potatoes are rich in complex <span style='color: red;'>carbohydrates, dietary fiber and beta-carotene (a provitamin A carotenoid)</span>, while having moderate contents of other micronutrients, including <span style='color: red;'>vitamin B5, vitamin B6, manganese and potassium</span>. When cooked by baking, small variable changes in micronutrient content occur to include a higher content of vitamin C at 24% of the Daily Value per 100 g serving (right table), as well as an increase in polyphenol levels.</p> <p>The Center for Science in the Public Interest has compared the nutritional value of sweet potatoes to other foods. Considering fiber content, complex carbohydrates, protein, vitamin A and potassium, the sweet potato ranked highest in nutritional value.</p> <p>Sweet potato varieties with dark orange flesh have more beta carotene than those with light-colored flesh, and their increased cultivation is being encouraged in Africa, where vitamin A deficiency is a serious health problem. A 2012 study of 10,000 households in Uganda found that 50% of children who ate normal sweet potatoes suffered from vitamin A deficiency compared with only 10% of those on the high beta carotene variety.</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 8:
//                        anim.setBackgroundResource(R.drawable.mushrooms);
//                        heading.setText("Mushrooms");
//                        header.setText("Mushrooms");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Mushroooms?</h3> <p>Mushrooms are a low-calorie food eaten cooked, raw or as a garnish to a meal. In a 100 g (3.5 ounce) serving, mushrooms are an excellent source (higher than 20% of the Daily Value, DV) of <span style='color: red;'>B vitamins</span>, such as riboflavin, niacin and pantothenic acid, an excellent source of the <span style='color: red;'>essential minerals</span>, selenium (37% DV) and copper (25% DV), and a good source (10-19% DV) of phosphorus and potassium. Fat, carbohydrate and calorie content are low, with absence of vitamin C and sodium. There are 27 calories in a typical serving of fresh mushrooms.</p> <p>When exposed to <span style='color: red;'>ultraviolet (UV)</span> light even after harvesting, natural ergosterols in mushrooms produce vitamin D2, a process now used to supply fresh vitamin D mushrooms for the functional food grocery market.</p> <p>In a comprehensive safety assessment of producing vitamin D in fresh mushrooms, researchers showed that artificial UV light technologies were equally effective for vitamin D production as in mushrooms exposed to natural sunlight, and that UV light has a long record of safe use for production of vitamin D in food. Mushrooms treated with UV light or exposed to sunlight are the only whole food vegetable source of vitamin D.</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;
//                    case 9:
//                        anim.setBackgroundResource(R.drawable.low_fat_yogurt);
//                        heading.setText("Low-Fat Yogurt");
//                        header.setText("Low-Fat Yogurt");
//
//                        htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Low-Fat Yogurt?</h3> <p>Yogurt is nutritionally rich in <span style='color: red;'>protein, calcium, vitamin D, riboflavin, vitamin B6 and vitamin B12</span>. It has nutritional benefits beyond those of milk. Lactose-intolerant individuals may tolerate yogurt better than other dairy products due to the conversion of lactose to the sugars glucose and galactose, and due to the fermentation of lactose to lactic acid carried out by the bacteria present in the yogurt. Yogurt contains varying amounts of fat. There is non-fat (0% fat), low-fat (usually 2% fat) and plain or whole milk yogurt (4% fat).</p> <p>Yogurt is a valuable health food for both <span style='color: red;'>infants and elderly persons</span>. For children, it is a balanced source of protein, fats, carbohydrates, and minerals. For senior citizens, who frequently have more sensitive colons or who no longer produce much lactase, yogurt is also a valuable food. Elderly intestines showed declining levels of bifidus bacteria, which allow the growth of toxin-producing and, perhaps, cancer-causing bacteria. Yogurt consumption may help prevent osteoporosis. </p> <p>As of 2013, there is moderate-quality evidence to support the idea that consumption of dairy products, including yogurt, may reduce the risk of <span style='color: red;'>high blood pressure</span>. However, the precise mechanism for this effect is not fully understood. Yogurt with active cultures helps the gut,[vague] and may help one feel fuller.</p>";
//
//                        description.setBackgroundColor(0x00000000);
//
//                        description.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
//                        break;

//                    default:
//                        break;
//                }
            default:
                break;
        }
		
/*		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});*/

    }

    public void runAnimation() {
        DescriptionActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                anim2 = (AnimationDrawable) anim.getBackground();
                anim2.setOneShot(false);
                anim2.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        adView.destroy();
        if (mainVariable == 8) {
            Intent intent = new Intent(getBaseContext(), FoodActivity.class);
            finish();
            startActivity(intent);
        } else {
//            Intent intent = new Intent(getBaseContext(), ListActivity.class);
//            finish();
//            startActivity(intent);
        }


    }
}
