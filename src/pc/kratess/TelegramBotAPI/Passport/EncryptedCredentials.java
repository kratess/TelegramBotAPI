package pc.kratess.TelegramBotAPI.Passport;

import org.json.JSONObject;

public class EncryptedCredentials {

    private String data;
    private String hash;
    private String secret;

    public EncryptedCredentials(JSONObject encryptedCredentialsObject) {
        this.data = encryptedCredentialsObject.getString("data");
        this.hash = encryptedCredentialsObject.getString("hash");
        this.secret = encryptedCredentialsObject.getString("secret");
    }

    public EncryptedCredentials(String data, String hash, String secret) {
        this.data = data;
        this.hash = hash;
        this.secret = secret;
    }

}
