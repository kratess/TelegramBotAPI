package pc.kratess.TelegramBotAPI.Enums.Input;

import pc.kratess.TelegramBotAPI.Enums.ParseMode;

public class InputMediaAudio {

    private String type = "animation";
    private String media;

    private String thumb;
    private String caption;
    private ParseMode parseMode;
    private int duration;
    private String performer;
    private String title;

    public InputMediaAudio(String media) {
        this.media = media;
    }

    public InputMediaAudio thumb(String thumb) {
        this.thumb = thumb;

        return this;
    }

    public InputMediaAudio caption(String caption) {
        this.caption = caption;

        return this;
    }

    public InputMediaAudio parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;

        return this;
    }

    public InputMediaAudio duration(int duration) {
        this.duration = duration;

        return this;
    }

    public InputMediaAudio performer(String performer) {
        this.performer = performer;

        return this;
    }

    public InputMediaAudio title(String title) {
        this.title = title;

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

    public int getDuration() {
        return duration;
    }

    public String getPerformer() {
        return performer;
    }

    public String getTitle() {
        return title;
    }

}
