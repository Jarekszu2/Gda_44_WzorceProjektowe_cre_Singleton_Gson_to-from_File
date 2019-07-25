package creational.wzorceProjektowe3_Singleton_Zad_1;

import java.util.Scanner;

public class InputScanner {
    private Scanner scanner = new Scanner(System.in);

    public int getInt() {
        Integer number = null;

        System.out.println("Podaj liczbę:");
        do {
            try {
                String linia = scanner.nextLine();
                number = Integer.valueOf(linia);
            } catch (NumberFormatException e) {
                System.err.println("To nie jest liczba.");
            }
        } while (number == null);

        return number;
    }

    public String getString() {
        String linia;

        System.out.println("Podaj znak operacji:");
        boolean flag = false;
        do {
            linia = scanner.nextLine();
            if (linia.equals("+") || linia.equals("-") || linia.equals("*") || linia.equals("/")) {
                flag = true;
            } else {
                System.err.println("Dostępne znaki: +, -, *, /.");
            }
        } while (!flag);

        return linia;
    }
}
