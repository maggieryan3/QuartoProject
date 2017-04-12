package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/10/2017.
 */

public class QuartoPlayPieceAction extends GameAction {

    int playedPieceNum;
    int x;
    int y;

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public QuartoPlayPieceAction(GamePlayer player, int initX, int initY, int initPieceNum) {
        super(player);
        playedPieceNum = initPieceNum;
        x = initX;
        y = initY;
    }

}
