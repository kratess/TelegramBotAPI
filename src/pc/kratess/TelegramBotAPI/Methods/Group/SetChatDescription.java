package pc.kratess.TelegramBotAPI.Methods.Group;

public class SetChatDescription {

    private long chat_id;

    private String description = "";

    public SetChatDescription(long chat_id) {
        this.chat_id = chat_id;
    }

    public SetChatDescription description(String description) {
        this.description = description;

        return this;
    }

    public String toString() {
        return "setChatDescription?chat_id=" + chat_id
                + "&description=" + description;
    }

}
