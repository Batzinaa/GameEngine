package org.example.model;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("snake square")
public class SnakeSquare implements Square {
    private int stepsBackwards;

    public SnakeSquare() {
    }

    public SnakeSquare(int stepsBackwards) {
        this.stepsBackwards = stepsBackwards;
    }

    @Override
    public void execute(BoardGame boardGame) {
        stepsBackwards = stepsBackwards*-1; // anti na pernaw arnitiko arithmo sto json apla ton pollaplasiazw me to -1
        System.out.println(boardGame.currentPlayer().getNickname() + " stepped on a Snake! Move " + stepsBackwards*-1 + " steps backwards.");
        boardGame.moveCurrentPlayer(stepsBackwards);
    }

    @JsonGetter
    public int getStepsBackwards() {
        return stepsBackwards;
    }

    @JsonSetter
    public void setStepsBackwards(int stepsBackwards) {
        this.stepsBackwards = stepsBackwards;
    }


}
