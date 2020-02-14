package pc.kratess.TelegramBotAPI.Payments;

public class Invoice {

    private String title;
    private String description;
    private String start_parameter;
    private String currency;
    private int total_amount;

    public Invoice(String title, String description, String start_parameter, String currency, int total_amount) {
        this.title = title;
        this.description = description;
        this.start_parameter = start_parameter;
        this.currency = currency;
        this.total_amount = total_amount;
    }

}
