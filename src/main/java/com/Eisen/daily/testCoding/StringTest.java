package com.Eisen.daily.testCoding;

import java.util.regex.Matcher;

public class StringTest {
    public static void main(String[] args) {
        String.format("");
        System.out.println("String.format(\"\\\"id\\\" : \\\"%s\\\"\", \"id\") = " + String.format("\"id\" : \"%s\"", "id"));

        String s = "Hello";
        System.out.println(" = " + s.replaceAll("[A-Z]", "[a-z]"));
        for (Character c : s.toCharArray()) {
            s.toLowerCase();
        }
    }


}
