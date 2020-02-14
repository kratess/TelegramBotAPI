package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class Animation {

    private String file_id;
    private String file_unique_id;
    private int width;
    private int height;
    private int duration;

    private PhotoSize thumb;
    private String file_name;
    private String mime_type;
    private int file_size;

    public Animation(JSONObject animationObject) {
        this.file_id = animationObject.getString("file_id");
        this.file_unique_id = animationObject.getString("file_unique_id");
        this.width = animationObject.getInt("width");
        this.height = animationObject.getInt("height");
        this.duration = animationObject.getInt("duration");

        if (!animationObject.isNull("thumb")) {
            this.thumb = new PhotoSize(animationObject.getJSONObject("thumb"));
        }

        if (!animationObject.isNull("file_name")) {
            this.file_name = animationObject.getString("file_name");
        }

        if (!animationObject.isNull("mime_type")) {
            this.mime_type = animationObject.getString("mime_type");
        }

        if (!animationObject.isNull("file_size")) {
            this.file_size = animationObject.getInt("file_size");
        }
    }


    public Animation(String file_id, String file_unique_id, int width, int height, int duration) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.width = width;
        this.height = height;
        this.duration = duration;
    }

    public Animation thumb(PhotoSize thumb) {
        this.thumb = thumb;

        return this;
    }

    public Animation file_name(String file_name) {
        this.file_name = file_name;

        return this;
    }

    public Animation mime_type(String mime_type) {
        this.mime_type = mime_type;

        return this;
    }

    public Animation thumb(int file_size) {
        this.file_size = file_size;

        return this;
    }

}
