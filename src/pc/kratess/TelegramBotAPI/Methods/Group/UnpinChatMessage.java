package pc.kratess.TelegramBotAPI.Methods.Group;

public class UnpinChatMessage {

    private long chat_id;

    public UnpinChatMessage(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "unpinChatMessage?chat_id=" + chat_id;
    }

}
