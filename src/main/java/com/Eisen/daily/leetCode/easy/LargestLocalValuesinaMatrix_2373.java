package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : LargestLocalValuesinaMatrix_2373
 * author :  eisen
 * date : 2023/01/16
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/16                eisen             최초 생성
 */
public class LargestLocalValuesinaMatrix_2373 {
    public int[][] largestLocal(int[][] grid) {
        System.out.println("Arrays.deepToString(grid) = " + Arrays.deepToString(grid));

        int[][] result = new int[grid.length-2][grid.length-2];
        int rowI = 0;
        while(rowI != grid.length-2){
            for (int i = 0; i < grid.length - 2; i++) {
                int max = 0;
                System.out.println("i = " + i);
                for (int j = rowI; j <= rowI + 2; j++) {
                    max = Math.max(max, grid[j][i]);
                    max = Math.max(max, grid[j][i+1]);
                    max = Math.max(max, grid[j][i+2]);
                    System.out.println("grid[i][i] = " + grid[j][i]);
                    System.out.println("grid[i][i] = " + grid[j][i+1]);
                    System.out.println("grid[i][i] = " + grid[j][i+2]);
                    System.out.println("max = " + max);
                    System.out.println();
                }
                result[rowI][i] = max;
            }
            rowI++;
        }

        System.out.println("Arrays.deepToString(result) = " + Arrays.deepToString(result));

        return result;
    }
}
