package org.example;

import org.example.model.*;

//TODO: rename from BoardGameFactory to BoardGameBuilder
public class BoardGameFactory {
    GameConfiguration gameConfiguration;
    IBoard board;

    public BoardGameFactory(GameConfiguration gameConfiguration) {
        this.gameConfiguration = gameConfiguration;
    }

    private void constructBoard() {
        board = gameConfiguration.getBoardType().createBoard(gameConfiguration.getSquares());
    }

    public IBoard getBoard() {
        constructBoard();
        return board;
    }

    public PlayerList getPlayerList() {
        return new PlayerList(gameConfiguration.getPlayers());
    }

    public WinningCondition getWinningCondition() {
        return gameConfiguration.getWinningCondition();
    }

    public int getNumberOfDice() {
        return gameConfiguration.getNumberOfDice();
    }
}
