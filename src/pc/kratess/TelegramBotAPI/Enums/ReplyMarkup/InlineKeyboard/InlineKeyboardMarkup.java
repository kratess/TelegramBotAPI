package pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.InlineKeyboard;

import org.json.JSONObject;

public class InlineKeyboardMarkup {

    private InlineKeyboardButton[][] array_of_array;

    public InlineKeyboardMarkup(InlineKeyboardButton[]... buttons) {
        this.array_of_array = buttons;
    }

    @Override
    public String toString() {
        JSONObject json_obj = new JSONObject();
        json_obj.put("inline_keyboard", array_of_array);
        return json_obj.toString();
    }
}
