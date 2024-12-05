package com.zcl.leetcode.huawei.slidewindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class MostColorCarPassTest {

    @Test
    public void testGetMostColorCar1() {
        int[] carColors = {0,1,2,1};
        int n = 3;
        MostColorCarPass mostColorCarPass = new MostColorCarPass();
        int mostColorCar = mostColorCarPass.getMostColorCar(carColors, n);
        Assert.assertEquals(2, mostColorCar);
        System.out.println(mostColorCar);
    }

    @Test
    public void testGetMostColorCar2() {
        int[] carColors = {0,1,2,1};
        int n = 2;
        MostColorCarPass mostColorCarPass = new MostColorCarPass();
        int mostColorCar = mostColorCarPass.getMostColorCar(carColors, n);
        Assert.assertEquals(1, mostColorCar);
        System.out.println(mostColorCar);
    }
}
