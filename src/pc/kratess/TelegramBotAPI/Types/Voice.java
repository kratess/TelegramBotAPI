package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class Voice {

    private String file_id;
    private String file_unique_id;
    private int duration;

    private String mimeType;
    private int fileSize;

    public Voice(JSONObject voiceObject) {
        this.file_id = voiceObject.getString("file_id");
        this.file_unique_id = voiceObject.getString("file_unique_id");
        this.duration = voiceObject.getInt("duration");

        if (!voiceObject.isNull("mime_type")) {
            this.mimeType = voiceObject.getString("mime_type");
        }

        if (!voiceObject.isNull("file_size")) {
            this.fileSize = voiceObject.getInt("file_size");
        }
    }

    public Voice(String file_id, String file_unique_id, int duration) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.duration = duration;
    }

    public Voice mimeType(String mimeType) {
        this.mimeType = mimeType;

        return this;
    }

    public Voice fileSize(int fileSize) {
        this.fileSize = fileSize;

        return this;
    }

}
