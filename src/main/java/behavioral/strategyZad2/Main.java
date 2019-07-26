package behavioral.strategyZad2;
/*
Ustalam strategię: możliwość zmiany formatu wydruku w zależności od potrzeb
1. tworzę interface (np. IFormatterCzcionki), który pozwoli zaimplementować metody do zmiany formatu wydruku
2. twrzę klasy implementujące interfejs (np. FormatterLower, FormatterUpper), które nadają
   odpowiedni format wydrukowi;
3. tworzę klasę wykorzystującą możliwość zmiany startegii (np. Drukarka), która zawiera pole
   interfejsu (IFormatterCzcionki), metodę do zmiany wartości tego pola (ustawFormat wydruku)
   oraz metodę realizującą zadanie (drukuj - powiązaną z metodą interfejsu).
 */
public class Main {
    public static void main(String[] args) {
        Drukarka drukarka = new Drukarka("Epson");
        FormatterLower formatterLower = new FormatterLower();
        FormatterUpper formatterUpper = new FormatterUpper();

        drukarka.ustawFormatWydruku(formatterLower);
        drukarka.drukuj("Ala ma kota.");
        drukarka.ustawFormatWydruku(formatterUpper);
        drukarka.drukuj("Ala ma kota.");
    }
}
