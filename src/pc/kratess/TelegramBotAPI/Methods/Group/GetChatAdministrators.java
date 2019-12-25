package pc.kratess.TelegramBotAPI.Methods.Group;

public class GetChatAdministrators {

    private long chat_id;

    public GetChatAdministrators(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "getChatAdministrators?chat_id=" + chat_id;
    }

}
