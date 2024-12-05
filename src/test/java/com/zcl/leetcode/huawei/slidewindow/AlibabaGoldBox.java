package com.zcl.leetcode.huawei.slidewindow;

/**
 * 有0-N编号的箱子，每个箱子上贴着一个数字，阿里巴巴喊出一个数字k，找出连续k个宝箱数字和最大值
 *
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class AlibabaGoldBox {

    public int getBiggestGold(int[] goldBox, int k) {
        if (goldBox == null || goldBox.length == 0) {
            return 0;
        }
        int length = goldBox.length;
        k = k > length ? length : k;
        int max = 0;
        int winSum = 0;
        for (int i = 0; i < k; i++) {
            winSum += goldBox[i];
        }
        max = winSum;
        for (int right = k; right < length; right++) {
            winSum += goldBox[right];
            winSum -= goldBox[right-k];
            max = Math.max(winSum, max);
        }
        return max;
    }
}
