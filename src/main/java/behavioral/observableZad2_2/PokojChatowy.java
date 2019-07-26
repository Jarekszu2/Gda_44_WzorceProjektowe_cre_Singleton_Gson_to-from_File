package behavioral.observableZad2_2;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;

import java.util.Observable;

public class PokojChatowy {
    public SimpleObjectProperty<String> obserwowanaWiadomosc = new SimpleObjectProperty<>();

    public void dodajUsera(ChangeListener<String> str) {
        obserwowanaWiadomosc.addListener(str);
    }

    public void wyslijWiadomoscDoWszystkich(String wiadomosc){
        obserwowanaWiadomosc.setValue(wiadomosc);
    }

}
