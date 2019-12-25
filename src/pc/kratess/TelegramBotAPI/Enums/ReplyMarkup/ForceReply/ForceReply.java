package pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.ForceReply;

import org.json.JSONObject;

public class ForceReply {

    private boolean force_reply;

    private boolean selective;

    public ForceReply(boolean force_reply) {
        this.force_reply = force_reply;
    }

    public ForceReply selective(boolean selective) {
        this.selective = selective;

        return this;
    }

    public boolean getSelective() {
        return selective;
    }

    @Override
    public String toString() {
        JSONObject json_obj = new JSONObject();
        json_obj.put("force_reply", force_reply);
        json_obj.put("selective", selective);
        return json_obj.toString();
    }

}
