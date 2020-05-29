package org.example.event;

import org.example.model.Player;

public class WinnerEvent extends Event {
    private Player player;

    public WinnerEvent(Object source, String message, Player player) {
        super(source, message);
        this.player = player;
    }

    @Override
    public String getMessage() {
        return "Winner is " + player.getNickname();
    }
}
