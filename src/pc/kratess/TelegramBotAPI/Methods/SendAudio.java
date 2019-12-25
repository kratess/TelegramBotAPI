package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendAudio {

    private long chat_id;
    private String audio;

    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private int duration;
    private String performer;
    private String title;
    private String thumb;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendAudio(long chat_id, String audio) {
        this.chat_id = chat_id;
        this.audio = audio;
    }

    public SendAudio caption(String caption) {
        this.caption = caption;

        return this;
    }

    public SendAudio parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendAudio duration(int duration) {
        this.duration = duration;

        return this;
    }

    public SendAudio performer(String performer) {
        this.performer = performer;

        return this;
    }

    public SendAudio title(String title) {
        this.title = title;

        return this;
    }

    public SendAudio thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public SendAudio disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendAudio replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendAudio replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }



    public String toString() {
        return "sendAudio?chat_id=" + chat_id
                + "&audio=" + audio
                + "&caption=" + caption
                + "&parse_mode=" + parseMode
                + "&duration=" + duration
                + "&performer=" + performer
                + "&title=" + title
                + "&thumb=" + thumb
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
