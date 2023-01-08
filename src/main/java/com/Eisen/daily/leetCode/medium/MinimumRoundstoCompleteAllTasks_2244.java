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
//Runtime
//74 ms
//Beats
//48.93%
//Memory
//108.3 MB
//Beats
//19.58%
public class MinimumRoundstoCompleteAllTasks_2244 {
    public int minimumRounds(int[] tasks) {
        // [2,2,3,3,2,4,4,4,4,4]
        Map<Integer, Integer> taskCnt = new HashMap<>();

        for (Integer level : tasks) {
            taskCnt.put(level, taskCnt.getOrDefault(level, 0) + 1);
        }

        int result = 0;
        for (Integer cnt : taskCnt.values()) {
            if(cnt == 1) return -1;
            result += cnt / 3;
            if (cnt % 3 != 0){
                result ++;
            }
        }
        return result;
    }
    //Runtime
    //50 ms
    //Beats
    //64.41%
    //Memory
    //84.4 MB
    //Beats
    //60.50%
    public int minimumRounds1(int[] tasks) {
        Arrays.sort(tasks);
        int cnt = 0, result = 0;

        for (int i = 0; i < tasks.length; i++) {
            cnt++;
            if(i == tasks.length -1 | tasks[i] != tasks[i + 1]) {
                if(cnt == 1) return -1;
                result += cnt / 3;
                if(cnt % 3 != 0) result++;
                cnt =0;
            }
        }
        return result;
    }
}
