package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : DeleteColumnstoMakeSorted_944
 * author :  eisen
 * date : 2023/01/03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/03                eisen             최초 생성
 */
public class DeleteColumnstoMakeSorted_944 {
    public int minDeletionSize(String[] strs) {
        //"cba"
        //"daf"
        //"ghi"
        List<Character> temp = new ArrayList<>(); 
        int cnt = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            temp.clear();
            for (int j = 0; j < strs.length; j++) {
                if(temp.size() > 0) {
                    System.out.println("preChar: " + temp.get(temp.size() - 1));
                    System.out.println(temp.get(temp.size() - 1)-0);
                    System.out.println("preChar: " + strs[j].charAt(i));
                    System.out.println(strs[j].charAt(i)-0);
                    if(temp.get(temp.size() - 1)-0 > strs[j].charAt(i)-0){
                        System.out.println("더 큼");
                        cnt++;
                        break;
                    }
                    System.out.println("cnt = " + cnt);
                }
                temp.add(strs[j].charAt(i));
                
            }
            System.out.println();
        }


        return 0;

    }
}
