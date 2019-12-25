package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendAnimation {

    private long chat_id;
    private String animation;

    private int duration;
    private int width;
    private int height;
    private String thumb;
    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendAnimation(long chat_id, String animation) {
        this.chat_id = chat_id;
        this.animation = animation;
    }

    public SendAnimation duration(int duration) {
        this.duration = duration;

        return this;
    }

    public SendAnimation width(int width) {
        this.width = width;

        return this;
    }

    public SendAnimation height(int height) {
        this.height = height;

        return this;
    }

    public SendAnimation thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public SendAnimation caption(String caption) {
        this.caption = caption;

        return this;
    }

    public SendAnimation parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendAnimation disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendAnimation replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendAnimation replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }



    public String toString() {
        return "sendAnimation?chat_id=" + chat_id
                + "&animation=" + animation
                + "&duration=" + duration
                + "&width=" + width
                + "&height=" + height
                + "&thumb=" + thumb
                + "&caption=" + caption
                + "&parse_mode=" + parseMode
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
