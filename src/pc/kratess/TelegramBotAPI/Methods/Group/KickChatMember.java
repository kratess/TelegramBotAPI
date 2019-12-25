package pc.kratess.TelegramBotAPI.Methods.Group;

public class KickChatMember {

    private long chat_id;
    private int user_id;

    private int until_date;

    public KickChatMember(long chat_id, int user_id) {
        this.chat_id = chat_id;
        this.user_id = user_id;
    }

    public KickChatMember until_date(int until_date) {
        this.until_date = until_date;

        return this;
    }

    public String toString() {
        return "kickChatMember?chat_id=" + chat_id
                + "&user_id=" + user_id
                + "&until_date=" + until_date;
    }

}
