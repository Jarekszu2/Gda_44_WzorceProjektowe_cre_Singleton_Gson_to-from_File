package creational.wzorceProjektowe3_Singleton_Zad_1;

import java.util.Random;
import java.util.Scanner;

public class InputScanner {
    private Scanner scanner;
    private MySettings mySettings;
    private Random random;

    public InputScanner(MySettings mySettings) {
        this.scanner = new Scanner(System.in);
        this.mySettings = mySettings;
        this.random = new Random();
    }

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

    public int getIntFromRange(int range) {
        Integer result = null;

        boolean flag = false;
        do {
            result = getInt();
            if (result > 0 && result < range) {
                flag = true;
            } else {
                System.err.println("Podaj liczbę z zakresu: 0 - " + range + ".");
            }
        } while (!flag);

        return  result;
    }

    public double getDouble() {
        Double number = null;

        System.out.println("Podaj liczbę:");
        do {
            try {
                String linia = scanner.nextLine();
                number = Double.valueOf(linia);
            } catch (NumberFormatException e) {
                System.err.println("To nie jest liczba.");
            }
        } while (number == null);

        return number;
    }

    public String getZnakOperacji() {
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

    public double add(double number1, double number2) {
        return (number1 + number2);
    }

    public double subtract(double number1, double number2) {
        return (number1 - number2);
    }

    public double multiply(double number1, double number2) {
        return (number1 * number2);
    }

    public double divide(double number1, double number2) {
        return (number1 / number2);
    }

    public int compareDouble(double number1, double number2) {
        int result = 0;
        if (number1 == number2) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    public double losowanieFirstNumber() {
        double number1 = 0;
        return number1 = random.nextInt(mySettings.getZakres_liczby_1());
    }

    public double losowanieSecondNumber() {
        double number2 = 0;
        return number2 = random.nextInt(mySettings.getZakres_liczby_2());
    }

    public int losowanieIndeksuZnakuOperacji() {
        int indeksZnakuOperacji = 0;
        return indeksZnakuOperacji = random.nextInt(4);
    }

    public void showSign(int indeksZnakuOperacji) {
        String sign = "";
        String[] tab = mySettings.getDostepne_dzialania().split("");
        if (indeksZnakuOperacji == 0) {
            sign = tab[0];
        } else if (indeksZnakuOperacji == 1) {
            sign = tab[1];
        } else if (indeksZnakuOperacji == 2) {
            sign = tab[2];
        } else if (indeksZnakuOperacji == 3) {
            sign = tab[3];
        }
        System.out.print(sign);
    }

    public double calculate(double number1, double number2, double number3) {
        double calculateResult = 0;
        if (number3 == 0) {
            calculateResult = add(number1, number2);
        } else if (number3 == 1) {
            calculateResult = subtract(number1, number2);
        } else if (number3 == 2) {
            calculateResult = multiply(number1, number2);
        } else if (number3 == 3) {
            calculateResult = divide(number1, number2);
        }
        return calculateResult;
    }
}
