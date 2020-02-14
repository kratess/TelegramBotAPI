package pc.kratess.TelegramBotAPI.Updating;

import org.json.JSONObject;

public class MaskPosition {

    private String point;
    private float x_shift;
    private float y_shift;
    private float scale;

    public MaskPosition(JSONObject maskPositionObject) {
        this.point = maskPositionObject.getString("point");
        this.x_shift = maskPositionObject.getFloat("x_shift");
        this.y_shift = maskPositionObject.getFloat("y_shift");
        this.scale = maskPositionObject.getFloat("scale");
    }

    public MaskPosition(String point, float x_shift, float y_shift, float scale) {
        this.point = point;
        this.x_shift = x_shift;
        this.y_shift = y_shift;
        this.scale = scale;
    }

}
