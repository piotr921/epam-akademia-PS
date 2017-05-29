package com.epam.game;

import java.util.List;

class ResultChecker {

    boolean checkIfFieldIsOccupied(List<List<String>> fields, Field field) {

        List<String> row = fields.get(field.getRow());
        String checked = row.get(field.getColumn());
        return checked != null;
    }
}
