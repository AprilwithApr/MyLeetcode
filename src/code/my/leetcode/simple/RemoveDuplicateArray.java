package code.my.leetcode.simple;

/**
 * @author :qiuyongfeng
 * @description :
 * @date :2021-02-19
 * <p>
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class RemoveDuplicateArray {

    public static void main(String[] args) {
        int[] ints = {1,1,1,1,2,2,2,3,4,4,4,6,6,6,6};
        System.out.println(removeDuplicateArray(ints));
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("%d\t", ints[i]);
        }
    }

    //my answer
    static int removeDuplicateArray(int[] nums) {
        //指针，记录当前不重复的位置
        int p1 = 0;
        //遍历数组，与当前p1指示的值相等则不做任何变化，不相等时将值赋给p1后一位，p1后移一位  ++p1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[p1])
                nums[++p1] = nums[i];
        }
        return p1 + 1;
    }
}
