package es.patterns.observer.domain;

public class CloseFileEvent extends FileEvent {

    public CloseFileEvent(String filename) {
        super(filename);
    }
}
