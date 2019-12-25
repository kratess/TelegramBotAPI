package pc.kratess.TelegramBotAPI.Methods.Updating;

public class DeleteMessage {

    private long chat_id;
    private int message_id;

    public DeleteMessage(long chat_id, int message_id) {
        this.chat_id = chat_id;
        this.message_id = message_id;
    }

    public String toString() {
        return "deleteMessage?chat_id=" + chat_id
                + "&message_id=" + message_id;
    }

}
