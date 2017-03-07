package com.example.ryanmar19.quarto.quarto;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.ryanmar19.quarto.R;

/**
 * Created by ryanmar19 on 2/15/2017.
 */

public class ButtonListener implements View.OnClickListener
{
    int quartoStage = 0;
    int imageStage = 0; //0 = button not clicked, 1 = button clicked
    int checkboxState = 0; //0 = "Finish Turn", 1 = "Turn Complete!"

    @Override
    public void onClick(View view) {
        int buttonSelection = view.getId();

        //Quarto button
        if(buttonSelection == R.id.theQuartoButton){
            Button myButton = (Button)view;

            if(quartoStage == 0){
                myButton.setText("Try Again!");
                myButton.setBackgroundColor(0xFFFF0000);
                quartoStage = 1;
            }
            else if(quartoStage == 1){
                myButton.setText("WINNER!");
                myButton.setBackgroundColor(0xFF00FF00);
                quartoStage = 2;
            }
            else if(quartoStage == 2){
                myButton.setText("QUARTO!");
                myButton.setBackgroundColor(0xFFc5d789);
                quartoStage = 0;
            }
        }

        //CheckBox
        if(buttonSelection == R.id.turnCheckbox)
        {
            CheckBox myCheckbox = (CheckBox)view;

            if(checkboxState == 0) {
                myCheckbox.setText("Turn Complete!");
                checkboxState = 1;
            }
            else if(checkboxState == 1){
                myCheckbox.setText("Finish Turn");
                checkboxState = 0;
            }
        }

        //image selections
        if(buttonSelection == R.id.bluelargehollowsquare || buttonSelection == R.id.bluelargefilledsquare){
            ImageView myImage = (ImageView)view;

            if(imageStage == 0) {
                myImage.setColorFilter(Color.argb(30, 255, 255, 255)); // White Tint
                imageStage = 1;
            }
            else if(imageStage == 1) {
                myImage.clearColorFilter(); // no filter
                imageStage = 0;
            }
        }


    }
}
