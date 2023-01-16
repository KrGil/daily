package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : LargestLocalValuesinaMatrix_2373Test
 * author :  eisen
 * date : 2023/01/16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/16                eisen             최초 생성
 */
class LargestLocalValuesinaMatrix_2373Test {
    LargestLocalValuesinaMatrix_2373 test = new LargestLocalValuesinaMatrix_2373();

    @Test
    void test(){
        int [][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        // Output: [[9,9],[8,6]]
        test.largestLocal(grid);
    }
}