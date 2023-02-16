package com.Eisen.daily.codewar.seventhkyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isthisatriangle {
    public static boolean isTriangle(int a, int b, int c){
        int max = 0;
        int sum = 0;
        max = Math.max(a, b);
        max = Math.max(c, max);

        sum = a + b + c - max;

        return sum > max;
    }
}
