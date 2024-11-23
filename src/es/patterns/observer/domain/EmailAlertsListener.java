package es.patterns.observer.domain;

public class EmailAlertsListener implements EventListener{

    @Override
    public void update(Event event) {
        if (event instanceof FileEvent) {
            switch (event) {
                case OpenFileEvent openFileEvent ->
                    System.out.printf("File %s has been opened \n", ((FileEvent) event).getFilename());
                case CloseFileEvent closeFileEvent ->
                    System.out.printf("File %s has been closed \n", ((FileEvent) event).getFilename());
                default ->
                    System.out.println("Unknown Event type");
            }
        } else {
            System.out.println("Unknown Event type");
        }
    }
}
