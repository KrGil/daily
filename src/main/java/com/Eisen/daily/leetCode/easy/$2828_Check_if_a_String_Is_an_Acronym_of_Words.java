package com.Eisen.daily.leetCode.easy;

import java.util.List;
import java.util.stream.Collectors;

public class $2828_Check_if_a_String_Is_an_Acronym_of_Words {
    public boolean isAcronym(List<String> words, String s) {

        return words.stream()
            .map(e -> String.valueOf(e.charAt(0)))
            .collect(Collectors.joining())
            .equals(s);

//            StringBuilder sb = new StringBuilder();
//            for(String word : words){
//                sb.append(word.charAt(0));
//            }
//            return sb.toString().equals(s);
    }
}
