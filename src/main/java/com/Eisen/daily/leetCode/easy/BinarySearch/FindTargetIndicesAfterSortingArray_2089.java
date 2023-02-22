package com.Eisen.daily.leetCode.easy.BinarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTargetIndicesAfterSortingArray_2089 {

    static List<Integer> result;
    @Test
    void test(){
        int[] nums1 = {1, 2, 5, 2, 3};
        int target1 = 2;
        int[] nums2 = {1,2,5,2,3};
        int target2 = 3;
        int[] nums3 = {1,2,5,2,3};
        int target3 = 5;

        Assertions.assertEquals("[1, 2]", targetIndices(nums1, target1).toString());
//        Assertions.assertEquals("[3]", targetIndices(nums2, target2).toString());
//        Assertions.assertEquals("[4]", targetIndices(nums3, target3).toString());
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        result = new ArrayList<>();
        nums = Arrays.stream(nums).sorted().toArray();
        dfs(nums, target, l, r);
        Collections.sort(result);
        return result;
    }
    public void dfs(int[] nums, int target, int l, int r){
        System.out.println("l = " + l);
        System.out.println("r = " + r);
        if(l > r){return;}

        int mid = (l + r) / 2;
        System.out.println("mid = " + mid);
        System.out.println("nums[mid] = " + nums[mid]);
        System.out.println("target = " + target);
        if(nums[mid] == target){
            result.add(mid);
            System.out.println("result = " + result);
            System.out.println();
            if(r != l){
                dfs(nums, target, mid + 1, r);
                dfs(nums, target, l, mid);
            }
        }else if(nums[mid] < target){
            dfs(nums, target, mid + 1, r);
        } else if (nums[mid] > target) {
            dfs(nums, target, l, mid);
        }
    }

}
