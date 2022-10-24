package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class ShuffleString_1528 {
//    Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//    Output: "leetcode"
    public String restoreString(String s, int[] indices) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}
