package com.example.foodlagbe.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.foodlagbe.R;
import com.example.foodlagbe.activities.Login;
import com.example.foodlagbe.activities.Payment;
import com.example.foodlagbe.activities.Register;
import com.example.foodlagbe.activities.Welcome;
import com.example.foodlagbe.adapters.CartAdapter;
import com.example.foodlagbe.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyChartFragment extends Fragment  {
    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    Button button;

    public MyChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_my_chart, container, false);

        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list=new ArrayList<>();

        list.add(new CartModel(R.drawable.orangemoj,"Order 1","30","4.3"));
        list.add(new CartModel(R.drawable.s1,"Order 2","300","4.3"));
        cartAdapter=new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
         button=view.findViewById(R.id.make);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Fragment f=new Payment();
                 FragmentTransaction tm=getActivity().getSupportFragmentManager().beginTransaction();
                 tm.replace(R.id.i,f).commit();
             }
         });


        return view;
    }


}