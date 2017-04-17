package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/10/2017.
 */

public class QuartoPickPieceAction extends GameAction {

    // to support the Serializable interface
    private static final long serialVersionUID = 30672013L;

    //pieceNum of the selected piece
    int pieceNum;

    /**
     * constructor for QuartoPickPieceAction
     *
     * @param player the player who created the action
     * @param initPieceNum the pieceNum of the selected piece
     */
    public QuartoPickPieceAction(GamePlayer player, int initPieceNum) {
        super(player);
        pieceNum = initPieceNum;
    }

}
