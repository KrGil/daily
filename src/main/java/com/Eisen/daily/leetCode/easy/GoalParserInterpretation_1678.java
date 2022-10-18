package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class GoalParserInterpretation_1678 {
    public String interpret(String command) {
        command.replace("()", "o").replace("(al)", "al");
        System.out.println(command);
        return command;
    }
}
