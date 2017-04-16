package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GameComputerPlayer;
import com.example.ryanmar19.quarto.game.infoMsg.GameInfo;


public class QuartoComputerPlayer2 extends GameComputerPlayer {

    public QuartoComputerPlayer2(String name) {
        // invoke superclass constructor
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        // if it's not a QuartoState message, ignore it; otherwise
        // cast it
        if (!(info instanceof QuartoState)) return;
        QuartoState myState = (QuartoState) info;

        // if it's not our move, ignore it
        if (myState.turn != this.playerNum) return;

        //if pieckedPiece is not null, pick a random piece until we find an empty spot on board
        if (myState.pickedPiece != null) {
            sleep(500);
            // pick x and y positions at random (0-3)
            boolean playedPiece = false;
            do {
                int xVal = (int) (4 * Math.random());
                int yVal = (int) (4 * Math.random());
                if (myState.boardPieces[xVal][yVal] == null) {
                    QuartoPlayPieceAction action = new QuartoPlayPieceAction(this, xVal, yVal, myState.pickedPiece.pieceNum);
                    game.sendAction(action);
                    return;
                }
            } while (playedPiece == false);
        }
        else if (myState.pickedPiece == null) {
            sleep(1000);
            //pick piece
            boolean pickedPiece = false;
            do {
                int ranVal = (int) (15 * Math.random());
                if (myState.bankPieces[ranVal] != null) {
                    QuartoPickPieceAction action = new QuartoPickPieceAction(this, ranVal);
                    game.sendAction(action);
                    return;
                }
            }while (pickedPiece == false);
        }
    }
}


