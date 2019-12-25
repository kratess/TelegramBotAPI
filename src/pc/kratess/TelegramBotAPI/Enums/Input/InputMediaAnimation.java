package pc.kratess.TelegramBotAPI.Enums.Input;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class InputMediaAnimation {

    private String type = "animation";
    private String media;

    private String thumb;
    private String caption;
    private ParseMode parseMode;
    private int width;
    private int height;
    private int duration;

    public InputMediaAnimation(String media) {
        this.media = media;
    }

    public InputMediaAnimation thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public InputMediaAnimation caption(String caption) {
        this.caption = caption;

        return this;
    }

    public InputMediaAnimation parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public InputMediaAnimation width(int width) {
        this.width = width;

        return this;
    }

    public InputMediaAnimation height(int height) {
        this.height = height;

        return this;
    }

    public InputMediaAnimation duration(int duration) {
        this.duration = duration;

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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDuration() {
        return duration;
    }

}
