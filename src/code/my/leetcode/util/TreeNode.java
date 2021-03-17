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
     * 按照层序数组重建二叉树
     *
     * @param arr
     * @return
     */
    public static TreeNode createTreeUseLevelArray(Integer[] arr) {
        //如果当前时间戳是奇数就用递归
        if (System.currentTimeMillis() % 2 != 3) {
            System.out.println("call a recursive method");
            return createTreeUseLevelArrayRecursive(arr, 0);
        }
        //偶数用循环
        if (arr.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        TreeNode header = root;
        int i = 0;
        while (2 * i < arr.length) {
            if (2 * i + 1 < arr.length) root.left = new TreeNode(arr[2 * i + 1]);
            if (2 * i + 2 < arr.length) root.right = new TreeNode(arr[2 * i + 2]);
            root = root.left;
            i++;
        }
        return header;
    }

    private static TreeNode createTreeUseLevelArrayRecursive(Integer[] arr, int index) {
        if (index >= arr.length) {
            return null;
        }
        TreeNode treeNode = new TreeNode(arr[index]);
        treeNode.left = createTreeUseLevelArrayRecursive(arr, index * 2 + 1);
        treeNode.right = createTreeUseLevelArrayRecursive(arr, index * 2 + 2);
        return treeNode;
    }

    public static void main(String[] args) {

        TreeNode levelArray = createTreeUseLevelArray(new Integer[]{2, null, 3, null, 4, null, 5, null, 6});
        System.out.println("pre ->");
        prefixOrderTraversal(levelArray);

        System.out.println("in ->");
        infixOrderTraversal(levelArray);

        System.out.println("suf -> ");
        suffixOrderTraversal(levelArray);

        System.out.println("level ->");
        levelTraversal(levelArray);
    }
}
