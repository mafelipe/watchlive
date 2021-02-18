package api.zero.enums;

public enum APIS {

    URL_STREAMER_STATUS("https://api.twitch.tv/helix/search/channels?query=");

    String stream;
    APIS(String streamer){
        this.stream = streamer;
    }

    public String getStreamStatus() {
        return stream;
    }
}
