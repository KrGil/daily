package com.Eisen.daily.testCoding.integerTest;

import com.tistory.eisen.Eisen;

import java.util.Arrays;

public class percentOperation {
    public int test1(){
        int num = 12345;
        return num % 10;

    }
    public int test2(){
        int num = 12345;
        return num / 10;
    }

    public int test3(){
        int num = 2932;
        int[] arr = new int[(num + "").length()];
        int index = 0;
        System.out.println("str");
        while (num > 0) {
            System.out.println(num);
            arr[index] = num % 10;
            num /= 10;
            index++;
        }
        Arrays.sort(arr);
        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];
        return num1 + num2;
    }
}
