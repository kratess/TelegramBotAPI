package pc.kratess.TelegramBotAPI.Methods;

public class SendVenue {

    private long chat_id;
    private float latitude;
    private float longitude;
    private String title;
    private String address;

    private String foursquareId;
    private String foursquareType;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendVenue(long chat_id, float latitude, float longitude, String title, String address) {
        this.chat_id = chat_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    public SendVenue foursquareId(String foursquareId) {
        this.foursquareId = foursquareId;

        return this;
    }

    public SendVenue foursquareType(String foursquareType) {
        this.foursquareType = foursquareType;

        return this;
    }

    public SendVenue disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendVenue replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendVenue replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "sendLocation?chat_id=" + chat_id
                + "&latitude=" + latitude
                + "&longitude=" + longitude
                + "&title=" + title
                + "&address=" + address
                + "&foursquare_id=" + foursquareId
                + "&foursquare_type=" + foursquareType
                + "&disable_notification=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
