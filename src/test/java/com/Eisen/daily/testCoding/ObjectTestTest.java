package com.Eisen.daily.testCoding;

import com.tistory.eisen.Eisen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


class ObjectTestTest {

    @Test
    @DisplayName("오브젝트 기본 생성 시 get 하면 NPE가 뜰까?")
    void objectTest(){
        ObjectTest test = new ObjectTest();
        ObjectTest.ObTest aTest = new ObjectTest.ObTest();
        System.out.println("aTest = " + aTest.getA());
    }
}