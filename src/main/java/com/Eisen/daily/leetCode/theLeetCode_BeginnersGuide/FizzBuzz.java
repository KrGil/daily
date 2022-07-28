package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
    //Input: n = 3
    //Output: ["1","2","Fizz"]
    /* java */
//    public List<String> fizzBuzz(int n) {
//        List<String> strArray = new ArrayList<>();
//        //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        //answer[i] == "Fizz" if i is divisible by 3.
//        //answer[i] == "Buzz" if i is divisible by 5.
//        for (int i = 1; i <= n; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                strArray.add("FizzBuzz");
//            }else if (i % 3 == 0){
//                strArray.add("Fizz");
//            }else if (i % 5 == 0){
//                strArray.add("Buzz");
//            }else{
//                strArray.add(String.valueOf(i));
//            }
//        }
//        return strArray;
//    }
    /* intStream  */
    public List<String> fizzBuzz(int n){
        return IntStream.rangeClosed(1, n)
            .mapToObj(x -> x % 3 == 0 ? (x % 5 == 0 ? "FizzBuzz" : "Fizz") : (x % 5 == 0 ? "Buzz" : String.valueOf(x)))
            .collect(Collectors.toList());
    }

    /* Stream */
//    public List<String> fizzBuzz(int n ){
//        return Stream
//            .iterate(1, i -> i+1)
//            .limit(n)
//            .map(() -> {})
//    }
}
