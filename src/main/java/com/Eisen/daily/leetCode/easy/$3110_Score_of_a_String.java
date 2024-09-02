package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class $3110_Score_of_a_String {
    //    Input: words = ["leet","code"], x = "e"
//    Output: [0,1]
//    Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new List<Integer>();
        int cnt =0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.contains(String.valueOf(x))){
                cnt++;
            }
        }
        result.add(0, cnt);
        System.out.println(result);
        return result;
    }
}