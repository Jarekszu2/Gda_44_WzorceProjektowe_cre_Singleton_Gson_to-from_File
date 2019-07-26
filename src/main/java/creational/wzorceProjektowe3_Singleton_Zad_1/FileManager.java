package creational.wzorceProjektowe3_Singleton_Zad_1;

import java.io.*;

public class FileManager {
    public void saveDataInAFile(String daneDoPliku) {
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("mySettings.txt"))) {
            printWriter.print(daneDoPliku);
            System.out.println("Zapisano dane do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String takeDataFromAFile(String fileName) {
        StringBuilder builder = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            bufferedReader.lines().forEach(builder::append);
            System.out.println("Wczytano dane z pliku.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
