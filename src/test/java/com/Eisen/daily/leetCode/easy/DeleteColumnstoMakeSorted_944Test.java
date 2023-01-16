package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : DeleteColumnstoMakeSorted_944Test
 * author :  eisen
 * date : 2023/01/03
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/03                eisen             최초 생성
 */
class DeleteColumnstoMakeSorted_944Test {
    DeleteColumnstoMakeSorted_944 test = new DeleteColumnstoMakeSorted_944();
    @Test
    void test(){
        //ab
        //bc
        //ca
        String[] strs = {"cba","daf","ghi"};
        test.minDeletionSize(strs);
    }
}