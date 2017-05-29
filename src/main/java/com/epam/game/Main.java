package com.epam.game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Circle and Cross game!");
        int startingPlayer = readInput("Select which player will start\n0 - 'O'\n1 - 'X'");
        System.out.println("\n\n\nYou select: " + startingPlayer);
    }

    private static int readInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        return scanner.nextInt();
    }
}
