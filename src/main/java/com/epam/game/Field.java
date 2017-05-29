package com.epam.game;

class Field {

    private int row;
    private int column;

    Field(int row, int column) {
        this.row = row;
        this.column = column;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }
}
