package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-19
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 **/
public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode listNode = mergeTwoLists(l1, l2);

        ListNode sentryNode = new ListNode(0, listNode);
        while (sentryNode.next != null) {
            sentryNode = sentryNode.next;
            System.out.println(sentryNode.val);
        }
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode move = new ListNode();
        ListNode res = move;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                move.next = l2;
                break;
            }
            if (l2 == null) {
                move.next = l1;
                break;
            }
            if (l1.val < l2.val) {
                move.next = l1;
                move = move.next;
                l1 = l1.next;
            } else {
                move.next = l2;
                move = move.next;
                l2 = l2.next;
            }
        }
        return res.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
