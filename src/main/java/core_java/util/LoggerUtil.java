package core_java.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    public static void setLoggerCapabilities(Logger logger) throws IOException {
        FileHandler fileHandler = new FileHandler("app.log", true);
        CustomLogFormatter formatter = new CustomLogFormatter();
        fileHandler.setFormatter(formatter);

        // Important: Set levels
        logger.setLevel(Level.ALL);
        fileHandler.setLevel(Level.ALL);

        logger.addHandler(fileHandler);
    }
}
