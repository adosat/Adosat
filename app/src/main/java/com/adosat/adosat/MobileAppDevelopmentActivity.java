package com.adosat.adosat;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MobileAppDevelopmentActivity extends AppCompatActivity {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();




        if (id == R.id.call) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:7338884063"));
            startActivity(callIntent);
        }

        if (id == R.id.email) {
            Intent mailpIntent = new Intent(this,Mail.class);
            startActivity(mailpIntent);
        }

        if (id == R.id.map) {
            Intent mapIntent = new Intent(MobileAppDevelopmentActivity.this,MapsActivity.class);
            startActivity(mapIntent);
        }
        if (id == R.id.fb) {
            Intent mapIntent = new Intent(MobileAppDevelopmentActivity.this,FollowFacebook.class);
            startActivity(mapIntent);
        }
        if (id == R.id.aboutus) {
            Intent mapIntent = new Intent(MobileAppDevelopmentActivity.this,AboutUs.class);
            startActivity(mapIntent);
        }


        return super.onOptionsItemSelected(item);
    }
}