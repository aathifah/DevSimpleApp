package com.example.devsimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.loadUrl("https://poltekssn.ac.id");
    }
}