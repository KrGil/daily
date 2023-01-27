package com.Eisen.daily.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : FlipStringtoMonotoneIncreasing_926
 * author : eisen
 * date : 2023-01-17
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-17    AUTHOR: eisen    NOTE: 최초 생성
 */
public class FlipStringtoMonotoneIncreasing_926 {
    public int minFlipsMonoIncr(String s) {
        System.out.println("s = " + s);
        int one = 0;
        int flip = 0;
        boolean isAfterOne = false;
        int size = s.length();
        for (int i = 0; i < size; i++) {
             if(s.charAt(i) == '1') one++;
             else {
                 flip = Math.min(one, ++flip);
             }
        }
        System.out.println("flip = " + flip);
        System.out.println("one = " + one);
        return flip;
    }
}
