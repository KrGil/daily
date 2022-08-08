package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import java.util.Arrays;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){
        char[] alphabetList = new char[26];
        char[] temp = new char[26];
        char[] ransomNoteCharArr = ransomNote.toCharArray();

        // 0 = 97, 1 = 98 ...
        char alpahbet = 96;
        for (int i = 0; i < alphabetList.length; i++) {
            alphabetList[i] = alpahbet++;
        }
        temp = alphabetList;

        for (int i = 0; i < temp.length; i++) {

        }

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        ransomNote = new String(a);
        magazine = new String(b);

        if(magazine.contains(ransomNote)){
            return true;
        }
        return false;
    }
}

