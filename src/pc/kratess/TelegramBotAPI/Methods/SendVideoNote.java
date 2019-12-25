package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendVideoNote {

    private long chat_id;
    private String video_note;

    private int duration;
    private int length;
    private String thumb;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendVideoNote(long chat_id, String video_note) {
        this.chat_id = chat_id;
        this.video_note = video_note;
    }

    public SendVideoNote duration(int duration) {
        this.duration = duration;

        return this;
    }

    public SendVideoNote length(int length) {
        this.length = length;

        return this;
    }

    public SendVideoNote thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public SendVideoNote disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendVideoNote replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendVideoNote replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendVideoNote?chat_id=" + chat_id
                + "&video_note=" + video_note
                + "&duration=" + duration
                + "&length=" + length
                + "&thumb=" + thumb
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
