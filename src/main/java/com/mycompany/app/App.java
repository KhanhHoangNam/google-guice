package com.mycompany.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Calendar.SATURDAY);

//        Calendar cal = Calendar.getInstance();
//        Date date = cal.getTime();
//
//        System.out.println(cal);
//
//        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//            System.out.println("Sunday!");
//        }
//
//        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'17:00:00.000");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            System.out.println("Sunday!");
        } else {
            System.out.println("A day in week");
        }

    }
}
