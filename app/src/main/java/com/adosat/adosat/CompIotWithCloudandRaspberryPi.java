package com.adosat.adosat;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CompIotWithCloudandRaspberryPi extends Fragment {

    public CompIotWithCloudandRaspberryPi() {
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
        View root = inflater.inflate(R.layout.activity_comp_iot_with_cloudand_raspberry_pi, container, false);

        Button btn1 = (Button) root.findViewById(R.id.iotcsearduino);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IotCseItArduino.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) root.findViewById(R.id.iotcserasberrypi);
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
