package com.adosat.adosat;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class EEEIotAndRasberryPie extends Fragment {

    private TextView t;
    public EEEIotAndRasberryPie() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.activity_eee_iot_and_rasberry_pie, container, false);

        Button btn1 = (Button) root.findViewById(R.id.aurdino);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IotEEE.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) root.findViewById(R.id.rasberrypi);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IotEeeRasberry.class);
                startActivity(intent);
            }
        });

        return root;
    }

}

