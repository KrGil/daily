package com.Eisen.daily.leetCode.medium;

import com.tistory.eisen.Eisen;
import java.util.function.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingleElementinaSortedArray_540 {

    @Test
    @DisplayName("xor test")
    void xor(){
        int[] td1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] td2 = {3, 3, 7, 7, 10, 11, 11};
        Assertions.assertEquals(2, singleNonDuplicate_xor(td1));
        Assertions.assertEquals(10, singleNonDuplicate_xor(td2));
    }
    @Test
    @DisplayName("bs test")
    void bs(){
        int[] td1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] td2 = {3, 3, 7, 7, 10, 11, 11};
        Assertions.assertEquals(2, singleNonDuplicate(td1));
        Eisen.logMeasuredExecutionTime(this::singleNonDuplicate, td1);
        Assertions.assertEquals(10, singleNonDuplicate(td2));
        Eisen.logMeasuredExecutionTime(this::singleNonDuplicate, td2);

    }
    // O(n)
    public int singleNonDuplicate_xor(int[] nums) {
        int result = 0;
        for(int x : nums){
            result ^= x;
        }
        return result;
    }
    public void test(int[] a){

    }
    // O(log n)
    public int singleNonDuplicate(int[] nums){
        int left = 0, right = nums.length;
        while(left < right){
            int mid = (left + right) / 2;
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
