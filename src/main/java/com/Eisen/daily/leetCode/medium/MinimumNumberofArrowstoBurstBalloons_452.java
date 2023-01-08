package com.Eisen.daily.leetCode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MinimumNumberofArrowstoBurstBalloons_452
 * author : eisen
 * date : 2023-01-05
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-05    AUTHOR: eisen    NOTE: 최초 생성
 */
public class MinimumNumberofArrowstoBurstBalloons_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        for (int[] point : points) {
            System.out.println("Arrays.toString(point) = " + Arrays.toString(point));
        }
        int cnt = 1;
        int[] prePoint = {points[0][0],points[0][1] };
        for (int[] curPoint : points) {
            cnt++;
            System.out.println("prePoint = " + Arrays.toString(prePoint));
            System.out.println("curPoint = " + Arrays.toString(curPoint));
            if(prePoint[0] <= curPoint[0] && curPoint[0] <= prePoint[1]){
                System.out.println("겹침");
                if(prePoint[1] > curPoint[1]){
                    prePoint[1] = curPoint[1];
                }
                cnt--;
            }else{
                System.out.println("curPoint = " + Arrays.toString(curPoint));
                prePoint[0] = curPoint[0];
                prePoint[1] = curPoint[1];
            }
            System.out.println("cnt = " + cnt);
            System.out.println();

        }
        return cnt;
    }
}
