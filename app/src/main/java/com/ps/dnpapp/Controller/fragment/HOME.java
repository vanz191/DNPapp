package com.ps.dnpapp.Controller.fragment;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ps.dnpapp.R;


public class HOME extends Fragment {


    public HOME() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        // Inflate the layout for this fragment
        return v;
    }

}
