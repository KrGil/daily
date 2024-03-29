package com.Eisen.daily.enum_test;

import com.Eisen.daily.testCoding.enum_test.Enum_getTest;
import com.Eisen.daily.testCoding.enum_test.Enum_getTest.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

class Enum_getTestTest {

    @Test
    void EnumValue테스트() throws JsonProcessingException {
        Enum_getTest enum1 = new Enum_getTest();
        ObjectMapper jsonMapper = new ObjectMapper();

        enum1.str1 = "테스트 데이터1";
        enum1.enumTest = TestEnum1.AA;
//        enum1.enumTest2 = TestEnum2.NA;

        System.out.println(jsonMapper.writeValueAsString(enum1));
    }

    @Test
    void EnumValues테스트() {
        Enum_getTest e = new Enum_getTest();
        TestEnum1 a = e.getEnumTest();
        System.out.println(a.values());
    }
}