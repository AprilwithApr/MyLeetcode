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
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode deleteDuplicates = deleteDuplicates(node);

        ListNode ln = new ListNode(0,deleteDuplicates);
        while (ln.next != null){
            System.out.println(ln.next.val);
            ln = ln.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode p = new ListNode();
        ListNode k = p;

        ListNode l = new ListNode(0,head);
        HashSet<Integer> set = new HashSet<>();
        while (l.next != null){
            if (!set.contains(l.next.val)){
                p.next = l.next;
                p = p.next;
                set.add(l.next.val);
            }
            l = l.next;
        }
        return k.next;
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

