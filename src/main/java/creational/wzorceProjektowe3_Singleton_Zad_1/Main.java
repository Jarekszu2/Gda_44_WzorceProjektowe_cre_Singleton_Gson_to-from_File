package creational.wzorceProjektowe3_Singleton_Zad_1;

public class Main {
    public static void main(String[] args) {
        // singleton - antywzorzec (bo zaprzecza zasadzie obiektowości), nie można nadużywać
        // singleton - pojedyncza instacja obiektu pewnej klasy.


        // tworzę obiekt MySettings zawierający konfigurację ustawień
        MySettings mySettings = new MySettings(1000, 10000, "+-*/", 10);

        // zamiana MySettings na String'a
        String stringFromMySettings = JSON_work.INSTANCE.getStringFromMySettings(mySettings);

        // zapis String'a do pliku
        FileManager fileManager = new FileManager();
        fileManager.saveDataInAFile(stringFromMySettings);

        // pobranie String'a z pliku
        String stringFromFile = fileManager.takeDataFromAFile("mySettings.txt");

        // zamiana stringa na obiekt MySettings
        MySettings daneZPliku = JSON_work.INSTANCE.getMySettingsFromString(stringFromFile);

//        MySettings mySettings1 = GameSingleton.getInstance();

        // gra w kalkulator
        System.out.println();
        InputScanner inputScanner = new InputScanner(daneZPliku);
        int result = 0;
        for (int i = 0; i < daneZPliku.getIlosc_rund(); i++) {
            System.out.println();
            double number1 = inputScanner.losowanieFirstNumber();
            System.out.println("number1: " + number1);
            double number2 = inputScanner.losowanieSecondNumber();
            System.out.println("number2: " + number2);
            int number3 = inputScanner.losowanieIndeksuZnakuOperacji();
            System.out.print("operacja: ");
            inputScanner.showSign(number3);
            System.out.println();
            System.out.println("_____________________");
            System.out.print("Ile wynosi: " + number1 + " ");
            inputScanner.showSign(number3);
            System.out.print(" " + number2 + ":");
            System.out.println();

            double answer = inputScanner.getDouble();
            double calculateResult = inputScanner.calculate(number1, number2, number3);
            int ocenaOperacji = inputScanner.compareDouble(answer, calculateResult);
            result += ocenaOperacji;
        }
        System.out.println();
        System.out.println("Zdobyte punkty: " + result + ", na 10 możliwych.");
    }
}
