package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class $1207_Unique_Number_of_Occurrences {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        uniqueOccurrences(arr);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] *= -1;
            }
        }

        Arrays.sort(arr);
        ArrayList<Integer> cntList = new ArrayList<>();
        cntList.add(1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                cntList.add(1);
            }
            cntList.set(i, cntList.get(i)+1);
        }

        for (int i = 0; i < arr.length; i++) {
            for (Integer integer : cntList) {
                if(Objects.equals(cntList.get(i), integer)){
                    return false;
                }
            }
        }


        return true;
    }
}
