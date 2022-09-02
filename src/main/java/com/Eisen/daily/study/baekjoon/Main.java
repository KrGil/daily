package com.Eisen.daily.study.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : BojTemplate
 * author :  eisen
 * date : 2022/08/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/21                eisen             최초 생성
 */

public class Main {
    void main() throws IOException {
        //input
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        //logic
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int answer = first + second;

        //output
        println(answer);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        new Main().main();
        bw.flush();
        bw.close();
        br.close();
    }

    void println(int n) throws IOException {
        println(String.valueOf(n));
    }

    void println(String str) throws IOException {
        bw.write(str + "\n");
    }

}