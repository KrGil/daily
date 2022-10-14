package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class JewelsAndStones_771 {
    // jewels = "aA", stones = "aAAbbbb"
    // jewels = "aA", stones = "aAAbbbb"
    public int numJewelsInStones(String jewels, String stones) {
        int[] jewelCnt = new int[58];
        int[] stoneCnt = new int[58];
        char[] chJ = jewels.toCharArray();
        char[] chS = stones.toCharArray();
        int cnt = 0;

        for (char c : chJ) {
            jewelCnt[c-65]++;
        }
        System.out.println(Arrays.toString(jewelCnt));
        for (char ch : chS) {
//            stoneCnt[ch - 65]++;
            if(jewelCnt[ch - 65] != 0){
                cnt++;
            }
        }
//        System.out.println(Arrays.toString(stoneCnt));

//        for (int i = 0; i < jewelCnt.length; i++) {
//            if (jewelCnt[i] != 0 && stoneCnt[i] != 0) {
//                cnt += stoneCnt[i];
//            }
//        }
        System.out.println("cnt = " + cnt);

        return 0;
    }
}
