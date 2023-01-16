package com.Eisen.daily.listTest;

import com.Eisen.daily.testCoding.listTest.emptyListTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class emptyListTestTest {
    @Test
    void emptyListTest() {
        emptyListTest test = new emptyListTest();
        String a = "";
        a = test.testEmpty().isEmpty() ? "empty" : "123";
        System.out.println(a);
    }

    @Test
    @DisplayName("loop empty list")
    void emptyListLoopTest(){
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> test1 = new ArrayList<>();
        test1.add(1);
        test.add(test1);
        for (int i = 1; i < 3; i++) {
            test.add(new ArrayList<>());
        }

        System.out.println("test = " + test);
        for (Integer v : test.get(0)) {
            if(v == 1){
                System.out.println("v = " + v);
            }else if(v == 0){
                System.out.println("v = " + null);
            }
        }
        for (int i = 0; i < test.size(); i++) {
            System.out.println("test.get(i) = " + test.get(i));
            if (test.get(i).isEmpty()) {
                System.out.println("i = " + i);
            }
        }
    }
}