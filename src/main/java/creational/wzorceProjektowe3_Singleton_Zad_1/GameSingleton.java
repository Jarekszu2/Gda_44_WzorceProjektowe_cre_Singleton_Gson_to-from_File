package creational.wzorceProjektowe3_Singleton_Zad_1;

public class GameSingleton {
    private static GameSingleton ourInstance = new GameSingleton();

    public static GameSingleton getInstance() {
        return ourInstance;
    }

    private GameSingleton() {
        FileManager fileManager = new FileManager();
        String stringFromAFile = fileManager.takeDataFromAFile("mySettings.txt");

        MySettings mySettingsSingleton = JSON_work.INSTANCE.getMySettingsFromString(stringFromAFile);
    }
}
