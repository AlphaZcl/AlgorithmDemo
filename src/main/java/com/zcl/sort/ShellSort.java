package com.zcl.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 希尔排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/14
 **/
public class ShellSort {

    public void shellSort(int[] arr){
        for(int gap = arr.length/2;gap>0;gap /=2){
            for (int i=gap;i<arr.length;i++){
                /*从步长gap开始往前进行直接插入排序，i为待插入元素的下标*/
                int insertVal = arr[i];
                for (int j = i-gap;j>=0&&insertVal < arr[j];j-=gap){
                    /*与i同一组数组的下标，表示同组中的前一个元素*/
                    arr[j+gap]= arr[j];
                    arr[j] = insertVal;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            int num = random.nextInt(100);
            arr[i] = num%3 ==0 ? num : (num * -1);
        }
        System.out.println(Arrays.toString(arr));
        ShellSort ss=new ShellSort();
        ss.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
