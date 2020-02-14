package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Enums.Chat.ChatPermissions;

public class Chat {

    private int id;
    private String type;

    private String title;
    private String username;
    private String firstName;
    private String lastName;
    private ChatPhoto photo;
    private String description;
    private String inviteLink;
    private Message pinnedMessage;
    private ChatPermissions permissions;
    private int slowModeDelay;
    private String stickerSetName;
    private boolean canSetStickerSet;

    public Chat(JSONObject chatObject) {
        this.id = chatObject.getInt("id");
        this.type = chatObject.getString("type");

        if (!chatObject.isNull("title")) {
            this.title = chatObject.getString("title");
        }

        if (!chatObject.isNull("username")) {
            this.username = chatObject.getString("username");
        }

        if (!chatObject.isNull("first_name")) {
            this.firstName = chatObject.getString("first_name");
        }

        if (!chatObject.isNull("last_name")) {
            this.lastName = chatObject.getString("last_name");
        }

        if (!chatObject.isNull("photo")) {
            this.photo = new ChatPhoto(chatObject.getJSONObject("photo"));
        }

        if (!chatObject.isNull("description")) {
            this.description = chatObject.getString("description");
        }

        if (!chatObject.isNull("invite_link")) {
            this.inviteLink = chatObject.getString("invite_link");
        }

        if (!chatObject.isNull("pinned_message")) {
            this.pinnedMessage = new Message(chatObject.getJSONObject("pinned_message"));
        }

        if (!chatObject.isNull("permissions")) {
            this.permissions = new ChatPermissions(chatObject.getJSONObject("permissions"));
        }

        if (!chatObject.isNull("slow_mode_delay")) {
            this.slowModeDelay = chatObject.getInt("slow_mode_delay");
        }

        if (!chatObject.isNull("sticker_set_name")) {
            this.stickerSetName = chatObject.getString("sticker_set_name");
        }

        if (!chatObject.isNull("can_set_sticker_set")) {
            this.canSetStickerSet = chatObject.getBoolean("can_set_sticker_set");
        }

    }

    public Chat(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Chat title(String title) {
        this.title = title;

        return this;
    }

    public Chat username(String username) {
        this.username = username;

        return this;
    }

    public Chat firstName(String firstName) {
        this.firstName = firstName;

        return this;
    }

    public Chat lastName(String lastName) {
        this.lastName = lastName;

        return this;
    }

    public Chat photo(ChatPhoto photo) {
        this.photo = photo;

        return this;
    }

    public Chat description(String description) {
        this.description = description;

        return this;
    }

    public Chat inviteLink(String inviteLink) {
        this.inviteLink = inviteLink;

        return this;
    }

    public Chat pinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;

        return this;
    }

    public Chat permissions(ChatPermissions permissions) {
        this.permissions = permissions;

        return this;
    }

    public Chat slowModeDelay(int slowModeDelay) {
        this.slowModeDelay = slowModeDelay;

        return this;
    }

    public Chat stickerSetName(String stickerSetName) {
        this.stickerSetName = stickerSetName;

        return this;
    }

    public Chat canSetStickerSet(boolean canSetStickerSet) {
        this.canSetStickerSet = canSetStickerSet;

        return this;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getFirst_name() {
        return firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }

    public String getInviteLink() {
        return inviteLink;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public ChatPermissions getPermissions() {
        return permissions;
    }

    public int getSlowModeDelay() {
        return slowModeDelay;
    }

    public String getStickerSetName() {
        return stickerSetName;
    }

    public boolean isCanSetStickerSet() {
        return canSetStickerSet;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        object.put("id", id);
        object.put("type", type);

        if (title != null) {
            object.put("title", title);
        }

        if (title != null) {
            object.put("username", username);
        }

        if (title != null) {
            object.put("first_name", firstName);
        }

        if (title != null) {
            object.put("last_name", lastName);
        }

        if (title != null) {
            object.put("photo", photo.toObject());
        }

        if (title != null) {
            object.put("description", description);
        }

        if (title != null) {
            object.put("invite_link", inviteLink);
        }

        if (title != null) {
            object.put("pinned_message", pinnedMessage.toObject());
        }

        /*if (title != null) {
            object.put("permissions", permissions.toObject());
        }*/

        if (title != null) {
            object.put("slow_mode_delay", slowModeDelay);
        }

        if (title != null) {
            object.put("sticker_set_name", stickerSetName);
        }

        if (title != null) {
            object.put("can_set_sticker_set", canSetStickerSet);
        }

        return object;
    }

    @Override
    public String toString() {
        return toObject().toString(4);
    }
}
