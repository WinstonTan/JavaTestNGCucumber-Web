package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeStampGenerator {

    public String getTimestamp()
    {
        return new SimpleDateFormat("yyMMdd_HHmmssSSS").
                format(new Timestamp(System.currentTimeMillis()));
    }
}