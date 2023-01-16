package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : InsertInterval_57Test
 * author : eisen
 * date : 2023-01-16
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-16    AUTHOR: eisen    NOTE: 최초 생성
 */
class InsertInterval_57Test {
    InsertInterval_57 test = new InsertInterval_57();

    @Test
    void test(){
//        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//        Output: [[1,5],[6,9]]
        int[][] intervals = {{1,3},{6,9}};
        int[] newIntervals = {2, 5};
        int[][] intervals1 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newIntervals1 = {4, 8};


        test.insert(intervals1, newIntervals1);

    }

}