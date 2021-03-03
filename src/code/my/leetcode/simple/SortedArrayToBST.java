package code.my.leetcode.simple;

import code.my.leetcode.util.TreeNode;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-03
 *
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] ints = {-10, -3, 0, 5, 9};
        TreeNode node = sortedArrayToBST(ints);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        return null;
    }

    static void showTree(TreeNode node){
        if (node!=null){
            showTree(node.left);
            System.out.println(node.val);
            showTree(node.right);
        }
    }
}
