package pc.kratess.TelegramBotAPI.Methods.Group;

import org.json.JSONArray;

public class SendPoll {

    private long chat_id;
    private String question;
    private String[] options;

    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendPoll(long chat_id, String question, String[] options) {
        this.chat_id = chat_id;
        this.question = question;
        this.options = options;
    }

    public SendPoll disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendPoll replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendPoll replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        JSONArray options_array = new JSONArray(options);
        return "sendPoll?chat_id=" + chat_id
                + "&question=" + question
                + "&options=" + options_array
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
