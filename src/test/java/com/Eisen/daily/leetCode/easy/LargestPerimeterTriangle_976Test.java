package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : LargestPerimeterTriangle_976Test
 * author :  eisen
 * date : 2022/10/12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/10/12                eisen             최초 생성
 */
class LargestPerimeterTriangle_976Test {
    LargestPerimeterTriangle_976 test = new LargestPerimeterTriangle_976();

    @Test
    void test(){
        int[] testData = {3, 2, 3, 4};
        System.out.println(test.largestPerimeter(testData));
    }

}