package com.mycompany.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Calendar.SATURDAY);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'17:00:00.000");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            System.out.println("Sunday!");
        } else {
            System.out.println("A day in week");
        }

        //Call a method in main method
        anotherMethod();

    }

    private static void anotherMethod() {
        System.out.println("I'm a fucking boy");
    }
}
