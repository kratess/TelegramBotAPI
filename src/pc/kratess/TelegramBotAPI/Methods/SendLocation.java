package pc.kratess.TelegramBotAPI.Methods;

public class SendLocation {

    private long chat_id;
    private float latitude;
    private float longitude;

    private int livePeriod;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendLocation(long chat_id, float latitude, float longitude) {
        this.chat_id = chat_id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public SendLocation livePeriod(int livePeriod) {
        this.livePeriod = livePeriod;

        return this;
    }

    public SendLocation disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendLocation replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendLocation replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendLocation?chat_id=" + chat_id
                + "&latitude=" + latitude
                + "&longitude=" + longitude
                + "&live_period=" + livePeriod
                + "&disable_notification=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
