package pc.kratess.TelegramBotAPI;

import pc.kratess.TelegramBotAPI.Updates.Update;

public interface UpdateEvent {
    void onUpdate(Update update);
}
