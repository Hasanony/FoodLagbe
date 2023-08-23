package com.example.foodlagbe.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodlagbe.R;

import com.example.foodlagbe.adapters.HomeHorAdapter;
import com.example.foodlagbe.adapters.HomeHorAddAdapter;
import com.example.foodlagbe.adapters.HomeVarAdapter;
import com.example.foodlagbe.adapters.UpdateverticalRec;
import com.example.foodlagbe.databinding.FragmentHomeBinding;
import com.example.foodlagbe.models.HomeHorAddModel;
import com.example.foodlagbe.models.HomeHorModel;
import com.example.foodlagbe.models.HomeVermodel;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateverticalRec {

RecyclerView homeHorizontalRec,homehorizontalAddrec,homeVerticalRec;
    ArrayList<HomeHorModel>homeHorModelList;
List<HomeHorAddModel>homeHorAddModels;
ArrayList<HomeVermodel>homeVermodelList;
HomeVarAdapter homeVarAdapter;
HomeHorAddAdapter homeHorAddAdapter;
HomeHorAdapter homeHorAdapter;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        //////////horizontal model
        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeHorModelList =new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizzza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.burrger,"Burger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fries,"FrenchFry"));
        homeHorModelList.add(new HomeHorModel(R.drawable.chicken,"Chicken"));
        homeHorModelList.add(new HomeHorModel(R.drawable.steakk,"Steak"));
        homeHorModelList.add(new HomeHorModel(R.drawable.kacchi,"Kacchi"));
        homeHorModelList.add(new HomeHorModel(R.drawable.iceecream,"IceCream"));
        homeHorAdapter =new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        //////////horizontal add
        homehorizontalAddrec = root.findViewById(R.id.home_hor_add);
        homeHorAddModels =new ArrayList<>();
        homeHorAddModels.add(new HomeHorAddModel(R.drawable.burgerdis,""));
        homeHorAddModels.add(new HomeHorAddModel(R.drawable.foodvouc,""));
        homeHorAddModels.add(new HomeHorAddModel(R.drawable.steakoff,""));
        homeHorAddAdapter =new HomeHorAddAdapter(getActivity(),homeHorAddModels);
        homehorizontalAddrec.setAdapter(homeHorAddAdapter);
        homehorizontalAddrec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homehorizontalAddrec.setHasFixedSize(true);
        homehorizontalAddrec.setNestedScrollingEnabled(false);


        //////////vertical model
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);
        homeVermodelList =new ArrayList<>();




        homeVarAdapter =new HomeVarAdapter(getActivity(),homeVermodelList);
        homeVerticalRec.setAdapter(homeVarAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));


        return root;

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVermodel> list) {
        homeVarAdapter=new HomeVarAdapter(getContext(),list);
        homeVarAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVarAdapter);
    }
}