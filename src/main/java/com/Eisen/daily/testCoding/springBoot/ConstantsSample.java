package com.Eisen.daily.testCoding.springBoot;

import org.springframework.beans.factory.annotation.Value;

public class ConstantsSample {

    @Value("${test.name}")
    private String who;

}
