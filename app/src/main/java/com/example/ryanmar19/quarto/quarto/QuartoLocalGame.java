package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.game.GamePlayer;
import com.example.ryanmar19.quarto.game.LocalGame;
import com.example.ryanmar19.quarto.game.actionMsg.GameAction;

import static android.os.SystemClock.sleep;


public class QuartoLocalGame extends LocalGame {

    // the game's state
    protected QuartoState state;

    /**
     * Constructor for the QuartoLocalGame.
     */
    public QuartoLocalGame() {

        // perform superclass initialization
        super();

        // create a new, unfilled-in QuartoState object
        state = new QuartoState();
    }

    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        // make a copy of the state, and send it to the player
        p.sendInfo(new QuartoState(state));
    }

    @Override
    protected boolean canMove(int playerIdx) {
        if(playerIdx == state.turn){
            return true;
        }
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        if(state.gameOver == true){
            return this.playerNames[state.turn] + " has won!";
        }
        else if(state.boardFull == true){
            if(state.checkIfQuarto() == true) {
                return this.playerNames[state.turn] + " has won!";
            }
            else {return "Tie!";}
        }
        else{
            return null;
        }
    }

    @Override
    protected boolean makeMove(GameAction action) {
        if (action instanceof QuartoPickPieceAction) {
            state.PickPieceAction((QuartoPickPieceAction)action);
            this.sendUpdatedStateTo(players[0]);
            this.sendUpdatedStateTo(players[1]);
            return true;
        }
        if (action instanceof QuartoPlayPieceAction) {
            state.PlayPieceAction((QuartoPlayPieceAction)action);
            this.sendUpdatedStateTo(players[0]);
            this.sendUpdatedStateTo(players[1]);
            return true;
        }
        if (action instanceof QuartoClaimVictoryAction) {
            state.ClaimVictoryAction((QuartoClaimVictoryAction)action);
            if(state.ClaimVictoryAction((QuartoClaimVictoryAction)action) == true){
                this.checkIfGameOver();
            }
            this.sendUpdatedStateTo(players[0]);
            this.sendUpdatedStateTo(players[1]);
            return true;
        }
        return false;
    }
}
