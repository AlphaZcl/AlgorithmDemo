package com.zcl;

import com.zcl.leetcode.huawei.slidewindow.GluttonousMonkeys;

import java.util.Scanner;

/**
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class MainApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] bananas = new int[length];
        for (int i = 0; i < length; i++) {
            bananas[i] = in.nextInt();
        }
        int n = in.nextInt();
        GluttonousMonkeys gluttonousMonkeys = new GluttonousMonkeys();
        System.out.println(gluttonousMonkeys.getMostBanana(bananas, n));
    }
}
