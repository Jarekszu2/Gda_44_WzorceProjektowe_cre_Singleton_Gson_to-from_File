package behavioral.observableZad2_2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Observable;
import java.util.Observer;

@Data
@AllArgsConstructor
@ToString
public class User implements ChangeListener<String> {
    private String name;

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        System.out.println("Ja " + name + " otrzymalem obserwowanaWiadomosc: " + newValue);
    }
}
