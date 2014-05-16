/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Cuong
 */
public class ConvertUtils {

    public static String formatDateToString(Date date, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        if (date != null) {
            return format.format(date);
        }

        return null;
    }

    public static String formatDateToString(Date date) {
        return formatDateToString(date, "yyyy-MM-dd");
    }

    public static Date parserStringToDate(String value, String pattern) {
        // TODO: CODE
        return null;
    }

    public static Date parserStringToDate(String value) {
        // TODO: code;
        return parserStringToDate(value, "");
    }

    public static Date parserXmlSoccerDate(String value) {
        
        boolean inDST = false;
        
        Calendar cal = DatatypeConverter.parseDateTime(value);
//        int year = cal.get(Calendar.YEAR);
//        
//        Calendar checkCal1 = (Calendar) cal.clone();
//        Calendar checkCal2 = (Calendar) cal.clone();
//        
//        checkCal1.set(Calendar.MONTH, Calendar.MARCH);
//        checkCal1.set(Calendar.DAY_OF_MONTH, getLastSundayOfMonth(year, Calendar.MARCH));
//        checkCal1.set(Calendar.HOUR_OF_DAY, 1);
//        
//        checkCal2.set(Calendar.MONTH, Calendar.OCTOBER);
//        checkCal2.set(Calendar.DAY_OF_MONTH, getLastSundayOfMonth(year, Calendar.OCTOBER));
//        checkCal1.set(Calendar.HOUR_OF_DAY, 1);
//        
//        if (cal.after(checkCal1) && cal.before(checkCal2)) {
//            inDST = true;
//        }
//
//        if (inDST) {
//            cal.add(Calendar.HOUR, -1);
//        }
        
        return cal.getTime();
    }

    public static int getLastSundayOfMonth(int year, int month) {
        {
            Calendar cal = Calendar.getInstance();
            cal.set(year, month, 1, 0, 0, 0);
            cal.set(Calendar.MILLISECOND, 0);

            int firstDay = cal.get(Calendar.DAY_OF_WEEK);
            int daysOfMonth = cal.getMaximum(Calendar.DAY_OF_MONTH);

            switch (firstDay) {
                case Calendar.SUNDAY:
                    if (daysOfMonth > 29)
                    return 29;
                case Calendar.MONDAY:
                    return 28;
                case Calendar.TUESDAY:
                    return 27;
                case Calendar.WEDNESDAY:
                    return 26;
                case Calendar.THURSDAY:
                    return 25;
                case Calendar.FRIDAY:
                    if (daysOfMonth == 31) {
                        return 31;
                    }
                    return 24;
                case Calendar.SATURDAY:
                    if (daysOfMonth >= 30) {
                        return 30;
                    }
                    return 23;
            }
            throw new RuntimeException("what day of the month?");
        }
    }
    
    public static int parseStr2Int(String value) {
        int result = 0;
        try {
            result = Integer.valueOf(value);
        } catch (Exception e) {
        }
        
        return result;
    }
}
