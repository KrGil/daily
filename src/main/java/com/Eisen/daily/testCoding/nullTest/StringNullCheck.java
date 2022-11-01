package com.Eisen.daily.testCoding.nullTest;

public class StringNullCheck {
    void test(){
        String a = null;
        String b = null;
        String c = a+b;
        System.out.println(c.equals("a"));
    }
}
