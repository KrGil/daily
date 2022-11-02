package com.Eisen.daily.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage_2325 {

    public String decodeMessage(String key, String message) {
        Map<Character, Character> mappingTable = new HashMap<>();
        mappingTable.put(' ', ' ');
        key = key.replace(" ", "");
        char[] keyArr = key.toCharArray();
        int num = 97;
        int cnt = 0;
        char[] messageArr = message.toCharArray();
        for (int i = 0; i < keyArr.length; i++) {
            if(mappingTable.containsKey(keyArr[i])){
                continue;
            }else{
                mappingTable.put(keyArr[i], (char) (num+cnt));
            }
            cnt++;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < message.length(); i++) {
            sb.append(mappingTable.get(messageArr[i]));
        }
        return sb.toString();
    }
}
