package com.epam.game;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ResultCheckerTest {

    private ArrayList<ArrayList<String>> fields = new ArrayList<>();

    @Before
    public void init() {

        ArrayList<String> row = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            row.add("X");
        }
        fields.add(row);
        fields.add(row);
        fields.add(row);
    }

    @Test
    public void shouldReturnTrueForFreeField() {

        // Given
        int row = 1;
        int col = 1;

        ResultChecker checker = new ResultChecker();

        ArrayList<String> rowOfFields = fields.get(row);
        rowOfFields.set(col, null);
        fields.set(row, rowOfFields);

        // When
        boolean b = checker.checkIfFieldIsOccupied(fields, new Field(row, col, "X"));

        // Then
        Assert.assertTrue(b);
    }

    @Test
    public void shouldReturnFalseForOccupiedField() {

        // Given
        int row = 1;
        int col = 1;

        ResultChecker checker = new ResultChecker();
        // When
        boolean b = checker.checkIfFieldIsOccupied(fields, new Field(row, col, "X"));

        // Then
        Assert.assertFalse(b);
    }
}
