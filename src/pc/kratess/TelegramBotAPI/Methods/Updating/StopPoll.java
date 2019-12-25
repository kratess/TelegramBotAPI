package pc.kratess.TelegramBotAPI.Methods.Updating;

public class StopPoll {

    private long chat_id;
    private int message_id;

    private Object replyMarkup = "";

    public StopPoll(long chat_id, int message_id) {
        this.chat_id = chat_id;
        this.message_id = message_id;
    }

    public <T> StopPoll replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "stopPoll?chat_id=" + chat_id
                + "&message_id=" + message_id
                + "&reply_markup=" + replyMarkup;
    }

}
