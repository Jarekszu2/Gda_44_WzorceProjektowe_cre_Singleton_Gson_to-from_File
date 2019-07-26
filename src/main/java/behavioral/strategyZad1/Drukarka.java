package behavioral.strategyZad1;

import lombok.Data;

@Data
public class Drukarka {
    private String name;
    private IFormatterCzcionki formatter;

    public Drukarka(String name) {
        this.name = name;
    }

    public void zmien(IFormatterCzcionki iFormatterCzcionki) {
        setFormatter(iFormatterCzcionki);
    }

    public void drukuj(String text) {
        System.out.println(formatter.zamienTekst(text));
    }
}
