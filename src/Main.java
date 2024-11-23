import es.patterns.observer.domain.Editor;
import es.patterns.observer.domain.EmailAlertsListener;
import es.patterns.observer.domain.EventManager;
import es.patterns.observer.domain.LogginListener;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();
        Editor editor = new Editor(eventManager);

        EmailAlertsListener emailAlertsListener = new EmailAlertsListener();
        LogginListener logginListener = new LogginListener();

        eventManager.subcribe(emailAlertsListener);
        eventManager.subcribe(logginListener);


        editor.openFile("porueba.txt");
        editor.closeFile("proror.txt");


        eventManager.unsubcribe(logginListener);

        editor.openFile("hola.txt");





    }
}