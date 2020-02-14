package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class VideoNote {

    private String file_id;
    private String file_unique_id;
    private int length;
    private int duration;

    private PhotoSize thumb;
    private int fileSize;

    public VideoNote(JSONObject videoNoteObject) {
        this.file_id = videoNoteObject.getString("file_id");
        this.file_unique_id = videoNoteObject.getString("file_unique_id");
        this.length = videoNoteObject.getInt("length");
        this.duration = videoNoteObject.getInt("duration");

        if (!videoNoteObject.isNull("thumb")) {
            this.thumb = new PhotoSize(videoNoteObject.getJSONObject("thumb"));
        }

        if (!videoNoteObject.isNull("file_size")) {
            this.fileSize = videoNoteObject.getInt("file_Size");
        }
    }

    public VideoNote(String file_id, String file_unique_id, int length, int duration) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.length = length;
        this.duration = duration;
    }

    public VideoNote thumb(PhotoSize thumb) {
        this.thumb = thumb;

        return this;
    }

    public VideoNote fileSize(int fileSize) {
        this.fileSize = fileSize;

        return this;
    }

}
