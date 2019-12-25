package pc.kratess.TelegramBotAPI.Methods.Group;

public class DeleteChatPhoto {

    private long chat_id;

    public DeleteChatPhoto(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "deleteChatPhoto?chat_id=" + chat_id;
    }

}
