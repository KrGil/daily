package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
            .mapToInt(e -> {
                StringTokenizer st = new StringTokenizer(e);
                return st.countTokens();
            })
            .peek(System.out::println)
            .max()
            .getAsInt();
    }
    public int mostWordsFound1(String[] sentences) {
        int cnt = 0;
        for (String sentence : sentences) {
            StringTokenizer st = new StringTokenizer(sentence);
            if (cnt < st.countTokens()) {
                cnt = st.countTokens();
            }
        }
        return cnt;
    }
}
