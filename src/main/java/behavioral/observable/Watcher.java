package behavioral.observable;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Watcher implements ChangeListener<News> {
    private String name;
    private int poziomIstotności;

    @Override
    public void changed(ObservableValue<? extends News> observable, News oldValue, News newValue) {
        if (newValue.getPoziomWaznosci() < poziomIstotności) {
            System.out.println("Ja " + name + " - otrzymałem wiadomość: " + newValue.getName());
        } else {
            System.err.println("Ja " + name + " - O rety: " + newValue.getName());
        }
    }
}
