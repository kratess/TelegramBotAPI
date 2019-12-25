package pc.kratess.TelegramBotAPI.Methods.Group;

public class SetChatStickerSet {

    private long chat_id;
    private String sticker_set_name;

    public SetChatStickerSet(long chat_id, String sticker_set_name) {
        this.chat_id = chat_id;
        this.sticker_set_name = sticker_set_name;
    }

    public String toString() {
        return "setChatTitle?chat_id=" + chat_id
                + "&sticker_set_name=" + sticker_set_name;
    }

}
