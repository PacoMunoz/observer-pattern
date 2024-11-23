package es.patterns.observer.domain;

public class OpenFileEvent extends FileEvent {
    public OpenFileEvent(String filename) {
        super(filename);
    }
}
