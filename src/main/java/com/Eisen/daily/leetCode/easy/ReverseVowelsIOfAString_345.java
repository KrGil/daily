package com.Eisen.daily.leetCode.easy;

import java.util.*;

public class ReverseVowelsIOfAString_345 {
    public String reverseVowels(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] chars = s.toCharArray();
        // stack을 사용.
        List<Integer> indies = new ArrayList<>();
        Queue<Character> queue = new LinkedList<>();
        // vowel인지 확인/
        for (int i = 0; i < chars.length; i++) {
            for (char vowel : vowels) {
                if(chars[i] == vowel){
                    System.out.println("chars = " + chars[i]);
                    System.out.println("vowel = " + vowel);
                    indies.add(i);
                    queue.add(vowel);
                }
            }
        }
        if (queue.isEmpty()) {
            System.out.println("empty");
            return s;
        }
        char start = queue.poll();
        char current = 0;
        for (int i = 1; i < indies.size() ; i++) {
            System.out.println("indies = " + indies.get(i));
            System.out.println("current = " + current);
            System.out.println("start = " + start);
            current = queue.poll();
            if(start != current){
                chars[indies.get(i)] = start;
                chars[indies.get(i-1)] = current;
            }
        }

        return new String(chars);
    }
}
