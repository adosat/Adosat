package com.adosat.adosat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Departments extends AppCompatActivity {

    CardView cdview;
    CardView cdview2;
    CardView cdview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        getIntent();

        cdview=(CardView) findViewById(R.id.card_view1);
        cdview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent in = new Intent(Departments.this, ComputerAndItCourses.class);
                startActivity(in);
            }
        });
        cdview2=(CardView) findViewById(R.id.card_view2);
        cdview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent card2 = new Intent(Departments.this, MechAndCivilCourses.class);
                startActivity(card2);
            }
        });
        cdview3=(CardView) findViewById(R.id.card_view3);
        cdview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent card3 = new Intent(Departments.this, EEEandECECourses.class);
                startActivity(card3);
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
            callIntent.setData(Uri.parse("tel:7338884062"));
            startActivity(callIntent);
        }
        //if (id == R.id.map) {
           // Intent mapIntent = new Intent(Departments.this,MapsActivity.class);
            //startActivity(mapIntent);
        //}

        return super.onOptionsItemSelected(item);
    }

}
