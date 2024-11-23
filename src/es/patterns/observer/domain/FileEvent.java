package es.patterns.observer.domain;

public class FileEvent extends Event{

    private final String filename;

    public FileEvent(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
