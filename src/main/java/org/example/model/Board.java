package org.example.model;

import java.util.ArrayList;
import java.util.List;

//TODO: rename from Board To SimpleBoard,SprintBoard
public class Board implements IBoard {
    private List<Square> board = new ArrayList<>();

    public Board() {
    }

    public Board(List<Square> squares) {
        this.board = squares;
    }

    public Square getFirstSquare() {
        return board.get(0);
    }

    public Square getLastSquare() {
        return board.get(board.size()-1);
    }

    private int getIndexOf(Square square){
        return board.indexOf(square);
    }

    @Override
    public void move(Player currentPlayer, int steps) {
        Square oldPosition = currentPlayer.getPosition();
        int i = getIndexOf(oldPosition);
        Square newPosition = board.get(i+steps);
        currentPlayer.setPosition(newPosition);
    }

    private int numberOfSquares() {
        return board.size();
    }

    @Override
    public void add(Square square) {
        board.add(square);
    }

    @Override
    public void remove(Square square) {
        board.remove(square);
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
