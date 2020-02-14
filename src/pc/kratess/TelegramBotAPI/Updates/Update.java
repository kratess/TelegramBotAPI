package pc.kratess.TelegramBotAPI.Updates;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Inline.ChosenInlineResult;
import pc.kratess.TelegramBotAPI.Inline.InlineQuery;
import pc.kratess.TelegramBotAPI.Payments.PreCheckoutQuery;
import pc.kratess.TelegramBotAPI.Payments.ShippingQuery;
import pc.kratess.TelegramBotAPI.Types.CallbackQuery;
import pc.kratess.TelegramBotAPI.Types.Message;
import pc.kratess.TelegramBotAPI.Types.Poll;

public class Update {

    private int update_id;

    private Message message;
    private Message editedMessage;
    private Message channelPost;
    private Message editedChannelPost;
    private InlineQuery inlineQuery;
    private ChosenInlineResult chosenInlineResult;
    private CallbackQuery callbackQuery;
    private ShippingQuery shippingQuery;
    private PreCheckoutQuery preCheckoutQuery;
    private Poll poll;

    public Update(JSONObject updateObject) {
        this.update_id = updateObject.getInt("update_id");

        if (!updateObject.isNull("message")) {
            this.message = new Message(updateObject.getJSONObject("message"));
        }

        if (!updateObject.isNull("edited_message")) {
            this.editedMessage = new Message(updateObject.getJSONObject("edited_message"));
        }

        if (!updateObject.isNull("channel_post")) {
            this.channelPost = new Message(updateObject.getJSONObject("channel_post"));
        }

        if (!updateObject.isNull("edited_channel_post")) {
            this.editedChannelPost = new Message(updateObject.getJSONObject("edited_channel_post"));
        }

        if (!updateObject.isNull("inline_query")) {
            this.inlineQuery = new InlineQuery(updateObject.getJSONObject("inline_query"));
        }

        if (!updateObject.isNull("chosen_inline_result")) {
            this.chosenInlineResult = new ChosenInlineResult(updateObject.getJSONObject("chosen_inline_result"));
        }

        if (!updateObject.isNull("callback_query")) {
            this.callbackQuery = new CallbackQuery(updateObject.getJSONObject("callback_query"));
        }

        if (!updateObject.isNull("shipping_query")) {
            this.shippingQuery = new ShippingQuery(updateObject.getJSONObject("shipping_query"));
        }

        if (!updateObject.isNull("pre_checkout_query")) {
            this.preCheckoutQuery = new PreCheckoutQuery(updateObject.getJSONObject("pre_checkout_query"));
        }

        if (!updateObject.isNull("poll")) {
            this.poll = new Poll(updateObject.getJSONObject("poll"));
        }
    }

    public Update(int update_id) {
        this.update_id = update_id;
    }

    public Update message(Message message) {
        this.message = message;

        return this;
    }

    public Update editedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;

        return this;
    }

    public Update channelPost(Message channelPost) {
        this.channelPost = channelPost;

        return this;
    }

    public Update editedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;

        return this;
    }

    public Update inlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;

        return this;
    }

    public Update chosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;

        return this;
    }

    public Update callbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;

        return this;
    }

    public Update shippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;

        return this;
    }

    public Update preCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;

        return this;
    }

    public Update poll(Poll poll) {
        this.poll = poll;

        return this;
    }

    public int getUpdate_id() {
        return update_id;
    }

    public Message getMessage() {
        return message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public Poll getPoll() {
        return poll;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        if (message != null) {
            object.put("message", message.toObject());
        }

        if (editedMessage != null) {
            object.put("edited_message", editedMessage.toObject());
        }

        if (channelPost != null) {
            object.put("channel_post", channelPost.toObject());
        }

        if (editedChannelPost != null) {
            object.put("edited_channel_post", editedChannelPost.toObject());
        }

        return object;
    }

    @Override
    public String toString() {
        return toObject().toString(4);
    }
}
