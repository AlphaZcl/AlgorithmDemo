package com.zcl.leetcode.huawei.slidewindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class AlibabaGoldBoxTest {

    @Test
    public void testGetBiggestGold1() {
        int[] goldBox = {2,10,-3,-8,40,5};
        int k = 4;
        AlibabaGoldBox alibabaGoldBox = new AlibabaGoldBox();
        int biggestGold = alibabaGoldBox.getBiggestGold(goldBox, k);
        Assert.assertEquals(39, biggestGold);
        System.out.println(biggestGold);
    }

    @Test
    public void testGetBiggestGold2() {
        int[] goldBox = {8};
        int k = 1;
        AlibabaGoldBox alibabaGoldBox = new AlibabaGoldBox();
        int biggestGold = alibabaGoldBox.getBiggestGold(goldBox, k);
        Assert.assertEquals(8, biggestGold);
        System.out.println(biggestGold);
    }
}
