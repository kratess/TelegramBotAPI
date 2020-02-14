package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Poll {

    private String id;
    private String question;
    private ArrayList<PollOption> options;
    private boolean is_closed;

    public Poll(JSONObject pollObject) {
        this.id = pollObject.getString("id");
        this.question = pollObject.getString("question");
        {
            JSONArray array = pollObject.getJSONArray("options");
            this.options = (ArrayList<PollOption>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PollOption::new).collect(Collectors.toList());
        }
        this.is_closed = pollObject.getBoolean("is_closed");
    }

    public Poll(String id, String question, ArrayList<PollOption> options, boolean is_closed) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.is_closed = is_closed;
    }

}
