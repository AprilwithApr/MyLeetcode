package code.my.leetcode.util;

import java.util.LinkedList;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-03-03
 **/
public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(Integer val, TreeNode left) {
        this.val = val;
        this.left = left;
    }

    /**
     * 前序遍历
     *
     * @param treeNode
     */
    public static void prefixOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.val);
            prefixOrderTraversal(treeNode.left);
            prefixOrderTraversal(treeNode.right);
        }
    }

    /**
     * 中序遍历
     *
     * @param treeNode
     */
    public static void infixOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            infixOrderTraversal(treeNode.left);
            System.out.println(treeNode.val);
            infixOrderTraversal(treeNode.right);
        }
    }

    /**
     * 后序遍历
     *
     * @param treeNode
     */
    public static void suffixOrderTraversal(TreeNode treeNode) {
        if (treeNode != null) {
            suffixOrderTraversal(treeNode.left);
            suffixOrderTraversal(treeNode.right);
            System.out.println(treeNode.val);
        }
    }

    /**
     * 层序遍历
     *
     * @param treeNode
     */
    public static void levelTraversal(TreeNode treeNode) {
        //队列
        LinkedList<TreeNode> list = new LinkedList<>();
        //传入的节点作为队头
        if (treeNode != null) list.offer(treeNode);
        while (list.size() > 0) {
            //取出头节点
            TreeNode poll = list.poll();
            System.out.println(poll.val);
            //将头节点的左右子节点依次插入队尾
            if (poll.left != null) list.offer(poll.left);
            if (poll.right != null) list.offer(poll.right);
        }
    }

    /**
     * 按照前序数组重建二叉树
     *
     * @param arr
     * @return
     */
    public static TreeNode createTreeUsePrefixOrderArray(int[] arr) {

        return null;
    }

    /**
     * 按照中序数组重建二叉树
     *
     * @param arr
     * @return
     */
    public static TreeNode createTreeUseInfixOrderArray(int[] arr) {

        return null;
    }

    /**
     * 按照后序数组重建二叉树
     *
     * @param arr
     * @return
     */
    public static TreeNode createTreeUseSuffixOrderArray(int[] arr) {

        return null;
    }

    /**
     * 按照层序数组重建二叉树
     *
     * @param arr
     * @return
     */
    public static TreeNode createTreeUseLevelArray(Integer[] arr) {

        int i = 0;
        //指针节点，移动
        TreeNode pointer = new TreeNode();
        //根节点，固定
        TreeNode root = pointer;

        while (2 * i < arr.length) {
            pointer.val = arr[i];
            if (2 * i + 1 < arr.length){
                pointer.left = new TreeNode(arr[2 * i + 1]);
            }
            if (2 * i + 2 < arr.length){
                pointer.right = new TreeNode(arr[2 * i + 2]);
            }
            pointer = pointer.left;
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode levelArray = createTreeUseLevelArray(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        levelTraversal(levelArray);
    }
}
