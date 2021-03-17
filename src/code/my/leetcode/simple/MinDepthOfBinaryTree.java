package code.my.leetcode.simple;

import code.my.leetcode.util.TreeNode;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-17
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 **/
public class MinDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.createTreeUseLevelArray(new Integer[]{1,2,3,4,5});
        System.out.println(minDepth(treeNode));
    }

    public static int minDepth(TreeNode root) {
        return minDepthRecursive(root, 0);
    }

    public static int minDepthRecursive(TreeNode root, int dep) {
        if (root != null) {
            dep++;
            if (root.left == null) {
                dep = minDepthRecursive(root.right, dep);
            } else if (root.right == null) {
                dep = minDepthRecursive(root.left, dep);
            } else {
                dep = Math.min(minDepthRecursive(root.left, dep), minDepthRecursive(root.right, dep));
            }
        }
        return dep;
    }
}
