package com.Eisen.daily.leetCode.study_LeetCode75;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t){
        if(s.length() == 0){
            return true;
        }
        // 'abc', 'aebec';
        int indexS = 0;
        int indexT = 0;
        for (int i = 0; i <= t.length(); i++) {
             if(s.charAt(indexS) == t.charAt(indexT)){
                 indexS++;
                 if(indexS == s.length()){
                     return true;
                 }
             }else{
                 indexT++;
             }
        }
        return false;
    }
}
