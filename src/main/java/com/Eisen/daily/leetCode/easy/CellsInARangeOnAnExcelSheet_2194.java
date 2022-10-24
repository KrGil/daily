package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet_2194 {
//    Input: s = "K1:L2"
//    Output: ["K1","K2","L1","L2"]
    public List<String> cellsInRange(String s) {
        String[] colRow = s.split(":");
        String[] colRow1 = colRow[0].split("");
        String[] colRow2 = colRow[1].split("");

        String col1 = colRow1[0];
        int row1 = Integer.parseInt(colRow1[1]);

        String col2 = colRow2[0];
        int row2 = Integer.parseInt(colRow2[1]);

        for (int i = col1.charAt(0); i <= col2.charAt(0); i++) {
            StringBuffer sb = new StringBuffer();
            System.out.println("i = " + (char)i);
            sb.append((char) i);
            for (int j = row1; j <= row2; j++) {
                StringBuffer sb2 = new StringBuffer(sb);
                sb2.append(j);
                System.out.println("sb = " + sb2);
            }
        }


        int max = Integer.parseInt(colRow[1].substring(1));
        char a = '1';
        System.out.println("1 = " + a);
        List<String> res = new ArrayList<>();

//        for (int i = 65; i <= 90; i++) {
//            System.out.println("i = " + (char)i);
//        }
//        for (int i = 1; i <= max; i++) {
//            StringBuffer sb = new StringBuffer();
//
//        }
        System.out.println(max);
        return null;
    }
}

