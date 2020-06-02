package org.example.model;


import java.util.List;

public enum BoardType {

    SPRINT {
        @Override
        public IBoard createBoard(List<Square> squares) {
            return new Board(squares);
        }
    },

    CIRCULAR {
        @Override
        public IBoard createBoard(List<Square> squares) {
            return new CircularBoard(squares);
        }
    };

    // SPRINT(new BoardType(new Board()));
    // SPRINT.getBoard().setSquares(...)
    // CIRCULAR(new BoardType(new CircularBoard()));

    /*private IBoard board;

    BoardType(IBoard board) {
        this.board = board;
    }

    public IBoard getBoard() {
        return board;
    }*/

    public abstract IBoard createBoard(List<Square> squares);
}
