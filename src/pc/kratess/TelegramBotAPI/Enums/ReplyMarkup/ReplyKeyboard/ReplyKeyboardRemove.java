package pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.ReplyKeyboard;

import org.json.JSONObject;

public class ReplyKeyboardRemove {

    private boolean remove_keyboard;

    private boolean selective;

    public ReplyKeyboardRemove(boolean remove_keyboard) {
        this.remove_keyboard = remove_keyboard;
    }

    public ReplyKeyboardRemove selective(boolean selective) {
        this.selective = selective;

        return this;
    }

    public boolean getSelective() {
        return selective;
    }

    @Override
    public String toString() {
        JSONObject json_obj = new JSONObject();
        json_obj.put("remove_keyboard", remove_keyboard);
        json_obj.put("selective", selective);
        return json_obj.toString();
    }

}
