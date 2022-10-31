package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] start = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            int[] ints = matrix[i];

            for (int j = 0; j < ints.length-1; j++) {
                if(start[j] != ints[j+1]){
                    return false;
                }
            }
            start = matrix[i];
        }
        return true;
    }
}
