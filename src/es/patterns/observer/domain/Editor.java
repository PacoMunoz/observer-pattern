package es.patterns.observer.domain;

public class Editor {

    private final EventManager eventManager;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void openFile(String filename) {
        System.out.printf("Abriendo fichero %s \n", filename);
        eventManager.notify(new OpenFileEvent(filename));
    }

    public void closeFile(String filename) {
        System.out.printf("Cerrando fichero %s \n", filename);
        eventManager.notify(new CloseFileEvent(filename));
    }
}
