package com.Eisen.daily.leetCode.easy;

public class SplitAStringInBalancedStrings_1221 {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        int maxNumOfValancedString = 0;
        for (char c : chars) {
            if (c == 'R') {
                cnt++;
            }else if(c == 'L') {
                cnt--;
            }
            if (cnt == 0) {
                maxNumOfValancedString++;
            }
        }
        return maxNumOfValancedString;
    }
}
