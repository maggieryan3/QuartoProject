package com.example.ryanmar19.quarto;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by ryanmar19 on 2/15/2017.
 */

public class ButtonListener implements View.OnClickListener
{
    int stage = 0;

    @Override
    public void onClick(View view) {
        int buttonSelection = view.getId();

        if(buttonSelection == R.id.quartoButton){
            Button myButton = (Button) view;
            if(stage == 0){
                myButton.setText("Try Again!");
                myButton.setBackgroundColor(0xFFFF0000);
                stage = 1;
            }
            if(stage == 1){
                myButton.setText("WINNER!");
                myButton.setBackgroundColor(0xFF00FF00);
                stage = 2;
            }
            else if(stage == 1 || stage == 2){
                myButton.setText("QUARTO!");
                myButton.setBackgroundColor(0xFFCCCC99);
                stage = 0;
            }
        }

        if(buttonSelection == R.id.bluelargehollowsquare){
            ImageView myImage = (ImageView)view;

            //myImage.setImageTintMode();
        }
    }
}
