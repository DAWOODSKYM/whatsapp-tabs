package com.example.dave.whatsapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_arsenal extends Fragment {


    public Fragment_arsenal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment_arsenal, container, false);
        ListView arsenal=v.findViewById(R.id.arsenal);
        arsenal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String[] arsenal = getActivity().getResources().getStringArray(R.array.arsenal);
                String name = arsenal[position];
                Toast.makeText(getContext(),""+name,Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}
