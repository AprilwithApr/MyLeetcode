package code.my.leetcode.simple;

import code.my.leetcode.util.TreeNode;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-15
 * <p>
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 **/
public class BanlancedBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7, new TreeNode(13))));
        System.out.println(isBalanced(treeNode));
        System.out.println(heigh(treeNode));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(maxDepthOfTree(root.left, 0) - maxDepthOfTree(root.right, 0)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    static int maxDepthOfTree(TreeNode treeNode, int ct) {
        if (treeNode != null) {
            ct++;
            ct = Math.max(maxDepthOfTree(treeNode.left, ct), maxDepthOfTree(treeNode.right, ct));
        }
        return ct;
    }

    static int heigh(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            return Math.max(heigh(treeNode.left), heigh(treeNode.right)) + 1;
        }
    }
}
