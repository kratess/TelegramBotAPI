package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class Document {

    private String file_id;
    private String file_unique_id;

    private PhotoSize thumb;
    private String file_name;
    private String mime_type;
    private int file_size;

    public Document(JSONObject documentObject) {
        this.file_id = documentObject.getString("file_id");
        this.file_unique_id = documentObject.getString("file_unique_id");

        if (!documentObject.isNull("thumb")) {
            this.thumb = new PhotoSize(documentObject.getJSONObject("thumb"));
        }

        if (!documentObject.isNull("file_name")) {
            this.file_name = documentObject.getString("file_name");
        }

        if (!documentObject.isNull("mime_type")) {
            this.mime_type = documentObject.getString("mime_type");
        }

        if (!documentObject.isNull("file_size")) {
            this.file_size = documentObject.getInt("file_size");
        }
    }

    public Document(String file_id, String file_unique_id) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
    }

    public Document thumb(PhotoSize thumb) {
        this.thumb = thumb;

        return this;
    }

    public Document file_name(String file_name) {
        this.file_name = file_name;

        return this;
    }

    public Document mime_type(String mime_type) {
        this.mime_type = mime_type;

        return this;
    }

    public Document thumb(int file_size) {
        this.file_size = file_size;

        return this;
    }

}
