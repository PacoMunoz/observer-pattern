package es.patterns.observer.domain;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private final List<EventListener> listeners;

    public EventManager() {
        this.listeners = new ArrayList<>();
    }

    public void subcribe(EventListener eventListener) {
        listeners.add(eventListener);
    }

    public void unsubcribe(EventListener eventListener) {
        listeners.remove(eventListener);
    }

    public void notify(Event event) {
        listeners.forEach(eventListener -> eventListener.update(event));
    }
}
