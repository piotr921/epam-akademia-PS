package com.epam.game;

class Field {

    private int row;
    private int column;
    private String playerMark;

    Field(int row, int column, String mark) {
        this.row = row;
        this.column = column;
        this.playerMark = mark;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }

    public String getPlayerMark() {
        return playerMark;
    }
}
