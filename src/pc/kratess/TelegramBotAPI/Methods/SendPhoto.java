package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendPhoto {

    private long chat_id;
    private String photo;

    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendPhoto(long chat_id, String photo) {
        this.chat_id = chat_id;
        this.photo = photo;
    }

    public SendPhoto caption(String caption) {
        this.caption = caption;

        return this;
    }

    public SendPhoto parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendPhoto disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendPhoto replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendPhoto replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendPhoto?chat_id=" + chat_id
                + "&photo=" + photo
                + "&caption=" + caption
                + "&parse_mode=" + parseMode
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
