package com.Eisen.daily.testCoding.springBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SpringBootFieldStaticSample {
    private final SpringBootFieldStaticSample1 springBootFieldStaticSample1;
    private final SpringBootFieldStaticSample2 springBootFieldStaticSample2;
    public SpringBootFieldStaticSample(SpringBootFieldStaticSample1 springBootFieldStaticSample1, SpringBootFieldStaticSample2 springBootFieldStaticSample2,
                                       @Qualifier("myBean") String name,  @Qualifier("myBean1") String name1
                                       ) {
        this.springBootFieldStaticSample1 = springBootFieldStaticSample1;
        this.springBootFieldStaticSample2 = springBootFieldStaticSample2;
        this.name = name;
        this.name1 = name1;
    }
    private String name = "test";
    private String name1 = "test";
    public void test(){
        springBootFieldStaticSample1.getName();
        springBootFieldStaticSample2.getName();
        System.out.println("name = " + name);
        System.out.println("name2 = " + name1);
    }
}
