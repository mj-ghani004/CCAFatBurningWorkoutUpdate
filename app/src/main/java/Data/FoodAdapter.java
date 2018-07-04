package Data;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cca.fat.burn.workout.FoodDescription;
import com.cca.fat.burn.workout.R;

import java.util.ArrayList;

import static com.cca.fat.burn.workout.FoodActivity.PREFS_PRIVATE;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.RecyclerViewHolder> {


    private ArrayList<FoodProvider> foodData;
    private static SharedPreferences pref;


    public FoodAdapter(ArrayList<FoodProvider> foodData) {
        this.foodData = foodData;

    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_items, parent, false);
        return new RecyclerViewHolder(view , parent.getContext());

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        FoodProvider food = foodData.get(position);

        holder.image.setImageDrawable(food.getImg_src());
        holder.title.setText(food.getTitle());
        holder.desc.setText(food.getDes());

    }

    @Override
    public int getItemCount() {
        return foodData.size();
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView image;
        TextView title;
        TextView desc;
        private  Context mContext;



        public RecyclerViewHolder(View itemView , Context ctx) {

            super(itemView);

            this.mContext = ctx;
            image = itemView.findViewById(R.id.imageView_foodListItem);
            title = itemView.findViewById(R.id.textView_titleFood);
            desc = itemView.findViewById(R.id.textView_descFood);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Log.e("Pressed" , "I am Pressed");
            pref = mContext.getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);
            int position = getAdapterPosition();
            Intent intent = new Intent(mContext, FoodDescription.class);
            pref.edit().putInt("main", 8).apply();
            pref.edit().putInt("list", position + 1 ).apply();
            mContext.startActivity(intent);
        }
    }
}
