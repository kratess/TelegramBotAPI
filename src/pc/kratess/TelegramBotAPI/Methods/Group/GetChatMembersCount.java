package pc.kratess.TelegramBotAPI.Methods.Group;

public class GetChatMembersCount {

    private long chat_id;

    public GetChatMembersCount(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "getChatMembersCount?chat_id=" + chat_id;
    }

}
