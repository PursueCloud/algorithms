package com.yo.algorithm.practise.cig.common.util;

import com.yo.algorithm.practise.cig.common.entity.DoubleNode;
import com.yo.algorithm.practise.cig.common.entity.SingleNode;

public class LinkedListUtil {

    /**
     * 遍历单遍历
     * @param node
     */
    public static void printLinkedList(SingleNode node) {
        System.out.print("Single Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 遍历双链表
     * @param head
     */
    public static void printLinkedList(DoubleNode head) {
        System.out.print("Double Linked List: ");
        DoubleNode end = null;
        while (head != null) {
            System.out.print(head.value + " ");
            end = head;
            head = head.next;
        }
        System.out.print("| ");
        while (end != null) {
            System.out.print(end.value + " ");
            end = end.last;
        }
        System.out.println();
    }
}