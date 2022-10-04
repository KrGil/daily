package com.Eisen.daily.testCoding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntegerTestTest {
    IntegerTest test = new IntegerTest();
    @Test
    void test(){
        int[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(test.solution2(testData));

    }
    @Test
    void test2(){
        int num1 = 3;
        int num2 = 2;
        System.out.println(test.solution3(num1, num2));
    }

    @Test
    void test5(){
        int n = 3;
        int n1 = 121;
        int n2 = 1;
        System.out.println(test.solution5(n2));
    }

    @Test
    void test6(){
        int n = 10;
        System.out.println(Arrays.toString(test.solution6(n)));
    }
}