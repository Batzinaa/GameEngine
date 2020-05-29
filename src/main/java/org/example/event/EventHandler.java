package org.example.event;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private static List<MySubscriber> subscriberList = new ArrayList<>();

    public static void subscribeToEvent(MySubscriber s) {
        subscriberList.add(s);
    }

    public void registerEvent (Event e) {
        for (MySubscriber subscriber : subscriberList) {
            subscriber.handleEvent(e);
        }

    }
}