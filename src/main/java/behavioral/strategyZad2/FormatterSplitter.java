package behavioral.strategyZad2;

import java.util.Arrays;
import java.util.List;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZmiany) {
        String[] tab = tekstDoZmiany.split("");
        List<String> list = Arrays.asList(tab);
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(" ")) {
                String temp = list.get(i);
                String tempPlusSpacja = temp + " ";
                list.set(i, tempPlusSpacja);
            }
        }

        String poDodaniuSpacji = "";
        for (int i = 0; i < list.size(); i++) {
            poDodaniuSpacji += list.get(i);
        }
        return poDodaniuSpacji;
    }
}
