package behavioral.observableZad2;

import javafx.beans.property.SimpleObjectProperty;

import java.util.Observable;

public class PokojChatowy extends Observable {

    public void wyslijWiadomosc(String wiadomosc) {
//        System.out.println("Otrzymałeś wiadomość.");

        setChanged();
        notifyObservers(wiadomosc);
    }
}
