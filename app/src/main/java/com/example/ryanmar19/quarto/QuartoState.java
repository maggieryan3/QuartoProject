package com.example.ryanmar19.quarto;

/**
 * Created by maggie on 2/19/2017.
 */

public class QuartoState {

    //Instance Variables
    int board[] = new int[16]; //Array of piece IDs on board
    int bank[] = new int[16]; //Array of piece IDs in bank
    int playerId; //id is 1 or 2
    int turn; //playerId of whose turn it is

    //Basic Constructor
    public QuartoState()
    {
        //board initializer
        for(int i=0; i<16; i++) {
            board[i] = -1;
        }

        //bank initializer - piece id will match initial bank position
        for(int i=0; i<16; i++) {
            bank[i] = i;
        }

        //turn - player 1 goes first
        turn = 1;

    }
}

