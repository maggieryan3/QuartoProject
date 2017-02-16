package com.example.ryanmar19.quarto;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

import static com.example.ryanmar19.quarto.R.id.quartoButton;

public class MainActivity extends Activity {

    //button setup
    Button quartoButton = (Button) findViewById(R.id.quartoButton);
    Button exitButton = (Button) findViewById(R.id.exitButton);
    ToggleButton userMessage = (ToggleButton) findViewById(R.id.userMessageButton);
    ImageView bluelargehollowsquare = (ImageView) findViewById(R.id.bluelargehollowsquare);
    //ToggleButton helpText = (ToggleButton) findViewById(R.id.helpTextToggle)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listeners
        quartoButton.setOnClickListener(new ButtonListener());
        exitButton.setOnClickListener(new ButtonListener());
        userMessage.setOnClickListener(new ToggleListener());
    }
}