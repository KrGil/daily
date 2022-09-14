package com.Eisen.daily.book.javaInAction.chap05;

import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName :  com.Eisen.daily.book.javaInAction.chap05
 * fileName : Quiz5_2
 * author :  eisen
 * date : 2022/09/07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/09/07                eisen             최초 생성
 */
public class Quiz5_2 {
    public static void main(String[] args) {
        num1();

    }

    // 숫자 list가 주어졌을 때 각 숫자의 제곱근으로 이루어진 리스트를 반환하시오.
    // 1,2,3,4,5 -> 1,4,9,16,25
    private static void num1(){
        System.out.println("1. "+List.of(1, 2, 3, 4, 5).stream().map(e -> e*=e).collect(Collectors.toList()));
    }

    // 두 개의 숫자 리스트가 있을 때 모든 숫자 쌍의 리스트를 반환하시오.
    // [1,2,3] [3,4] [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]
    private static void num2(){

    }
}
