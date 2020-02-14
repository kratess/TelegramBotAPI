package pc.kratess.TelegramBotAPI.Passport;

import org.json.JSONArray;
import org.json.JSONObject;
import pc.kratess.TelegramBotAPI.Types.PhotoSize;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EncryptedPassportElement {

    private String type;

    private String data;
    private String phoneNumber;
    private String email;
    private ArrayList<PassportFile> files;
    private PassportFile frontSide;
    private PassportFile reverseSide;
    private PassportFile selfie;
    private ArrayList<PassportFile> translation;

    private String hash;

    public EncryptedPassportElement(JSONObject encryptedPassportElementObject) {
        this.type = encryptedPassportElementObject.getString("type");
        this.hash = encryptedPassportElementObject.getString("hash");

        if (!encryptedPassportElementObject.isNull("data")) {
            this.data = encryptedPassportElementObject.getString("data");
        }

        if (!encryptedPassportElementObject.isNull("phoneNumber")) {
            this.phoneNumber = encryptedPassportElementObject.getString("phoneNumber");
        }

        if (!encryptedPassportElementObject.isNull("email")) {
            this.email = encryptedPassportElementObject.getString("email");
        }

        if (!encryptedPassportElementObject.isNull("files")) {
            JSONArray array = encryptedPassportElementObject.getJSONArray("files");
            this.files = (ArrayList<PassportFile>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PassportFile::new).collect(Collectors.toList());
        }

        if (!encryptedPassportElementObject.isNull("front_side")) {
            this.frontSide = new PassportFile(encryptedPassportElementObject.getJSONObject("front_side"));
        }

        if (!encryptedPassportElementObject.isNull("reverse_Side")) {
            this.reverseSide = new PassportFile(encryptedPassportElementObject.getJSONObject("reverse_Side"));
        }

        if (!encryptedPassportElementObject.isNull("selfie")) {
            this.selfie = new PassportFile(encryptedPassportElementObject.getJSONObject("selfie"));
        }

        if (!encryptedPassportElementObject.isNull("translation")) {
            JSONArray array = encryptedPassportElementObject.getJSONArray("translation");
            this.translation = (ArrayList<PassportFile>) IntStream.range(0, array.length()).mapToObj(array::getJSONObject).map(PassportFile::new).collect(Collectors.toList());
        }
    }


    public EncryptedPassportElement(String type, String hash) {
        this.type = type;
        this.hash = hash;
    }

    public EncryptedPassportElement data(String data) {
        this.data = data;

        return this;
    }

    public EncryptedPassportElement phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

        return this;
    }

    public EncryptedPassportElement email(String email) {
        this.email = email;

        return this;
    }

    public EncryptedPassportElement files(ArrayList<PassportFile> files) {
        this.files = files;

        return this;
    }

    public EncryptedPassportElement frontSide(PassportFile frontSide) {
        this.frontSide = frontSide;

        return this;
    }

    public EncryptedPassportElement reverseSide(PassportFile reverseSide) {
        this.reverseSide = reverseSide;

        return this;
    }

    public EncryptedPassportElement selfie(PassportFile selfie) {
        this.selfie = selfie;

        return this;
    }

    public EncryptedPassportElement translation(ArrayList<PassportFile> translation) {
        this.translation = translation;

        return this;
    }

}
