package com.Eisen.daily.leetCode.easy;

import java.util.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : SortIntegersbyTheNumberof1Bits_1356
 * author : eisen
 * date : 2023-01-10
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-10    AUTHOR: eisen    NOTE: 최초 생성
 */
public class SortIntegersbyTheNumberof1Bits_1356 {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] result = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            map.putIfAbsent(Integer.bitCount(i), new ArrayList<>());
            map.get(Integer.bitCount(i)).add(i);
        }

        int cnt = 0;
        for (Integer key : map.keySet()) {
            map.get(key).sort(Integer::compareTo);
            for (Integer num : map.get(key)) {
                result[cnt] = num;
                cnt++;
            }
        }
        return result;
    }

}
