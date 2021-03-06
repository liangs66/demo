package com.liangs.likou.linkedlist;

import com.liangs.likou.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * 如下面的两个链表：
 *
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *
 */

public class FirstCommonNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return getIntersectionNode1(headA,headB,headA,headB);
    }
    public ListNode getIntersectionNode1(ListNode sheadA, ListNode sheadB,ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;
        if(headA.next == null && headB.next == null) return null;
        return getIntersectionNode1(sheadA,sheadB,headA.next==null?sheadB:headA.next, headB.next==null?sheadA:headB.next);
    }
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode ha = headA;
        ListNode hb = headB;
        while (ha!=hb){
            ha = ha == null? headB:ha.next;
            hb = hb == null? headA:hb.next;
        }
        return ha;
    }

}

