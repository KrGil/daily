package com.Eisen.daily.programmers.level0;

/**
 * packageName : com.Eisen.daily.programmers.level0
 * fileName : AntRegion
 * author : eisen
 * date : 2023-01-05
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-05    AUTHOR: eisen    NOTE: 최초 생성
 */
public class AntRegion {
    public int solution(int hp) {
        int answer = 0;
        int[] degrees = {5, 3};
        // 5, 3, 1
        for (int degree : degrees) {
            answer += hp / degree;
            hp %= degree;
        }
        return answer + hp;
    }
}
