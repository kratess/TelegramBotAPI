package pc.kratess.TelegramBotAPI.Passport;

import org.json.JSONObject;

public class PassportFile {

    private String file_id;
    private String file_unique_id;
    private int file_size;
    private int file_date;

    public PassportFile(JSONObject passportFileObject) {
        this.file_id = passportFileObject.getString("file_id");
        this.file_unique_id = passportFileObject.getString("file_unique_id");
        this.file_size = passportFileObject.getInt("file_size");
        this.file_date = passportFileObject.getInt("file_date");
    }

    public PassportFile(String file_id, String file_unique_id, int file_size, int file_date) {
        this.file_id = file_id;
        this.file_unique_id = file_unique_id;
        this.file_size = file_size;
        this.file_date = file_date;
    }

}
