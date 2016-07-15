package com.adosat.adosat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;


    CardView crdview,crdview1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaPlayer= MediaPlayer.create(this, R.raw.adosat);
        mMediaPlayer.start();

        crdview = (CardView) findViewById(R.id.courses);
        crdview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent in = new Intent(DashBoard.this, Departments.class);
                startActivity(in);
            }
        });
        crdview1 = (CardView) findViewById(R.id.mobdev);
        crdview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code in here!
                Intent in = new Intent(DashBoard.this, MobileAppDevelopmentActivity.class);
                startActivity(in);
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

        if (id == R.id.email) {
            Intent mailpIntent = new Intent(this,Mail.class);
            startActivity(mailpIntent);
        }

        if (id == R.id.map) {
           Intent mapIntent = new Intent(DashBoard.this,MapsActivity.class);
           startActivity(mapIntent);
        }
        if (id == R.id.fb) {
            Intent mapIntent = new Intent(DashBoard.this,FollowFacebook.class);
            startActivity(mapIntent);
        }


        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        mMediaPlayer.stop();
        finish();
    }

}