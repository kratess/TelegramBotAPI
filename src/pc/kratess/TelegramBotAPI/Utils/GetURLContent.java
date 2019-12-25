package pc.kratess.TelegramBotAPI.Utils;

import org.json.JSONObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class GetURLContent {

    public static JSONObject getContent(String URL) {
        URL url;

        try {
            // get URL content
            url = new URL(URL);
            URLConnection conn = url.openConnection();

            StringBuilder sb = new StringBuilder();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }

            JSONObject json = new JSONObject(sb.toString());

            return json;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
