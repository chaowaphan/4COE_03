package com.example.chaow.applicationexam;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import org.opencv.android.OpenCVLoader;

import java.time.Instant;


public class MainActivity extends BaseActivity {


    // OpenCV Load
    static {

        System.loadLibrary("native-lib");

        if(OpenCVLoader.initDebug()) {
            Log.i("OpenCV", "Success");
        }
        else {
            Log.i("OpenCV", "Fail");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_main, contentFrameLayout);

        // ------------------------------------------------------------------------------------ //



        CardView card_view = (CardView) findViewById(R.id.new_class); // creating a CardView and assigning a value.

        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity_NewClassActivity();
            }
        });


        // ------------------------------------------------------------------------------------ //

    }


    // ------------------------------------------------------------------------------------ //

    public void OpenActivity_NewClassActivity() {
        Intent NewClassActivity = new Intent(getApplicationContext(), NewClassActivity.class);
        startActivity(NewClassActivity);
    }

    // ------------------------------------------------------------------------------------ //

    }

