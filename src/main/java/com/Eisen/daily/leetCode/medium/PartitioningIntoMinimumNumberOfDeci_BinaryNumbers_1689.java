package com.Eisen.daily.leetCode.medium;

/**
 * packageName :  com.Eisen.daily.leetCode.medium
 * fileName : PartitioningIntoMinimumNumberOfDeci_BinaryNumbers_1689
 * author :  eisen
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/10/04                eisen             최초 생성
 */
public class PartitioningIntoMinimumNumberOfDeci_BinaryNumbers_1689 {
    //"27346209830709182346"
    public int minPartitions(String n) {
        char[] ch = n.toCharArray();
        int cnt = 0;
        for (int i = 0; i < ch.length; i++) {
            if(Character.getNumericValue(ch[i]) > Character.getNumericValue(ch[i+1])){
                return cnt + Character.getNumericValue(ch[i]);
            }else{
                cnt += Character.getNumericValue(ch[i]);
            }
        }
        return cnt;
    }
}
