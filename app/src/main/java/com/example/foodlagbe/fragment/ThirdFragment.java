package com.example.foodlagbe.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodlagbe.R;
import com.example.foodlagbe.adapters.FeatureAdapter;
import com.example.foodlagbe.adapters.FeaturedVerAdapter;
import com.example.foodlagbe.models.FeatureModel;
import com.example.foodlagbe.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {


    List<FeatureModel> featureModelList;
    List<FeaturedVerModel>featuredVerModelList;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    FeatureAdapter featureAdapter;
    FeaturedVerAdapter featuredVerAdapter;
    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        recyclerView2=view.findViewById(R.id.second_ver);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        featuredVerModelList=new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffee,"Feature 1","description 1","4.8","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.food,"Feature 2","description 2","4.8","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffee,"Feature 3","description 3","4.8","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffee,"Feature 4","description 4","4.8","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffee,"Feature 1","description 1","4.8","10:00am-8:00pm"));

        featuredVerAdapter=new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        recyclerView=view.findViewById(R.id.second_hor);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featureModelList=new ArrayList<>();
        featureModelList.add(new FeatureModel(R.drawable.fries,"Featured 1","description 1"));
        featureModelList.add(new FeatureModel(R.drawable.food,"Featured 1","description 1"));
        featureModelList.add(new FeatureModel(R.drawable.fries7,"Featured 1","description 1"));

        featureAdapter=new FeatureAdapter(featureModelList);
        recyclerView.setAdapter(featureAdapter);
        return view;
    }
}