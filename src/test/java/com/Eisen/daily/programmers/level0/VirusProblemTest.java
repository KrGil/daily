package com.Eisen.daily.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirusProblemTest {
    VirusProblem v = new VirusProblem();
    @Test
    void test(){
        int n = 2;
        int t = 10;
        v.solution(n, t);
    }
}