package pc.kratess.TelegramBotAPI.Enums.Input;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class InputMediaVideo {

    private String type = "video";
    private String media;

    private String thumb;
    private String caption;
    private ParseMode parseMode;
    private int width;
    private int height;
    private int duration;
    private boolean supportsStreaming;

    public InputMediaVideo(String media) {
        this.media = media;
    }

    public InputMediaVideo thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public InputMediaVideo caption(String caption) {
        this.caption = caption;

        return this;
    }

    public InputMediaVideo parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public InputMediaVideo width(int width) {
        this.width = width;

        return this;
    }

    public InputMediaVideo height(int height) {
        this.height = height;

        return this;
    }

    public InputMediaVideo duration(int duration) {
        this.duration = duration;

        return this;
    }

    public InputMediaVideo supportsStreaming(boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;

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

    public boolean isSupports_streaming() {
        return supportsStreaming;
    }

}
