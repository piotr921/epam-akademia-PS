package com.epam.game;

class Player {

    private String mark;

    Player(String mark) {
        this.mark = mark;
    }

    String getMark() {
        return mark;
    }

    Field selectField(){
        int row = CommunicationHandler.readInput("\nPlayer " + this.getMark() + " write row(0, 1 or 2): ", 0, 2);
        int column = CommunicationHandler.readInput("\nPlayer " + this.getMark() + " write column(0, 1 or 2): ", 0, 2);
        return new Field(row, column, this.mark);
    }
}
