package api.zero.controllers;

import net.minidev.json.JSONObject;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Twitch {

    public static ResponseEntity<String> retornaAPI(String API, HttpMethod httpMethod, String token, String clientId) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.set("client-id", clientId);
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        JSONObject jsonObject = new JSONObject();

        HttpEntity<String> entity = new HttpEntity<String>(jsonObject.toString(), headers);
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.exchange(API, httpMethod, entity, String.class);
    }
}
