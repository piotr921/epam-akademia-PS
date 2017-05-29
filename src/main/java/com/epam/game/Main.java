package com.epam.game;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Circle and Cross game!");
        int startingPlayer = CommunicationHandler.readInput("Select which player will start\n0 - 'O'\n1 - 'X'", 0, 1);

        Board board = new Board(startingPlayer);
        int playerTurnCounter = 0;

        while (board.contiuneGame) {
            CommunicationHandler.displayBoard(board);
            board.makeMove(playerTurnCounter % 2);
            playerTurnCounter++;

            // change when validataion will be complete
            if (playerTurnCounter > 9) {
                board.endGame();
            }
        }
    }

}
