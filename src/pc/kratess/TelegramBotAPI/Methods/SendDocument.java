package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendDocument {

    private long chat_id;
    private String document;

    private String thumb;
    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendDocument(long chat_id, String document) {
        this.chat_id = chat_id;
        this.document = document;
    }

    public SendDocument thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public SendDocument caption(String caption) {
        this.caption = caption;

        return this;
    }

    public SendDocument parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendDocument disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendDocument replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendDocument replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendDocument?chat_id=" + chat_id
                + "&thumb=" + thumb
                + "&caption=" + caption
                + "&document=" + document
                + "&parse_mode=" + parseMode
                + "&disable_notification=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
