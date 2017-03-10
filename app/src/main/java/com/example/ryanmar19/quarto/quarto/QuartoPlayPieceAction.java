package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

/**
 * Created by maggi on 3/10/2017.
 */

public class QuartoPlayPieceAction extends GameAction {

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public QuartoPlayPieceAction(GamePlayer player) {
        super(player);
    }

    Piece playedPiece;
    int row;
    int col;
}
