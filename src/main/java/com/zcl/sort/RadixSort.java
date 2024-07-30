package com.zcl.sort;

import java.util.Arrays;

/**
 * 基数排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/20
 **/
public class RadixSort {

    public void radixSort(int[] arr){
        /*获取最大的数*/
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int maxLength = String.valueOf(max).length();
        /*计数数组，表示每个桶中放入的个数*/
        int[] bucketElmCount = new int[10];
        /*定义二维数组作为桶*/
        int[][] bucket = new int[10][arr.length];
        for(int i = 0,n=1;i<maxLength;i++,n*=10){
            /*n:位数基数*/
            for(int j = 0 ;j<arr.length;j++){
                /*判断当前元素对应位的数*/
                int dNum = arr[j]/n%10;
                /*放入到对应的桶中*/
                bucket[dNum][bucketElmCount[dNum]++] = arr[j];
            }
            /*取出桶中的数据，放入原数组*/
            int index = 0;
            for(int k = 0;k< bucket.length;k++){
                for(int l=0;l<bucketElmCount[k];l++){
                    arr[index++] = bucket[k][l];
                }
                /*重置当前桶中元素个数，为下一轮做准备*/
                bucketElmCount[k] = 0;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {53,3,542,748,14,214,154,63,616};
        RadixSort rs = new RadixSort();
        rs.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
