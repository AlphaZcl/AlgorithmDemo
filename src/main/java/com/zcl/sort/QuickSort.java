package com.zcl.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 快速排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/15
 **/
public class QuickSort {

    public void quickSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        sort(arr,0,arr.length-1);
    }

    public void sort(int[] arr,int left,int right){
        /*left:每个子数组的左边界，right:每个子数组的右边界*/
        if(left >= right){
            return;
        }
        /*当前基准值,以*/
        int baseVal = arr[left];
        /*左右指针*/
        int i = left,j  = right;
        /*分组拆分*/
        while(i < j){
            while(i<j&&arr[j]>=baseVal){
                j--;
            }
            if (i<j){
                /*防止与基准值相同导致指针无移动进入死循环*/
                arr[i] = arr[j];
            }
            while (i<j&&arr[i]<=baseVal){
                i++;
            }
            if(i<j){
                arr[j] = arr[i];
            }
        }
        arr[i] = baseVal;
        /*左子树递归*/
        sort(arr,left,i-1);
        /*右子树递归*/
        sort(arr,i+1,right);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];
        for(int i=0;i<arr.length;i++){
            int num = random.nextInt(100);
            arr[i] = num%3 ==0 ? num : (num * -1);
        }
        System.out.println(Arrays.toString(arr));
        QuickSort sq = new QuickSort();
        sq.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
