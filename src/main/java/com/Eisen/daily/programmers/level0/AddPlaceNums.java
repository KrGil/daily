package com.Eisen.daily.programmers.level0;

public class AddPlaceNums {
    public int solution(int n) {
        // n = 1234
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        int answer = 0;
        for (char c : ch) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}
