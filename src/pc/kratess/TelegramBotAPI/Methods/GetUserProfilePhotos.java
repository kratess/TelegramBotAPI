package pc.kratess.TelegramBotAPI.Methods;

public class GetUserProfilePhotos {

    private int user_id;

    private int offset;
    private int limit;

    public GetUserProfilePhotos(int user_id) {
        this.user_id = user_id;
    }

    public GetUserProfilePhotos offset(int offset) {
        this.offset = offset;

        return this;
    }

    public GetUserProfilePhotos limit(int limit) {
        this.limit = limit;

        return this;
    }

    public String toString() {
        return "getUserProfilePhotos?user_id=" + user_id
                + "&offset=" + offset
                + "&limit=" + limit;
    }

}
