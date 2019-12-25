package pc.kratess.TelegramBotAPI.Methods;

public class SendChatAction {

    private long chat_id;
    private String action;

    public SendChatAction(long chat_id, String action) {
        this.chat_id = chat_id;
        this.action = action;
    }

    public String toString() {
        return "sendChatAction?chat_id=" + chat_id
                + "&action=" + action;
    }

}
