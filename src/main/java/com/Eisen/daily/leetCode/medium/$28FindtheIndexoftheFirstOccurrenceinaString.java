package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class $28FindtheIndexoftheFirstOccurrenceinaString {
    @Test
    void test(){
        String haystack = "sadbutsad", needle = "sad";
        String haystack1 = "leetcode", needle1 = "leeto";
        String haystack2 = "mississippi", needle2 = "issip";
        String haystack3 = "a", needle3 = "a";
        String haystack4 = "aaabaaabbbabaa", needle4 = "babb";

//        Assertions.assertEquals(0, strStr(haystack, needle));
//        Assertions.assertEquals(-1, strStr(haystack1, needle1));
//        Assertions.assertEquals(0, strStr(haystack3, needle3));
        Assertions.assertEquals(-1, strStr(haystack4, needle4));
    }
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    public int strStr(String haystack, String needle) {
        String[] arrH = haystack.split("");
        String[] arrN = needle.split("");
        if (arrH.length < arrN.length) {
            return -1;
        }
        int nPointer = 0;
        for (int i = 0; i <= arrH.length - arrN.length; i++) {
            System.out.println("i = " + i);
            if (arrH[i].equals(arrN[0])) {
                nPointer=0;
                while (arrH[i + nPointer].equals(arrN[nPointer])){
                    System.out.println("nPointer = " + nPointer);
                    System.out.println("arrH[i + nPointer] = " + arrH[i + nPointer]);
                    System.out.println("arrN[nPointer] = " + arrN[nPointer]);
                    if(nPointer + 1 == arrN.length){
                        return i;
                    }
                    nPointer++;
                }
            }
        }
        return -1;
    }

}
