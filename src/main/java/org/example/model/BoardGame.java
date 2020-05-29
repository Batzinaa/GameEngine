package org.example.model;


import org.example.view.Display;

public class BoardGame {
    private WinningCondition winningCondition;
    private IBoard board;
    private PlayerList playerList;
    private Player winner;
    private int numberOfDice;


    public BoardGame(IBoard board, int numberOfDice, PlayerList playerList, WinningCondition winningCondition) {
        this.board = board;
        this.numberOfDice = numberOfDice;
        this.playerList = playerList;
        this.winningCondition = winningCondition;
    }

    private boolean gameNotOver() {
        return winningCondition.hasWon(this);
    }

    private int rollDice() {
        return numberOfDice * Dice.roll();
    }

    private void spawnPlayers() {
        for (int i=0; i <playerList.getNumberOfPlayers(); i++){
            playerList.getNextPlayer().setPosition(board.getFirstSquare());
        }
    }

    void setWinner(Player currentPlayer) {
        winner = currentPlayer;
    }



    private Player getNextPlayer() {
        return playerList.getNextPlayer();
    }

    private void startGame() {
        spawnPlayers();
        winner = null;
    }

    public void play() {
        startGame();
        while (gameNotOver()) {
            Display.currentPlayer(currentPlayer());
            int nSteps = rollDice();
            getNextPlayer();
        }
        Display.winner(winner);
    }

    Player currentPlayer() {
        return playerList.getCurrentPlayer();
    }

    Square getLastSquare() {
        return board.getLastSquare();
    }

    Square getCurrentPlayerPosition() {
        return currentPlayer().getPosition();
    }

    void moveCurrentPlayer(int steps) {
        board.move(currentPlayer(),steps);
        currentPlayer().getPosition().execute(this);
    }
}
