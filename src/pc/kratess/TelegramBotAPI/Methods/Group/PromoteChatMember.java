package pc.kratess.TelegramBotAPI.Methods.Group;

public class PromoteChatMember {

    private long chat_id;
    private int user_id;

    private boolean canChangeInfo;
    private boolean canPostMessages;
    private boolean canEditMessages;
    private boolean canDeleteMessages;
    private boolean canInviteUsers;
    private boolean canRestrictMembers;
    private boolean canPinMessages;
    private boolean canPromoteMembers;

    public PromoteChatMember(long chat_id, int user_id) {
        this.chat_id = chat_id;
        this.user_id = user_id;
    }

    public PromoteChatMember canChangeInfo(boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;

        return this;
    }

    public PromoteChatMember canPostMessages(boolean canPostMessages) {
        this.canPostMessages = canPostMessages;

        return this;
    }

    public PromoteChatMember canEditMessages(boolean canEditMessages) {
        this.canEditMessages = canEditMessages;

        return this;
    }

    public PromoteChatMember canDeleteMessages(boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;

        return this;
    }

    public PromoteChatMember canInviteUsers(boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;

        return this;
    }

    public PromoteChatMember canPinMessages(boolean canPinMessages) {
        this.canPinMessages = canPinMessages;

        return this;
    }

    public PromoteChatMember canRestrictMembers(boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;

        return this;
    }

    public PromoteChatMember canPromoteMembers(boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;

        return this;
    }

    public String toString() {
        return "promoteChatMember?chat_id=" + chat_id
                + "&user_id=" + user_id
                + "&can_change_info=" + canChangeInfo
                + "&can_post_messages=" + canPostMessages
                + "&can_edit_messages=" + canEditMessages
                + "&can_delete_messages=" + canDeleteMessages
                + "&can_invite_users=" + canInviteUsers
                + "&can_restrict_members=" + canRestrictMembers
                + "&can_pin_messages=" + canPinMessages
                + "&can_promote_members=" + canPromoteMembers;
    }

}
