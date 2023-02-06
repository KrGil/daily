package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : N_thTribonacciNumber_1137
 * author : eisen
 * date : 2023-01-30
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-30    AUTHOR: eisen    NOTE: 최초 생성
 */
public class N_thTribonacciNumber_1137 {
    public int tribonacci(int n) {
        switch (n) {
            case 0 -> {return 0;}
            case 1, 2 -> {return 1;}
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i-1]+result[i-2]+result[i-3];
            System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
        }
        return result[n];
    }
}
