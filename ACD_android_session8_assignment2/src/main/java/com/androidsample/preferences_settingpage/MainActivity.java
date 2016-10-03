package com.androidsample.preferences_settingpage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.preference.PreferenceActivity;
import android.os.Bundle;


public class MainActivity extends PreferenceActivity {



        @SuppressWarnings("deprecation")

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);          /** Setting Preferences resource to the PreferenceActivity */

            addPreferencesFromResource(R.xml.preferences);

        }
       /* super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.view.View.OnClickListener settingsClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SettingsActivity.class);
                startActivity(intent);


            }
        };

     *//*   *//**//** Defining a click  listener *//**//*
        android.view.View.OnClickListener showClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ShowActivity.class);
                startActivity(intent);
            }
        };*//*

        *//** Getting a reference to button object of the main layout *//*
        Button btnSettings = (Button) findViewById(R.id.btn_settings);
        btnSettings.setOnClickListener(settingsClickListener);

*//*        *//**//** Getting a reference to button object of the main layout *//**//*
        Button btnShow = (Button) findViewById(R.id.btn_show);
        btnShow.setOnClickListener(showClickListener);*//*



*/

    }

