package com.zcl.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 归并排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/19
 **/
public class MergeSort {

    public void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }

    private void sort(int[] arr,int left,int right,int[] tmp){
        if(left>=right){
            return;
        }
        int mid = (right-left)/2+left;
        /*左递归分解*/
        sort(arr,left,mid,tmp);
        /*右递归分解*/
        sort(arr,mid+1,right,tmp);
        /*合并左右分解子数组*/
        /*左子数组的初始指针位置*/
        int i = left;
        /*右子数组的初始指针位置*/
        int j = mid+1;
        /*空tmp数组的当前位置指针*/
        int t = left;
        while(i<=mid&&j<=right){
            tmp[t++] = arr[i]>arr[j]? arr[j++] : arr[i++];
        }
        /*将左子数组未填充完的元素继续填充完毕*/
        while(i<=mid){
            tmp[t++] = arr[i++];
        }
        /*将右子数组未填充完的元素继续填充完毕*/
        while(j<=right){
            tmp[t++] = arr[j++];
        }
        /*将本次排序的数组结果tmp复制到原数组*/
        for(int k = left;k<=right;k++){
            arr[k] = tmp[k];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        Random random = new Random();
        int[] arr = new int[9];
        for(int i=0;i<arr.length;i++){
            int num = random.nextInt(100);
            arr[i] = num%3 ==0 ? num : (num * -1);
        }
        System.out.println(Arrays.toString(arr));
        ms.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
