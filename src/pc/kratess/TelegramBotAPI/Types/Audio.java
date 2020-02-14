package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class Audio {

    private String file_id;
    private String file_unique_id;
    private int duration;

    private String performer;
    private String title;
    private String mimeType;
    private int fileSize;
    private PhotoSize thumb;

    public Audio(JSONObject audioObject) {
        this.file_id = audioObject.getString("file_id");
        this.file_unique_id = audioObject.getString("file_unique_id");
        this.duration = audioObject.getInt("duration");

        if (!audioObject.isNull("performer")) {
            this.performer = audioObject.getString("performer");
        }

        if (!audioObject.isNull("title")) {
            this.title = audioObject.getString("title");
        }

        if (!audioObject.isNull("mimeType")) {
            this.mimeType = audioObject.getString("mimeType");
        }

        if (!audioObject.isNull("fileSize")) {
            this.fileSize = audioObject.getInt("fileSize");
        }

        if (!audioObject.isNull("thumb")) {
            this.thumb = new PhotoSize(audioObject.getJSONObject("thumb"));
        }
    }

    public Audio(String file_id, String file_unique_id, int duration) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.duration = duration;
    }

    public Audio performer(String performer) {
        this.performer = performer;

        return this;
    }

    public Audio title(String title) {
        this.title = title;

        return this;
    }

    public Audio mimeType(String mimeType) {
        this.mimeType = mimeType;

        return this;
    }

    public Audio fileSize(int fileSize) {
        this.fileSize = fileSize;

        return this;
    }

    public Audio thumb(PhotoSize thumb) {
        this.thumb = thumb;

        return this;
    }

}
