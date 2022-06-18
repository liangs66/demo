package com.liangs.likou;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public ListNode next(int val){
        this.next = new ListNode(val);
        return this.next;
    }
}