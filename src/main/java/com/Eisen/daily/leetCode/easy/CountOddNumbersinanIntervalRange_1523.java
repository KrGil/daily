package com.Eisen.daily.leetCode.easy;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : CountOddNumbersinanIntervalRange_1523
 * author :  eisen
 * date : 2023/02/13
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/13                eisen             최초 생성
 */
public class CountOddNumbersinanIntervalRange_1523 {

    public int countOdds(int low, int high) {
        boolean isLowEven = low % 2 == 0;
        boolean isHighEven = high % 2 == 0;
        System.out.println("isLowEven = " + isLowEven);
        System.out.println("isHighEven = " + isHighEven);
//        3, 4: 4 / 2 + 1
//        3, 7: 4 / 2 + 1
//        3, 9: 6 / 2 +1

//        8, 10: 2 / 2
//        4, 7: 3 / 2 + 1
//        9 10: 1 / 2 + 1
        if (isLowEven && isHighEven) {
            System.out.println(" == ");
            return (high - low) / 2;
        }
        System.out.println(" != ");
        return (high - low) / 2 + 1;
    }
}
