package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : BufferedReaderTEst
 * author :  eisen
 * date : 2022/08/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/21                eisen             최초 생성
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()){
            br.readLine();
        }
    }
}
