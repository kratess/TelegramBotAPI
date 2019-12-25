package pc.kratess.TelegramBotAPI.Methods.Updating;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class EditMessageText {

    private long chatId;
    private int messageId;
    private String  inlineMessageId;

    private String text;

    private ParseMode parseMode = ParseMode.Markdown;
    private boolean disableWebPagePreview;
    private Object replyMarkup = "";

    public EditMessageText(String text) {
        this.text = text;
    }

    public EditMessageText chatId(long chatId) {
        this.chatId = chatId;

        return this;
    }

    public EditMessageText messageId(int messageId) {
        this.messageId = messageId;

        return this;
    }

    public EditMessageText inlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;

        return this;
    }

    public EditMessageText parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public <T> EditMessageText replyMarkup(T replyMarkup) {
        this.replyMarkup = replyMarkup;

        return this;
    }

    public String toString() {
        return "editMessageText?chat_id=" + chatId
                + "&message_id=" + messageId
                + "&inline_message_id=" + inlineMessageId
                + "&text=" + text
                + "&parse_mode=" + parseMode
                + "&disable_web_page_preview=" + disableWebPagePreview
                + "&reply_markup=" + replyMarkup;
    }

}
