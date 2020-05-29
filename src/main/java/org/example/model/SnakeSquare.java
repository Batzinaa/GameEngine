package org.example.model;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("snake square")
public class SnakeSquare implements Square {
    private int stepsBackwards;
    private boolean lastSquare;

    public SnakeSquare() {
    }

    public SnakeSquare(int stepsBackwards) {
        this.stepsBackwards = stepsBackwards;
    }

    @Override
    public void execute(BoardGame boardGame) {
        boardGame.moveCurrentPlayer(stepsBackwards);
    }

    @Override
    public boolean isLastSquare() {
        return false;
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
