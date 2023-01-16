package com.Eisen.daily.leetCode.medium;

import java.util.Arrays;

/**
 * packageName :  com.Eisen.daily.leetCode.medium
 * fileName : MaximumIceCreamBars_1833
 * author :  eisen
 * date : 2023/01/06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/06                eisen             최초 생성
 */
public class MaximumIceCreamBars_1833 {
    public int maxIceCream(int[] costs, int coins) {
//        [1,3,2,4,1]
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++) {
            if ((coins -= costs[i]) < 0) return i;

        }

        return costs.length;
    }
}
