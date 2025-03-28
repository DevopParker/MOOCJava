package application;

import java.net.URI;
import java.net.http.*;
import org.json.JSONObject;

public class RestAPI {

    public String createUser(String name, String job) throws Exception {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("job", job);

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://reqres.in/api/users"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json.toString()))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());

        return postResponse.body();
    }
}