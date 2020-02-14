package pc.kratess.TelegramBotAPI.Passport;

import org.json.JSONArray;
import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.PhotoSize;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PassportData {

    private ArrayList<EncryptedPassportElement> data;
    private EncryptedCredentials credentials;

    public PassportData(JSONObject passportDataObject) {
        {
            JSONArray array = passportDataObject.getJSONArray("data");
            this.data = (ArrayList<EncryptedPassportElement>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(EncryptedPassportElement::new).collect(Collectors.toList());
        }
        this.credentials = new EncryptedCredentials(passportDataObject.getJSONObject("credentials"));
    }

    public PassportData(ArrayList<EncryptedPassportElement> data, EncryptedCredentials credentials) {
        this.data = data;
        this.credentials = credentials;
    }

}
