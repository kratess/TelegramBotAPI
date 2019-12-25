package pc.kratess.TelegramBotAPI.Methods.Group;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Enums.Chat.ChatPermissions;

public class RestrictChatMember {

    private long chat_id;
    private int user_id;
    private ChatPermissions permissions;

    private int until_date;

    public RestrictChatMember(long chat_id, int user_id, ChatPermissions permissions) {
        this.chat_id = chat_id;
        this.user_id = user_id;
        this.permissions = permissions;
    }

    public RestrictChatMember until_date(int until_date) {
        this.until_date = until_date;

        return this;
    }

    public String toString() {
        JSONObject permissions_object = new JSONObject(permissions);
        return "restrictChatMember?chat_id=" + chat_id
                + "&user_id=" + user_id
                + "&permissions=" + permissions_object
                + "&until_date=" + until_date;
    }

}
