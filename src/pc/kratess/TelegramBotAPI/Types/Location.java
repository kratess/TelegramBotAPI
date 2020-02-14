package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Location {

    private float longitude;
    private float latitude;

    public Location(JSONObject locationObject) {
        this.longitude = locationObject.getFloat("longitude");
        this.latitude = locationObject.getFloat("latitude");
    }

    public Location(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

}
