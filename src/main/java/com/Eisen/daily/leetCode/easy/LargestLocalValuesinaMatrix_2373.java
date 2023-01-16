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
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < grid.length; i++) {
            int index = 0;
            int max = 0;
            System.out.println("i = " + i);
            while(index+2 != grid[0].length){
                System.out.println("i = " + i);
                System.out.println("index = " + index);
                System.out.println("max = " + max);
                max = Math.max(max, grid[i][index]);
                max = Math.max(max, grid[i][index+1]);
                max = Math.max(max, grid[i][index+2]);
                System.out.println("max = " + max);
//                result[i][index] = max;
                System.out.println("grid[0] = " + grid[i][index]);
                System.out.println("grid[0] = " + grid[i][index+1]);
                System.out.println("grid[0] = " + grid[i][index+2]);
                System.out.println();
                index++;
            }
        }
        System.out.println("Arrays.deepToString(result) = " + Arrays.deepToString(result));

//        for (int i = 0; i < grid.length; i++) {
//            int[] row = grid[i];
//            System.out.println("Arrays.toString(row) = " + Arrays.toString(row));
//            for (int j = 0; j < 3; j++) {
//                int column = row[j];
//                System.out.println("column = " + column);
//
//            }
//        }
        return new int[][]{{1,2}};
    }
}
