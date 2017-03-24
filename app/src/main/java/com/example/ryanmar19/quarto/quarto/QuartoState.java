package com.example.ryanmar19.quarto.quarto;

import com.example.ryanmar19.quarto.R;
import com.example.ryanmar19.quarto.game.infoMsg.GameState;

/**
 * Created by maggie on 2/19/2017.
 */

public class QuartoState extends GameState {

    //Variables
    public Piece pieces[] = new Piece[16];
    public Piece bankPieces[] = new Piece[16]; //Array of pieces in bank
    public Piece boardPieces[][] = new Piece[4][4]; //Array of pieces on board
    int playerId; //id is 1 or 2
    int turn; //playerId of whose turn it is
    boolean gameOver;
    public Piece pickedPiece;

    //Basic Constructor
    public QuartoState() {
        //piece initialize
        //Blue Large Hollow Square
        pieces[0].myPieceId = R.id.bluelargehollowsquare;
        pieces[0].color = 'b';
        pieces[0].size = 'l';
        pieces[0].solidity = 'h';
        pieces[0].shape = 's';
        pieces[0].pieceNum = 0;

        //Blue Large Filled Square
        pieces[1].myPieceId = R.id.bluelargefilledsquare;
        pieces[1].color = 'b';
        pieces[1].size = 'l';
        pieces[1].solidity = 'f';
        pieces[1].shape = 's';
        pieces[1].pieceNum = 1;

        //Blue Small Hollow Square
        pieces[2].myPieceId = R.id.bluesmallhollowsquare;
        pieces[2].color = 'b';
        pieces[2].size = 's';
        pieces[2].solidity = 'h';
        pieces[2].shape = 's';
        pieces[2].pieceNum = 2;

        //Blue Small Filled Square
        pieces[3].myPieceId = R.id.bluesmallfilledsquare;
        pieces[3].color = 'b';
        pieces[3].size = 's';
        pieces[3].solidity = 'f';
        pieces[3].shape = 's';
        pieces[3].pieceNum = 3;

        //Yellow Large Hollow Square
        pieces[4].myPieceId = R.id.yellowlargehollowsquare;
        pieces[4].color = 'y';
        pieces[4].size = 'l';
        pieces[4].solidity = 'h';
        pieces[4].shape = 's';
        pieces[4].pieceNum = 4;

        //Yellow Large Filled Square
        pieces[5].myPieceId = R.id.yellowlargefilledsquare;
        pieces[5].color = 'y';
        pieces[5].size = 'l';
        pieces[5].solidity = 'f';
        pieces[5].shape = 's';
        pieces[5].pieceNum = 5;

        //Yellow small hollow square
        pieces[6].myPieceId = R.id.yellowsmallhollowsquare;
        pieces[6].color = 'y';
        pieces[6].size = 's';
        pieces[6].solidity = 'h';
        pieces[6].shape = 's';
        pieces[6].pieceNum = 6;

        //Yellow small filled square
        pieces[7].myPieceId = R.id.yellowsmallfilledsquare;
        pieces[7].color = 'y';
        pieces[7].size = 's';
        pieces[7].solidity = 'f';
        pieces[7].shape = 's';
        pieces[7].pieceNum = 7;

        //Blue Large hollow circle
        pieces[8].myPieceId = R.id.bluelargehollowsquare;
        pieces[8].color = 'b';
        pieces[8].size = 'l';
        pieces[8].solidity = 'h';
        pieces[8].shape = 'c';
        pieces[8].pieceNum = 8;

        //Blue Large filled Circle
        pieces[9].myPieceId = R.id.bluelargefilledcircle;
        pieces[9].color = 'b';
        pieces[9].size = 'l';
        pieces[9].solidity = 'f';
        pieces[9].shape = 'c';
        pieces[9].pieceNum = 9;

        //Blue small hollow circle
        pieces[10].myPieceId = R.id.bluesmallhollowcircle;
        pieces[10].color = 'b';
        pieces[10].size = 's';
        pieces[10].solidity = 'h';
        pieces[10].shape = 'c';
        pieces[10].pieceNum = 10;

        //Blue small filled circle
        pieces[11].myPieceId = R.id.bluesmallfilledcircle;
        pieces[11].color = 'b';
        pieces[11].size = 's';
        pieces[11].solidity = 'f';
        pieces[11].shape = 'c';
        pieces[11].pieceNum = 11;

        //Yellow large hollow circle
        pieces[12].myPieceId = R.id.yellowlargehollowcircle;
        pieces[12].color = 'y';
        pieces[12].size = 'l';
        pieces[12].solidity = 'h';
        pieces[12].shape = 'c';
        pieces[12].pieceNum = 12;

        //Yellow large filled circle
        pieces[13].myPieceId = R.id.yellowlargefilledcircle;
        pieces[13].color = 'y';
        pieces[13].size = 'l';
        pieces[13].solidity = 'f';
        pieces[13].shape = 'c';
        pieces[13].pieceNum = 13;

        //Yellow small hollow circle
        pieces[14].myPieceId = R.id.yellowsmallhollowcircle;
        pieces[14].color = 'y';
        pieces[14].size = 's';
        pieces[14].solidity = 'h';
        pieces[14].shape = 'c';
        pieces[14].pieceNum = 14;

        //Yellow small filled circle
        pieces[15].myPieceId = R.id.yellowsmallfilledcircle;
        pieces[15].color = 'y';
        pieces[15].size = 's';
        pieces[15].solidity = 'f';
        pieces[15].shape = 'c';
        pieces[15].pieceNum = 15;

        //board initializer
        for (int i = 0; i < 16; i++) {
            boardPieces[i] = null;
        }

        //bank initializer
        for (int i = 0; i < 16; i++) {
            bankPieces[i] = pieces[i];
        }

        //turn: player 1 goes first
        turn = 1;

        //game over
        gameOver = false;

    }

    //Deep copies a Quartostate
    public QuartoState(QuartoState original) {

        //Pieces
        pieces = new Piece[16];
        for (int i = 0; i < 16; i++) {
            pieces[i] = original.pieces[i];
        }

        //Board
        boardPieces = new Piece[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                boardPieces[i][j] = original.boardPieces[i][j];
            }
        }

        //Bank
        bankPieces = new Piece[16];
        for (int i = 0; i < 16; i++) {
            bankPieces[i] = original.bankPieces[i];
        }

        //Variable deep copies
        playerId = original.playerId; //id is 1 or 2
        turn = original.turn; //playerId of whose turn it is

    }


    //ACTION METHODS
    //method for PickPieceAction: makes the chosen piece the game state's "pickedPiece" variable
    public boolean PickPieceAction(QuartoPickPieceAction action) {
        if (action instanceof QuartoPickPieceAction)
        {
            pickedPiece = action.pickedPiece;
            return true;
        }
        return false;
    }

    //method for PlacePieceAction: adds played piece to boardPieces array and removes it from boardPieces array
    public boolean PlacePieceAction(QuartoPlayPieceAction action) {
        if (action instanceof QuartoPlayPieceAction) {
            boardPieces[action.row][action.col] = action.playedPiece;
            bankPieces[action.playedPiece.pieceNum] = null;
            return true;
        }
        return false;
    }

    //method for ClaimVictoryAction
    public boolean ClaimVictoryAction(QuartoClaimVictoryAction action) {
        if (action instanceof QuartoClaimVictoryAction) {

            boolean colorEqual = true;
            boolean sizeEqual = true;
            boolean solidityEqual = true;
            boolean shapeEqual = true;

            //checking columns
            for (int col = 0; col < 4; col++) {
                //Check each piece in the column with the first one in that column.
                for (int row = 0; row < 3; row++) {
                    // compares color
                    if (boardPieces[col][row].color != boardPieces[col][row + 1].color)
                    {
                        colorEqual = false;
                    }

                    //compares size
                    if (boardPieces[col][row].size != boardPieces[col][row + 1].size)
                    {
                        sizeEqual = false;
                    }

                    //compares solidity
                    if (boardPieces[col][row].solidity != boardPieces[col][row + 1].solidity)
                    {
                        solidityEqual = false;
                    }

                    //compares shape
                    if (boardPieces[col][row].shape != boardPieces[col][row + 1].shape)
                    {
                        shapeEqual = false;
                    }
                }

                //If the column we just checked has a Quarto then return. Otherwise check the next column.
                if (colorEqual == true || sizeEqual == true || solidityEqual == true || shapeEqual == true)
                {
                    gameOver = true;
                    return true;
                }
            }


            //checking rows
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 3; col++) {
                    //compares color
                    if (boardPieces[col][row].color != boardPieces[col + 1][row].color) {
                        colorEqual = false;
                    }

                    //compares size
                    if (boardPieces[col][row].size != boardPieces[col+1][row].size) {
                        sizeEqual = false;
                    }

                    //compares solidity
                    if (boardPieces[col][row].solidity != boardPieces[col+1][row].solidity) {
                        solidityEqual = false;
                    }

                    //compares shape
                    if (boardPieces[col][row].shape != boardPieces[col+1][row].shape) {
                        shapeEqual = false;
                    }
                }

                //If the row we just checked has a Quarto then return. Otherwise check the next row.
                if (colorEqual == true || sizeEqual == true || solidityEqual == true || shapeEqual == true) {
                    gameOver = true;
                    return true;
                }
            }


            //checking cross - top left to bottom right
            for (int col = 0; col < 3; col++) {
                for (int row = 0; row < 3; row++) {
                    //checks (0,0) (1,1) (2,2) and (3,3)
                    if(row == col) {
                        //compares color
                        if (boardPieces[col][row].color != boardPieces[col + 1][row + 1].color) {
                            colorEqual = false;
                        }

                        //compares size
                        if (boardPieces[col][row].size != boardPieces[col + 1][row + 1].size) {
                            sizeEqual = false;
                        }

                        //compares solidity
                        if (boardPieces[col][row].solidity != boardPieces[col + 1][row + 1].solidity) {
                            solidityEqual = false;
                        }

                        //compares shape
                        if (boardPieces[col][row].shape != boardPieces[col + 1][row + 1].shape) {
                            shapeEqual = false;
                        }
                    }
                }

                //If the diagonal we just checked has a Quarto then return.
                if (colorEqual == true || sizeEqual == true || solidityEqual == true || shapeEqual == true) {
                    gameOver = true;
                    return true;
                }
            }

            //Checking cross - top right to bottom left.
            //Holds the row value that corresponds to the column number for the next loop.
            int row = 0;

            for (int col = 3; col > 0; col--) {
                //checks (3,0) (2,1) (1,2) and (0,3)
                //compares color
                if (boardPieces[col][row].color != boardPieces[col - 1][row + 1].color) {
                    colorEqual = false;
                }

                //compares size
                if (boardPieces[col][row].size != boardPieces[col - 1][row + 1].size) {
                    sizeEqual = false;
                }

                //compares solidity
                if (boardPieces[col][row].solidity != boardPieces[col - 1][row + 1].solidity) {
                    solidityEqual = false;
                }

                //compares shape
                if (boardPieces[col][row].shape != boardPieces[col - 1][row + 1].shape) {
                    shapeEqual = false;
                }

                row++;
            }

            //If the diagonal we just checked has a Quarto then return.
            if (colorEqual == true || sizeEqual == true || solidityEqual == true || shapeEqual == true) {
                gameOver = true;
                return true;
            }

        }
        return false;
    }


    //GETTERS AND SETTERS
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

    //change turn
    public void changeTurn ()
    {
        if(turn == 1)
        {
            turn = 2;
        }
        if(turn == 2)
        {
            turn = 1;
        }
    }

    //get a piece from the bank
    public Piece getBankPiece(int pieceNumber)
    {
        return bankPieces[pieceNumber];
    }

    //get a piece from the board
    public Piece getBoardPiece(int row, int col)
    {
        return boardPieces[row][col];
    }

    //moves piece from bank to board
    public void setBoardPiece(Piece piece, int boardRow, int boardCol)
    {
        boardPieces[boardRow][boardCol] = piece;
        bankPieces[piece.myPieceId] = null;
    }

    //get ID of piece
    public int getPieceId(Piece piece)
    {
        return piece.pieceNum;
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

