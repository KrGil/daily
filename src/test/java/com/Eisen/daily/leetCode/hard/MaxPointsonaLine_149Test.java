package com.Eisen.daily.leetCode.hard;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.hard
 * fileName : MaxPointsonaLine_149Test
 * author : eisen
 * date : 2023-01-09
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-09    AUTHOR: eisen    NOTE: 최초 생성
 */
class MaxPointsonaLine_149Test {

    MaxPointsonaLine_149 test = new MaxPointsonaLine_149();

    @Test
    void test() {
        int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int[][] points1 = {{2, 3}, {3, 3}, {-5, 3}};
        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}};
        int[][] points3 = {{9,-25},{-4,1},{-1,5},{-7,7}};
        int[][] points4 = {{0, 0}, {1, -1}, {1, 1}};
        int[][] points5 = {{7,3},{19,19},{-16,3},{13,17},{-18,1},{-18,-17},{13,-3},{3,7},{-11,12},{7,19},{19,-12},{20,-18},{-16,-15},{-10,-15},{-16,-18},{-14,-1},{18,10},{-13,8},{7,-5},{-4,-9},{-11,2},{-9,-9},{-5,-16},{10,14},{-3,4},{1,-20},{2,16},{0,14},{-14,5},{15,-11},{3,11},{11,-10},{-1,-7},{16,7},{1,-11},{-8,-3},{1,-6},{19,7},{3,6},{-1,-2},{7,-3},{-6,-8},{7,1},{-15,12},{-17,9},{19,-9},{1,0},{9,-10},{6,20},{-12,-4},{-16,-17},{14,3},{0,-1},{-18,9},{-15,15},{-3,-15},{-5,20},{15,-14},{9,-17},{10,-14},{-7,-11},{14,9},{1,-1},{15,12},{-5,-1},{-17,-5},{15,-2},{-12,11},{19,-18},{8,7},{-5,-3},{-17,-1},{-18,13},{15,-3},{4,18},{-14,-15},{15,8},{-18,-12},{-15,19},{-9,16},{-9,14},{-12,-14},{-2,-20},{-3,-13},{10,-7},{-2,-10},{9,10},{-1,7},{-17,-6},{-15,20},{5,-17},{6,-6},{-11,-8}};
        assertEquals(4, test.maxPoints(points));
        assertEquals(3, test.maxPoints(points1));
        assertEquals(3, test.maxPoints(points1));
        assertEquals(3, test.maxPoints(points2));
        assertEquals(3, test.maxPoints(points3));
        assertEquals(2, test.maxPoints(points4));
        assertEquals(6, test.maxPoints(points5));

    }
    @Test
    void test1() {
        Set<Double> set = new HashSet<Double>();
        double a = 0/2;
        double b = (double) 2 / 0;
        double c = 2 / (double)0;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}