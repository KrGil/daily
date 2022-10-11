package com.Eisen.daily.leetCode.easy;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : FinalValueOfVariableAfterPerformingOperations_2011
 * author :  eisen
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/09/28                eisen             최초 생성
 */
public class FinalValueOfVariableAfterPerformingOperations_2011 {
    public int finalValueAfterOperations(String[] operations) {
//       ["--X","X++","X++"]
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].contains("+")){
                result++;
            }else {
                result--;
            }
        }
        return result;
    }
}
