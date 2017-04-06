package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/10/2017.
 */

public class QuartoPickPieceAction extends GameAction {

    Piece pickedPiece;

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public QuartoPickPieceAction(GamePlayer player, Piece initPiece) {
        super(player);
        pickedPiece = initPiece;
    }

}
