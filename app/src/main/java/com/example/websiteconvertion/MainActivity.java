package com.example.websiteconvertion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview =(WebView) findViewById(R.id.webViewId);

        WebSettings webSettings = webview.getSettings();
        webSettings.getJavaScriptEnabled();

        webview.setWebViewClient(new WebViewClient());

        webview.loadUrl("https://www.tutorialspoint.com/android/index.htm");


    }
}