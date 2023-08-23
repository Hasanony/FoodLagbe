package com.example.foodlagbe.ui.daily_meal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodlagbe.R;
import com.example.foodlagbe.adapters.DailymealAdapter;
import com.example.foodlagbe.models.DailyMealModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DailyMealFragment extends Fragment {

RecyclerView recyclerView;
ArrayList<DailyMealModel> dailyMealModel;
DailymealAdapter dailymealAdapter;
Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.daily_meal_fragment,container,false);
        recyclerView =root.findViewById((R.id.daily_meal_rec));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModel =new ArrayList<>();

        dailyMealModel.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","Description Description ","breakfast","30% off"));
        dailyMealModel.add(new DailyMealModel(R.drawable.lunch,"Lunch","Description Description ","lunch","20% off"));
        dailyMealModel.add(new DailyMealModel(R.drawable.dinner,"Dinner","Description Description ","dinner","10% off"));
        dailyMealModel.add(new DailyMealModel(R.drawable.sweets,"Sweet","Description Description ","sweet","50% off"));
        dailyMealModel.add(new DailyMealModel(R.drawable.drinks,"Drinks","Description Description ","drinks","50% off"));

        
dailymealAdapter = new DailymealAdapter(dailyMealModel, getActivity());
recyclerView.setAdapter(dailymealAdapter);
dailymealAdapter.notifyDataSetChanged();




        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}