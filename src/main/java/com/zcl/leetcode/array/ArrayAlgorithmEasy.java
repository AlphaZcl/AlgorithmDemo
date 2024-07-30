package com.zcl.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author AlphaZcl
 * @Date 2023/5/30
 **/
public class ArrayAlgorithmEasy {

    /**
     * 1979 : 最大公约数
     * 给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
     * <p>
     * 两个数的 最大公约数 是能够被两个数整除的最大正整数。
     *
     * @param nums
     * @return
     */
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return gcd(max, min);
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    /**
     * 1002 : 给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），
     * 并以数组形式返回。你可以按 任意顺序 返回答案
     *
     * @param words
     * @return
     */
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] startArr = getCs(words[0]);
        for (int i = 1; i < words.length; i++) {
            int[] currArr = getCs(words[i]);
            if (startArr[i] > currArr[i]) {
                startArr[i] = currArr[i];
            }
        }
        for (int i = 0; i < startArr.length; i++) {
            while (startArr[i] != 0) {
                list.add(String.valueOf(i + 'a'));
            }
        }
        return list;
    }

    private int[] getCs(String word) {
        int[] ints = new int[26];
        for (char ch : word.toCharArray()) {
            ints[ch - 'a']++;
        }
        return ints;
    }
}
