package com.Eisen.daily.leetCode.easy;

public class $2894_Divisible_and_Non_divisible_Sums_Difference {
//        Input: n = 10, m = 3
//        Output: 19
//        Explanation: In the given example:
//    - Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10],
//      num1 is the sum of those integers = 37.
//    - Integers in the range [1, 10] that are divisible by 3 are [3,6,9],
//      num2 is the sum of those integers = 18.
//    We return 37 - 18 = 19 as the answer.
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if(i % m != 0){
                sum1+= i;
            }
        }
        return sum1-sum2;
    }
}   