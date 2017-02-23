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
        pieces[0].solidity = 'h';
        pieces[0].shape = 's';

        //Blue Large Filled Square
        pieces[1].myPieceId = R.id.bluelargefilledsquare;
        pieces[1].color = 'b';
        pieces[1].size = 'l';
        pieces[1].solidity = 'f';
        pieces[1].shape = 's';

        //Blue Small Hollow Square
        pieces[2].myPieceId = R.id.bluesmallhollowsquare;
        pieces[2].color = 'b';
        pieces[2].size = 's';
        pieces[2].solidity = 'h';
        pieces[2].shape = 's';

        //Blue Small Filled Square
        pieces[3].myPieceId = R.id.bluesmallfilledsquare;
        pieces[3].color = 'b';
        pieces[3].size = 's';
        pieces[3].solidity = 'f';
        pieces[3].shape = 's';

        //Yellow Large Hollow Square
        pieces[4].myPieceId = R.id.yellowlargehollowsquare;
        pieces[4].color = 'y';
        pieces[4].size = 'l';
        pieces[4].solidity = 'h';
        pieces[4].shape = 's';

        //Yellow Large Filled Square
        pieces[5].myPieceId = R.id.yellowlargefilledsquare;
        pieces[5].color = 'y';
        pieces[5].size = 'l';
        pieces[5].solidity = 'f';
        pieces[5].shape = 's';

        //Yellow small hollow square
        pieces[6].myPieceId = R.id.yellowsmallhollowsquare;
        pieces[6].color = 'y';
        pieces[6].size = 's';
        pieces[6].solidity = 'h';
        pieces[6].shape = 's';

        //Yellow small filled square
        pieces[7].myPieceId = R.id.yellowsmallfilledsquare;
        pieces[7].color = 'y';
        pieces[7].size = 's';
        pieces[7].solidity = 'f';
        pieces[7].shape = 's';

        //Blue Large hollow circle
        pieces[8].myPieceId = R.id.bluelargehollowsquare;
        pieces[8].color = 'b';
        pieces[8].size = 'l';
        pieces[8].solidity = 'h';
        pieces[8].shape = 'c';

        //Blue Large filled Circle
        pieces[9].myPieceId = R.id.bluelargefilledcircle;
        pieces[9].color = 'b';
        pieces[9].size = 'l';
        pieces[9].solidity = 'f';
        pieces[9].shape = 'c';

        //Blue small hollow circle
        pieces[10].myPieceId = R.id.bluesmallhollowcircle;
        pieces[10].color = 'b';
        pieces[10].size = 's';
        pieces[10].solidity = 'h';
        pieces[10].shape = 'c';

        //Blue small filled circle
        pieces[11].myPieceId = R.id.bluesmallfilledcircle;
        pieces[11].color = 'b';
        pieces[11].size = 's';
        pieces[11].solidity = 'f';
        pieces[11].shape = 'c';

        //Yellow large hollow circle
        pieces[12].myPieceId = R.id.yellowlargehollowcircle;
        pieces[12].color = 'y';
        pieces[12].size = 'l';
        pieces[12].solidity = 'h';
        pieces[12].shape = 'c';

        //Yellow large filled circle
        pieces[13].myPieceId = R.id.yellowlargefilledcircle;
        pieces[13].color = 'y';
        pieces[13].size = 'l';
        pieces[13].solidity = 'f';
        pieces[13].shape = 'c';

        //Yellow small hollow circle
        pieces[14].myPieceId = R.id.yellowsmallhollowcircle;
        pieces[14].color = 'y';
        pieces[14].size = 's';
        pieces[14].solidity = 'h';
        pieces[14].shape = 'c';

        //Yellow small filled circle
        pieces[15].myPieceId = R.id.yellowsmallfilledcircle;
        pieces[15].color = 'y';
        pieces[15].size = 's';
        pieces[15].solidity = 'f';
        pieces[15].shape = 'c';

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

    //Deep copies a Quartostate
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
        playerId = original.playerId; //id is 1 or 2
        turn = original.turn; //playerId of whose turn it is

    }

    //get ID of player
    public int getPlayerId()
    {
        return playerId;
    }

    //set the ID of player
    public void setPlayerId(int playerId)
    {
        playerId = this.playerId;
    }

    //get who's turn it is (human or computer)
    public int getTurn()
    {
        return turn;
    }

    //set who's turn it is
    public void setTurn (int turn)
    {
        turn = this.turn;
    }

    //get a piece from the bank
    public Piece getBankPiece(int pieceNumber)
    {
        return pieces[pieceNumber];
    }

    //get a piece from the board
    public Piece getBoardPiece(int row, int col)
    {
        return boardPieces[row][col];
    }

    //sets place on board to a certain piece
    public void setBoardPiece(Piece piece, int row, int col)
    {
        boardPieces[row][col] = piece;
    }

    //get ID of piece
    public int getPiecesId(Piece piece)
    {
        return piece.myPieceId;
    }

    //get color of piece
    public char getPieceColor(Piece piece)
    {
        return piece.color;
    }

    //get size of piece
    public char getPieceSize(Piece piece)
    {
        return piece.size;
    }

    //get shape of piece
    public char getPieceShape(Piece piece)
    {
        return piece.shape;
    }

    //get solidity of piece
    public char getPieceSolidity(Piece piece)
    {
        return piece.solidity;
    }

}

