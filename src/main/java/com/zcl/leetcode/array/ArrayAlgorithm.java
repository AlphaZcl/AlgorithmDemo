package com.zcl.leetcode.array;

/**
 * @Author AlphaZcl
 * @Date 2023/5/22
 **/
public class ArrayAlgorithm {

    /**
     * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * <p>
     * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间
     *
     * 全异或运算
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int numXOR = 0;
        for (int i = 0; i < nums.length; i++) {
            numXOR ^= nums[i];
        }
        return numXOR;
    }

    /**
     * 你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素
     * 你必须设计并实现线性时间复杂度的算法且不使用额外空间来解决此问题
     *
     * 统计所有数所有位的值，判断每一个位的统计值是否能被3整除，是则说明目标数在该位为0，否则为1，统计完后还原位为十进制数
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum = (nums[j] >> i) & 1;
            }
            if (sum %3 != 0) {
                result |= 1<<i;
            }
        }
        return result;
    }

    /**
     * 给你一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
     * 你可以按 任意顺序 返回答案
     * 你必须设计并实现线性时间复杂度的算法且仅使用常量额外空间来解决此问题
     * @param nums
     * @return
     */
    public int[] singleNumber3(int[]  nums) {
        int sumXOR = 0;
        for (int i = 0; i < nums.length; i++) {
            sumXOR ^= nums[i];
        }
        int mask = sumXOR & (-sumXOR);
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i <nums.length; i++) {
            if ((mask & nums[i]) == 0) {
                num1 ^= nums[i];
            } else {
                num2 ^= nums[i];
            }
        }
        return new int[]{num1, num2};
    }
}
