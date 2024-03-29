package com.Eisen.daily.testCoding;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NullTestTest {
    NullTest test = new NullTest();

    @Test
    @DisplayName("단순 출력 시 NPE가 발생하지 않음.")
    void generateNPE_01() {
        String str = null;
        if (str == null) {
            System.out.println("str = " + str);
        }
    }

    @Test
    @DisplayName("List에 값을 넣었을 경우")
    void generateNPE_02() {
        String str = null;
        if (str == null) {
            System.out.println("str = " + str);
        }
        try {
            str.toCharArray();
        } catch (NullPointerException e) {
            System.out.println("NPE 발생! err: "+ ExceptionUtils.getStackTrace(e));
        }
    }
    @Test
    @DisplayName("List에서 null값을 넣고 loop 돌렸을 경우")
    void generateNPE_03() {
        List<String> list = List.of(null, null);
        
        try {
            for (String s : list) {
                System.out.println("s = " + s);
            }            
        } catch (NullPointerException e) {
            System.out.println("NPE 발생! err: "+ ExceptionUtils.getStackTrace(e));
        }
    }

    @Test
   @DisplayName("Optional에서 map을 먼저 사용하면 어떻게 결과가 나오는지 확인")
    void optionalTest(){
        String a = null;
        String strResult = optionalOp("123");
        String nullResult = optionalOp(null);

        System.out.println("strResult = " + strResult);
        System.out.println("nullResult = " + nullResult);

    }
    String optionalOp(String str){
        return  Optional.ofNullable(str)
            .map(e -> e.substring(0,1))
            .orElse("");
    }

}