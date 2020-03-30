package pc.kratess.TelegramBotAPI.Methods;

public class AnswerCallbackQuery {

    private String callback_query_id;

    private String text;
    private boolean showAlert;
    private String url = "";
    private int cacheTime;

    public AnswerCallbackQuery(String callback_query_id) {
        this.callback_query_id = callback_query_id;
    }

    public AnswerCallbackQuery text(String text) {
        this.text = text;

        return this;
    }

    public AnswerCallbackQuery showAlert(boolean showAlert) {
        this.showAlert = showAlert;

        return this;
    }

    public AnswerCallbackQuery url(String url) {
        this.url = url;

        return this;
    }

    public AnswerCallbackQuery cacheTime(int cacheTime) {
        this.cacheTime = cacheTime;

        return this;
    }

    public String toString() {
        return "answerCallbackQuery?callback_query_id=" + callback_query_id
                + "&text=" + text
                + "&show_alert=" + showAlert
                + "&url=" + url
                + "&cache_time=" + cacheTime;
    }

}
