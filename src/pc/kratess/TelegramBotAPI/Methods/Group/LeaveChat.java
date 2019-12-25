package pc.kratess.TelegramBotAPI.Methods.Group;

public class LeaveChat {

    private long chat_id;

    public LeaveChat(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "leaveChat?chat_id=" + chat_id;
    }

}
