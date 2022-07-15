package com.Eisen.daily.leetCode.study_LeetCode75;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String f, String s){
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < f.length(); i++) {
            char a = f.charAt(i);
            char b = s.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a).equals(b)){
                   continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(b)){
                    map.put(a, b);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
