package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.medium
 * fileName : MaximumIceCreamBars_1833Test
 * author :  eisen
 * date : 2023/01/06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/06                eisen             최초 생성
 */
class MaximumIceCreamBars_1833Test {
    MaximumIceCreamBars_1833 test = new MaximumIceCreamBars_1833();
    @Test
    void test(){
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        int[] costs2 = {10, 6, 8, 7, 7, 8};
        int coins2 = 5;
        assertEquals(4, test.maxIceCream(costs, coins));
        assertEquals(0, test.maxIceCream(costs2, coins2));

    }
}