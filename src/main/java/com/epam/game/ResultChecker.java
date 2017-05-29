package com.epam.game;

import java.util.ArrayList;

class ResultChecker {

    boolean checkIfFieldIsOccupied(ArrayList<ArrayList<String>> fields, Field field) {

        ArrayList<String> row = fields.get(field.getRow());
        String checked = row.get(field.getColumn());
        return checked != null;
    }
}
