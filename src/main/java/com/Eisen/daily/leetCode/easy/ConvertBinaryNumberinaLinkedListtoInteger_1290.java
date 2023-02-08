package com.Eisen.daily.leetCode.easy;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : ConvertBinaryNumberinaLinkedListtoInteger_1290
 * author :  eisen
 * date : 2023/02/06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/06                eisen             최초 생성
 */
public class ConvertBinaryNumberinaLinkedListtoInteger_1290 {

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
