package com.Eisen.daily.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage_2325 {

    public String decodeMessage(String key, String message) {
        System.out.println("key = " + key);
        Map<Character, String> mappingTable = new HashMap<>();
        key = key.replace(" ", "");
        System.out.println("mappingTable = " + mappingTable);
        char[] keyArr = key.toCharArray();
        int num = 97;
        for (int i = 0; i < keyArr.length; i++) {
            mappingTable.put(keyArr[i], "");
            System.out.println("keyArr[i] = " + keyArr[i]);

            System.out.println((char) (num + i));

        }
//        mappingTable.put()
        return "";
    }
}
