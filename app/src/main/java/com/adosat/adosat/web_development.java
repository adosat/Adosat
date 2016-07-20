package com.adosat.adosat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

public class web_development extends AppCompatActivity {
    WebView mWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_development2);

        mWebView = (WebView) findViewById(R.id.webview);

        String text = "<html><body>" + "<p align=\"justify\">"
                + getString(R.string.web_development) + "</p> " + "</body></html>";

        mWebView.loadData(text, "text/html", "utf-8");
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
            Intent mapIntent = new Intent(web_development.this,MapsActivity.class);
            startActivity(mapIntent);
        }
        if (id == R.id.fb) {
            Intent mapIntent = new Intent(web_development.this,FollowFacebook.class);
            startActivity(mapIntent);
        }
        if (id == R.id.aboutus) {
            Intent mapIntent = new Intent(web_development.this,AboutUs.class);
            startActivity(mapIntent);
        }


        return super.onOptionsItemSelected(item);
    }

}
