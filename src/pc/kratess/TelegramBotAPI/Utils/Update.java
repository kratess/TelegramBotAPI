package pc.kratess.TelegramBotAPI.Utils;

public enum Update {

    MESSAGE("message"),
    EDITED_MESSAGE("edited_message"),
    EDITED_CHANNEL_POST("edited_channel_post"),
    INLINE_QUERY("inline_query"),
    CHOSEN_INLINE_RESULT("chosen_inline_result"),
    CALLBACK_QUERY("callback_query"),
    SHIPPING_QUERY("shipping_query"),
    PRE_CHECKOUT_QUERY("pre_checkout_query"),
    POLL("poll"),
    CHANNEL_POST("channel_post");

    private String update;

    public String getUpdate() {
        return this.update;
    }

    private Update(String action) {
        this.update = action;
    }

}
