package com.Eisen.daily.testCoding.implementsTest.service;

import com.Eisen.daily.testCoding.implementsTest.RetryHandlers;
import org.springframework.stereotype.Service;

@Service
public class TestService2 implements RetryHandlers {
    @Override
    public void retry() {
        System.out.println("TestService 2 retried");
    }
}
