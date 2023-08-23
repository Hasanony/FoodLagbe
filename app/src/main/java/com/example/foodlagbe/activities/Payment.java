package com.example.foodlagbe.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodlagbe.R;
import com.example.foodlagbe.adapters.DailymealAdapter;
import com.example.foodlagbe.models.DailyMealModel;

import java.util.ArrayList;

public class Payment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<DailyMealModel> dailyMealModel;
    DailymealAdapter dailymealAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_my_chart, container, false);

        dailymealAdapter = new DailymealAdapter(dailyMealModel, getActivity());
        recyclerView.setAdapter(dailymealAdapter);
        dailymealAdapter.notifyDataSetChanged();
        return view;
    }

}