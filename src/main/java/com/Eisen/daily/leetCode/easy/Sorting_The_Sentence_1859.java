package com.Eisen.daily.leetCode.easy;

import java.util.StringTokenizer;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : Sorting_The_Sentence_1859
 * author :  eisen
 * date : 2022/11/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/11/21                eisen             최초 생성
 */
public class Sorting_The_Sentence_1859 {
//    "is2 sentence4 This1 a3"
    public String sortSentence(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String[] result = new String[st.countTokens()];
        while (st.hasMoreTokens()) {
            String a = st.nextToken();
            String index = a.substring(a.length()-1, a.length());
            result[Integer.parseInt(index)-1] = a.substring(0, a.length()-1);
        }
        return String.join(" ", result);
    }
}
