package behavioral.strategyZad1;

public class FormatterUpper implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
