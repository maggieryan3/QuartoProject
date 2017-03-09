package com.example.ryanmar19.quarto.quarto;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.ryanmar19.quarto.R;
import com.example.ryanmar19.quarto.game.GameHumanPlayer;
import com.example.ryanmar19.quarto.game.GameMainActivity;
import com.example.ryanmar19.quarto.game.infoMsg.GameInfo;

/**
 * Created by maggi on 3/8/2017.
 */


public class QuartoHumanPlayer extends GameHumanPlayer {
	/* instance variables */

    // the most recent game state, as given to us by the QuartoLocalGame
    private QuartoState state;

    // the android activity that we are running
    private GameMainActivity myActivity;

    /**
     * constructor
     * @param name
     * 		the player's name
     */
    public QuartoHumanPlayer(String name) {
        super(name);
    }

    /**
     * Returns the GUI's top view object
     *
     * @return
     * 		the top object in the GUI's view heirarchy
     */
    public View getTopView() {return null;}

    /**
     * callback method when we get a message (e.g., from the game)
     *
     * @param info
     * 		the message
     */
    @Override
    public void receiveInfo(GameInfo info) {
        // ignore the message if it's not a CounterState message
        if (!(info instanceof QuartoState)) return;

        // update our state; then update the display
        this.state = (QuartoState)info;
        //updateDisplay();
    }

    @Override
    public void setAsGui(GameMainActivity activity) {
        // remember the activity
        myActivity = activity;

        // Load the layout resource for our GUI
        activity.setContentView(R.layout.activity_main);

        Piece piece[] = new Piece[16]; //Array of all game pieces

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


/*        //button setup
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
        bluelargefilledsquare.setOnClickListener(new ButtonListener());*/
    }
}
