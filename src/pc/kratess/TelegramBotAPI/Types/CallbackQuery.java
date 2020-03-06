package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class CallbackQuery {

    private String id;
    private User from;

    private Message message;
    private String inlineMessageId;
    private String chatInstance;
    private String data;
    private String gameShortName;

    public CallbackQuery(JSONObject callbackQueryObject) {
        this.id = callbackQueryObject.getString("id");
        this.from = new User(callbackQueryObject.getJSONObject("from"));

        if (!callbackQueryObject.isNull("chat_instance")) {
            this.chatInstance = callbackQueryObject.getString("chat_instance");
        }

        if (!callbackQueryObject.isNull("message")) {
            this.message = new Message(callbackQueryObject.getJSONObject("message"));
        }

        if (!callbackQueryObject.isNull("inline_message_id")) {
            this.inlineMessageId = callbackQueryObject.getString("inline_message_id");
        }

        if (!callbackQueryObject.isNull("data")) {
            this.data = callbackQueryObject.getString("data");
        }

        if (!callbackQueryObject.isNull("game_short_name")) {
            this.gameShortName = callbackQueryObject.getString("game_short_name");
        }
    }

    public CallbackQuery(String id, User from, String chatInstance) {
        this.id = id;
        this.from = from;
    }

    public CallbackQuery message(Message message) {
        this.message = message;

        return this;
    }

    public CallbackQuery inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

        return this;
    }

    public CallbackQuery chatInstance(String chatInstance) {
        this.chatInstance = chatInstance;

        return this;
    }

    public CallbackQuery data(String data) {
        this.data = data;

        return this;
    }

    public CallbackQuery gameShortName(String gameShortName) {
        this.gameShortName = gameShortName;

        return this;
    }

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public Message getMessage() {
        return message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public String getData() {
        return data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        object.put("id", id);
        object.put("from", from.toObject());

        if (message != null) {
            object.put("message", message.toObject());
        }

        if (inlineMessageId != null) {
            object.put("inline_message_id", inlineMessageId);
        }

        if (chatInstance != null) {
            object.put("chat_instance", chatInstance);
        }

        if (data != null) {
            object.put("data", data);
        }

        if (gameShortName != null) {
            object.put("game_short_name", gameShortName);
        }

        return object;
    }

    @Override
    public String toString() {
        return toObject().toString(4);
    }

}
