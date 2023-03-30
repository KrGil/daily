package com.Eisen.daily.programmers;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeNums {
    @Test
    void test(){
        assertEquals(2, solution(10, 40, 5));
        assertEquals(1, solution(10, 40, 30));
    }

    public int solution(int x, int y, int n) {
        int cnt = 0;
        Set<Integer> valueList = new HashSet<>();
        valueList.add(x);
        while (!valueList.isEmpty()) {
            if(valueList.contains(y)) {
                return cnt;
            }
            Set<Integer> temp = new HashSet<>();
            for (int i  : valueList) {
                int fCon = i + n;
                int sCon = i * 2;
                int tCon = i * 3;
                if (fCon <= y) {
                    temp.add(fCon);
                }
                if (sCon <= y) {
                    temp.add(sCon);
                }
                if (tCon <= y) {
                    temp.add(tCon);
                }
            }
            valueList = temp;
            cnt++;
        }
        return -1;
    }
}
