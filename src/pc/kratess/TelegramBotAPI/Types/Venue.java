package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Venue {

    private Location location;
    private String title;
    private String address;

    private String foursquareId;
    private String foursquareType;

    public Venue(JSONObject venueObject) {
        this.location = new Location(venueObject.getJSONObject("location"));
        this.title = venueObject.getString("title");
        this.address = venueObject.getString("address");

        if (!venueObject.isNull("foursquare_id")) {
            this.foursquareId = venueObject.getString("foursquare_id");
        }

        if (!venueObject.isNull("foursquare_type")) {
            this.foursquareType = venueObject.getString("foursquare_type");
        }
    }

    public Venue(Location location, String title, String address) {
        this.location = location;
        this.title = title;
        this.address = address;
    }

    public Venue foursquareId(String foursquareId) {
        this.foursquareId = foursquareId;

        return this;
    }

    public Venue foursquareType(String foursquareType) {
        this.foursquareType = foursquareType;

        return this;
    }

}
