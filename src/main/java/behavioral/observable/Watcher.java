package behavioral.observable;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Watcher implements ChangeListener<News> {
    private String name;

    @Override
    public void changed(ObservableValue<? extends News> observable, News oldValue, News newValue) {
        System.out.println("Ja " + name + " otrzymałem wiadomość: " + newValue);
    }
}
