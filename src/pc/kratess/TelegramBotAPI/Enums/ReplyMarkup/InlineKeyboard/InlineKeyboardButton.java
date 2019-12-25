package pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.InlineKeyboard;

public class InlineKeyboardButton {

    private String text;

    private String url;
    // LoginUrl
    private String callbackData;
    private String switchInlineQuery;
    private String switchInlineQueryCurrentChat;
    // CallbackGame
    private boolean pay;

    public InlineKeyboardButton(String text) {
        this.text = text;
    }

    public InlineKeyboardButton url(String url) {
        this.url = url;

        return this;
    }

    public InlineKeyboardButton callbackData(String callbackData) {
        this.callbackData = callbackData;

        return this;
    }

    public InlineKeyboardButton switchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;

        return this;
    }

    public InlineKeyboardButton switchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;

        return this;
    }

    public InlineKeyboardButton pay(boolean pay) {
        this.pay = pay;

        return this;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getCallback_data() {
        return callbackData;
    }

    public String getSwitch_inline_query() {
        return switchInlineQuery;
    }

    public String getSwitch_inline_query_current_chat() {
        return switchInlineQueryCurrentChat;
    }

    public boolean getPay() {
        return pay;
    }
}
