package com.Eisen.daily.testCoding.springBoot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringBootFieldStaticSampleTest {
    @Autowired
    SpringBootFieldStaticSample test;

    @Test
    void test(){
        test.test();
    }

}