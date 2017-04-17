package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/10/2017.
 */

public class QuartoPlayPieceAction extends GameAction {

    // to support the Serializable interface
    private static final long serialVersionUID = 30672013L;

    //Instance variables
    int playedPieceNum;
    int x;
    int y;

    /**
     * constructor for QuartoPlayPieceAction
     *
     * @param player the player who created the action
     * @param initX the board x-coordinate
     * @param initY the board y-coordinate
     * @param initPieceNum the pieceNum of the piece being played
     *
     */
    public QuartoPlayPieceAction(GamePlayer player, int initX, int initY, int initPieceNum) {
        super(player);
        playedPieceNum = initPieceNum;
        x = initX;
        y = initY;
    }

}
