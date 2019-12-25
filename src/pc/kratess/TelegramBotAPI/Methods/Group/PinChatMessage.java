package pc.kratess.TelegramBotAPI.Methods.Group;

public class PinChatMessage {

    private long chat_id;
    private int message_id;

    private boolean disableNotification;

    public PinChatMessage(long chat_id, int message_id) {
        this.chat_id = chat_id;
        this.message_id = message_id;
    }

    public PinChatMessage disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public String toString() {
        return "pinChatMessage?chat_id=" + chat_id
                + "&message_id=" + message_id
                + "&disable_notification=" + disableNotification;
    }

}
