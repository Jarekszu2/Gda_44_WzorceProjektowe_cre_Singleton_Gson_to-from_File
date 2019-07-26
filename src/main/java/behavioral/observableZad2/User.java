package behavioral.observableZad2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Observable;
import java.util.Observer;
@Data
@AllArgsConstructor
@ToString
public class User implements Observer {
    private String name;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " wiadomość: " + arg);
    }
}
