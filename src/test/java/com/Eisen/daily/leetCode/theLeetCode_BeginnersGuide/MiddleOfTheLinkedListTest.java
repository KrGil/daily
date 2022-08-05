package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {
    @Test
    void testLode(){
        MiddleOfTheLinkedList test = new MiddleOfTheLinkedList();
        MiddleOfTheLinkedList.ListNode listNode = new MiddleOfTheLinkedList.ListNode(1,
            new MiddleOfTheLinkedList.ListNode(2,
                new MiddleOfTheLinkedList.ListNode(3,
                    new MiddleOfTheLinkedList.ListNode(4,
                        new MiddleOfTheLinkedList.ListNode(5,
                            new MiddleOfTheLinkedList.ListNode(6))))
                )
        );
        // 4,5,6
        test.middleNode(listNode);
        System.out.println("listNode1 = " + listNode.val);
        System.out.println("listNode1 = " + listNode.next.val);
        System.out.println("listNode1 = " + listNode.next.next.val);
        System.out.println("listNode1 = " + listNode.next.next.next.val);
        System.out.println("listNode1 = " + listNode.next.next.next.next.val);

    }
}
