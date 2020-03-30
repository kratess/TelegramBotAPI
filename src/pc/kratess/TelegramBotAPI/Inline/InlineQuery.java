package pc.kratess.TelegramBotAPI.Inline;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.Location;
import pc.kratess.TelegramBotAPI.Types.User;

public class InlineQuery {

    private String id;
    private User from;

    private Location location;

    private String query;
    private String offset;

    public InlineQuery(JSONObject updateObject) {
        this.id = updateObject.getString("id");
        this.from = new User(updateObject.getJSONObject("from"));
        this.query = updateObject.getString("query");
        this.offset = updateObject.getString("offset");

        if (!updateObject.isNull("location")) {
            this.location = new Location(updateObject.getJSONObject("location"));
        }
    }

    public InlineQuery(String id, User from, String query, String offset) {
        this.id = id;
        this.from = from;
        this.query = query;
        this.offset = offset;
    }

    public InlineQuery location(Location location) {
        this.location = location;

        return this;
    }

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public Location getLocation() {
        return location;
    }

    public String getQuery() {
        return query;
    }

    public String getOffset() {
        return offset;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        object.put("id", id);
        object.put("from", from.toObject());

        return object;
    }

}
