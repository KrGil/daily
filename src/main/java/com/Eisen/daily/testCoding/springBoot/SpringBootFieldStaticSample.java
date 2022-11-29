package com.Eisen.daily.testCoding.springBoot;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class SpringBootFieldStaticSample {
    private SpringBootFieldStaticSample1 springBootFieldStaticSample1;

    private SpringBootFieldStaticSample2 springBootFieldStaticSample2;

    private String name = "springBoot";

    public void test(){
        springBootFieldStaticSample1.getName();
        springBootFieldStaticSample2.getName();
    }
}
