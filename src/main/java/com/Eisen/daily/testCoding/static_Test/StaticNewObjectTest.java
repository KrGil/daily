package com.Eisen.daily.testCoding.static_Test;

/**
 * packageName : com.Eisen.daily.testCoding.static_Test
 * fileName : StaticNewObjectTest
 * author : eisen
 * date : 2023-01-19
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-19    AUTHOR: eisen    NOTE: 최초 생성
 */
public class StaticNewObjectTest {

    StaticNewObjectTest(){
        System.out.println("create newObject" );
    }

    static StaticNewObjectTest get(){
         StaticNewObjectTest test = new StaticNewObjectTest();
        return test;
    }

    public static void main(String[] args) {
        StaticNewObjectTest test = get();
        System.out.println("test = " + test);
        System.out.println("get() = " + get());
    }
}
