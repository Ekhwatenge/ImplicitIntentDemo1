package com.example.implicitintentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //declare an intent with action type view and we shall launch the webpage called android developer
    public void onLaunchWebPagebuttonClicked(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"));
        //start the activity and run project
        startActivity(intent);
    }

}