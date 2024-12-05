package com.zcl.leetcode.huawei.slidewindow;

/**
 * 找出通过车辆最多颜色
 * 有个路口每秒只能通过一辆车，假如车的颜色只有3种，找出N秒内经过的最多颜色的车辆数量，三种颜色编号为0,1,2
 *
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class MostColorCarPass {

    public int getMostColorCar(int[] passCarColors, int n) {
        if (passCarColors == null || passCarColors.length == 0) {
            return 0;
        }
        int length = passCarColors.length;
        n = n > length ? length : n;
        int[] colorsStatistics = new int[3]; // 颜色统计集合
        int max = 0;
        // 根据第一个窗口初始化最大值
        for (int i = 0; i < n; i++) {
            int colorCode = passCarColors[i];
            colorsStatistics[colorCode]++;
        }
        max = Math.max(Math.max(colorsStatistics[0], colorsStatistics[1]), colorsStatistics[2]);
        // 滑动窗口进行进一步判断找出最大颜色数量
        for (int right = n; right < length; right++) {
            int color1 = passCarColors[right];
            colorsStatistics[color1]++; // 新入窗口的颜色加1
            int color2 = passCarColors[right - n];
            colorsStatistics[color2]--; // 退出窗口的颜色减1
            max = Math.max(max, colorsStatistics[color1]);
        }
        return max;
    }
}
