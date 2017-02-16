package com.example.ryanmar19.quarto;

import android.view.View;
import android.widget.ToggleButton;

/**
 * Created by ryanmar19 on 2/13/2017.
 */

public class ToggleListener implements View.OnClickListener {

    @Override
    public void onClick(View v)
    {
        int toggleSelection = v.getId();

        if(toggleSelection == R.id.userMessageButton)
        {
            ToggleButton myButton = (ToggleButton)v;
            //to be continued
        }

        /* For new Help Text Toggle button
        if (toggleSelection == R.id.helpTextToggle)
        {
            ToggleButton myButton = (ToggleButton)v;
        }
        */
    }
}
