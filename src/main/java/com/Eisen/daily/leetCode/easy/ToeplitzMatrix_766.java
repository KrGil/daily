package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[i-1][j] != matrix[i][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
