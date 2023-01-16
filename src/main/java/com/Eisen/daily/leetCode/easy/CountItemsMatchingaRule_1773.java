package com.Eisen.daily.leetCode.easy;

import java.util.List;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : CountItemsMatchingaRule_1773
 * author :  eisen
 * date : 2023/01/06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/06                eisen             최초 생성
 */
public class CountItemsMatchingaRule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0: ruleKey.equals("color") ? 1 : ruleKey.equals("name") ? 2 : -1;
        int cnt = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) cnt++;
        }
        return cnt;
    }
}
