package com.Eisen.daily.leetCode.easy;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class Determine_If_String_Halves_Are_Alike_1704 {
    public boolean halvesAreAlike(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] sChars = s.toCharArray();

        String a = s.substring(0, sChars.length / 2);
        char[] aChars = a.toCharArray();

        String b = s.substring(sChars.length / 2, sChars.length);
        char[] bChars = b.toCharArray();

        int cnt = 0;
        for (int i = 0; i < aChars.length; i++) {
            for (Character vowel : vowels) {
                if(vowel == aChars[i]){
                    cnt++;
                }
                if (vowel == bChars[i]) {
                    cnt--;
                }
            }
        }
        return cnt == 0;
    }
    public boolean halvesAreAlikeSet(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] sChars = s.toCharArray();

        int cnt = 0;
        int halfLength = sChars.length / 2;
        for (int i = 0; i < halfLength; i++) {
            for (Character vowel : vowels) {
                if(vowel == sChars[i]){
                    cnt++;
                }
                if (vowel == sChars[i+halfLength]) {
                    cnt--;
                }
            }
        }
        return cnt == 0;
    }
}
