package com.zcl.leetcode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author AlphaZcl
 * @Date 2023/5/30
 **/
public class ArrayAlgorithmEasyTest {

    private ArrayAlgorithmEasy arrayAlgorithmEasy;

    @Before
    public void init() {
        arrayAlgorithmEasy = new ArrayAlgorithmEasy();
    }

    @Test
    public void testFindGCD() {
        int[] nums = {2,5,6,9,10};
        int gcd = arrayAlgorithmEasy.findGCD(nums);
        System.out.println(gcd);
    }

    @Test
    public void testCommonChars() {
        String[] words = {"bella","label","roller"};
        List<String> strings = arrayAlgorithmEasy.commonChars(words);
        System.out.println(strings);
    }
}
