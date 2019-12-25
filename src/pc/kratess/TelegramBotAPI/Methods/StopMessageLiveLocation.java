package pc.kratess.TelegramBotAPI.Methods;

public class StopMessageLiveLocation {

    private long chatId;
    private int messageId;
    private String inlineMessageId;
    private Object replyMarkup = "";

    public StopMessageLiveLocation() {
    }

    public StopMessageLiveLocation chatId(long chatId) {
        this.chatId = chatId;

        return this;
    }

    public StopMessageLiveLocation messageId(int messageId) {
        this.messageId = messageId;

        return this;
    }

    public StopMessageLiveLocation inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

        return this;
    }

    public <T> StopMessageLiveLocation replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "stopMessageLiveLocation?chat_id=" + chatId
                + "&message_id=" + messageId
                + "&inline_message_id=" + inlineMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
