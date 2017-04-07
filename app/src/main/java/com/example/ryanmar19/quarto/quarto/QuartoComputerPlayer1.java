package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GameComputerPlayer;
import com.example.ryanmar19.quarto.game.infoMsg.GameInfo;
import com.example.ryanmar19.quarto.game.infoMsg.GameState;
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

        // Submit our move to the game object. We haven't even checked it it's
        // our turn, or that that position is unoccupied. If it was not our turn,
        // we'll get a message back that we'll ignore. At some point,
        // we'll end up randomly pick a move that is legal.
        if (info instanceof GameState) {
            QuartoState myState = (QuartoState) info;
            //play piece
            if (myState.pickedPiece != null) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (myState.boardPieces[i][j] == null) {
                            QuartoPlayPieceAction action = new QuartoPlayPieceAction(this,i,j,myState.pickedPiece.pieceNum);
                            game.sendAction(action);
                            return;
                        }
                    }
                }
            }
            //pick piece
            else if (myState.pickedPiece == null) {
                for (int i = 0; i < 16; i++) {
                    if (myState.bankPieces[i] == null)
                    {
                        QuartoPickPieceAction action = new QuartoPickPieceAction(this,i);
                        game.sendAction(action);
                        return;
                    }
                }
            }
        }
    }
}
