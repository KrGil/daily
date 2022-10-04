package com.Eisen.daily.testCoding;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * packageName :  com.Eisen.daily.testCoding
 * fileName : IntegerTest
 * author :  eisen
 * date : 2022/08/22
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/22                eisen             최초 생성
 */
public class IntegerTest {
    public static void main(String[] args) {
        System.out.println("100 / 10 = " + 100 / 10);
    }
    public int solution(int num1, int num2){
        return num1 == num2 ? 1 : -1;
    }
    public double solution2(int[] nums){

        return Arrays.stream(nums).mapToDouble(e -> Double.valueOf(e)).average().orElse(0);

    }

    public int solution3(int num1, int num2) {

        return (int) ((Double.valueOf(num1) / num2)*1000) ;
    }

    public int solution4(int n) {
        return IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 == 0)
            .sum();
    }
    public int solution5(long n){
        return IntStream.rangeClosed(0, (int)Math.ceil(n/2))
            .filter(e -> n == Math.pow(e, 2))
            .findFirst()
//            .orElse(-1);
            .stream().peek(e -> System.out.println(e))
            .map(e -> (int) Math.pow(e+1, 2))
            .findFirst()
            .orElse(-1);
    }
    public int[] solution6(int n){
        return IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 != 0)
            .toArray();
    }
}
