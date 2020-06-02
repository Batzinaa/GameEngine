package org.example.model;

public class LoseTurnSquare implements Square {

    public LoseTurnSquare() {
    }

    @Override
    public void execute(BoardGame boardGame) {
        boardGame.currentPlayer().losesNextRound();
    }

}
