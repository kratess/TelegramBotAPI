package pc.kratess.TelegramBotAPI.Inline;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.Location;
import pc.kratess.TelegramBotAPI.Types.User;

public class ChosenInlineResult {

    private String result_id;
    private User from;

    private Location location;

    private String inline_message_id;
    private String query;

    public ChosenInlineResult(JSONObject chosenInlineResultObject) {
        this.result_id = chosenInlineResultObject.getString("result_id");
        this.from = new User(chosenInlineResultObject.getJSONObject("from"));
        this.inline_message_id = chosenInlineResultObject.getString("inline_message_id");
        this.query = chosenInlineResultObject.getString("query");

        if (!chosenInlineResultObject.isNull("location")) {
            this.location = new Location(chosenInlineResultObject.getJSONObject("location"));
        }
    }

    public ChosenInlineResult(String result_id, User from, String inline_message_id, String query) {
        this.result_id = result_id;
        this.from = from;
        this.inline_message_id = inline_message_id;
        this.query = query;
    }

    public ChosenInlineResult location(Location location) {
        this.location = location;

        return this;
    }

}
