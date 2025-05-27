package com.greetings;

import com.utils.UtilityClass;

public class GreetingApp {
    public static void main(String[] args) {
        String message = UtilityClass.greetUser("Taylor");
        System.out.println(message);
    }
}
