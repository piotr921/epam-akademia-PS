package com.epam.game;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void shouldCreateBoardObjectWithStratingZeroPlayer(){

        // When
        Board board = new Board(0);

        // Then
        Assert.assertEquals("O", board.getPlayers().get(0).getMark());
    }

    @Test
    public void shouldCreateBoardObjectWithStratingOnePlayer(){

        // When
        Board board = new Board(1);

        // Then
        Assert.assertEquals("X", board.getPlayers().get(0).getMark());
    }
}
