package com.Eisen.daily.testCoding.listTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class emptyListTest {
    public List<String> testEmpty() {
        List<String> test = new ArrayList<>();
        test = new ArrayList<>(test);
        return test;
    }
    public List<String> testSort(){
        List<String> test = new ArrayList<>();
        test = test.stream().collect(Collectors.toList());
//        test.sort();
        return test;
    }
}
