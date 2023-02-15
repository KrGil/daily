package com.Eisen.daily.programmers;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName :  com.Eisen.daily.programmers
 * fileName : ChangeNums
 * author :  eisen
 * date : 2023/02/15
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/15                eisen             최초 생성
 */
public class ChangeNums {
//    자연수 x를 y로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.
// x에 n을 더합니다
// x에 2를 곱합니다.
// x에 3을 곱합니다.
// 자연수 x, y, n이 매개변수로 주어질 때, x를 y로 변환하기 위해
// 필요한 최소 연산 횟수를 return하도록 solution 함수를 완성해주세요. 이때 x를 y로 만들 수 없다면 -1을 return 해주세요.
//    10	40	5	2
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
