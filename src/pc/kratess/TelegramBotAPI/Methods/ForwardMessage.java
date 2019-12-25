package pc.kratess.TelegramBotAPI.Methods;

public class ForwardMessage {

    private long chat_id;
    private int from_chat_id;
    private int message_id;

    private boolean disableNotification;

    public ForwardMessage(long chat_id, int from_chat_id, int message_id) {
        this.chat_id = chat_id;
        this.from_chat_id = from_chat_id;
        this.message_id = message_id;
    }

    public ForwardMessage disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public String toString() {
        return "forwardMessage?chat_id=" + chat_id
                + "&from_chat_id=" + from_chat_id
                + "&message_id=" + message_id
                + "&disable_notification=" + disableNotification;
    }



}
