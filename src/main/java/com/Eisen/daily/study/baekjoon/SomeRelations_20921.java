package com.Eisen.daily.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SomeRelations_20921 {
    // 5 7
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 5 7
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.println("list.toString() = " + list.toString());
        int place = 0;
        // 1 2 3 4 5
        while(K > 0){
            int last = list.remove(N-1); // 5
            int move = Math.min(K, N - 1 - place); // 7, 5 - 1 - 0 // 4
            int newIndex = N - move - 1; // 5 - 4 - 1;
            place = newIndex + 1; // 1+1
            list.add(newIndex, last);
            K -= move;
        }
        System.out.println("list.toString() = " + list.toString());

    }
}
