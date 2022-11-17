package com.Eisen.daily.leetCode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWordsInAString_151 {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        List<String> words = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreTokens()) {
            words.add(st.nextToken());
        }
        for (int i = words.size()-1; i >= 0; i--) {
            sb.append(words.get(i));
            if (i != 0) {
                sb.append(" ");
            }
        }

    return sb.toString();
    }

    public String reverseWords_v2(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String s1 : str) {

            sb.insert(0, s1+" ");
        }
        return sb.toString();
    }
}
