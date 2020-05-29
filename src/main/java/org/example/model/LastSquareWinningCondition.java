package org.example.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("last square winning condition")
public class LastSquareWinningCondition implements WinningCondition {
    @Override
    public boolean hasWon(BoardGame boardGame) {
        if (boardGame.getCurrentPlayerPosition().equals(boardGame.getLastSquare())) {
            boardGame.setWinner(boardGame.currentPlayer());
            return true;
        } else {
            return false;
        }
    }
}
