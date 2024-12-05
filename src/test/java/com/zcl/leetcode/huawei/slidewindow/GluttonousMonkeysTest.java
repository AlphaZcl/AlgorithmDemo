package com.zcl.leetcode.huawei.slidewindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class GluttonousMonkeysTest {

    @Test
    public void testGetMostBananas1() {
        int[] bananas = new int[]{1,2,2,7,3,6,1};
        int n = 3;
        GluttonousMonkeys gluttonousMonkeys = new GluttonousMonkeys();
        int mostBanana = gluttonousMonkeys.getMostBanana(bananas, n);
        Assert.assertEquals(10, mostBanana);
        System.out.println(mostBanana);
    }

    @Test
    public void testGetMostBananas2() {
        int[] bananas = new int[]{1,2,3};
        int n = 3;
        GluttonousMonkeys gluttonousMonkeys = new GluttonousMonkeys();
        int mostBanana = gluttonousMonkeys.getMostBanana(bananas, n);
        Assert.assertEquals(6, mostBanana);
        System.out.println(mostBanana);
    }

    @Test
    public void testGetMostBananas3() {
        int[] bananas = new int[]{4,2,2,3};
        int n = 2;
        GluttonousMonkeys gluttonousMonkeys = new GluttonousMonkeys();
        int mostBanana = gluttonousMonkeys.getMostBanana(bananas, n);
        Assert.assertEquals(7, mostBanana);
        System.out.println(mostBanana);
    }
}
