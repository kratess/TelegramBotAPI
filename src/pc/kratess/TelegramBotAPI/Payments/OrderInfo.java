package pc.kratess.TelegramBotAPI.Payments;

import org.json.JSONObject;

public class OrderInfo {

    private String name;
    private String phoneNumber;
    private String email;
    private ShippingAddress shippingAddress;

    public OrderInfo(JSONObject orderInfoObject) {
        this.name = orderInfoObject.getString("name");
        this.phoneNumber = orderInfoObject.getString("phoneNumber");
        this.email = orderInfoObject.getString("email");
        this.shippingAddress = new ShippingAddress(orderInfoObject.getJSONObject("shippingAddress"));
    }

    public OrderInfo(String name, String phoneNumber, String email, ShippingAddress shippingAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }

}
