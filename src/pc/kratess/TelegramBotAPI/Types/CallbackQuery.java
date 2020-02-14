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
        this.chatInstance = callbackQueryObject.getString("chatInstance");

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
        this.chatInstance = chatInstance;
    }

    public CallbackQuery message(Message message) {
        this.message = message;

        return this;
    }

    public CallbackQuery inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

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

}
