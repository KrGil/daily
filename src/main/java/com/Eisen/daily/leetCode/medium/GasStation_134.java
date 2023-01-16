package com.Eisen.daily.leetCode.medium;

/**
 * packageName :  com.Eisen.daily.leetCode.medium
 * fileName : GasStation_134
 * author :  eisen
 * date : 2023/01/07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/07                eisen             최초 생성
 */
public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
//        Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            if(gas[i] >  cost[i+1]){
                start = i;
            }
        }
        System.out.println("start = " + start);
        return start;
    }
}
