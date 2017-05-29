package com.epam.game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Circle and Cross game!");
        int startingPlayer = readInput("Select which player will start\n0 - 'O'\n1 - 'X'");

        Board board = new Board(startingPlayer);
    }

    private static int readInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        return scanner.nextInt();
    }

    private static void displayBoard(Board board){

    }
}
