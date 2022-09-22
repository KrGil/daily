package com.Eisen.daily.testCoding.enum_test;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

@Data
public class Enum_getTest {
//    @JsonProperty("Test1")
    public TestEnum1 enumTest;
    public String str1;
//    @JsonProperty("Test2")
//    TestEnum2 enumTest2;

    public enum TestEnum1{
        AA("N/A");

        String value;

        TestEnum1(String value){
            this.value = value;
        }
        @JsonValue
        public String getValue(){
            return value;
        }
    }
    enum TestEnum2{
        NA("N/A");

        String value;

        TestEnum2(String value){
            this.value = value;
        }

        @JsonValue
        private String getValue(){
            return value;
        }
    }
}
