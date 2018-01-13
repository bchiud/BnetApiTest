package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigService {

    private String apiKey;
    private String locale;

    public ConfigService() {
        InputStream in = null;
        Properties prop = new Properties();

        try {
            in = new FileInputStream("config.properties");
            prop.load(in);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        apiKey = prop.getProperty("apiKey");
        locale = prop.getProperty("locale");
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getLocale() {
        return locale;
    }

}
