package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class PollOption {

    private String text;
    private int voter_count;

    public PollOption(JSONObject pollOptionObject) {
        this.text = pollOptionObject.getString("text");
        this.voter_count = pollOptionObject.getInt("voter_count");
    }

    public PollOption(String text, int voter_count) {
        this.text = text;
        this.voter_count = voter_count;
    }

}
