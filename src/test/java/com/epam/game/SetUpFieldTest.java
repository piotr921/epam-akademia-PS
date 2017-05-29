package com.epam.game;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SetUpFieldTest {

    private List<List<String>> fields = new ArrayList<>();

    @Before
    public void init() {

        List<String> row = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            row.add("X");
        }
        fields.add(row);
        fields.add(row);
        fields.add(row);
    }

    @Test
    public void shouldSetField(){

        // Given
        Board board = new Board(0);
        Field field = new Field(0,0, "$");

        // Then
        board.setUpField(field);
    }
}
