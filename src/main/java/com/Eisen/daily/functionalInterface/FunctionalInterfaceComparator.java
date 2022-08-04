package com.Eisen.daily.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceComparator {
    public static void main(String[] args) {
        // lambda
        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compare(o1, o2);
        System.out.println(comparatorLambda.compare(2,4));

        List<Integer> testList = Arrays.asList(1, 5, 3);
//        testList.add(1);
//        testList.add(4);
//        testList.add(2);

        System.out.println("before: " + testList);
        testList.sort(comparatorLambda);
        System.out.println("after: " + testList);

        // anonymous
        Comparator<Integer> comparatorAnonymous = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }

}
