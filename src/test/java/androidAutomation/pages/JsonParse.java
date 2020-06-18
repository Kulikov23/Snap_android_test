package androidAutomation.pages;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonParse {
    private static JSONParser parser = new JSONParser();
    private static URL urlObject;
    private static StringBuffer response;
    private static JSONObject jsonObject;
    private static JSONObject accountObject;
    public static String login;
    public static String password;
    public static String email;
    public static String description;

    public static void parseCredentials() throws IOException, ParseException {
         jsonObject = (JSONObject) parser.parse(new FileReader("src/test/resources/files/Credentials.json"));
           accountObject = (JSONObject) parser.parse(jsonObject.get("account").toString());
          login = accountObject.get("login").toString();
          password = accountObject.get("password").toString();
    }

    public static void parseJson() throws IOException, ParseException {
        String url = "https://randomuser.me/api/";
        urlObject = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        JSONObject jsonObject = (JSONObject) parser.parse(response.toString());
        JSONArray resultsObject = (JSONArray) parser.parse(jsonObject.get("results").toString());
        JSONObject userDetailsObject = (JSONObject) parser.parse(resultsObject.get(0).toString());
        JSONObject locationObject = (JSONObject) parser.parse(userDetailsObject.get("location").toString());
        JSONObject timezoneObject = (JSONObject) parser.parse(locationObject.get("timezone").toString());
         email = userDetailsObject.get("email").toString();
         description = timezoneObject.get("description").toString();
    }
}
