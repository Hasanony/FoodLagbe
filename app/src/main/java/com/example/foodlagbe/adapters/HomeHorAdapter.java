package com.example.foodlagbe.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodlagbe.R;
import com.example.foodlagbe.models.HomeHorModel;
import com.example.foodlagbe.models.HomeVermodel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {
    UpdateverticalRec updateverticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;
    boolean check =true;
    boolean select =true;
    int row_index=-1;

    public HomeHorAdapter(UpdateverticalRec updateverticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateverticalRec = updateverticalRec;
        this.activity = activity;
        this.list = list;
    }


    @NonNull
    @Override
    public HomeHorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeHorAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horitzontal,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHorAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVermodel> homeVermodels = new ArrayList<>();
            homeVermodels.add(new HomeVermodel(R.drawable.pizza12," Bacon Pizza","10:00am - 10:00pm","4.9","৳25"));
            homeVermodels.add(new HomeVermodel(R.drawable.pizza8,"Pizza","10:00am - 10:00pm","4.9","৳25"));
            homeVermodels.add(new HomeVermodel(R.drawable.pizza13, " Sausage Pizza", "10:00am - 10:00pm", "4.9", "৳25"));
            homeVermodels.add(new HomeVermodel(R.drawable.pizza3, " Chezze Pizza", "10:00am - 10:00pm", "4.9", "৳25"));
            homeVermodels.add(new HomeVermodel(R.drawable.pizza11,"Special Pizza","10:00am - 10:00pm","4.9","৳25"));

            updateverticalRec.callBack(position, homeVermodels);
            check = false;
        }
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index =position;
                notifyDataSetChanged();

                if(position==0){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.pizza12," Bacon Pizza","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.pizza8,"Pizza","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.pizza13, " Sausage Pizza", "10:00am - 10:00pm", "4.9", "৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.pizza3, " Chezze Pizza", "10:00am - 10:00pm", "4.9", "৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.pizza11,"Special Pizza","10:00am - 10:00pm","4.9","৳25"));


                    updateverticalRec.callBack(position,homeVermodels);
                }else if(position==1){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.burger7," Beef Burger","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.burger8,"Double bacon Burger","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.burger9," Chicken Burger","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.burger10," crispy Burger","10:00am - 10:00pm","4.9","৳25"));

                    updateverticalRec.callBack(position,homeVermodels);

                }else if(position==2){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.fries7," Large fries","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.fries8,"Small fries","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.fries9,"Chezze fries","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.fries10," Ring fries","10:00am - 10:00pm","4.9","৳25"));


                    updateverticalRec.callBack(position,homeVermodels);

                }else if(position==3){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.chick3," large Chicken Fry","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.chick4,"Small Chicken Fry","10:00am - 10:00pm","4.9","৳25"));


                    updateverticalRec.callBack(position,homeVermodels);

                }else if(position==4){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.steak5," T-bone Steak","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.steak6,"Ribs Steak","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.steak7," Lamb chop Stek","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.steack8," Tomahawk","10:00am - 10:00pm","4.9","৳25"));

                    updateverticalRec.callBack(position,homeVermodels);

                }else if(position==5){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.kacchi3," Bashmoti Kacchi","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.tehari,"Kacchi","10:00am - 10:00pm","4.9","৳25"));


                    updateverticalRec.callBack(position,homeVermodels);

                }
                else if(position==6){
                    ArrayList<HomeVermodel>homeVermodels=new ArrayList<>();
                    homeVermodels.add(new HomeVermodel(R.drawable.ice1," Mixed Ice Cream","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.ice2,"Vanila Ice Cream","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.ice3," Chocolate Ice Creamr","10:00am - 10:00pm","4.9","৳25"));
                    homeVermodels.add(new HomeVermodel(R.drawable.ice4," strawberry ice cream","10:00am - 10:00pm","4.9","৳25"));

                    updateverticalRec.callBack(position,homeVermodels);

                }
            }
        });
        if(select){
            if(position==0){
                holder.cardview.setBackgroundResource(R.drawable.change_bg);
                select=false;
            }
        }else {
            if(row_index==position){
                holder.cardview.setBackgroundResource(R.drawable.change_bg);
            }else {
                holder.cardview.setBackgroundResource(R.drawable.hor_desig);
            }
        }
    }




    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;

        CardView cardview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_text);
            cardview=itemView.findViewById(R.id.cardview);

        }
    }

}