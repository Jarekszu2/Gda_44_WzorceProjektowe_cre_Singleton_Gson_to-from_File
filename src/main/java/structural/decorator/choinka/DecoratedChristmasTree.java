package structural.decorator.choinka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Random;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class DecoratedChristmasTree implements ITree {
    private SimpleChristmasTree simpleChristmasTree;
    private int iloscPodmianek;


    public String buildStringTree() {
        String temp = simpleChristmasTree.buildStringTree();

        String[] tab = temp.split("");

        // obliczam ilość gwiazdek w choince
//        List<String> list = Arrays.asList(tab);
//        long iloscGwiazdek = list.stream()
//                .filter(s -> s.equals("*"))
//                .count();
//
        // ustalam zakres randoma na: ilość gwiazdek / 2;
        Random random = new Random();
//        int iloscPodmianek = random.nextInt((int) iloscGwiazdek / 2);

        // podmieniam '*' na 'O"
        for (int i = 0; i < iloscPodmianek; i++) {
            boolean flag = false;
            do {
                int indexPodmiany = random.nextInt(temp.length());
                if (tab[indexPodmiany].equals("*")) {
                    tab[indexPodmiany] = "O";
                    flag = true;
                }
            } while (!flag);
        }

        String result = "";
        for (int i = 0; i < tab.length; i++) {
            result += tab[i];
        }
        return result;
    }

    public void printTree(String s) {
        System.out.println(s);
    }

}
