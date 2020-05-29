package org.example.view;

import org.example.model.Player;

public class Display {
    public static void currentPlayer(Player player) {
        System.out.println("Current player is " + player.getNickname());
    }

    public static void gameOver() {
        System.out.println("Game Over!");
    }

    public static void winner(Player player) {
        System.out.println("Congratulations " + player.getNickname() + " is the winner!");
    }


}
