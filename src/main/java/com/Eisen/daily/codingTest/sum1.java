package com.Eisen.daily.codingTest;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName :  com.Eisen.daily.codingTest
 * fileName : sum1
 * author :  eisen
 * date : 2022/11/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/11/21                eisen             최초 생성
 */
public class sum1 {
    public int[] solution(int[] number, int[] start, int[] finish) {
        // number = [100, 101, 102, 103, 104]
        // start = [1,2]
        // finish = [2,4]
        // 1. start
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[start.length];
        for (int i = 0; i < start.length; i++) {
            map.put(start[i], Math.min(finish[i], number.length));
            System.out.println("map.toString() = " + map.toString());
//            int sum = 0;
//            if (finish[i] <= number.length){
//                // 1 ~ 2, 2 ~ 4
//                for (int j = start[i]; j <= finish[i]; j++) {
//                    sum += number[j];
//                    System.out.println("sum = " + sum);
//                }
//            }else{
//                for (int j = start[i]; j <= number.length; j++) {
//                    sum += number[j];
//                    System.out.println("sum = " + sum);
//                }
//            }
//            result[i] = sum;
//            System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
        }
        int index = 0;
        for (int key : map.keySet()) {
            int sum = 0;
            for (int i = key; i <= map.get(key); i++) {
                sum += number[i];
                result[index] = sum;
            }
            index++;
        }
        return result;
    }
}
