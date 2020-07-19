package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static String getData(String data) throws IOException {
        String path = "configuration.properties";
        InputStream input = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(input);
        String result = properties.getProperty(data);
        return result;
    }
}
