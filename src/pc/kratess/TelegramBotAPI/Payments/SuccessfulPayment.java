package pc.kratess.TelegramBotAPI.Payments;

import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.User;

public class SuccessfulPayment {

    private String currency;
    private int total_amount;
    private String invoice_payload;

    private String shippingOptionId;
    private OrderInfo orderInfo;

    private String telegram_payment_charge_id;
    private String provider_payment_charge_id;

    public SuccessfulPayment(JSONObject successfulPaymentObject) {
        this.currency = successfulPaymentObject.getString("currency");
        this.total_amount = successfulPaymentObject.getInt("total_amount");
        this.invoice_payload = successfulPaymentObject.getString("invoice_payload");
        this.telegram_payment_charge_id = successfulPaymentObject.getString("telegram_payment_charge_id");
        this.provider_payment_charge_id = successfulPaymentObject.getString("provider_payment_charge_id");

        if (!successfulPaymentObject.isNull("shipping_option_id")) {
            this.shippingOptionId = successfulPaymentObject.getString("shipping_option_id");
        }

        if (!successfulPaymentObject.isNull("order_info")) {
            this.orderInfo = new OrderInfo(successfulPaymentObject.getJSONObject("order_info"));
        }
    }

    public SuccessfulPayment(String currency, int total_amount, String invoice_payload, String telegram_payment_charge_id, String provider_payment_charge_id) {
        this.currency = currency;
        this.total_amount = total_amount;
        this.invoice_payload = invoice_payload;
        this.telegram_payment_charge_id = telegram_payment_charge_id;
        this.provider_payment_charge_id = provider_payment_charge_id;
    }

    public SuccessfulPayment shippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;

        return this;
    }

    public SuccessfulPayment orderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;

        return this;
    }

}
