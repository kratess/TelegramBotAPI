package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class User {

    private int id;
    private boolean is_bot;
    private String first_name;

    private String lastName;
    private String username;
    private String languageCode;

    public User(JSONObject userObject) {
        this.id = userObject.getInt("id");
        this.is_bot = userObject.getBoolean("is_bot");
        this.first_name = userObject.getString("first_name");

        if (!userObject.isNull("last_name")) {
            this.lastName = userObject.getString("last_name");
        }

        if (!userObject.isNull("username")) {
            this.username = userObject.getString("username");
        }

        if (!userObject.isNull("language_code")) {
            this.languageCode = userObject.getString("language_code");
        }
    }

    public User(int id, boolean is_bot, String first_name) {
        this.id = id;
        this.is_bot = is_bot;
        this.first_name = first_name;
    }

    public User lastName(String lastName) {
        this.lastName = lastName;

        return this;
    }

    public User username(String username) {
        this.username = username;

        return this;
    }

    public User languageCode(String languageCode) {
        this.languageCode = languageCode;

        return this;
    }

    public int getId() {
        return id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public JSONObject toObject() {
        JSONObject object = new JSONObject();

        object.put("id", id);
        object.put("is_bot", is_bot);
        object.put("first_name", first_name);

        if (lastName != null) {
            object.put("last_name", lastName);
        }

        if (username != null) {
            object.put("username", username);
        }

        if (languageCode != null) {
            object.put("language_code", languageCode);
        }

        return object;
    }

    @Override
    public String toString() {
        return toObject().toString(4);
    }
}
