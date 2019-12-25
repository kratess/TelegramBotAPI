package pc.kratess.TelegramBotAPI.Methods;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class SendVoice {

    private long chat_id;
    private String voice;

    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendVoice(long chat_id, String voice) {
        this.chat_id = chat_id;
        this.voice = voice;
    }

    public SendVoice caption(String caption) {
        this.caption = caption;

        return this;
    }

    public SendVoice parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public SendVoice disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendVoice replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendVoice replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendVoice?chat_id=" + chat_id
                + "&voice=" + voice
                + "&caption=" + caption
                + "&parse_mode=" + parseMode
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
