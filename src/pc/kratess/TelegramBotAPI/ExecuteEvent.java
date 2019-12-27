package pc.kratess.TelegramBotAPI;

import org.json.JSONObject;

public interface ExecuteEvent {
    void onExecute(JSONObject result);
}
