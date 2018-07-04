package Data;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cca.fat.burn.workout.ExerciseList;
import com.cca.fat.burn.workout.R;

import java.util.ArrayList;

import static com.cca.fat.burn.workout.FoodActivity.PREFS_PRIVATE;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    public static ArrayList<FoodProvider> data = new ArrayList<>();
    private  Context mContext;
    private static SharedPreferences pref;


    public ExerciseAdapter(ArrayList<FoodProvider> data, Context context) {
        this.data = data;
        this.mContext = context;
        pref = mContext.getSharedPreferences(PREFS_PRIVATE, Context.MODE_PRIVATE);


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.training_item, parent, false);
        return new ViewHolder(view, mContext);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        FoodProvider localItem = data.get(position);

        holder.title.setText(localItem.getTitle());
        holder.detail.setText(localItem.getDes());
        holder.display_image.setImageDrawable(localItem.getImg_src());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView display_image;
        TextView title;
        TextView detail;
        private Context viewContext;


        public ViewHolder(View itemView, Context context) {
            super(itemView);

            display_image = itemView.findViewById(R.id.imageViewExr_trainingItem);
            title = itemView.findViewById(R.id.textViewExr_name);
            detail = itemView.findViewById(R.id.textViewExr_detail);
            this.viewContext = context;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            FoodProvider foodProvider = data.get(getAdapterPosition());

            pref.edit().putString("exercise", foodProvider.getTitle()).apply();


            Intent intent = new Intent(viewContext, ExerciseList.class);
            viewContext.startActivity(intent);
        }


    }
}
