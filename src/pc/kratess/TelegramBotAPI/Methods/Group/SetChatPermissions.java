package pc.kratess.TelegramBotAPI.Methods.Group;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Enums.Chat.ChatPermissions;

public class SetChatPermissions {

    private long chat_id;
    private ChatPermissions permissions;

    private int until_date;

    public SetChatPermissions(long chat_id, ChatPermissions permissions) {
        this.chat_id = chat_id;
        this.permissions = permissions;
    }

    public SetChatPermissions until_date(int until_date) {
        this.until_date = until_date;

        return this;
    }

    public String toString() {
        JSONObject permissions_object = new JSONObject(permissions);
        return "setChatPermissions?chat_id=" + chat_id
                + "&permissions=" + permissions_object
                + "&until_date=" + until_date;
    }

}
