package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {

    private String title;
    private String description;
    private ArrayList<PhotoSize> photo;

    private String text;
    private ArrayList<MessageEntity> textEntities;
    private Animation animation;

    public Game(JSONObject gameObject) {
        this.title = gameObject.getString("title");
        this.description = gameObject.getString("description");
        {
            JSONArray array = gameObject.getJSONArray("photo");
            this.photo = (ArrayList<PhotoSize>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PhotoSize::new).collect(Collectors.toList());
        }

        if (!gameObject.isNull("text")) {
            this.text = gameObject.getString("text");
        }

        if (!gameObject.isNull("text")) {
            JSONArray array = gameObject.getJSONArray("text_entities");
            this.textEntities = (ArrayList<MessageEntity>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(MessageEntity::new).collect(Collectors.toList());
        }

        if (!gameObject.isNull("animation")) {
            this.animation = new Animation(gameObject.getJSONObject("animation"));
        }
    }

    public Game(String title, String description, ArrayList<PhotoSize> photo) {
        this.title = title;
        this.description = description;
        this.photo = photo;
    }

    public Game text(String text) {
        this.text = text;

        return this;
    }

    public Game textEntities(ArrayList<MessageEntity> textEntities) {
        this.textEntities = textEntities;

        return this;
    }

    public Game animation(Animation animation) {
        this.animation = animation;

        return this;
    }

}
