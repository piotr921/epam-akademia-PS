package com.epam.game;

import java.util.ArrayList;
import java.util.List;

public class Board {

    // later pass to constructor from UI
    private int boardSize = 3;

    private List<Player> players;
    private ResultChecker checker;

    private ArrayList<ArrayList<String>> fields;

    boolean contiuneGame;

    // region getters and setter
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public ResultChecker getChecker() {
        return checker;
    }

    public void setChecker(ResultChecker checker) {
        this.checker = checker;
    }

    public ArrayList<ArrayList<String>> getFields() {
        return fields;
    }

    public void setFields(ArrayList<ArrayList<String>> fields) {
        this.fields = fields;
    }
    // endregion


    public Board(int startingPlayer) {
        this.players = initPlayers(startingPlayer);
        this.checker = new ResultChecker();
        this.fields = initBoard(boardSize);
        this.contiuneGame = true;
    }

    public void endGame(){
        this.contiuneGame = false;
    }

    private ArrayList<Player> initPlayers(int startingPlayer) {

        ArrayList<Player> players = new ArrayList<>();
        switch (startingPlayer) {
            case 0:
                players.add(0, new Player("O"));
                players.add(1, new Player("X"));
                break;

            case 1:
                players.add(0, new Player("X"));
                players.add(1, new Player("O"));
                break;

                default:
                    players.add(0, new Player("O"));
                    players.add(1, new Player("X"));
                    break;
        }
        return players;
    }

    private ArrayList<ArrayList<String>> initBoard(int boardSize) {

        ArrayList<ArrayList<String>> board = new ArrayList<>();

        ArrayList<String> row = new ArrayList<>();
        for (int i = 0; i <boardSize ; i++) {
            row.add(null);
        }

        board.add(row);
        board.add(row);
        board.add(row);

        return board;
    }

    void makeMove(int playerId){

        Field userField = null;
        boolean fieldIsOccupied = true;
        while (fieldIsOccupied) {
            userField = players.get(playerId).selectField();
            fieldIsOccupied = checker.checkIfFieldIsOccupied(fields, userField);
        }
        setUpField(userField);
    }

    void setUpField(Field fieldToSet){

        ArrayList<String> oldRow = this.fields.get(fieldToSet.getRow());

        ArrayList<String> newRow = new ArrayList<>();
        for (String s : oldRow) {
            newRow.add(s);
        }
        newRow.set(fieldToSet.getColumn(), fieldToSet.getPlayerMark());
        this.fields.set(fieldToSet.getRow(), newRow);
    }
}
