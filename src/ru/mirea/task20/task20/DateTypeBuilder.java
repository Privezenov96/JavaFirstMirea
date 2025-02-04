package ru.mirea.task20.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTypeBuilder {
    long getMillisecondsFromDateStr(String dateStr)
    {
        long millis = -1;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try{
            Date date = sdf.parse(dateStr);
            millis = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return millis;
    }
}