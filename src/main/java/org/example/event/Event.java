package org.example.event;

public class Event{

    private Object source;
    private String message;

    public Event(Object source,String message) {
        this.message = message;
        this.source = source;
    }

    public Object getSource(){
        return source;
    }

    public String getMessage() {
        return message;
    }
}