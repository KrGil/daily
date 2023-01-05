package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MinimumRoundstoCompleteAllTasks_2244Test
 * author : eisen
 * date : 2023-01-05
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-05    AUTHOR: eisen    NOTE: 최초 생성
 */
class MinimumRoundstoCompleteAllTasks_2244Test {
    MinimumRoundstoCompleteAllTasks_2244 test = new MinimumRoundstoCompleteAllTasks_2244();

    @Test
    void test(){

        int[] data = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};

        test.minimumRounds(data);
    }
    @Test
    void test1(){
        System.out.println("몫 = " + 5 / 3);
        System.out.println("나머지 = " + 5 % 3);
    }
}