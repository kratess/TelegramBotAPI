package pc.kratess.TelegramBotAPI.Methods.Group;

public class DeleteChatStickerSet {

    private long chat_id;

    public DeleteChatStickerSet(long chat_id) {
        this.chat_id = chat_id;
    }

    public String toString() {
        return "deleteChatStickerSet?chat_id=" + chat_id;
    }

}
