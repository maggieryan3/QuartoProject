package com.example.ryanmar19.quarto;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends Activity {

    //button declarations
    Button myQuartoButton;
    Button myExitButton;
    ToggleButton userMessage;
    CheckBox turnCheckbox;

    //image declarations
    ImageView bluelargehollowsquare;
    ImageView bluelargefilledsquare;
    ImageView bluesmallhollowsquare;
    ImageView bluesmallfilledsquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button setup
        myQuartoButton = (Button) findViewById(R.id.theQuartoButton);
        myExitButton = (Button) findViewById(R.id.exitButton);
        userMessage = (ToggleButton) findViewById(R.id.userMessageButton);
        turnCheckbox = (CheckBox) findViewById(R.id.turnCheckbox);

        //pieces setup
        bluelargehollowsquare = (ImageView) findViewById(R.id.bluelargehollowsquare);
        bluelargefilledsquare = (ImageView) findViewById(R.id.bluelargefilledsquare);
        bluesmallhollowsquare = (ImageView) findViewById(R.id.bluesmallhollowsquare);
        bluesmallfilledsquare = (ImageView) findViewById(R.id.bluesmallfilledsquare);

        //listeners
        myQuartoButton.setOnClickListener(new ButtonListener());
        myExitButton.setOnClickListener(new ButtonListener());
        userMessage.setOnClickListener(new ToggleListener());
        bluelargehollowsquare.setOnClickListener(new ButtonListener());
        bluelargefilledsquare.setOnClickListener(new ButtonListener());
        turnCheckbox.setOnClickListener(new ButtonListener());
    }
}