package behavioral.strategyZad2;

public class FormatterInverter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        char[] tab = tekstDoZmiany.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            int znak = (int) tab[i];
            if (znak >= 65 && znak <= 87) {
                znak += 32;
                tab[i] = (char) znak;
            } else if (znak >= 97 && znak <= 119) {
                znak -= 32;
                tab[i] = (char) znak;
            }
        }
        String tekstPoZmianie = "";
        for (int i = 0; i < tab.length; i++) {
            tekstPoZmianie += tab[i];
        }
        return tekstPoZmianie;
    }
}
