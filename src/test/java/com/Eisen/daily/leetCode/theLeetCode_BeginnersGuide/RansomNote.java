package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import java.util.Arrays;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){
        int[] temp = new int[26];
        for (char c : magazine.toCharArray()) {
            temp[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            System.out.println(" before: "  );
            System.out.println(temp[c - 'a']<0);
            if(--temp[c - 'a'] < 0){
                return false;
            };
            System.out.println(" after: "  );
            System.out.println(temp[c - 'a']<0);
        }
        return true;
    }   
}

