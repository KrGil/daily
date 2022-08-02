package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int cnt = 0;
        while (num != 0){
            cnt++;
            if(num % 2 ==0){
                num = num / 2;
            }else{
                num--;
            }
        }
        return cnt;
    }
}
