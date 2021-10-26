package datastructures.linkedlist.megre_linkedlists;

import java.util.StringJoiner;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
class MergeSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        LinkedList2 res = new LinkedList2();

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    res.add(l1);
                    l1 = l1.next;
                } else {
                    res.add(l2);
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                res.add(l1);
                l1 = l1.next;
            } else { // l2 != null
                res.add(l2);
                l2 = l2.next;
            }
        }

        return res.getHead();
    }

    public static void main(String[] args) {
        ListNode l12 = new ListNode(5);
        ListNode l11 = new ListNode(2, l12);
        ListNode.printList(l11);

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);
        ListNode.printList(l21);

        ListNode res = MergeSortedList.mergeTwoLists(l11, l21);
        ListNode.printList(res);
    }
}

class LinkedList2 {
    ListNode head;
    ListNode tail;

    public ListNode getHead() {
        return head;
    }

    public void add(ListNode node) {
        if (node != null) {
            if (head == null) {
                head = new ListNode(node.val);
                tail = head;
            } else {
                tail.next = new ListNode(node.val);
                tail = tail.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList2 ls2 = new LinkedList2();
        ls2.add(new ListNode(1));
        ls2.add(new ListNode(2));
        ls2.add(new ListNode(3));
        ListNode.printList(ls2.getHead());
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static void printList(ListNode node) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        while (node != null) {
            joiner.add(String.valueOf(node.val));
            node = node.next;
        }
        System.out.println(joiner);
    }
}