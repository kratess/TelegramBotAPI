package pc.kratess.TelegramBotAPI.Types;

import org.json.JSONObject;

public class Contact {

    private String phone_number;
    private String first_name;

    private String lastName;
    private int userId;
    private String vcard;

    public Contact(JSONObject contactObject) {
        this.phone_number = contactObject.getString("phone_number");
        this.first_name = contactObject.getString("first_name");

        if (!contactObject.isNull("lastName")) {
            this.lastName = contactObject.getString("lastName");
        }

        if (!contactObject.isNull("userId")) {
            this.userId = contactObject.getInt("userId");
        }

        if (!contactObject.isNull("vcard")) {
            this.vcard = contactObject.getString("vcard");
        }
    }

    public Contact(String phone_number, String first_name) {
        this.phone_number = phone_number;
        this.first_name = first_name;
    }

    public Contact lastName(String lastName) {
        this.lastName = lastName;

        return this;
    }

    public Contact userId(int userId) {
        this.userId = userId;

        return this;
    }

    public Contact vcard(String vcard) {
        this.vcard = vcard;

        return this;
    }

}
