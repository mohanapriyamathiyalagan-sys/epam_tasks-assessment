package core_java.util;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomLogFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getSourceMethodName() + " : "+ record.getLevel() + " : " + record.getMessage() + "\n";
    }
}
