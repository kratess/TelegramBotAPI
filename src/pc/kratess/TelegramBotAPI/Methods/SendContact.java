package pc.kratess.TelegramBotAPI.Methods;

public class SendContact {

    private long chat_id;
    private String phone_number;
    private String first_name;

    private String lastName;
    private String vcard;
    private boolean disableNotification;
    private int replyToMessageId;
    private Object replyMarkup = "";

    public SendContact(long chat_id, String phone_number, String first_name) {
        this.chat_id = chat_id;
        this.phone_number = phone_number;
        this.first_name = first_name;
    }

    public SendContact lastName(String lastName) {
        this.lastName = lastName;

        return this;
    }

    public SendContact vcard(String vcard) {
        this.vcard = vcard;

        return this;
    }

    public SendContact disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendContact replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public <T> SendContact replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }



    public String toString() {
        return "sendContact?chat_id=" + chat_id
                + "&phone_number=" + phone_number
                + "&first_name=" + first_name
                + "&last_name=" + lastName
                + "&vcard=" + vcard
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId
                + "&reply_markup=" + replyMarkup;
    }

}
