package pc.kratess.TelegramBotAPI.Methods.Group;

public class SetChatTitle {

    private long chat_id;
    private String title;

    public SetChatTitle(long chat_id, String title) {
        this.chat_id = chat_id;
        this.title = title;
    }

    public String toString() {
        return "setChatTitle?chat_id=" + chat_id
                + "&title=" + title;
    }


}
