package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GameComputerPlayer;
import com.example.ryanmar19.quarto.game.infoMsg.GameInfo;

/**
 * class QuartoComputerPlayer1
 *
 * is the computer player that is our dumb AI. Functions as an opponent to
 * the human player, or to another computer player.
 *
 * @author Maggie Ryan
 * @author Elizabeth Moran
 * @author Lucy Davidson
 * @version April 2017
 */

public class QuartoComputerPlayer1 extends GameComputerPlayer {

    /**
     * constructor for QuartoComputerPlayer1
     *
     * @param name the name of the player
     */
    public QuartoComputerPlayer1(String name) {
        // invoke superclass constructor
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        // if it's not a Quarto State message, ignore it; otherwise cast it
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
                    //if there is a quarto, 50% chance we will "call" it
                    if(myState.checkIfQuarto() == true){
                        int random = (int) (10 * Math.random());
                        if(random < 5){
                            QuartoClaimVictoryAction win = new QuartoClaimVictoryAction(this);
                            game.sendAction(win);
                            return;
                        }
                    }
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
