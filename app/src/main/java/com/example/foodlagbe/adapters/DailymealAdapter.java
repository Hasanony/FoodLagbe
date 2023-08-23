package com.example.foodlagbe.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodlagbe.R;
import com.example.foodlagbe.activities.DetailedDailymealActivity;
import com.example.foodlagbe.models.DailyMealModel;

import java.util.List;
import java.util.zip.Inflater;

public class DailymealAdapter extends RecyclerView.Adapter<DailymealAdapter.ViewHolder>{
   List<DailyMealModel> list;
   Context context;

    public DailymealAdapter(List<DailyMealModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DailymealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailymealAdapter.ViewHolder holder, int position) {
         holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.discount.setText(list.get(position).getDiscount());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailedDailymealActivity.class);
                intent.putExtra("type",list.get(position).getType());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name,description,discount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView =itemView.findViewById(R.id.chow);
            name =itemView.findViewById(R.id.nam);
            description =itemView.findViewById(R.id.name1);
            discount =itemView.findViewById(R.id.name2);
        }
    }
}
