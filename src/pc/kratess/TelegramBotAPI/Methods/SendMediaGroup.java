package pc.kratess.TelegramBotAPI.Methods;

import org.json.JSONArray;

public class SendMediaGroup {

    private long chat_id;
    private Object media;

    private boolean disableNotification;
    private int replyToMessageId;

    public SendMediaGroup(long chat_id, Object... media) {
        this.chat_id = chat_id;
        this.media = media;
    }

    public SendMediaGroup disableNotification(boolean disableNotification) {
        this.disableNotification = disableNotification;

        return this;
    }

    public SendMediaGroup replyToMessageId(int replyToMessageId) {
        this.replyToMessageId = replyToMessageId;

        return this;
    }

    public String toString() {
        JSONArray array = new JSONArray(media);
        return "sendMediaGroup?chat_id=" + chat_id
                + "&media=" + array
                + "&disable_notifications=" + disableNotification
                + "&reply_to_message_id=" + replyToMessageId;
    }

}
