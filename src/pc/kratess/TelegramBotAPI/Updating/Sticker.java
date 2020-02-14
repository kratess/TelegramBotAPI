package pc.kratess.TelegramBotAPI.Updating;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.PhotoSize;

public class Sticker {

    private String file_id;
    private String file_unique_id;
    private int width;
    private int height;
    private boolean is_animated;

    private PhotoSize thumb;
    private String emoji;
    private String setName;
    private MaskPosition maskPosition;
    private int fileSize;

    public Sticker(JSONObject stickerObject) {
        this.file_id = stickerObject.getString("file_id");
        this.file_unique_id = stickerObject.getString("file_unique_id");
        this.width = stickerObject.getInt("width");
        this.height = stickerObject.getInt("height");
        this.is_animated = stickerObject.getBoolean("is_animated");

        if (!stickerObject.isNull("thumb")) {
            this.thumb = new PhotoSize(stickerObject.getJSONObject("thumb"));
        }

        if (!stickerObject.isNull("emoji")) {
            this.emoji = stickerObject.getString("emoji");
        }

        if (!stickerObject.isNull("set_name")) {
            this.setName = stickerObject.getString("set_name");
        }

        if (!stickerObject.isNull("maskPosition")) {
            this.maskPosition = new MaskPosition(stickerObject.getJSONObject("maskPosition"));
        }

        if (!stickerObject.isNull("fileSize")) {
            this.fileSize = stickerObject.getInt("fileSize");
        }
    }

    public Sticker(String file_id, String file_unique_id, int width, int height, boolean is_animated) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.width = width;
        this.height = height;
        this.is_animated = is_animated;
    }

    public Sticker thumb(PhotoSize thumb) {
        this.thumb = thumb;

        return this;
    }

    public Sticker emoji(String emoji) {
        this.emoji = emoji;

        return this;
    }

    public Sticker setName(String setName) {
        this.setName = setName;

        return this;
    }

    public Sticker maskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;

        return this;
    }

    public Sticker fileSize(int fileSize) {
        this.fileSize = fileSize;

        return this;
    }

}