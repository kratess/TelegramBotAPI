package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendVideo {

    private long chat_id;
    private String video;

    private int duration;
    private int width;
    private int height;
    private String thumb;
    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private boolean supportsStreaming;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendVideo(long chat_id, String video) {
        this.chat_id = chat_id;
        this.video = video;
    }

    public SendVideo duration(int duration) {
        this.duration = duration;

        return this;
    }

    public SendVideo width(int width) {
        this.width = width;

        return this;
    }

    public SendVideo height(int height) {
        this.height = height;

        return this;
    }

    public SendVideo thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public SendVideo caption(String caption) {
        this.caption = caption;

        return this;
    }

    public SendVideo parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendVideo supportsStreaming(boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;

        return this;
    }

    public SendVideo disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendVideo replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendVideo replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendVideo?chat_id=" + chat_id
                + "&video=" + video
                + "&duration=" + duration
                + "&width=" + width
                + "&height=" + height
                + "&thumb=" + thumb
                + "&caption=" + caption
                + "&parse_mode=" + parseMode
                + "&supports_streaming=" + supportsStreaming
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
