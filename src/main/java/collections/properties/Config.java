package collections.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private Properties config;

    public Config() throws IOException {
        reset();
    }

    public void reset() throws IOException {
        Properties mainProps = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        mainProps.load(fis);
        fis.close();

        String defaultFiles = mainProps.getProperty("default.filenames");

        Properties defaults = null;

        if (defaultFiles != null && !defaultFiles.trim().isEmpty()) {
            String[] files = defaultFiles.split(",");

            for (int i = files.length - 1; i >= 0; i--) {
                String fileName = "src/main/resources/" + files[i].trim() + ".properties";

                Properties temp = new Properties(defaults);

                FileInputStream dfis = new FileInputStream(fileName);
                temp.load(dfis);
                dfis.close();

                defaults = temp;
            }
        }

        config = new Properties(defaults);

        FileInputStream fis2 = new FileInputStream("src/main/resources/config.properties");
        config.load(fis2);
        fis2.close();
    }

    public String get(String key) {
        return config.getProperty(key);
    }

    public void set(String key, String value) {
        config.setProperty(key, value);
    }

    public void remove(String key) {
        config.remove(key);
    }

    public void save() throws IOException {
        Properties toSave = new Properties();

        for (Object key : config.keySet()) {
            toSave.setProperty((String) key, config.getProperty((String) key));
        }

        FileOutputStream fos = new FileOutputStream("src/main/resources/config.properties");
        toSave.store(fos, null);
        fos.close();
    }
}
