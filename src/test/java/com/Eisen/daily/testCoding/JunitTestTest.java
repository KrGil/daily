package com.Eisen.daily.testCoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ExtendWith(MockitoExtension.class)
class JunitTestTest {

    @InjectMocks
    private PrivateMethodClass junitTest;

    @Mock
    private PrivateMethodClass.ServiceObj service;

    @Mock
    private PrivateMethodClass.EntityObj entity;

    @Mock
    private PrivateMethodClass.DTOObj dto;


    @Test
    @DisplayName("private Method 검증하기")
    public void convertToDTOTest() throws Exception{
        /* Reflection */
        Method target = PrivateMethodClass.class.getDeclaredMethod("convertToEntity", PrivateMethodClass.DTOObj.class);
        target.setAccessible(true);

        // given
        String str = "Hello Eisen!";
        Mockito.when(service.someObject(Mockito.anyInt())).thenReturn(str);

        // when
        target.invoke(junitTest, dto);
        ReflectionTestUtils.invokeMethod(junitTest, "convertToEntity", dto);
        
        // then
        Mockito.verify(service, Mockito.atLeastOnce()).someObject(3);
    }
}