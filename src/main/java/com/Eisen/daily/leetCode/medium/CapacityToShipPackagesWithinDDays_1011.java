package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapacityToShipPackagesWithinDDays_1011 {

    @Test
    void test(){
        int[] data1 = {1, 2, 3, 4};
        int[] data2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] data3 = {10, 50, 100, 100, 50, 100, 100, 100};
//        Assertions.assertEquals(6, shipWithinDays(data1, 2));
//        Assertions.assertEquals(15, shipWithinDays(data2, 5));
        Assertions.assertEquals(160, shipWithinDays(data3, 5));
    }
    public int shipWithinDays(int[] weights, int days) {
        // weights = {1, 2, 3, 4}  days = 2
        int left = 0, right = 0;
        for (int weight : weights) {
            left = Math.max(weight, left);
            right += weight;
        }
        // bs
        int ans = 0;
        while (left <= right) {
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            int mid = (left + right) / 2;
            System.out.println("mid = " + mid);
            if (isPossible(weights, days, mid)) {
                right = mid-1;
                ans = mid;
            } else {
                left = mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] weights, int days, int maxCap){
        int currCap = 0;
        int currDay = 1;
        System.out.println("maxCap = " + maxCap);
        for (int weight : weights) {
            currCap += weight;
            System.out.println("currCap = " + currCap);
            if (currCap > maxCap) {
                currDay++;
                currCap = weight;
                System.out.println("currDay = " + currDay);
            }
        }
        return currDay <=days;
    }
}
