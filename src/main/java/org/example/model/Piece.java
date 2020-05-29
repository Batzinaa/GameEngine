package org.example.model;


public class Piece {

    private String colour;
    private Square position;


    public void setPosition(Square position) {
        this.position = position;
    }

    public Square getPosition() {
        return position;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void move(int nSteps) {

    }
}
