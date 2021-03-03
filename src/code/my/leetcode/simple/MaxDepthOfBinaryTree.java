package code.my.leetcode.simple;

import code.my.leetcode.util.TreeNode;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-02
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 **/
public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    public static int depth(TreeNode node, int ct) {
        if (node != null) {
            ct++;
            ct = Math.max(depth(node.left, ct), depth(node.right, ct));
        }
        return ct;
    }

}
