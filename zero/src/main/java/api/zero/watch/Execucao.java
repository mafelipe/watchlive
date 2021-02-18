package api.zero.watch;

import api.zero.controllers.Twitch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static api.zero.commons.Generics.*;
import static api.zero.enums.APIS.URL_STREAMER_STATUS;
import static api.zero.enums.Canal.*;

public class Execucao {

    WebDriver driver;

    public static final String nycts = "nycts&first=1";
    public static final String fluyr = "fluyr&first=1";
    public static final String tixinha = "tixinha&first=1";
    public static final String sacy = "sacy&first=1";
    public static final String gaules = "gaules&first=1";

    public void verificaStatus() {

        while (true) {
            try {
                ResponseEntity<String> responseEntity = Twitch.retornaAPI(URL_STREAMER_STATUS.getStreamStatus() + nycts, HttpMethod.GET, "5prrv1rxsex6qf21h26y6azqd4k5w0", "6h6266w6y9bquympyp0cpqzqhfduy4");
                String response = responseEntity.getBody();

                JSONArray jsonArray;
                JSONObject jsonObject = new JSONObject(response);

                jsonArray = jsonObject.getJSONArray("data");
                jsonObject = jsonArray.getJSONObject(0);

                boolean online = jsonObject.getBoolean("is_live");
                if (!online) {
                    System.out.println("O streamer " + jsonObject.getString("display_name") + " está offline");
                    espera(60000L);
                } else {
                    break;
                }

            } catch (Exception e) {
            }
        }
    }

    @Test
    public void init() {
        verificaStatus();
        executeCmd();
        driver = ConexaoDriver.getDriver();
        getUrl(NICOLE.getCanal());
        driver.close();
    }
}
