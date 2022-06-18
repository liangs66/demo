package com.liangs.likou.linkedlist;

import com.liangs.likou.ListNode;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        int size = size(head);
        int[] res = new int[size];
        int index = size-1;
        while (head != null){
            res[index--] = head.val;
            head = head.next;
        }
        return res;
    }

    private int size(ListNode head) {
        int size = 0;
        while (head !=null){
            size++;
            head = head.next;
        }
        return size;
    }
}
