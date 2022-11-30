package com.Eisen.daily.testCoding.springBoot;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootFieldStaticSampleConfig {
    @Bean(name = "myBean")
    public String myBean(){
        return "SpringBootFieldStaticSampleConfig";
    }
    // bean에는 한가지 타입에 하나의 객체만 등록 가능
    @Bean(name = "myBean1")
    public String myBean1(){
        return "SpringBootFieldStaticSampleConfig";
    }
}
