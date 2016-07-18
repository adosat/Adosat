package com.adosat.adosat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by jenith on 7/16/2016.
 */
public class SpokenEnglish extends AppCompatActivity {
    WebView mWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoken_english);

        mWebView = (WebView) findViewById(R.id.web6);

        String text = "<html><body>" + "<p align=\"justify\">"
                + getString(R.string.spoken) + "</p> " + "</body></html>";

        mWebView.loadData(text, "text/html", "utf-8");
    }
}

