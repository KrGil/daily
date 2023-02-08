package com.Eisen.daily.leetCode.easy;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : GreatestCommonDivisorofStrings_1071
 * author :  eisen
 * date : 2023/02/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/01                eisen             최초 생성
 */
public class GreatestCommonDivisorofStrings_1071 {

    public String gcdOfStrings(String str1, String str2) {
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        String preStr1 = str1.substring(0, str1.length() / 2);
        String postStr1 = str1.substring(str1.length() / 2);


        String resultStr1 = gcdOfStrings(preStr1, postStr1);
        String preStr2 = str1.substring(0, str1.length() / 2);
        String postStr2 = str1.substring(str1.length() / 2);
        String resultStr2 = gcdOfStrings(preStr2, postStr2);


        return resultStr1.length() < resultStr2.length() ? resultStr1 : resultStr2;
    }
}
