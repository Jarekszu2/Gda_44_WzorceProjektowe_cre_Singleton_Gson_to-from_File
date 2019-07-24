package wzorceProjektowe1_Builder;
/*
Tworzymy klasę, wpisujemy pola, (np. GameCharacter)
Stworzenie/generowanie konstruktora pełnego, (public GameCharacter(String name,...)
Stworzenie klasy (pustej) statycznej publicznej wewnętrznej Builder (public static class Builder {})
klikamy prawym na pełny konstruktor (GameCharacter), wybieramy:
refactor
replace constructor with builer
wybieramy opcję existing class (Use existing)
wskazujemy klasę Builder (kliknąć ... i wybrać odpowiednią)

 */
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        GameCharacter gameCharacter1 = new GameCharacter.Builder()
                .setName("Monster")
                .setNumberOfPoints(12)
                .createGameCharacter();

        GameCharacter.Builder builder = new GameCharacter.Builder();
        builder.setName("Pies")
                .setHealth("dead");

        System.out.println(gameCharacter1);

        Set<GameCharacter> set = new HashSet<GameCharacter>();
        set.add(builder.createGameCharacter());
        set.add(builder.createGameCharacter());
        set.add(builder.createGameCharacter());

        for (GameCharacter gameCharacter : set) {
            System.out.println(gameCharacter);
        }

    }
}
