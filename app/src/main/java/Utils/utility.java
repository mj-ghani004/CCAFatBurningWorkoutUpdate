package Utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.cca.fat.burn.workout.R;

import java.util.ArrayList;

import Data.FoodProvider;

public class utility {

    public ArrayList<FoodProvider> getDataForChest(Context context)

    {

        String[] titles =
                {
                        "Bench Press",
                        "Decline Crunch",
                        "Incline Bench Press",
                        "Incline Fly",
                        "Lying Fly",
                        "Dumbbell Fly",
                        "Barbell Bench Press",
                        "Dumbbell Decline Fly"};

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.bench_press),
                        context.getResources().getDrawable(R.drawable.decline_crunch),
                        context.getResources().getDrawable(R.drawable.incline_bench_press),
                        context.getResources().getDrawable(R.drawable.incline_fly),
                        context.getResources().getDrawable(R.drawable.lying_fly),
                        context.getResources().getDrawable(R.drawable.dumbbell_flys_),
                        context.getResources().getDrawable(R.drawable.barbell_bench_press),
                        context.getResources().getDrawable(R.drawable.dumbbell_decline_flys),

                };

        String[] desc =
                {
                        "Lie down on a flat bench with a dumbbell in each hand resting on top of your thighs",
                        "Secure your legs at the end of the decline bench and lie down",
                        "Lie back on an incline bench with a dumbbell in each hand atop your thighs",
                        "Hold a dumbbell on each hand and lie on an incline bench that is set to an incline angle",
                        "Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs",
                        "Lie down on a flat bench with a dumbbell on each hand resting on top of your thighs",
                        "Lie back on a flat bench. Using a medium width grip (a grip that creates a 90-degree angle in",
                        "Secure your legs at the end of the decline bench and lie down with a dumbbell on each hand on top of your thighs"
                };

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }

    public ArrayList<FoodProvider> getDataForBiceps(Context context)

    {

        String[] titles =
                {
                        "Alternate Bicep Curl",
                        "Alternate Hammer Curl",
                        "Alternate Incline Curl",
                        "Seated Bicep Curl",
                        "Barbell Bicep Curl",
                        "Dumbbell Bicep Hammer Curl",
                        "Dumbbell Bicep Curl",
                        "Bicep Curl Reverse",
                        "Lying Bicep Curl"};

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.alternate_bicep_curl),
                        context.getResources().getDrawable(R.drawable.alternate_hammer_curl),
                        context.getResources().getDrawable(R.drawable.alternate_incline_curl),
                        context.getResources().getDrawable(R.drawable.seated_bicep_curl),
                        context.getResources().getDrawable(R.drawable.barbell_bicep_curl),
                        context.getResources().getDrawable(R.drawable.dumbbell_bicep_hammer_curl),
                        context.getResources().getDrawable(R.drawable.dumbell_biceps_curl),
                        context.getResources().getDrawable(R.drawable.biceps_curl_reverse),
                        context.getResources().getDrawable(R.drawable.lying_bicep_cablecurl)


                };

        String[] desc =
                {
                        "Stand (torso upright) with a dumbbell in each hand held at arms length",
                        "Stand up with your torso upright and a dumbbell on each hand being held at arms length",
                        "Sit back on an incline bench with a dumbbell in each hand held at arms length",
                        "Rotate the palms of the hands so that they are facing your torso",
                        "Stand up with your torso upright while holding a barbell at a shoulder-width grip",
                        "Stand up with your torso upright and a dumbbell on each hand being held at arms length",
                        "Stand up straight with a dumbbell in each hand at arm's length",
                        "To begin, stand straight with a dumbbell in each hand using a pronated grip",
                        "Grab a straight bar or E-Z bar attachment that is attached to the low pulley"

                };

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }


    public ArrayList<FoodProvider> getDataForShoulders(Context context)

    {

        String[] titles =
                {
                        "Barbell Front Raises",
                        "Barbell Shrugs",
                        "Barbell Upright Rows",
                        "Dumbbell Front Raises",
                        "Dumbbell Lateral Raises",
                        "Lying One Arm Rear Lateral Raises",
                        "Lying Rear Lateral Raises",
                        "One Arm Bench Press",
                        "One Arm Shoulder Press"};

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.barbell_front_raises),
                        context.getResources().getDrawable(R.drawable.barbell_shrugs),
                        context.getResources().getDrawable(R.drawable.barbell_upright_rows),
                        context.getResources().getDrawable(R.drawable.dumbbell_front_raises),
                        context.getResources().getDrawable(R.drawable.dumbbell_lateral_raises),
                        context.getResources().getDrawable(R.drawable.lying_one_arm_rear_lateral_raise),
                        context.getResources().getDrawable(R.drawable.lying_rear_lateral_raise),
                        context.getResources().getDrawable(R.drawable.one_arm_bench_press),
                        context.getResources().getDrawable(R.drawable.one_arm_shoulder_press)


                };

        String[] desc =
                {
                        "Hold the dumbbells in front of your thighs, palms facing your thighs",
                        "Stand up straight with your feet at shoulder width as you hold a barbell with both",
                        "Grasp a barbell with an overhand grip that is slightly less than shoulder width",
                        "Pick a couple of dumbbells and stand with a straight torso and the dumbbells on front of",
                        "Pick a couple of dumbbells and stand with a straight torso and the dumbbells by your",
                        "While holding a dumbbell in each hand, lay with your chest down on a slightly inclined",
                        "While holding a dumbbell in each hand, lay with your chest down on a slightly",
                        "Lie down on a flat bench with a dumbbell in one hand on top of ",
                        "Grab a dumbbell and either sit on a military press bench or a utility bench that"
                };

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }

    public ArrayList<FoodProvider> getDataForThigh(Context context)

    {

        String[] titles =
                {
                        "Barbell Full Squat",
                        "Barbell Walking Lunge",
                        "Body weight Walking Lunge",
                        "Dumbbell Squat",
                        "Cable Dead Lifts",
                        "Barbell Squat",
                        "Leg Press",
                        "Leg Lift",
                        "Leg Raises"
                };

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.barbell_full_squat),
                        context.getResources().getDrawable(R.drawable.barbell_walking_lunge),
                        context.getResources().getDrawable(R.drawable.bodyweight_walking_lunge),
                        context.getResources().getDrawable(R.drawable.dumbbell_squat),
                        context.getResources().getDrawable(R.drawable.cable_deadlifts),
                        context.getResources().getDrawable(R.drawable.barbell_squat),
                        context.getResources().getDrawable(R.drawable.leg_press),
                        context.getResources().getDrawable(R.drawable.leg_lift),
                        context.getResources().getDrawable(R.drawable.leg_raises)


                };

        String[] desc =
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

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }

    public ArrayList<FoodProvider> getDataForTriceps(Context context)

    {

        String[] titles =
                {
                        "Bench Dip",
                        "Close Grip Bench Press",
                        "Low Triceps Extension",
                        "Dumbbell Incline Triceps Extensions",
                        "Lying Close Grip Triceps Press To Chin Dead Lifts",
                        "Close Grip EZ Bar Press",
                        "Dumbbell One Arm Triceps",
                        "Bent Over One Arm Dumbbell Triceps",
                        "Triceps Dumbbell Press",
                        "Tate Press",
                        "Kneeling Concentration Triceps Extension"
                };

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.bench_dip),
                        context.getResources().getDrawable(R.drawable.close_grip_bench_press),
                        context.getResources().getDrawable(R.drawable.low_triceps_extension),
                        context.getResources().getDrawable(R.drawable.dumbell_incline_triceps_extensions),
                        context.getResources().getDrawable(R.drawable.lying_close_grip_triceps_press_to_chin),
                        context.getResources().getDrawable(R.drawable.close_grip_ez_bar_press),
                        context.getResources().getDrawable(R.drawable.dumbbell_one_arm_triceps),
                        context.getResources().getDrawable(R.drawable.bent_over_one_arm_dumbbell_triceps),
                        context.getResources().getDrawable(R.drawable.triceps_dumbbell_press),
                        context.getResources().getDrawable(R.drawable.tate_press),
                        context.getResources().getDrawable(R.drawable.kneeling_concentration_triceps_extension)


                };

        String[] desc =
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

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }

    public ArrayList<FoodProvider> getDataForAbdominal(Context context)

    {

        String[] titles =
                {
                        "Cross Body Crunch",
                        "Crunches",
                        "Crunches With Legs On Stability Ball",
                        "Decline Crunch",
                        "Stability Ball Abdominal Crunch",
                        "Dumbbell Side Bend",
                        "Weighted Crunch",
                        "Weighted Leg Raise"

                };

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.cross_body_crunch),
                        context.getResources().getDrawable(R.drawable.crunches),
                        context.getResources().getDrawable(R.drawable.crunches_with_legs_on_stability_ball),
                        context.getResources().getDrawable(R.drawable.decline_crunch),
                        context.getResources().getDrawable(R.drawable.stability_ball_abdominal_crunch),
                        context.getResources().getDrawable(R.drawable.dumbbell_side_bend),
                        context.getResources().getDrawable(R.drawable.weighted_crunch),
                        context.getResources().getDrawable(R.drawable.weighted_leg_raise)


                };

        String[] desc =
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

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }


    public ArrayList<FoodProvider> getDataForWings(Context context)

    {

        String[] titles =
                {
                        "Wide Row",
                        "Kneeling One Arm Row",
                        "Back Fly",
                        "Pull Down With Squat With Elbows Flexed",
                        "Stiffed Legged Dead Lift",
                        "Crossover Row",
                        "Hyper Extension",
                        "Kneeling Row",
                        "Lateral Pull down",
                        "Rotating Back Fly"
                };

        Drawable[] drawables =
                {
                        context.getResources().getDrawable(R.drawable.wide_row),
                        context.getResources().getDrawable(R.drawable.kneeling_one_arm_row),
                        context.getResources().getDrawable(R.drawable.back_fly),
                        context.getResources().getDrawable(R.drawable.pulldown_with_squat_with_elbows_flexed),
                        context.getResources().getDrawable(R.drawable.stiffed_legged_dead_lift),
                        context.getResources().getDrawable(R.drawable.crossover_row),
                        context.getResources().getDrawable(R.drawable.hyperextension),
                        context.getResources().getDrawable(R.drawable.kneeling_row),
                        context.getResources().getDrawable(R.drawable.lateral_pulldown),
                        context.getResources().getDrawable(R.drawable.rotating_back_fly)


                };

        String[] desc =
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
                        , "Calcium has been shown to have beneficial effects on bone mass in people of all ages, although the results are not always consistent, says Nieves, also an assistant professor of clinical epidemiology at Columbia University"

                };

        // Setting Array to Populate

        ArrayList<FoodProvider> data = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            data.add(new FoodProvider(drawables[i], titles[i], desc[i]));
        }

        return data;


    }
}
