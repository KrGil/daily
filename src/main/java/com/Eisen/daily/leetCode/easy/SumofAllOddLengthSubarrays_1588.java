package com.Eisen.daily.leetCode.easy;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : SumofAllOddLengthSubarrays_1588
 * author : eisen
 * date : 2023-01-27
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-27    AUTHOR: eisen    NOTE: 최초 생성
 */
public class SumofAllOddLengthSubarrays_1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        System.out.println("arr = " + arr);
        int oddIndex = 0;
        int cnt = 0;
        while (oddIndex <= arr.length) {
            for (int i = 0; i <= arr.length; i+=oddIndex+1) {
                cnt += arr[i] + arr[oddIndex];
            }
            oddIndex+=2;
            
        }
        return 0;
    }
}
