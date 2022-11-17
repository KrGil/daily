package com.Eisen.daily.testCoding.finalTest;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {
    void test(){
        final String a = "123";
//        a = "234";

        final int b = 123;
//        b = 234;

        List<String> list = new ArrayList<String>();
        list.add(a);
        list.add("321");

    }
}
