package code.my.leetcode.simple;


import java.util.HashSet;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-01
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 **/
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3)))));
//        ListNode deleteDuplicates = deleteDuplicates(node);
        ListNode deleteDuplicates = deleteDuplicates2(node);

        while (deleteDuplicates != null) {
            System.out.println(deleteDuplicates.val);
            deleteDuplicates = deleteDuplicates.next;
        }
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode p = new ListNode();
        ListNode k = p;

        HashSet<Integer> set = new HashSet<>();
        while (head != null) {
            if (!set.contains(head.val)) {
                set.add(head.val);
                p.next = head;
                p = p.next;
            }
            head = head.next;
        }

        ListNode res = k.next;

        while (k.next != null) {
            if (set.isEmpty()) {
                k.next = null;
                break;
            }
            if (set.contains(k.next.val)) {
                set.remove(k.next.val);
            }
            k = k.next;
        }
        return res;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

