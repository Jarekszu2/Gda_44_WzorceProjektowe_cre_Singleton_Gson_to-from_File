package behavioral.observable;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;


public class NewsStation {
    public SimpleObjectProperty<News> newsSimpleObjectProperty = new SimpleObjectProperty<>();

    public void dodajSluchacza(ChangeListener<News> newsChangeListener ) {
        newsSimpleObjectProperty.addListener(newsChangeListener);
    }

    public void wyslijWiadomosc(News news) {
        newsSimpleObjectProperty.setValue(news);
    }
}
