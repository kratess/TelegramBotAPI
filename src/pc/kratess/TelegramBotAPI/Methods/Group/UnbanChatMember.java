package pc.kratess.TelegramBotAPI.Methods.Group;

public class UnbanChatMember {

    private long chat_id;
    private int user_id;

    public UnbanChatMember(long chat_id, int user_id) {
        this.chat_id = chat_id;
        this.user_id = user_id;
    }


    public String toString() {
        return "unbanChatMember?chat_id=" + chat_id
                + "&user_id=" + user_id;
    }

}
