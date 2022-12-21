package com.Eisen.daily.programmers.level0;

public class Protractor {
    /**
     * 예각 : 0 < angle < 90
     * 직각 : angle = 90
     * 둔각 : 90 < angle < 180
     * 평각 : angle = 180
     */
    public int solution(int angle) {
        if ( 0 < angle && angle < 90 ) {
            return 1;
        }else if ( angle == 90 ) {
            return 2;
        }else if ( 90 < angle && angle < 180 ) {
            return 3;
        }else if ( angle == 180 ) {
            return 4;
        }
        return 0;
    }
}
