package com.adosat.adosat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by jenith on 7/15/2016.
 */
public class MobileAppDevelopmentActivity extends Activity {
    CardView crdview1,crdview2,crdview3,crdview4;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_app_development);
        crdview1=(CardView)findViewById(R.id.card_view);
        crdview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileAppDevelopmentActivity.this,AndroidAppdevelopment.class);
                startActivity(intent);
            }
        });

        crdview2=(CardView)findViewById(R.id.card_view1);
        crdview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileAppDevelopmentActivity.this,IosDevelopmentActivity.class);
                startActivity(intent);
            }
        });
        crdview3=(CardView)findViewById(R.id.card_view3);
        crdview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileAppDevelopmentActivity.this,WindowsDevelopmentActivity.class);
                startActivity(intent);
            }
        });
        crdview4=(CardView)findViewById(R.id.card_view2);
        crdview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileAppDevelopmentActivity.this,CrossPlatformActivity.class);
                startActivity(intent);
            }
        });
    }
}