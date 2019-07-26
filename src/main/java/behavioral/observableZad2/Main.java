package behavioral.observableZad2;

public class Main {
    public static void main(String[] args) {
        PokojChatowy pokojChatowy = new PokojChatowy();
        pokojChatowy.addObserver(new User("name1"));
        pokojChatowy.addObserver(new User("name2"));
        pokojChatowy.addObserver(new User("name3"));
        pokojChatowy.addObserver(new User("name4"));
        pokojChatowy.addObserver(new User("name5"));

        pokojChatowy.wyslijWiadomosc("Uwaga");
    }
}
