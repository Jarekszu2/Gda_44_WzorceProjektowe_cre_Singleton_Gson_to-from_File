package creational.wzorceProjektowe3_Singleton_Zad_1;

public class ConfigFileManager {
    private static ConfigFileManager ourInstance = new ConfigFileManager();

    public static ConfigFileManager getInstance() {
        return ourInstance;
    }

    private ConfigFileManager() {
    }
}
