package com.adosat.adosat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by jenith on 7/15/2016.
 */
public class IosDevelopmentActivity extends AppCompatActivity {
    WebView mWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios_appdevelopment);

        mWebView = (WebView) findViewById(R.id.web2);

        String text = "<html><body>" + "<p align=\"justify\">"
                + getString(R.string.aboutus) + "</p> " + "</body></html>";

        mWebView.loadData(text, "text/html", "utf-8");
    }
}