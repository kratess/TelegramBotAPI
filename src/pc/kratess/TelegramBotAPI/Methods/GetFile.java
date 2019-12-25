package pc.kratess.TelegramBotAPI.Methods;

public class GetFile {

    private String file_id;

    public GetFile(String file_id) {
        this.file_id = file_id;
    }

    @Override
    public String toString() {
        return "getFile?file_id=" + file_id;
    }
}
