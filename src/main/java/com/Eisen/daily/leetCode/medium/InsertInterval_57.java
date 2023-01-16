package com.Eisen.daily.leetCode.medium;

import java.util.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : InsertInterval_57
 * author : eisen
 * date : 2023-01-16
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-16    AUTHOR: eisen    NOTE: 최초 생성
 */
public class InsertInterval_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[] temp = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        System.out.println("Arrays.toString(newInterval) = " + Arrays.toString(newInterval));
        System.out.println("Arrays.deepToString(intervals) = " + Arrays.deepToString(intervals));
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            System.out.println("Arrays.toString(interval) = " + Arrays.toString(interval));
            if(interval[0]  <= newInterval[0] && newInterval[0] <= interval[1]){
                temp[0] = interval[0];
            }
            if(interval[0] <= newInterval[1] && newInterval[1] <= interval[1]){
                temp[1] = interval[1];
            }
            System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));
            System.out.println();
        }
        if (temp[0] == Integer.MIN_VALUE ) {
            temp[0] = newInterval[0];
        }
        if(temp[1] == Integer.MIN_VALUE){
            temp[1] = newInterval[1];
        }
        System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));


        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if(interval[1] < temp[0])
                list.add(interval);
            if(interval[0] > temp[1])
                list.add(interval);
        }
        list.add(temp);

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = list.get(i)[j];
            }
        }
        System.out.println("result = " + Arrays.deepToString(result));

        Arrays.sort(result, Comparator.comparingInt(o -> o[0]));
        System.out.println("result = " + Arrays.deepToString(result));

        return result;
    }
}
