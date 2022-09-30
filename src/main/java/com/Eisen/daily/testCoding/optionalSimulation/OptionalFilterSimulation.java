package com.Eisen.daily.testCoding.optionalSimulation;

import java.util.Optional;

public class OptionalFilterSimulation {
    String result;
    public String test(String succeed, int num){
        return Optional.ofNullable(succeed)
            .filter(e -> e.contains("N") && num >= 4)
            .map(e -> "F")
            .orElse(Optional.ofNullable(succeed).orElse("널안됨"));
    }
}
