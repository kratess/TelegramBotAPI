package pc.kratess.TelegramBotAPI;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Utils.GetURLContent;

import java.util.ArrayList;

public class TelegramBot {

    private String Token;

    public TelegramBot(String Token) {
        this.Token = Token;
    }

    private UpdatesEvent listener;

    public void setUpdateListener(UpdatesEvent listener, int time, int limit, int timeout, ArrayList<String> allowed_updates) {
        this.listener = listener;

        if (listener != null) {
            (new Thread(new Runnable() {

                @Override
                public void run() {
                    int last_offset = 0;
                    while (!Thread.interrupted())
                        try {
                            JSONObject json = getUpdates(last_offset + 1, limit, timeout, allowed_updates);
                            int result_length = json.getJSONArray("result").length();
                            if (result_length > 0) {
                                last_offset = ((JSONObject) json.getJSONArray("result").get(result_length-1)).getInt("update_id");
                            }
                            listener.onUpdate(json);
                            Thread.sleep(time);
                        } catch (InterruptedException e) {
                            // ooops
                        }
                }
            })).start();
        }
    }

    public <T> JSONObject execute(T request) {
        return GetURLContent.getContent("https://api.telegram.org/bot"+this.Token+"/" + request.toString());
    }

    private JSONObject getUpdates(int offset, int limit, int timeout, ArrayList<String> allowed_updates) {
        return GetURLContent.getContent("https://api.telegram.org/bot"+this.Token+"/getupdates?"
                + "offset=" + offset
                + "&limit=" + limit
                + "&timeout=" + timeout
                + "&allowed_updates=" + allowed_updates
        );
    }

}
