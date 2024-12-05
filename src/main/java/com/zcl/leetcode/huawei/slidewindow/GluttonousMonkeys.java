package com.zcl.leetcode.huawei.slidewindow;

/**
 * 贪吃的猴子：采摘香蕉，每次只能从行的开头或末尾采摘一串香蕉，并且总共只能采摘N次
 *
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class GluttonousMonkeys {

    public int getMostBanana(int[] bananas, int n) {
        if (bananas == null || bananas.length == 0) {
            return 0;
        }
        int length = bananas.length;
        n = n > length ? length : n;
        int minWinSum = 0; // 连续取值的滑动窗口最小值
        int winSum = 0; // 窗口总和
        int winLen = length - n;
        for (int i = 0; i < winLen; i++) {
            winSum += bananas[i];
        }
        minWinSum = winSum; // 初始化最小窗口值为第一个窗口
        for (int right = winLen; right < length; right++) {
            winSum += bananas[right];
            winSum -= bananas[right - winLen];
            minWinSum = Math.min(winSum, minWinSum);
        }
        // 获取最大值
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += bananas[i];
        }
        return sum - minWinSum;
    }
}
