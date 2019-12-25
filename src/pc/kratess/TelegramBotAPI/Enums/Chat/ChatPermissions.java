package pc.kratess.TelegramBotAPI.Enums.Chat;

public class ChatPermissions {

    private boolean canSendMessages;
    private boolean canSendMediaMessages;
    private boolean canSendPolls;
    private boolean canSendOtherMessages;
    private boolean canAddWebPagePreviews;
    private boolean canChangeInfo;
    private boolean canInviteUsers;
    private boolean canPinMessages;

    public ChatPermissions() {

    }

    public ChatPermissions canSendMessages(boolean canSendMessages) {
        this.canSendMessages = canSendMessages;

        return this;
    }

    public ChatPermissions canSendMediaMessages(boolean canSendMediaMessages) {
        this.canSendMediaMessages = canSendMediaMessages;

        return this;
    }

    public ChatPermissions canSendPolls(boolean canSendPolls) {
        this.canSendPolls = canSendPolls;

        return this;
    }

    public ChatPermissions canSendOtherMessages(boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;

        return this;
    }

    public ChatPermissions canAddWebPagePreviews(boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;

        return this;
    }

    public ChatPermissions canChangeInfo(boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;

        return this;
    }

    public ChatPermissions canInviteUsers(boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;

        return this;
    }

    public ChatPermissions canPinMessages(boolean canPinMessages) {
        this.canPinMessages = canPinMessages;

        return this;
    }

    public boolean isCan_send_messages() {
        return canSendMessages;
    }

    public boolean isCan_send_media_messages() {
        return canSendMediaMessages;
    }

    public boolean isCan_send_polls() {
        return canSendPolls;
    }

    public boolean isCan_send_other_messages() {
        return canSendOtherMessages;
    }

    public boolean isCan_add_web_page_previews() {
        return canAddWebPagePreviews;
    }

    public boolean isCan_change_info() {
        return canChangeInfo;
    }

    public boolean isCan_invite_users() {
        return canInviteUsers;
    }

    public boolean isCan_pin_messages() {
        return canPinMessages;
    }
}
