package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SomeRelations_20921 {
    // 5 7
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        // 5 7
        int smallestNum = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("N = " + N);
            System.out.println("K = " + K);
            System.out.println("smallestNum = " + smallestNum);

            if((N - 1) <= K){
                arr[i] = N;
                K -= (N - 1);
                int heads = N;
                smallestNum = Arrays.stream(arr).anyMatch(e -> e == heads) ? smallestNum++ : smallestNum;

            }else{
                arr[i] = smallestNum;
                smallestNum++;
            }
            N--;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
