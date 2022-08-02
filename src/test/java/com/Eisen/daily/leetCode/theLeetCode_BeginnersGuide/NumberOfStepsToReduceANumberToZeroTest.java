package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberToZeroTest {
    NumberOfStepsToReduceANumberToZero test;

    @Test
    void numberOfSteps(){
        test = new NumberOfStepsToReduceANumberToZero();
        System.out.println("test.numberOfSteps(6) = " + test.numberOfSteps(6));
    }
}