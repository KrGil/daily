package com.Eisen.daily.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : Non_decreasingSubsequences_491
 * author : eisen
 * date : 2023-01-20
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-20    AUTHOR: eisen    NOTE: 최초 생성
 */
public class Non_decreasingSubsequences_491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        List<List<Integer>> sequences = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            System.out.println("nums[i] = " + nums[i]);
            System.out.println("nums[i+1] = " + nums[i+1]);

            List<Integer> list = new ArrayList<>();
            System.out.println("list = " + list);
            list.add(nums[i]);
            List<Integer> tmp = new ArrayList<>(list);

            for (int j = i+1; j < nums.length-1; j++) {
                List<Integer> sublist = new ArrayList<>(tmp);
                List<Integer> sublist1 = new ArrayList<>(list);
                System.out.println("j = " + j);
                System.out.println("nums[j] = " + nums[j]);
                System.out.println("nums[j+1] = " + nums[j + 1]);
                if (nums[i] <= nums[j]) { // 4, 6 // 4,6,7
                    sublist.add(nums[j]);
                    System.out.println("sublist = " + sublist);
                    sequences.add(sublist);
                }
                for (int k = 0; k < nums.length; k++) {
                    int num = nums[k];

                }
                if(nums[j] <= nums[j + 1]){ // 4, 7
                    tmp.add(nums[j + 1]);
                    sublist.add(nums[j + 1]);
                    sequences.add(sublist);
                }else break;
            }
        }
        return sequences;
    }
}
