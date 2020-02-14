package pc.kratess.TelegramBotAPI.Payments;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.User;

public class PreCheckoutQuery {

    private String id;
    private User from;
    private String currency;
    private String total_amount;
    private String invoice_payload;

    private String shippingOptionId;
    private OrderInfo orderInfo;

    public PreCheckoutQuery(JSONObject preCheckoutQueryObject) {
        this.id = preCheckoutQueryObject.getString("id");
        this.from = new User(preCheckoutQueryObject.getJSONObject("from"));
        this.currency = preCheckoutQueryObject.getString("currency");
        this.total_amount = preCheckoutQueryObject.getString("total_amount");
        this.invoice_payload = preCheckoutQueryObject.getString("invoice_payload");

        if (!preCheckoutQueryObject.isNull("shipping_option_id")) {
            this.shippingOptionId = preCheckoutQueryObject.getString("shipping_option_id");
        }

        if (!preCheckoutQueryObject.isNull("order_info")) {
            this.orderInfo = new OrderInfo(preCheckoutQueryObject.getJSONObject("order_info"));
        }
    }

    public PreCheckoutQuery(String id, User from, String currency, String total_amount, String invoice_payload) {
        this.id = id;
        this.from = from;
        this.currency = currency;
        this.total_amount = total_amount;
        this.invoice_payload = invoice_payload;
    }

    public PreCheckoutQuery shippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;

        return this;
    }

    public PreCheckoutQuery orderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;

        return this;
    }

}
