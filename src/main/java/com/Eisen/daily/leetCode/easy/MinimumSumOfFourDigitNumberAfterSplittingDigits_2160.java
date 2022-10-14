package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits_2160 {

    public int solution(int num){
        int[] arr = new int[4];
        int index = 0;
        while (num > 0) {
            arr[index] = num % 10;
            num /= 10;
            index++;
        }
        Arrays.sort(arr);
        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];
        return num1 + num2;
    }
    public int solution2(int num){
        char[] str = (num + "").toCharArray();
        Arrays.sort(str);

        String num1 = str[0]+""+ str[2];
        String num2 = str[1]+"" + str[3];
        return Integer.parseInt(num1 + num2);
    }
}
