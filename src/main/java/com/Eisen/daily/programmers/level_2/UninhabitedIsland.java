package com.Eisen.daily.programmers.level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName :  com.Eisen.daily.programmers.level_2
 * fileName : UninhabitedIsland
 * author :  eisen
 * date : 2023/02/08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/08                eisen             최초 생성
 */
public class UninhabitedIsland {
    public int[] solution(String[] maps) {
        int mapsLength = maps.length;
        int mapLength = maps[0].length();

        int sumFood = 0;
        int curFood = 0;

        List<Integer> foodSumList = new ArrayList<>();
        for (int i = 0; i < mapsLength; i++) {
            for (int j = 0; j < mapLength; j++) {
                boolean isIsolated = true;
                if(maps[i].charAt(j) == 'X') {
                    continue;
                }
                curFood = maps[i].charAt(j)-'0';

                if(j != 0 && maps[i].charAt(j - 1) != 'X'){
                    System.out.println("left: " + maps[i].charAt(j - 1));
                    isIsolated = false;
                }else if(i != 0 && maps[i-1].charAt(j) != 'X') {
                    System.out.println("up: " + maps[i-1].charAt(j));
                    isIsolated = false;
                }else if(j != mapLength - 1 && maps[i].charAt(j + 1) != 'X'){
                    System.out.println("right: "+ maps[i].charAt(j + 1));
                    isIsolated = false;
                }else if(i != mapsLength - 1 && maps[i+1].charAt(j) != 'X') {
                    System.out.println("down: " +  maps[i+1].charAt(j));
                    isIsolated = false;
                }
                System.out.println("isIsolated = " + isIsolated);
                if(isIsolated){
                    foodSumList.add(sumFood);
                    sumFood = curFood;
                }else{
                    sumFood += curFood;
                }
                if(i == mapsLength - 1 && j == mapLength - 1){
                    foodSumList.add(sumFood);
                }
            }
        }
        if(foodSumList.size() == 0){
            return new int[]{-1};
        }
        Collections.sort(foodSumList);
        System.out.println("foodSumList = " + foodSumList);
        return foodSumList.stream().mapToInt(Integer::intValue).toArray();
    }
}
