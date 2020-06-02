package org.example.model;

import java.util.LinkedList;
import java.util.List;

public class PlayerList {

    private LinkedList<Player> playerList;
    private Player currentPlayer;

    public PlayerList(List<Player> playerList) {
        this.playerList = new LinkedList<>(playerList);
        currentPlayer = getFirstPlayer();
    }

    public int getNumberOfPlayers() {
        return playerList.size();
    }

    public Player getNextPlayer() {
        currentPlayer = playerList.poll();
        playerList.offer(currentPlayer);
        return currentPlayer;
    }

    public Player getFirstPlayer() {
        return playerList.getFirst();
    }

    public Player getCurrentPlayer() {
        return playerList.peek();
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
    }
}
