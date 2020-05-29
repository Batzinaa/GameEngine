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

    public abstract IBoard createBoard(List<Square> squares);
}
