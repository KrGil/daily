package com.Eisen.daily.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage_2325 {

    public String decodeMessage(String key, String message) {
        Map<Character, Character> mappingTable = new HashMap<>();
        key = key.replace(" ", "");
        char[] keyArr = key.toCharArray();
        int num = 97;
        for (int i = 0; i < keyArr.length; i++) {
            if(!mappingTable.containsKey(keyArr[i])){
                mappingTable.put(keyArr[i], (char) (num++));
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < message.length(); i++) {
            if(mappingTable.containsKey(keyArr[i])){
                sb.append(mappingTable.get(message.charAt(i)));
            }else{
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}
