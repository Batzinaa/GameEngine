package org.example.model;


import java.util.List;

public class CircularBoard implements IBoard {
    private Node head = null;
    private Node tail = null;

    public CircularBoard() {
    }

    public CircularBoard(List<Square> board) {
        for (Square square : board){
            add(square);
        }
    }

    public Square getFirstSquare() {
        return head.getSquare();
    }

    public Square getLastSquare() {
        return tail.getSquare();
    }


    @Override
    public void add(Square square) {

        Node newNode = new Node(square);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNextNode(head);
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
            tail.setNextNode(head);
        }
    }

    @Override
    public void move(Player currentPlayer, int steps) {
        //TODO: implement logic for moving in circular board
        /*Square currentPlayerPosition = currentPlayer.getPosition();
        Square newPlayerPosition ;
        for (int i = 0; i<steps; i++){

        }*/
    }

    @Override
    public void remove(Square square) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

}
