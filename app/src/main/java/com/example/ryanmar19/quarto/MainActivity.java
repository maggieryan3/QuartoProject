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

   /* //piece setup
    ImageView blueLargeHollowSquare = (ImageView) findViewById(R.id.bluelargehollowsquare);
    blueLargeHollowSquare.setOnTouchListener(new View.OnTouchListener() {
        Rect rect;

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN){
                blueLargeHollowSquare.setColorFilter(Color.argb(50, 0, 0, 0));
                rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
            }
            if(event.getAction() == MotionEvent.ACTION_UP){
                blueLargeHollowSquare.setColorFilter(Color.argb(0, 0, 0, 0));
            }
            if(event.getAction() == MotionEvent.ACTION_MOVE){
                if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                    blueLargeHollowSquare.setColorFilter(Color.argb(0, 0, 0, 0));
                }
            }
            return false;
        }
    })*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listeners
        quartoButton.setOnClickListener(new ButtonListener());
        exitButton.setOnClickListener(new ButtonListener());

        //other
        int stage = 0;
    }
}