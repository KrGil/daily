package com.Eisen.daily.leetCode.medium;

public class $2396_Strictly_Palindromic_Number {
    public boolean isStrictlyPalindromic(int n) {
        // 2 <= b <= n-2
        int b = 2;
        int cnt =0;

        // 1. 진수 구하기
        while(Math.pow(b, cnt) <= n){
            cnt++;

        }
        System.out.println(cnt);
        return false;
    }


}
