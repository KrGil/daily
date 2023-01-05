package com.Eisen.daily.leetCode.medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MinimumRoundstoCompleteAllTasks_2244
 * author : eisen
 * date : 2023-01-05
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-05    AUTHOR: eisen    NOTE: 최초 생성
 */
public class MinimumRoundstoCompleteAllTasks_2244 {
    public int minimumRounds(int[] tasks) {
        // [2,2,3,3,2,4,4,4,4,4]
        Map<Integer, Integer> taskCnt = new HashMap<>();

        System.out.println("taskCnt.entrySet() = " + taskCnt.entrySet());
        for (Integer level : tasks) {
            taskCnt.put(level, taskCnt.getOrDefault(level, 0) + 1);
        }
        System.out.println("taskCnt.entrySet() = " + taskCnt.entrySet());

        int result = 0;
        for (Integer cnt : taskCnt.values()) {
            if(cnt == 1) return -1;
            result += cnt / 3;

            if (cnt % 3 != 0){
                result ++;
            }
        }
        System.out.println("result = " + result);
        return tasks.length;
    }
}
