package behavioral.strategyZad2;

public class FormatterTrim implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.trim();
    }
}
