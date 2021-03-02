package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-02
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 **/
public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(2, new TreeNode(3),new TreeNode(4,new TreeNode(2),new TreeNode())));
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {




        return 4;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
