package org.example.model;

//TODO: Rename from IBoard to Board
public interface IBoard {

    void add(Square square);
    void remove(Square square);
    boolean hasNext();

    Square getLastSquare();

    void move(Player currentPlayer, int steps);

    Square getFirstSquare();
}
