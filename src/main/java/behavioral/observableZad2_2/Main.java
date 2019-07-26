package behavioral.observableZad2_2;

public class Main {
    public static void main(String[] args) {
        PokojChatowy pokojChatowy = new PokojChatowy();
        pokojChatowy.dodajUsera(new User("aleks"));
        pokojChatowy.dodajUsera(new User("olek"));
        pokojChatowy.dodajUsera(new User("jurek"));

        pokojChatowy.wyslijWiadomoscDoWszystkich("Siema wszyscy!");
        pokojChatowy.wyslijWiadomoscDoWszystkich("Dzisiaj czwartek!");
    }
}
