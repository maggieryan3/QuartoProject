package com.example.ryanmar19.quarto.quarto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.example.ryanmar19.quarto.R;

public class MainActivity extends Activity {

    Piece piece[] = new Piece[16]; //Array of all com.example.ryanmar19.quarto.game pieces

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
        turnCheckbox.setOnClickListener(new ButtonListener());
        bluelargehollowsquare.setOnClickListener(new ButtonListener());
        bluelargefilledsquare.setOnClickListener(new ButtonListener());
    }
}