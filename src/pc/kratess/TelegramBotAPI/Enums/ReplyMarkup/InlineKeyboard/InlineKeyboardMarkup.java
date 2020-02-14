package pc.kratess.TelegramBotAPI.Enums.ReplyMarkup.InlineKeyboard;

import org.json.JSONArray;
import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.PhotoSize;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InlineKeyboardMarkup {

    private InlineKeyboardButton[][] array_of_array;

    /*public InlineKeyboardMarkup(JSONObject inlineKeyboardMarkupObject) {
        {
            JSONArray array = gameObject.getJSONArray("photo");
            this.photo = (ArrayList<PhotoSize>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PhotoSize::new).collect(Collectors.toList());
        }
    }*/

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
