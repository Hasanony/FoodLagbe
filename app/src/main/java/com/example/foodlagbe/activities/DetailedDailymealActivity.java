package com.example.foodlagbe.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.foodlagbe.R;
import com.example.foodlagbe.adapters.DetailedDailyMealAdapter;
import com.example.foodlagbe.models.DailyMealModel;
import com.example.foodlagbe.models.DetailedDailyModel;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailedDailymealActivity extends AppCompatActivity {
      RecyclerView recyclerView;
      List<DetailedDailyModel> detailedDailyModelList;
      DetailedDailyMealAdapter dailyMealAdapter;
      ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_dailymeal);
        String type=getIntent().getStringExtra("type");

        recyclerView=findViewById(R.id.deatailed_rec);
        imageView=findViewById(R.id.deatailed_imag);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList=new ArrayList<>();
        dailyMealAdapter=new DetailedDailyMealAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyMealAdapter);


        if(type!=null && type.equalsIgnoreCase("breakfast")){
            imageView.setImageResource(R.drawable.breakfast);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.paratha,"Paratha","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sabji,"Sabji","description","4.4","20","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.nehari,"Nehari","description","4.4","20","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.soup,"Chicken Soup","description","4.4","20","8:00-12:00"));
            dailyMealAdapter.notifyDataSetChanged();
        }

        if(type!=null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Set Menu 1","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Set Menu 2","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.csizling,"Chicken Sizling","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bsizling,"Beef Sizling","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.loittafry,"Loitta Fry","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.loittajuro,"Loitta Juro","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rice,"Plain Rice","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dhal,"Dhal","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.beefcu,"Beef Curry","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chickencu,"Chicken Curry","description","4.4","12","8:00-12:00"));
            dailyMealAdapter.notifyDataSetChanged();
        }

        if(type!=null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Set Menu 1","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Set Menu 2","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.csizling,"Chicken Sizling","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bsizling,"Beef Sizling","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.crumed_coatedsnaper,"Crumed Coated Snaper","description","4.4","1450","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.boiledredsna,"Broiled Red Snaper","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.loittafry,"Loitta Fry","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.loittajuro,"Loitta Juro","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rice,"Plain Rice","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dhal,"Dhal","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.beefcu,"Beef Curry","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chickencu,"Chicken Curry","description","4.4","12","8:00-12:00"));
            dailyMealAdapter.notifyDataSetChanged();
        }
        if(type!=null && type.equalsIgnoreCase("sweet")){
            imageView.setImageResource(R.drawable.sweets);

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pan,"Breakfast","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lemonchcake,"Lemon Chesse Cake","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.strawcake,"Strawberry Chesse Cake","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.orangecake,"Orange Cheese Cake","description","4.4","12","8:00-12:00"));
            dailyMealAdapter.notifyDataSetChanged();
        }

        if(type!=null && type.equalsIgnoreCase("drinks")){
            imageView.setImageResource(R.drawable.drinks);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coke,"CocaCola","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee,"Cofee","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bluemoj," Blue Iced Cocktail","description","4.4","12","8:00-12:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.orangemoj,"Orange Mojito","description","4.4","12","8:00-12:00"));
            dailyMealAdapter.notifyDataSetChanged();
        }



    }
}