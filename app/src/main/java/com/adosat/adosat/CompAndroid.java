package com.adosat.adosat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.DropBoxManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



import java.util.ArrayList;

public class CompAndroid extends Fragment {

    public CompAndroid() {
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
        View root =  inflater.inflate(R.layout.activity_comp_android, container, false);

        Button btn1 = (Button) root.findViewById(R.id.bsylla);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AndroidBeginner.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) root.findViewById(R.id.bsyllas);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AndroidIntermediate.class);
                startActivity(intent);
            }
        });
        Button btn3 = (Button) root.findViewById(R.id.bsyllase);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AndroidAdvanced.class);
                startActivity(intent);
            }
        });
        Button btn4 = (Button) root.findViewById(R.id.bsyllast);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AndroidExpert.class);
                startActivity(intent);
            }
        });
        return root;


    }
}
