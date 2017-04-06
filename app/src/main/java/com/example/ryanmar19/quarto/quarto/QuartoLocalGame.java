package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.LocalGame;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/8/2017.
 */

public class QuartoLocalGame extends LocalGame {

    // the game's state
    protected QuartoState state;

    /**
     * Constructor for the TTTLocalGame.
     */
    public QuartoLocalGame() {

        // perform superclass initialization
        super();

        // create a new, unfilled-in TTTState object
        state = new QuartoState();
    }

    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        // make a copy of the state, and send it to the player
        p.sendInfo(new QuartoState(state));
    }

    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }
}
