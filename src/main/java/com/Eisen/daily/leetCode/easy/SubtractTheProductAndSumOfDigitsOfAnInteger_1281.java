package com.Eisen.daily.leetCode.easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger_1281 {
//    Input: n = 234
//    Output: 15
//    Explanation:
//    Product of digits = 2 * 3 * 4 = 24
//    Sum of digits = 2 + 3 + 4 = 9
//    Result = 24 - 9 = 15
    public int subtractProductAndSum(int n) {
        String str = n+"";
        char[] ch = str.toCharArray();
        int totalSum = 0;
        int totalMul = 1;
        for (char c : ch) {
            totalSum += Character.getNumericValue(c);
            totalMul *= Character.getNumericValue(c);
        }
        return totalMul - totalSum;
    }
    public int subtractProductAndSum2(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0){
            System.out.println("n = " + n);
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}
