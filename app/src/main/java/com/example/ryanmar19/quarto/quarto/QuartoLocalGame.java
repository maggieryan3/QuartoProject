package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.LocalGame;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/8/2017.
 */

public class QuartoLocalGame extends LocalGame {
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

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
