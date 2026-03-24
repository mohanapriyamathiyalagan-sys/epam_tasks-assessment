package collections.properties;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Config config = new Config();

        System.out.println("key1 = " + config.get("key1"));
        System.out.println("key2 = " + config.get("key2"));

        config.remove("key1");
        System.out.println("After remove key1 = " + config.get("key1"));

        config.save();

        config.set("default.filenames", "default2");
        config.save();

        config.reset();
        System.out.println("After reset key1 = " + config.get("key1"));
    }
}
