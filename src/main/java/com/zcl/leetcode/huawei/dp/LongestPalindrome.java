package com.zcl.leetcode.huawei.dp;

/**
 * 最长回文子串：给你一个字符串 s，找到 s 中最长的回文子串
 *
 * @Author AlphaZcl
 * @Date 2024/7/30
 **/
public class LongestPalindrome {

    public String longestPalindrome3(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int length = s.length();
        int maxLen = 0;
        int maxStart = 0;
        int maxEnd = 0;
        boolean[][] cacheResult = new boolean[length][length];
        for (int end = 1; end < length; end++) {
            for (int start = 0; start < end; start++) {
                if (s.charAt(end) == s.charAt(start)) {
                    if (end - start < 3) {
                        cacheResult[start][end] = true;
                    } else {
                        cacheResult[start][end] = cacheResult[start + 1][end - 1];
                    }
                }
                if (cacheResult[start][end] && end - start > maxLen) {
                    maxLen = end - start;
                    maxStart = start;
                    maxEnd = end;
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }

}
