package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class PhotoSize {

    private String file_id;
    private String file_unique_id;
    private int width;
    private int height;

    private int fileSize;

    public PhotoSize(JSONObject photoSizeObject) {
        this.file_id = photoSizeObject.getString("file_id");
        this.file_unique_id = photoSizeObject.getString("file_unique_id");
        this.width = photoSizeObject.getInt("width");
        this.height = photoSizeObject.getInt("height");

        if (!photoSizeObject.isNull("fileSize")) {
            this.fileSize = photoSizeObject.getInt("fileSize");
        }
    }

    public PhotoSize(String file_id, String file_unique_id, int width, int height) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.width = width;
        this.height = height;
    }

    public PhotoSize fileSize(int fileSize) {
        this.fileSize = fileSize;

        return this;
    }

}
