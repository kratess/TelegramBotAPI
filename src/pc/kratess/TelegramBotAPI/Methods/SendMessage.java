package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendMessage {

    private long chat_id;
    private String text;

    private ParseMode parseMode = ParseMode.Markdown;
    private boolean disableWebPagePreview;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendMessage(long chat_id, String text) {
        this.chat_id = chat_id;
        this.text = text;
    }

    public SendMessage parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendMessage disableWebPagePreview(boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;

        return this;
    }

    public SendMessage disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendMessage replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendMessage replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendMessage?chat_id=" + chat_id
                + "&text=" + text
                + "&parse_mode=" + parseMode
                + "&disable_web_page_preview=" + disableWebPagePreview
                + "&disable_notification=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
