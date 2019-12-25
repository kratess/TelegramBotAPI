package pc.kratess.TelegramBotAPI.Enums.Input;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class InputMediaPhoto {

    private String type = "photo";
    private String media;

    private String caption;
    private ParseMode parseMode;

    public InputMediaPhoto(String media) {
        this.media = media;
    }

    public InputMediaPhoto caption(String caption) {
        this.caption = caption;

        return this;
    }

    public InputMediaPhoto parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public String getCaption() {
        return caption;
    }

    public ParseMode getParse_mode() {
        return parseMode;
    }

}
