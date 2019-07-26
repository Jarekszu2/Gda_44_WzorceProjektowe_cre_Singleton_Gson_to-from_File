package behavioral.strategyZad1;

public class Main {
    public static void main(String[] args) {
        Drukarka drukarka = new Drukarka("Epson");
        FormatterLower formatterLower = new FormatterLower();
        FormatterUpper formatterUpper = new FormatterUpper();


        drukarka.zmien(formatterLower);
        drukarka.drukuj("Ala ma kota.");
        drukarka.zmien(formatterUpper);
        drukarka.drukuj("Ala ma kota.");
    }
}
