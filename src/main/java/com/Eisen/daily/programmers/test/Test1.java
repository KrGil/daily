package com.Eisen.daily.programmers.test;

/**
 * packageName :  com.Eisen.daily.programmers.test
 * fileName : test1
 * author :  eisen
 * date : 2023/02/11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/11                eisen             최초 생성
 */
public class Test1 {
    public int[] solution(int[][] queries) {

        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int turn = 0;
            while(isPalindrome(query)){

            }
            // check
            if (turn % 2 == 0) {
                answer[i] = 1;
            }else{
                answer[i] = 0;
            }

        }

        return answer;
    }
    public boolean isPalindrome(int[] query){
        int length = query.length;
        int[] pre = new int[length / 2];
        int[] post = new int[length / 2];

        for (int i = 0; i < length / 2; i++) {
            pre[i] = query[i];
            post[i] = query[length -1 - i];
        }

        for (int i = 0; i < post.length; i++) {
           if(pre[i] != post[i]) return false;
        }
        return true;
    }
}
