package pc.kratess.TelegramBotAPI.Methods.Group;

public class GetChat {

    private long chat_id;

    public GetChat(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "getChat?chat_id=" + chat_id;
    }

}
