package com.example.ryanmar19.quarto.quarto;


import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ryanmar19.quarto.R;
import com.example.ryanmar19.quarto.game.GameHumanPlayer;
import com.example.ryanmar19.quarto.game.GameMainActivity;
import com.example.ryanmar19.quarto.game.infoMsg.GameInfo;

import static com.example.ryanmar19.quarto.R.drawable.blue_large_solid_square;
import static com.example.ryanmar19.quarto.R.id.board;
import static com.example.ryanmar19.quarto.R.id.imageView2;

/**
 * Created by maggi on 3/8/2017.
 */


public class QuartoHumanPlayer extends GameHumanPlayer implements View.OnClickListener {
	/* instance variables */

    // the most recent game state, as given to us by the QuartoLocalGame
    private QuartoState state;

    // the android activity that we are running
    private GameMainActivity myActivity;

    //board surface view
    SurfaceView boardSurfaceView;

    // whether or not a piece is highlighted (selected by opponent for human to play)
    int imageStage = 0; //0 - not highlighted/selected & 1 - highlighted/selected

    //array of piece images
    ImageView pieces[] = new ImageView[16];

    //button declarations
    Button myQuartoButton;
    Button myExitButton;
    TextView userMessage;

    //image declarations
    ImageView bluelargehollowsquare;
    ImageView bluelargefilledsquare;
    ImageView bluesmallhollowsquare;
    ImageView bluesmallfilledsquare;
    ImageView yellowlargehollowsquare;
    ImageView yellowlargefilledsquare;
    ImageView yellowsmallhollowsquare;
    ImageView yellowsmallfilledsquare;
    ImageView bluelargehollowcircle;
    ImageView bluelargefilledcircle;
    ImageView bluesmallhollowcircle;
    ImageView bluesmallfilledcircle;
    ImageView yellowlargehollowcircle;
    ImageView yellowlargefilledcircle;
    ImageView yellowsmallhollowcircle;
    ImageView yellowsmallfilledcircle;

    ImageView board1;

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

        //board SV
        boardSurfaceView = (SurfaceView)myActivity.findViewById(board);

        //button setup
        myQuartoButton = (Button) myActivity.findViewById(R.id.theQuartoButton);
        myExitButton = (Button) myActivity.findViewById(R.id.exitButton);
        userMessage = (TextView) myActivity.findViewById(R.id.userMessage);

        //pieces setup
        bluelargehollowsquare = (ImageView) myActivity.findViewById(R.id.bluelargehollowsquare);
        bluelargefilledsquare = (ImageView) myActivity.findViewById(R.id.bluelargefilledsquare);
        bluesmallhollowsquare = (ImageView) myActivity.findViewById(R.id.bluesmallhollowsquare);
        bluesmallfilledsquare = (ImageView) myActivity.findViewById(R.id.bluesmallfilledsquare);
        yellowlargehollowsquare = (ImageView) myActivity.findViewById(R.id.yellowlargehollowsquare);
        yellowlargefilledsquare = (ImageView) myActivity.findViewById(R.id.yellowlargefilledsquare);
        yellowsmallhollowsquare = (ImageView) myActivity.findViewById(R.id.yellowsmallhollowsquare);
        yellowsmallfilledsquare = (ImageView) myActivity.findViewById(R.id.yellowsmallfilledsquare);
        bluelargehollowcircle = (ImageView) myActivity.findViewById(R.id.bluelargehollowcircle);
        bluelargefilledcircle = (ImageView) myActivity.findViewById(R.id.bluelargefilledcircle);
        bluesmallhollowcircle = (ImageView) myActivity.findViewById(R.id.bluesmallhollowcircle);
        bluesmallfilledcircle = (ImageView) myActivity.findViewById(R.id.bluesmallfilledcircle);
        yellowlargehollowcircle = (ImageView) myActivity.findViewById(R.id.yellowlargehollowcircle);
        yellowlargefilledcircle = (ImageView) myActivity.findViewById(R.id.yellowlargefilledcircle);
        yellowsmallhollowcircle = (ImageView) myActivity.findViewById(R.id.yellowsmallhollowcircle);
        yellowsmallfilledcircle = (ImageView) myActivity.findViewById(R.id.yellowsmallfilledcircle);

        //board ImageViews
        board1 = (ImageView)myActivity.findViewById(imageView2);
        board1.setOnClickListener(this);

        //put ImageViews into array
        pieces[0] = bluelargehollowsquare;
        pieces[1] = bluelargefilledsquare;
        pieces[2] = bluesmallhollowsquare;
        pieces[3] = bluesmallfilledsquare;
        pieces[4] = yellowlargehollowsquare;
        pieces[5] = yellowlargefilledsquare;
        pieces[6] = yellowsmallhollowsquare;
        pieces[7] = yellowsmallfilledsquare;
        pieces[8] = bluelargehollowcircle;
        pieces[9] = bluelargefilledcircle;
        pieces[10] = bluesmallhollowcircle;
        pieces[11] = bluesmallfilledcircle;
        pieces[12] = yellowlargehollowcircle;
        pieces[13] = yellowlargefilledcircle;
        pieces[14] = yellowsmallhollowcircle;
        pieces[15] = yellowsmallfilledcircle;

        //listeners
        myQuartoButton.setOnClickListener(this);
        myExitButton.setOnClickListener(this);

        //piece listeners
        for(int i = 0; i<16; i++)
        {
            pieces[i].setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
            int buttonSelection = v.getId();

            //Quarto button
            if(buttonSelection == R.id.theQuartoButton) {
                Button myButton = (Button)v;
            }

            //board placement
            if(buttonSelection == R.id.imageView2)
            {
                board1.setImageResource(R.mipmap.blue_large_hollow_circle);
            }

            //image selections
            for(int i=0; i<16; i++) {
                int piece = pieces[i].getId();
                if (buttonSelection == piece) {
                    ImageView myImage = (ImageView)v;
                    if (imageStage == 0) {
                        myImage.setColorFilter(Color.argb(80, 0, 0, 0)); // Dark Tint
                        imageStage = 1;
                    } else if (imageStage == 1) {
                        myImage.clearColorFilter(); // no filter
                        imageStage = 0;
                    }
                }
            }
        }
}
