package com.cca.fat.burn.workout;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDescription extends AppCompatActivity {

    ImageView mItemImages;
    TextView mHeading;
    WebView mDescription;

    int type = 0;
    SharedPreferences pref;
    public static final String PREFS_PRIVATE = "PREFS_PRIVATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_description);

        mItemImages = findViewById(R.id.imageView_itemFoodDesc);
        mHeading = findViewById(R.id.textView_headingFoodDesc);
        mDescription = findViewById(R.id.textView_descFoodDesc);

        pref = getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
        type = pref.getInt("list", 0);

        showItemDescription(type);


    }

    private void showItemDescription(int val) {
        String htmlText;
        final String mimeType = "text/html";
        final String encoding = "UTF-8";

        switch (val) {
            case 1:


                mItemImages.setBackgroundResource(R.drawable.broccoli);
                mHeading.setText("Broccoli");
                htmlText = "<style> html { color: #FFFFFF; }</style> <h3>Why Broccoli</h3> <p>Broccoli has more <span style='color: red;'>Vitamin C </span>than an orange and contains high amounts of antioxidants that will help to repair your muscles and bulk up your immune system. It also contains <span style='color: red;'>phyto-chemicals</span> which have anti-estrogen properties that help lower estrogen levels, increase testosterone and help fight off body fat storage.</p> <p>Broccoli is high in vitamin C and dietary fiber. It also contains multiple <span style='color: red;'>nutrients with potent anti-cancer properties</span>, such as di-indolylmethane and small amounts of selenium. A single serving provides more than 30 mg of vitamin C and a half-cup provides 52 mg of vitamin C.[10] The 3,3'-Diindolylmethane found in broccoli is a potent modulator of the innate immune response system with anti-viral, anti-bacterial and anti-cancer activity. Broccoli also contains the compound glucora-phanin, which can be processed into an anti-cancer compound sulfo-raphane, though the anti-cancer benefits of broccoli are greatly reduced if the vegetable is boiled. Broccoli is also an excellent source of indole-3-carbinol, a chemical which boosts <span style='color: red;'>DNA repair</span> in cells and appears to block the growth of cancer cells.</p> <h3>Weight Reduction</h3> <p>Boiling broccoli reduces the levels of suspected <span style='color: red;'>anti-carcinogenic compounds</span>, such as sulfo-raphane, with losses of 20�30% after five minutes, 40�50% after ten minutes, and 77% after thirty minutes., However, other preparation methods such as steaming, microwaving, and stir frying had no significant effect on the compounds.</p> <p>Broccoli has the highest levels of carotenoids in the brassica family. It is particularly rich in lutein and also provides a modest amount of beta-carotene.</p> ";
                mDescription.setBackgroundColor(0x00000000);
                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;


            case 2:

                mItemImages.setBackgroundResource(R.drawable.eggs);
                mHeading.setText("Eggs");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Eggs</h3> <p>These quick and easy treats are staples to the any fitness meal regimen. They are loaded with approximately 5 to 6 grams of protein at the very low cost of only 60 calories per medium-sized egg. It's also important to note that eggs are high in <span style='color: red;'>BCAAs</span>, which aids in muscular growth and development</p> <p>With 6 grams of the highest quality protein and 14 key nutrients, eggs provide the energy needed to keep you going. They are a natural choice for a healthy, active lifestyle.</p> <p>Eggs are one of the few foods considered to be a complete protein, because they contain all <span style='color: red;'>9 essential amino acids</span>. Amino acids are considered the 'building blocks for the body' because they help form protein.</p> <p>In addition to giving you energy, your body uses the protein found in eggs to build and repair body tissue and cells, grow strong hair and nails, build and maintain healthy muscles, help fight infections, help keep your body fluids in balance</p> ";

                mDescription.setBackgroundColor(0x00000000);

                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");

                break;

            case 3:
                mItemImages.setBackgroundResource(R.drawable.almonds);
                mHeading.setText("Almonds");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Almonds</h3> <p>The almond is a nutritionally dense food and is a rich source of <span style='color: red;'>vitamin E</span>, containing 26 mg per 100 g. They are also rich in <span style='color: red;'>dietary fiber, B vitamins, essential minerals such as magnesium, copper, manganese, calcium, and potassium as well as monounsaturated fats and polyunsaturated fats</span>, fats which potentially may lower LDL cholesterol. Typical of nuts and seeds, almonds also contain phytosterols such as Beta-sitosterol, stigmasterol, campesterol, sitostanol, and campestanol, which have been associated with cholesterol-lowering properties.</p> <p>Preliminary research associates consumption of almonds with elevated blood levels of high density lipoproteins and lower low density lipoproteins.</p> <p>Almonds may cause allergy or intolerance. Cross-reactivity is common with peach allergens (lipid transfer proteins) and tree nut allergens. Symptoms range from local signs and symptoms (e.g., oral allergy syndrome, contact urticaria) to systemic signs and symptoms including anaphylaxis (e.g., urticaria, angioedema, gastrointestinal and respiratory symptoms).</p> <p>During the digestion process in humans, almond flour may be fermented into short-chain <span style='color: red;'>fatty acids</span>, most notably butyrate which is a substrate for cells lining the large intestine.</p>";

                mDescription.setBackgroundColor(0x00000000);

                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;
            case 4:
                mItemImages.setBackgroundResource(R.drawable.grapefruit);
                mHeading.setText("Grapefruit");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Grapefruit?</h3> <p>Grapefruit is an excellent source of many <span style='color: red;'>nutrients and phytochemicals</span> that contribute to a healthy diet. Grapefruit is a good source of <span style='color: red;'>vitamin C</span>, contains the <span style='color: red;'>fiber pectin</span>, and the pink and red hues contain the beneficial <span style='color: red;'>antioxidant lycopene</span>. Studies have shown grapefruit helps lower cholesterol,] and there is evidence that the seeds have antioxidant properties, Grapefruit forms a core part of the 'grapefruit diet', the theory being that the fruit's low glycemic index is able to help the body's metabolism burn fat.</p> <p><span style='color: red;'>Grapefruit seed extract (GSE)</span> has been shown to have strong antimicrobial properties against fungi. It is also believed to have antimicrobial properties for bacteria, however there are no known studies that demonstrate its efficacy. Additionally, although GSE is promoted as a highly effective plant-based preservative by some natural personal care manufacturers, studies have shown that the apparent antimicrobial activity associated with GSE preparations is merely due to contamination with synthetic preservatives.</p> <p>There is a popular myth that grapefruits contain high amounts of spermidine, a simple polyamine that may be related to aging. The myth probably relies on the confusion between spermidine and putrescine. While citrus fruits show high amounts of putrescine, they contain very little spermidine.</p>";

                mDescription.setBackgroundColor(0x00000000);

                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;
            case 5:
                mItemImages.setBackgroundResource(R.drawable.wheat_germ);
                mHeading.setText("Wheat-Germ");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Wheat-Germ?</h3> <p>Wheat germ or wheatgerm is a concentrated source of several essential nutrients including <span style='color: red;'>Vitamin E, folate (folic acid), phosphorus, thiamin, zinc, and magnesium</span>, as well as essential fatty acids and fatty alcohols. It is a good source of fiber. White bread is made using flour that has had the germ and bran removed.</p> <p>Wheat germ can be added to protein shakes, casseroles, muffins, pancakes, cereals, yogurt, smoothies, cookies, and other goods. Wheat germ can become rancid if not properly stored in a refrigerator or freezer, and away from sunlight. Some manufacturers prevent rancidity by storing wheat germ in vacuum sealed glass containers.</p>";

                mDescription.setBackgroundColor(0x00000000);

                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;
            case 6:
                mItemImages.setBackgroundResource(R.drawable.tea);
                mHeading.setText("Tea");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Tea?</h3> <p>Black and green teas contain no essential nutrients in significant content, with the exception of the <span style='color: red;'>dietary mineral, manganese</span> at 0.5 mg per cup or 26% of the Daily Value. Tea leaves contain diverse polyphenols, including <span style='color: red;'>flavonoids, epigallocatechin gallate (commonly noted as EGCG)</span> and other catechins.</p> <p>It has been suggested that green and black tea may protect against cancer or other diseases such as obesity or <span style='color: red;'>Alzheimer's disease</span>, but the compounds found in green tea have not been adequately demonstrated to have any effect on human diseases</p>";

                mDescription.setBackgroundColor(0x00000000);
                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;
            case 7:
                mItemImages.setBackgroundResource(R.drawable.sweetpotato);
                mHeading.setText("Sweet Potato");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Sweet Potato?</h3> <p>Besides simple starches, raw sweet potatoes are rich in complex <span style='color: red;'>carbohydrates, dietary fiber and beta-carotene (a provitamin A carotenoid)</span>, while having moderate contents of other micronutrients, including <span style='color: red;'>vitamin B5, vitamin B6, manganese and potassium</span>. When cooked by baking, small variable changes in micronutrient content occur to include a higher content of vitamin C at 24% of the Daily Value per 100 g serving (right table), as well as an increase in polyphenol levels.</p> <p>The Center for Science in the Public Interest has compared the nutritional value of sweet potatoes to other foods. Considering fiber content, complex carbohydrates, protein, vitamin A and potassium, the sweet potato ranked highest in nutritional value.</p> <p>Sweet potato varieties with dark orange flesh have more beta carotene than those with light-colored flesh, and their increased cultivation is being encouraged in Africa, where vitamin A deficiency is a serious health problem. A 2012 study of 10,000 households in Uganda found that 50% of children who ate normal sweet potatoes suffered from vitamin A deficiency compared with only 10% of those on the high beta carotene variety.</p>";

                mDescription.setBackgroundColor(0x00000000);
                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;
            case 8:
                mItemImages.setBackgroundResource(R.drawable.mushrooms);
                mHeading.setText("Mushrooms");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Mushroooms?</h3> <p>Mushrooms are a low-calorie food eaten cooked, raw or as a garnish to a meal. In a 100 g (3.5 ounce) serving, mushrooms are an excellent source (higher than 20% of the Daily Value, DV) of <span style='color: red;'>B vitamins</span>, such as riboflavin, niacin and pantothenic acid, an excellent source of the <span style='color: red;'>essential minerals</span>, selenium (37% DV) and copper (25% DV), and a good source (10-19% DV) of phosphorus and potassium. Fat, carbohydrate and calorie content are low, with absence of vitamin C and sodium. There are 27 calories in a typical serving of fresh mushrooms.</p> <p>When exposed to <span style='color: red;'>ultraviolet (UV)</span> light even after harvesting, natural ergosterols in mushrooms produce vitamin D2, a process now used to supply fresh vitamin D mushrooms for the functional food grocery market.</p> <p>In a comprehensive safety assessment of producing vitamin D in fresh mushrooms, researchers showed that artificial UV light technologies were equally effective for vitamin D production as in mushrooms exposed to natural sunlight, and that UV light has a long record of safe use for production of vitamin D in food. Mushrooms treated with UV light or exposed to sunlight are the only whole food vegetable source of vitamin D.</p>";

                mDescription.setBackgroundColor(0x00000000);
                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;
            case 9:
                mItemImages.setBackgroundResource(R.drawable.low_fat_yogurt);
                mHeading.setText("Low-Fat Yogurt");

                htmlText = "<style> html { color: #FFFFFF; } </style> <h3>Why Low-Fat Yogurt?</h3> <p>Yogurt is nutritionally rich in <span style='color: red;'>protein, calcium, vitamin D, riboflavin, vitamin B6 and vitamin B12</span>. It has nutritional benefits beyond those of milk. Lactose-intolerant individuals may tolerate yogurt better than other dairy products due to the conversion of lactose to the sugars glucose and galactose, and due to the fermentation of lactose to lactic acid carried out by the bacteria present in the yogurt. Yogurt contains varying amounts of fat. There is non-fat (0% fat), low-fat (usually 2% fat) and plain or whole milk yogurt (4% fat).</p> <p>Yogurt is a valuable health food for both <span style='color: red;'>infants and elderly persons</span>. For children, it is a balanced source of protein, fats, carbohydrates, and minerals. For senior citizens, who frequently have more sensitive colons or who no longer produce much lactase, yogurt is also a valuable food. Elderly intestines showed declining levels of bifidus bacteria, which allow the growth of toxin-producing and, perhaps, cancer-causing bacteria. Yogurt consumption may help prevent osteoporosis. </p> <p>As of 2013, there is moderate-quality evidence to support the idea that consumption of dairy products, including yogurt, may reduce the risk of <span style='color: red;'>high blood pressure</span>. However, the precise mechanism for this effect is not fully understood. Yogurt with active cultures helps the gut,[vague] and may help one feel fuller.</p>";

                mDescription.setBackgroundColor(0x00000000);
                mDescription.loadDataWithBaseURL("", htmlText, mimeType, encoding, "");
                break;

            default:
                break;


        }
    }
}
