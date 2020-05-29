package org.example.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("default square")
public class DefaultSquare implements Square {
    private boolean lastSquare;

    public DefaultSquare() {
    }


    @Override
    public void execute(BoardGame boardGame) {

    }

    public void setLastSquare(boolean b) {
        this.lastSquare = b;
    }

    @Override
    public boolean isLastSquare() {
        return lastSquare;
    }
}
