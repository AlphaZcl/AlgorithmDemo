package com.zcl.leetcode.huawei.slidewindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class StringSummaryTest {

    @Test
    public void testGetStrSummary1() {
        String input = "aabbcc";
        StringSummary stringSummary = new StringSummary();
        String strSummary = stringSummary.getStrSummary(input);
        Assert.assertEquals("a2b2c2", strSummary);
        System.out.println(strSummary);
    }

    @Test
    public void testGetStrSummary2() {
        String input = "bAaAcBb";
        StringSummary stringSummary = new StringSummary();
        String strSummary = stringSummary.getStrSummary(input);
        Assert.assertEquals("a3b2b2c0", strSummary);
        System.out.println(strSummary);
    }

    @Test
    public void testGetStrSummary3() {
        String input = "bAaAcBbaa";
        StringSummary stringSummary = new StringSummary();
        String strSummary = stringSummary.getStrSummary(input);
        Assert.assertEquals("a3a2b2b2c0", strSummary);
        System.out.println(strSummary);
    }

    @Test
    public void testGetStrSummary4() {
        String input = "abAaAcBbaa";
        StringSummary stringSummary = new StringSummary();
        String strSummary = stringSummary.getStrSummary(input);
        Assert.assertEquals("a5a3a2b2b2c0", strSummary);
        System.out.println(strSummary);
    }
}
