package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class Video {

    private String file_id;
    private String file_unique_id;
    private int width;
    private int height;
    private int duration;

    private PhotoSize thumb;
    private String mimeType;
    private int fileSize;

    public Video(JSONObject videoObject) {
        this.file_id = videoObject.getString("file_id");
        this.file_unique_id = videoObject.getString("file_unique_id");
        this.width = videoObject.getInt("width");
        this.height = videoObject.getInt("height");
        this.duration = videoObject.getInt("duration");

        if (!videoObject.isNull("thumb")) {
            this.thumb = new PhotoSize(videoObject.getJSONObject("thumb"));
        }

        if (!videoObject.isNull("mime_type")) {
            this.mimeType = videoObject.getString("mime_type");
        }

        if (!videoObject.isNull("file_size")) {
            this.fileSize = videoObject.getInt("file_size");
        }
    }

    public Video(String file_id, String file_unique_id, int width, int height, int duration) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.width = width;
        this.height = height;
        this.duration = duration;
    }

    public Video thumb(PhotoSize thumb) {
        this.thumb = thumb;

        return this;
    }

    public Video mimeType(String mimeType) {
        this.mimeType = mimeType;

        return this;
    }

    public Video thumb(int fileSize) {
        this.fileSize = fileSize;

        return this;
    }

}
