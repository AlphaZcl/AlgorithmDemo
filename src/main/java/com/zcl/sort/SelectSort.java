package com.zcl.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 选择排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/12
 **/
public class SelectSort {

    public void selSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int min = arr[i];
            /*最小值的下标*/
            int minIdx = i;
            for(int j = i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIdx = j;
                }
            }
            if(minIdx != i){
                arr[minIdx] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        SelectSort ss = new SelectSort();
        ss.selSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
