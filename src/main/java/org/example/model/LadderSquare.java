package org.example.model;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ladder square")
public class LadderSquare implements Square {
    private int stepsForward;
    private boolean lastSquare;

    public LadderSquare() {
    }

    public LadderSquare(int stepsForward) {
        this.stepsForward = stepsForward;
    }

    @Override
    public void execute(BoardGame boardGame) {
        boardGame.moveCurrentPlayer(stepsForward);
    }

    @Override
    public boolean isLastSquare() {
        return false;
    }


    @JsonGetter
    public int getStepsForward() {
        return stepsForward;
    }

    @JsonSetter
    public void setStepsForward(int stepsForward) {
        this.stepsForward = stepsForward;
    }
}
