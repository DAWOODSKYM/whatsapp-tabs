package com.example.dave.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Fragment_manu extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    public Fragment_manu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_manu, container, false);
        ListView manu=v.findViewById(R.id.manu);
        manu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String[] manu = getActivity().getResources().getStringArray(R.array.manu);
                String name = manu[position];
                Toast.makeText(getContext(),""+name, Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }



}
