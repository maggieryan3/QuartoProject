package com.example.ryanmar19.quarto;

import android.widget.ImageView;

/**
 * Created by maggie on 2/19/2017.
 */

public class QuartoState {

    //Variables
    Piece pieces[] = new Piece[16];
    Piece bankPieces[] = new Piece[16]; //Array of pieces in bank
    Piece boardPieces[][] = new Piece[4][4]; //Array of pieces on board
    int playerId; //id is 1 or 2
    int turn; //playerId of whose turn it is

    //Basic Constructor
    public QuartoState()
    {
        //piece initialize
        //Blue Large Hollow Square
        pieces[0].myPieceId = R.id.bluelargehollowsquare;
        pieces[0].color = 'b';
        pieces[0].size = 'l';
        pieces[0].shape = 's';

        //Blue Large Filled Square
        pieces[1].myPieceId = R.id.bluelargefilledsquare;
        pieces[0].color = 'b';
        pieces[0].size = 'l';
        pieces[0].shape = 's';

        //Blue Small Hollow Square
        pieces[2].myPieceId = R.id.bluesmallhollowsquare;
        pieces[0].color = 'b';
        pieces[0].size = 'l';
        pieces[0].shape = 's';

        //Blue Small Filled Square
        pieces[3].myPieceId = R.id.bluesmallfilledsquare;
        pieces[0].color = 'b';
        pieces[0].size = 'l';
        pieces[0].shape = 's';

        //board initializer
        for(int i=0; i<16; i++) {
            boardPieces[i] = null;
        }

        //bank initializer
        for(int i=0; i<16; i++) {
            bankPieces[i] = pieces[i];
        }

        //turn: player 1 goes first
        turn = 1;

    }

    public QuartoState(QuartoState original) {

        //Pieces
        Piece pieces[] = new Piece[16];
        for(int i=0; i<16; i++)
        {
            pieces[i] = original.pieces[i];
        }

        //Board
        Piece boardPieces[][] = new Piece[4][4]; //Array of pieces on board
        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                boardPieces[i][j] = original.boardPieces[i][j];
            }
        }

        //Bank
        Piece bankPieces[] = new Piece[16]; //Array of pieces in bank
        for(int i=0; i<16; i++)
        {
            bankPieces[i] = original.bankPieces[i];
        }

        //Variable deep copies
        int playerId = original.playerId; //id is 1 or 2
        int turn = original.turn; //playerId of whose turn it is

    }
}

