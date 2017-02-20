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

/*Homework#4d
[10] When tapped, first game piece in first row (large hollow blue square) will be highlighted with slight white tint to indicate user has selected it.
[5] When tapped again, it reverts to being drawn in the original way.
[5] Second game piece in first row (large solid blue square) responds in the same way.
[10] Quarto button, when tapped, will say "WINNER!" in green or "TRY AGAIN!" in red to signify in player did win game or not.
[5] Toggle button, when tapped, alternates between "PICK THE PIECE!" and "PLAY THE PIECE!" to indicate what a user's next move is.
[15] CheckBox in top left corner that when tapped will signify the end of a users turn. Alternates between "Finish Turn" and "Turn Complete!"
*/

public class MainActivity extends Activity {

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