package behavioral.observable;
/*
Uwaga
1. stacja nasłuchowa (np. NewsStation) musi zawierać pole klasy SimpleObjectProperty<T>, np.
public SimpleObjectProperty<News> newsSimpleObjectProperty = new SimpleObjectProperty<>();
i musi mieć metody dodaj (usuń) słuchacza/obserwatora i wyślij wiadomość(<T>);
2. słuchacz (np. Watcher) musi implementować interface ChangeListener<T>, (Uwaga z biblioteki beans!!!)
co skutkuje potrzebą nadpisania metody changed.
3. w Mainie tworzymy obiekt stacji nasłuchowej, dodajemy do niej słuchaczy i możemy im wysyłać wiadomości
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        NewsStation newsStation = new NewsStation();
        newsStation.dodajSluchacza(new Watcher("Zbig", 2));
        newsStation.dodajSluchacza(new Watcher("WIG", 3));
        newsStation.dodajSluchacza(new Watcher("Dzik", 4));
        newsStation.dodajSluchacza(new Watcher("Wilk", 1));

        newsStation.wyslijWiadomosc(new News("Jest już późno.", 3));
    }
}
