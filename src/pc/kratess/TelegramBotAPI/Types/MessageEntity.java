package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class MessageEntity {

    private String type;
    private int offset;
    private int length;

    private String url;
    private User user;

    public MessageEntity(JSONObject messageEntityObject) {
        this.type = messageEntityObject.getString("type");
        this.offset = messageEntityObject.getInt("offset");
        this.length = messageEntityObject.getInt("length");

        if (!messageEntityObject.isNull("url")) {
            this.url = messageEntityObject.getString("url");
        }

        if (!messageEntityObject.isNull("user")) {
            this.user = new User(messageEntityObject.getJSONObject("user"));
        }
    }

    public MessageEntity(String type, int offset, int length) {
        this.type = type;
        this.offset = offset;
        this.length = length;
    }

    public MessageEntity url(String url) {
        this.url = url;

        return this;
    }

    public MessageEntity user(User user) {
        this.user = user;

        return this;
    }

    public String getType() {
        return type;
    }

    public int getOffset() {
        return offset;
    }

    public int getLength() {
        return length;
    }

    public String getUrl() {
        return url;
    }

    public User getUser() {
        return user;
    }
}
