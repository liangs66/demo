package com.liangs.likou.linkedlist;

import com.liangs.likou.ListNode;

/**
 * 回文链表
 * 给定一个链表的 头节点 head ，请判断其是否为回文链表。
 *
 * 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
 */
public class PalindromeList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next(2).next(2).next(1);
        boolean palindrome = new PalindromeList().isPalindrome(listNode);
        System.out.println(palindrome);
    }
    public boolean isPalindrome(ListNode head) {
        ListNode midNodeLess = midNodeLess(head);
        ListNode reserveList = reserveList(midNodeLess.next);
        boolean result = true;
        while(reserveList!=null && head!=null){
            if(reserveList.val != head.val) return false;
            reserveList = reserveList.next;
            head = head.next;
        }
        return result;
    }

    public ListNode reserveList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode result = reserveList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
    public ListNode midNodeLess(ListNode head) {
        if(head == null) return null;
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2.next!=null && n2.next.next!=null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        return n1;
    }
    public ListNode midNodeMORE(ListNode head) {
        if(head == null) return null;
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2!=null && n2.next!=null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        return n1;
    }
}
