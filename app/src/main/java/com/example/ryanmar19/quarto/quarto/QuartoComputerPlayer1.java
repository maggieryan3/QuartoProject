package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GameComputerPlayer;
import com.example.ryanmar19.quarto.game.infoMsg.GameInfo;
import com.example.ryanmar19.quarto.game.infoMsg.NotYourTurnInfo;

/**
 * Created by maggi on 3/8/2017.
 */

public class QuartoComputerPlayer1 extends GameComputerPlayer {

    public QuartoComputerPlayer1(String name) {
        // invoke superclass constructor
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        // if it was a "not your turn" message, just ignore it
        if (info instanceof NotYourTurnInfo) return;

        // pick x and y positions at random (0-2)
        int xVal = (int)(3*Math.random());
        int yVal = (int)(3*Math.random());

        // delay for a second to make opponent think we're thinking
        sleep(1000);

        // Submit our move to the game object. We haven't even checked it it's
        // our turn, or that that position is unoccupied. If it was not our turn,
        // we'll get a message back that we'll ignore. If it was an illegal move,
        // we'll end up here again (and possibly again, and again). At some point,
        // we'll end up randomly pick a move that is legal.
        //game.sendAction();

    }
}
