package org.example.event;

import org.example.model.Player;

public class MoveEvent extends Event {
    Player player;
    public MoveEvent(Object source, String message, Player player) {
        super(source, message);
        this.player = player;
    }

    @Override
    public String getMessage() {
        return "New position is " + player.getPosition();
    }
}
