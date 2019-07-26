package creational.wzorceProjektowe3_Singleton_Zad_1;

import com.google.gson.Gson;

public enum JSON_work {
    INSTANCE;

    public final static Gson GSON = new Gson();

    public String getStringFromMySettings(MySettings mySettings) {
        String stringToFile = GSON.toJson(mySettings);
        return stringToFile;
    }

    public MySettings getMySettingsFromString(String stringMySettings) {
        MySettings mySettings = GSON.fromJson(stringMySettings, MySettings.class);
        return mySettings;
    }
}
