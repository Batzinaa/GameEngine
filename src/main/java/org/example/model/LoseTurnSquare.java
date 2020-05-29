package org.example.model;

public class LoseTurnSquare implements Square {
    private boolean lastSquare;

    public LoseTurnSquare() {
    }

    @Override
    public void execute(BoardGame boardGame) {
        boardGame.currentPlayer().losesNextRound();
    }

    public void setLastSquare(boolean lastSquare) {
        this.lastSquare = lastSquare;
    }

    @Override
    public boolean isLastSquare() {
        return lastSquare;
    }
}
