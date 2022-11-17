package com.Eisen.daily.testCoding.jsonTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditJsonTest {
    EditJson test = new EditJson();

    @Test
    void test(){
        System.out.println("test = " + test.editJson());
    }

    @Test
    void test2(){
        System.out.println("test = " + test.editString());
    }

}