package com.Eisen.daily.programmers.kakao;

import java.util.*;

/**
 * packageName :  com.Eisen.daily.programmers.kakao
 * fileName : Num_1
 * author :  eisen
 * date : 2022/09/24
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/09/24                eisen             최초 생성
 */
public class Num_1 {
    // 모든달은 28일까지.
    public static void main(String[] args) {
        String today = "2020.01.01";
//        String today = "2022.05.19";
        String[] terms = {"D 5", "Z 3"};
//        String[] terms = {"A 24", "B 12", "C 3"};
        String[] privacies = {
            "2019.01.01 D",
            "2019.11.15 Z",
            "2019.08.02 D",
            "2019.07.01 D",
            "2018.12.28 Z"
        };
//        String[] privacies = {
//            "2021.05.02 A",
//            "2021.07.01 B",
//            "2022.02.19 C",
//            "2022.02.20 C"
//        };
        solution(today, terms, privacies);
    }
    private final static int maxMonth = 12;
    private final static int maxDay = 28;
    private final static int min = 01;
    public static int[] solution(String today, String[] terms, String[] privacies) {

        System.out.println("privacies = " + privacies.toString());
        int[] answer = new int[privacies.length];

        Map<String, Integer> newTerms = new HashMap<>();
        Map<String, String> newPrivacies = new LinkedHashMap<>();
        for (int i = 0; i < terms.length; i++) {
            StringTokenizer st = new StringTokenizer(terms[i]);
            newTerms.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
//
        for (int i = 0; i < privacies.length; i++) {
            String[] temp = privacies[i].split(" ");
            newPrivacies.put(temp[0], temp[1]);
        }
//        "2021.05.02 A",
//            "2021.07.01 B",
//            "2022.02.19 C",
//            "2022.02.20 C"
        StringBuffer sb = new StringBuffer();
        int index = -1;
        for (String key : newPrivacies.keySet()) {
            index++;
            System.out.println();
            String term = "";
            System.out.println("key = " + key);
            term = newPrivacies.get(key);
            System.out.println("term = " + newTerms.get(term));

            String[] tempDates = key.split("\\.");
            List<Integer> dates = new ArrayList<>();
            for (String date : tempDates) {
                dates.add(Integer.parseInt(date));
            }

            // 달에 12 더하기
            // 1. 달이 12보다 넘으면 연도에 +1
            int expireMon = newTerms.get(term);
            // 12달보다 많은 달이 존재
            //
            dates.set(1, dates.get(1) + newTerms.get(term));
            int addYear = dates.get(1) / 12;
            System.out.println("addYear " + addYear);
            if (dates.get(1) > maxMonth) {
                dates.set(0, dates.get(0) + addYear);
                dates.set(1, dates.get(1) - newTerms.get(term) -1);
            }
            // 2. 일자가 1보다 낮으면 달에 -1하고 일 28로 변경
            dates.set(2, dates.get(2) - 1);
            if (dates.get(2) < min) {
                dates.set(1, dates.get(1) - 1);
                dates.set(2, maxDay);
                // 3. 달에 -1 했을 시 1보다 작으면 년도 -1
                if (dates.get(1) < min) {
                    dates.set(0, dates.get(0) - 1);
                }
            }
            System.out.println("dates = " + dates);

            ArrayList<Integer> newToday = new ArrayList<>();
            String[] tempToday = today.split("\\.");
            for (String date : tempToday) {
                newToday.add(Integer.parseInt(date));
            }
            System.out.println("newToday = " + newToday);
            System.out.println(newToday.get(0)+"  "+dates.get(0));
            System.out.println(newToday.get(0)-dates.get(0));
            System.out.println(newToday.get(1)+"  "+dates.get(1));
            System.out.println(newToday.get(2)+"  "+dates.get(2));

            if ((newToday.get(0) - dates.get(0)) > 0) {
                System.out.println("in1 added");
                answer[index] = index + 1;
                continue;
            }else if (newToday.get(0) - dates.get(0) == 0){
                System.out.println("in2");
                if (newToday.get(1) - dates.get(1) > 0) {
                    System.out.println("inC1 added");
                    answer[index] = index + 1;
                    continue;
                }else if (newToday.get(1) == dates.get(1)){
                    System.out.println("inC2");
                    if (newToday.get(2) - dates.get(2) > 0) {
                        System.out.println("inC2 added");
                        answer[index] = index + 1;
                        continue;
                    }
                }
            }


        }
        System.out.println(Arrays.toString(answer));

        return Arrays.stream(answer).filter(e -> e != 0).toArray();
    }
}
