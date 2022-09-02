package com.Eisen.daily.testCoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ExtendWith(MockitoExtension.class)
class JunitTestTest {

    @InjectMocks
    private JunitTest junitTest;

    @Mock
    private JunitTest.ServiceObj service;

    @Mock
    private JunitTest.EntityObj entity;

    @Mock
    private JunitTest.DTOObj dto;


    @Test
    @DisplayName("private Method 검증하기")
    public void convertToDTOTest() throws Exception{
        /* Reflection */
        Method target = JunitTest.class.getDeclaredMethod("convertToEntity", JunitTest.DTOObj.class);
        target.setAccessible(true);

        // given
        Mockito.when(service.generateString(Mockito.anyInt())).thenReturn("Hello Eisen!");

        // when
        target.invoke(junitTest, dto);

        // then
        Mockito.verify(service, Mockito.atLeastOnce()).generateString(3);
    }
}