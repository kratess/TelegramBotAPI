package pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.ReplyKeyboard;

import org.json.JSONObject;

public class ReplyKeyboardMarkup {

    private KeyboardButton[][] array_of_array;

    private boolean resizeKeyboard;
    private boolean oneTimeKeyboard;
    private boolean selective;

    public ReplyKeyboardMarkup(KeyboardButton[]... buttons) {
        this.array_of_array = buttons;
    }

    public ReplyKeyboardMarkup resizeKeyboard(boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;

        return this;
    }

    public ReplyKeyboardMarkup oneTimeKeyboard(boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;

        return this;
    }

    public ReplyKeyboardMarkup selective(boolean selective) {
        this.selective = selective;

        return this;
    }

    public boolean getResize_keyboard() {
        return resizeKeyboard;
    }

    public boolean getOne_time_keyboard() {
        return oneTimeKeyboard;
    }

    public boolean getSelective() {
        return selective;
    }

    @Override
    public String toString() {
        JSONObject json_obj = new JSONObject();
        /*JSONArray json_array_of_array = new JSONArray();
        for (JSONArray array : array_of_array) {
            json_array_of_array.put(array);
        }*/
        json_obj.put("keyboard", array_of_array);
        json_obj.put("resize_keyboard", resizeKeyboard);
        json_obj.put("one_time_keyboard", oneTimeKeyboard);
        json_obj.put("selective", selective);
        return json_obj.toString();
    }
}