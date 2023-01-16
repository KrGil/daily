package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : CountItemsMatchingaRule_1773Test
 * author :  eisen
 * date : 2023/01/06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/06                eisen             최초 생성
 */
class CountItemsMatchingaRule_1773Test {
    //    Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
    //    ruleKey = "color", ruleValue = "silver"
//        Output: 1
    CountItemsMatchingaRule_1773 test = new CountItemsMatchingaRule_1773();
    @Test
    void test(){
        List<List<String>> items = List.of( List.of("phone","blue","pixel"), List.of("computer","silver","lenovo"), List.of("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        List<List<String>> items2 =  List.of(List.of("phone","blue","pixel"),List.of("computer","silver","phone"),List.of("phone","gold","iphone"));
        String ruleKey2 = "type";
        String ruleValue2 = "phone";
        assertEquals(1, test.countMatches(items, ruleKey, ruleValue));
        assertEquals(2, test.countMatches(items2, ruleKey2, ruleValue2));

    }
}