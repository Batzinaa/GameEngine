package org.example.model;

import java.util.LinkedList;
import java.util.List;

public class PlayerList {

    private LinkedList<Player> playerList;
    private Player currentPlayer;

    public PlayerList(List<Player> playerList) {
        this.playerList = new LinkedList<>(playerList);
    }

    public PlayerList(String[] playerNames) {
        setPlayers(playerNames);
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

    private void setPlayers(String[] playerNames) {
        System.out.println("Players are: ");
        for (String str : playerNames) {
            Player player = new Player(str);
            playerList.add(player);
            System.out.println(player.getNickname());
        }
    }

    public Player getCurrentPlayer() {
        return playerList.peek();
    }

}
