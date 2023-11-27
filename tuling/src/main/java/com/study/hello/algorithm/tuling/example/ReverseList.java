package com.study.hello.algorithm.tuling.example;

/**
 * @author : fangxiangqian
 * @created : 2023/11/9
 **/
public class ReverseList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode listNode1 = iterate(listNode);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }

    /**
     * 递归
     *
     * @param listNode
     * @return
     */
    public static ListNode recursion(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode listNode1 = recursion(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return listNode1;
    }

    /**
     * 迭代
     *
     * @param listNode
     * @return
     */
    private static ListNode iterate(ListNode listNode) {
        ListNode pre = null;
        ListNode cur = listNode;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
