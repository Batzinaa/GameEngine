package org.example.model;

public class Node {
   private Square square;
   private Node next;

    public Node(Square square) {
        this.square = square;
    }

    public void setNextNode(Node node) {
        next = node;
    }

    public Square getSquare() {
        return square;
    }

    public Node getNext() {
        return next;
    }
}
