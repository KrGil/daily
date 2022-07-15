package com.Eisen.daily.lombok;

import org.junit.jupiter.api.Test;


class LombokClientTest {
    LombokClient client = new LombokClient();

    @Test
    void toString테스트하기(){
        client.toStringTest();
    }
}