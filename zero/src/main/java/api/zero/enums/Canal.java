package api.zero.enums;

public enum  Canal {

    TIXINHA("https://www.twitch.tv/tixinhadois"),
    NICOLE("https://www.twitch.tv/nycts"),
    FLUYR("https://www.twitch.tv/fluyr"),
    SACY("https://www.twitch.tv/sacy"),
    GAULES("https://www.twitch.tv/gaules");

    String canal;
    Canal(String canais){
        canal = canais;
    }

    public String getCanal() {
        return canal;
    }
}
