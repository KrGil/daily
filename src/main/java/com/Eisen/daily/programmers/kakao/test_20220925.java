package com.Eisen.daily.programmers.kakao;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * packageName :  com.Eisen.daily.programmers.kakao
 * fileName : test_20220925
 * author :  eisen
 * date : 2022/09/24
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/09/24                eisen             최초 생성
 */
public class test_20220925 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        IntStream.rangeClosed(1, a)
            .map(e -> {
                sb.append("*");
                System.out.println(sb);
                return e;
            })
            .sum();
    }
}
