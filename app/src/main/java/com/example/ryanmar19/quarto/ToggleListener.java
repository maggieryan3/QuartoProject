package com.example.ryanmar19.quarto;

import android.view.View;
import android.widget.ToggleButton;

import static com.example.ryanmar19.quarto.R.id.userMessageButton;

/**
 * Created by ryanmar19 on 2/13/2017.
 */

public class ToggleListener implements View.OnClickListener {

    @Override
    public void onClick(View v)
    {
        int toggleSelection = v.getId();

        if(toggleSelection == userMessageButton)
        {
            ToggleButton myButton = (ToggleButton)v;
            //to be continued
        }
    }
}
