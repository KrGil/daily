package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithTheGreatestNumberOfCandies_1431 {
    // Input: candies = [2,3,5,1,3], extraCandies = 3
    // Output: [true,true,true,false,true]
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        int finalMax = max;
        return Arrays.stream(candies).mapToObj(e -> e + extraCandies > finalMax).collect(Collectors.toList());
    }

}
