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


public class Fragment_chelsea extends Fragment {


    public Fragment_chelsea() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment_chelsea, container, false);
        ListView chelsea=v.findViewById(R.id.chelsea);
        chelsea.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String[] chelsea = getActivity().getResources().getStringArray(R.array.chelsea);
                String name = chelsea[position];
                Toast.makeText(getContext(),""+name,Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}
