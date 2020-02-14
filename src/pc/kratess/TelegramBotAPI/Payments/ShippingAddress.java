package pc.kratess.TelegramBotAPI.Payments;

import org.json.JSONObject;

public class ShippingAddress {

    private String country_code;
    private String state;
    private String city;
    private String street_line1;
    private String street_line2;
    private String post_code;

    public ShippingAddress(JSONObject shippingAddressObject) {
        this.country_code = shippingAddressObject.getString("country_code");
        this.state = shippingAddressObject.getString("state");
        this.city = shippingAddressObject.getString("city");
        this.street_line1 = shippingAddressObject.getString("street_line1");
        this.street_line2 = shippingAddressObject.getString("street_line2");
        this.post_code = shippingAddressObject.getString("post_code");
    }

    public ShippingAddress(String country_code, String state, String city, String street_line1, String street_line2, String post_code) {
        this.country_code = country_code;
        this.state = state;
        this.city = city;
        this.street_line1 = street_line1;
        this.street_line2 = street_line2;
        this.post_code = post_code;
    }

}
