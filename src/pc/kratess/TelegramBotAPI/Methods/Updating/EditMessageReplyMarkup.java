package pc.kratess.TelegramBotAPI.Methods.Updating;

public class EditMessageReplyMarkup {

    private long chatId;
    private int messageId;
    private String  inlineMessageId;
    private Object replyMarkup = "";

    public EditMessageReplyMarkup() {

    }

    public EditMessageReplyMarkup chatId(long chatId) {
        this.chatId = chatId;

        return this;
    }

    public EditMessageReplyMarkup messageId(int messageId) {
        this.messageId = messageId;

        return this;
    }

    public EditMessageReplyMarkup inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

        return this;
    }

    public <T> EditMessageReplyMarkup replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "editMessageReplyMarkup?chat_id=" + chatId
                + "&message_id=" + messageId
                + "&inline_message_id=" + inlineMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
