package pc.kratess.TelegramBotAPI.Methods.Updating;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class EditMessageCaption {

    private long chatId;
    private int messageId;
    private String  inlineMessageId;
    private String caption = "";
    private ParseMode parseMode = ParseMode.Markdown;
    private Object replyMarkup = "";

    public EditMessageCaption() {

    }

    public EditMessageCaption chatId(long chatId) {
        this.chatId = chatId;

        return this;
    }

    public EditMessageCaption messageId(int messageId) {
        this.messageId = messageId;

        return this;
    }

    public EditMessageCaption inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

        return this;
    }

    public EditMessageCaption caption(String caption) {
        this.caption = caption;

        return this;
    }

    public EditMessageCaption parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public <T> EditMessageCaption replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "editMessageCaption?chat_id=" + chatId
                + "&message_id=" + messageId
                + "&inline_message_id=" + inlineMessageId
                + "&caption=" + caption
                + "&parse_mode=" + parseMode
                + "&reply_markup=" + replyMarkup;
    }

}
