package behavioral.strategyZad2;

public class FormatterLower implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toLowerCase();
    }
}
