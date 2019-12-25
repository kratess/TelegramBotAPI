package pc.kratess.TelegramBotAPI.Methods.Group;

public class ExportChatInviteLink {

    private long chat_id;

    public ExportChatInviteLink(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "exportChatInviteLink?chat_id=" + chat_id;
    }

}
