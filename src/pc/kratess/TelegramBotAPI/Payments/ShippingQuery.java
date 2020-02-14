package pc.kratess.TelegramBotAPI.Payments;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.User;

public class ShippingQuery {

    private String id;
    private User from;
    private String invoice_payload;
    private String shipping_address;

    public ShippingQuery(JSONObject shippingQueryObject) {
        this.id = shippingQueryObject.getString("id");
        this.from = new User(shippingQueryObject.getJSONObject("from"));
        this.invoice_payload = shippingQueryObject.getString("invoice_payload");
        this.shipping_address = shippingQueryObject.getString("shipping_address");
    }

    public ShippingQuery(String id, User from, String invoice_payload, String shipping_address) {
        this.id = id;
        this.from = from;
        this.invoice_payload = invoice_payload;
        this.shipping_address = shipping_address;
    }

}
