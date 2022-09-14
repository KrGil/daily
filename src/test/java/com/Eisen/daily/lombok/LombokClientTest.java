package com.Eisen.daily.lombok;

import com.Eisen.daily.testCoding.lombok.LombokClient;
import org.junit.jupiter.api.Test;


class LombokClientTest {
    LombokClient client = new LombokClient();

    @Test
    void toString테스트하기(){
        client.toStringTest();
    }
}