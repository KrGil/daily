package com.Eisen.daily.leetCode.easy;

import java.util.StringTokenizer;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : TruncateSentence_1816
 * author :  eisen
 * date : 2023/01/31
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/31                eisen             최초 생성
 */
public class TruncateSentence_1816 {
    public String truncateSentence(String s, int k) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        while (cnt < k) {
            sb.append(st.nextToken());
            if(cnt != k-1) sb.append(" ");
            cnt++;
        }
        return sb.toString();
    }
}
