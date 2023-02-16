package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman_12 {
    @Test
    void test(){
        Assertions.assertEquals("MCMXCIV", intToRoman(1994));
    }

    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");

        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");

        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");

        map.put(1000, "M");
//        3999
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        System.out.println("sb = " + sb);

        String reverseStr = sb.toString();
        String[] arr = reverseStr.split("");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {

            }
            if (i == 1) {

            }
            if (i == 2) {
                map.getOrDefault(arr[i * 100], 0);

                result.append()
            }
            if (i == 3) {
                result.append("M");
            }
            map.get(arr[i]);
            result.append();
        }

        return map.toString();
    }
}
