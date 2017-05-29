package com.epam.game;

import java.util.List;
import java.util.Scanner;

class CommunicationHandler {

    static int readInput(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println(message);
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (!(number <= max) && (number >= min));

        return number;
    }

    static void displayBoard(Board board) {

        for (List<String> row : board.getFields()) {
            System.out.println();
            for (String mark : row) {
                displayMark(mark);
            }
        }
    }

    static void displayMark(String mark) {
        if (mark != null) {
            System.out.print("" + mark + "");
        } else {
            System.out.print(".");
        }
    }
}
