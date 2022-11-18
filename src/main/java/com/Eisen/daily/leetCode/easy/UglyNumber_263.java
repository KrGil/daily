package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumber_263 {
    // while
//    public boolean isUgly(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        while (n % 5 == 0) {
//            n = n / 5;
//        }
//        while (n % 3 == 0) {
//            n = n / 3;
//        }
//        while (n % 2 == 0) {
//            n = n / 2;
//        }
//        return n == 1;
//    }

    // recursion
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }if (n % 3 == 0) {
            return isUgly(n / 3);
        } if (n % 2 == 0) {
            return isUgly(n / 2);
        }
        return false;
    }
}


