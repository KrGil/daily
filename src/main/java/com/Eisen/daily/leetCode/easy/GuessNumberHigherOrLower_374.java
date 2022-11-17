package com.Eisen.daily.leetCode.easy;

public class GuessNumberHigherOrLower_374 {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = guess(mid);
            if (guess == -1) { // n > pick
                high = mid - 1;
            } else if (guess == 1) { // n < pick
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int guess(int mid) {
        int pick = 6;
        if(pick > mid){
            return 1;
        }else if(pick < mid){
            return -1;
        }else{
            return 0;
        }
    }
}
