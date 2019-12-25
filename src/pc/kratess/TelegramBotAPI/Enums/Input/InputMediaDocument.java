package pc.kratess.TelegramBotAPI.Enums.Input;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class InputMediaDocument {

    private String type = "document";
    private String media;

    private String thumb;
    private String caption;
    private ParseMode parseMode;

    public InputMediaDocument(String media) {
        this.media = media;
    }

    public InputMediaDocument thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public InputMediaDocument caption(String caption) {
        this.caption = caption;

        return this;
    }

    public InputMediaDocument parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public String getThumb() {
        return thumb;
    }

    public String getCaption() {
        return caption;
    }

    public ParseMode getParse_mode() {
        return parseMode;
    }

}
