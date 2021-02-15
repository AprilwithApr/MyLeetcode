package code.my.leetcode;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode result = addTwoNumbers(l1, l2);
        ListNode pointer = result;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //动态节点，长度递增
        ListNode move = new ListNode();
        //静态节点，记录单链表头节点位置
        ListNode staticNode = move;
        //进位
        int i = 0;
        while (l1 != null || l2 != null || i != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            move.next = new ListNode((sum + i) % 10);
            System.out.println(staticNode == move);
            move = move.next;
            i = (sum + i) > 9 ? 1 : 0;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return staticNode.next;
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
