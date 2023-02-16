package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddtoArrayFormofInteger_989 {

    @Test
    void tets(){
//        Assertions.assertEquals(List.of(1,2,3,4), addToArrayForm(new int[]{1,2,0,0}, 34));
//        Assertions.assertEquals(List.of(4,5,5), addToArrayForm(new int[]{2,7,4}, 181));
        Assertions.assertEquals(List.of(1,0,2,1), addToArrayForm(new int[]{2,1,5}, 806));
//        Assertions.assertEquals(List.of(2,3), addToArrayForm(new int[]{0}, 23));
//        Assertions.assertEquals(List.of(8,1,5), addToArrayForm(new int[]{6}, 809));
//        Assertions.assertEquals(List.of(8,1,5), addToArrayForm(new int[]{6}, 809));
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = num.length-1; i >= 0; i--) {
            System.out.println("i = " + i);
            // 811: 806 + 5
            // 82: 81 + 1
            // 10: 8 + 2
            k += num[i];

            // 1 : 811
            // 2 : 82
            // 0 : 10
            // 1 : 1
            list.add(0, k % 10);

            // 81
            // 8
            k = k / 10;
        }
        while(k > 0){
            list.add(0, k % 10);
            k = k / 10;
        }
        System.out.println("list = " + list);

        return list;

    }

}
