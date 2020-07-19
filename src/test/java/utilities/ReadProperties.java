package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static String getData(String data) {
        String path = "configuration.properties";
        String result = null;
        try {
            InputStream input = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(input);
            result = properties.getProperty(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
