package org.example.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("default square")
public class DefaultSquare implements Square {

    public DefaultSquare() {
    }

    @Override
    public void execute(BoardGame boardGame) {

    }

}
