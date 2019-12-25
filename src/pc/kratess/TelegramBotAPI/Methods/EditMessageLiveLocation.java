package pc.kratess.TelegramBotAPI.Methods;

public class EditMessageLiveLocation {

    private long chatId;
    private int messageId;
    private String inlineMessageId;

    private float latitude;
    private float longitude;

    private Object replyMarkup = "";

    public EditMessageLiveLocation(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public EditMessageLiveLocation chatId(long chatId) {
        this.chatId = chatId;

        return this;
    }

    public EditMessageLiveLocation messageId(int messageId) {
        this.messageId = messageId;

        return this;
    }

    public EditMessageLiveLocation inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

        return this;
    }

    public <T> EditMessageLiveLocation replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "editMessageLiveLocation?chat_id=" + chatId
                + "&message_id=" + messageId
                + "&inline_message_id=" + inlineMessageId
                + "&latitude=" + latitude
                + "&longitude=" + longitude
                + "&reply_markup=" + replyMarkup;
    }

}
