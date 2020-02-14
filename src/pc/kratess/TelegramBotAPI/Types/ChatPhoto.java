package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class ChatPhoto {

    private String small_file_id;
    private String small_file_unique_id;
    private String big_file_id;
    private String big_file_unique_id;

    public ChatPhoto(JSONObject chatPhotoObject) {
        this.small_file_id = chatPhotoObject.getString("small_file_id");
        this.small_file_unique_id = chatPhotoObject.getString("small_file_unique_id");
        this.big_file_id = chatPhotoObject.getString("big_file_id");
        this.big_file_unique_id = chatPhotoObject.getString("big_file_unique_id");
    }

    public ChatPhoto(String small_file_id, String small_file_unique_id, String big_file_id, String big_file_unique_id) {
        this.small_file_id = small_file_id;
        this.small_file_unique_id = small_file_unique_id;
        this.big_file_id = big_file_id;
        this.big_file_unique_id = big_file_unique_id;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        object.put("small_file_id", small_file_id);
        object.put("small_file_unique_id", small_file_unique_id);
        object.put("big_file_id", big_file_id);
        object.put("big_file_unique_id", big_file_unique_id);

        return object;
    }

    @Override
    public String toString() {
        return toObject().toString(4);
    }

}
