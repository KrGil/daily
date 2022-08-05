package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

public class MiddleOfTheLinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        int mid = 0;
        // figure length
        while(temp != null){
            temp = temp.next;
            length++;
        }
        mid = length / 2;
        temp = head;
        System.out.println("temp.val = " + temp.val);
        // return
        while(mid != 0){
            temp = temp.next;
            mid--;
        }
        System.out.println("temp = " + temp.val);
        return temp;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
