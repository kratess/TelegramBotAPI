package pc.kratess.TelegramBotAPI;

import org.json.JSONObject;

public interface UpdatesEvent {
    void onUpdate(JSONObject updates);
}
