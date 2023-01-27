package com.Eisen.daily.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : SubarraySumsDivisiblebyK_974
 * author : eisen
 * date : 2023-01-19
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-19    AUTHOR: eisen    NOTE: 최초 생성
 */
public class SubarraySumsDivisiblebyK_974 {
    int cnt;
    public int subarraysDivByK(int[] nums, int k) {

        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            System.out.println("nums[i] = " + nums[i]);

            // revert
            tmp.add(nums[i]);
            System.out.println("tmp = " + tmp);

            sum(tmp, k);
        }
        return cnt;
    }
    public int sum(List<Integer> tmp, int k) {
        int sum = 0;
        int[] invertNums = new int[tmp.size()];

        System.out.println("tmp.size() = " + tmp.size());
        int j = 0;
        for (int i = tmp.size() - 1; i >= 0 ; i--) {
            invertNums[j] = tmp.get(i);
            j++;
        }
        System.out.println("tmp = " + tmp);
        for (int num : invertNums) {
            if((sum += num) % k == 0){
                cnt++;
            }
            System.out.println();
        }
        return cnt;
    }
}
