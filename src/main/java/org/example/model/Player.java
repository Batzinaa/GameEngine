package org.example.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;


public class Player {
    @JsonProperty("nickname")
    private String playerNickname;
    private Square position;
    private boolean yourTurn;

    public Player() {
    }

    public Player(String playerNickname) {
        this.playerNickname = playerNickname;
        this.yourTurn = false;
    }

    public boolean isYourTurn() {
        return yourTurn;
    }

    public void setYourTurn(boolean b) {
        this.yourTurn = b;
    }

    @JsonGetter
    public String getNickname() {
        return playerNickname;
    }

    @JsonSetter
    public void setPlayerNickname(String playerNickname) {
        this.playerNickname = playerNickname;
    }

    public void losesNextRound() {
        setYourTurn(false);
    }

    public Square getPosition() {
        return position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }
}

