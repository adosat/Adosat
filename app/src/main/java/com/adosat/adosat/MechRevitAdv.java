package com.adosat.adosat;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MechRevitAdv extends Fragment {

    public MechRevitAdv() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =  inflater.inflate(R.layout.activity_mech_revit_adv, container, false);
        Button btn1 = (Button) root.findViewById(R.id.bsylla);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MechRevitAdvSyllabus.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) root.findViewById(R.id.bsyllas);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MechRevitInter.class);
                startActivity(intent);
            }
        });
        return root;
    }

}
