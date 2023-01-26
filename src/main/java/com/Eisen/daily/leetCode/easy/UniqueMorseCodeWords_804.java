package com.Eisen.daily.leetCode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : UniqueMorseCodeWords_804
 * author :  eisen
 * date : 2023/01/20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/20                eisen             최초 생성
 */
public class UniqueMorseCodeWords_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mosAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> mosSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                sb.append(mosAlphabet[(int)c - 97]);
            }
            mosSet.add(sb.toString());
        }
        return mosSet.size();

    }
}
