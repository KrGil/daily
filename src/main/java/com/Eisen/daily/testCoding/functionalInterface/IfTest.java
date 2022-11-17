package com.Eisen.daily.testCoding.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class IfTest {
    private final Map<String, Function<String, String>> foo = new HashMap<>();

    IfTest() {
        foo.put("String1", this::boo1);
        foo.put("String2", this::boo2);
        foo.put("String3", this::boo3);
    }

    public String boo1(String str){
        return str + ": String1 done";
    }
    public String boo2(String str){
        return str + ": String2 done";
    }
    public String boo3(String str){
        return str + ": String3 done";
    }

    public String run(String str){

        if(!foo.containsKey(str)){
            String err = "String1,2,3 중 하나만 가능합니다.";
            System.out.println(err);
            return err;
        }
        String bangta = "bangta1";
        return foo.get(str).apply(bangta);
    }


    public void ifTest(String str){

        if (str.equals("String1")) {
            //...
            System.out.println(boo1(str));
        }
        if (str.equals("String2")) {
            //...
            System.out.println(boo2(str));
        }
        if (str.equals("String3")) {
            //...
            System.out.println(boo3(str));
        }
    }


}
