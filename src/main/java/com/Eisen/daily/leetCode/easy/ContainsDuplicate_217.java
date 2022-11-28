package com.Eisen.daily.leetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<Integer>();

        for (int num : nums) {
            if (res.contains(num)) {
                return true;
            }
            res.add(num);
        }
        return false;
    }
}
