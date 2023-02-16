package com.Eisen.daily.codewar.sixthkyu;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Findtheoddint {

    public class FindOdd {

        public static int findIt(int[] A) {
            int xor = 0;
            for (int i = 0; i < A.length; i++) {
                xor ^= A[i];
            }
            return xor;
        }
    }

    @Test
    void test() {
        System.out.println(
            " = " + findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));

    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return key;
            }
        }

        return -1;
    }
}
