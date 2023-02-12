package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : ConvertBinaryNumberinaLinkedListtoInteger_1290Test
 * author :  eisen
 * date : 2023/02/06
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/06                eisen             최초 생성
 */
class ConvertBinaryNumberinaLinkedListtoInteger_1290Test {
    ConvertBinaryNumberinaLinkedListtoInteger_1290 test = new ConvertBinaryNumberinaLinkedListtoInteger_1290();
    @Test
    void test(){
//        1,0,0,1,0,0,1,1,1,0,0,0,0,0,0
        ListNode node14 = new ListNode(0);
        ListNode node13 = new ListNode(0, node14);
        ListNode node12 = new ListNode(0, node13);
        ListNode node11 = new ListNode(0, node12);
        ListNode node10 = new ListNode(0, node11);
        ListNode node9 = new ListNode(0, node10);
        ListNode node8 = new ListNode(1, node9);
        ListNode node7 = new ListNode(1, node8);
        ListNode node6 = new ListNode(1, node7);
        ListNode node5 = new ListNode(0, node6);
        ListNode node4 = new ListNode(0, node5);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(0, node2);
        ListNode node = new ListNode(1, node1);
        test.getDecimalValue(node);
    }
}