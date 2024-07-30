package com.zcl.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/12
 **/
public class InsertSort {

    public void inSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int insertVal = arr[i];
            for(int j = i-1;j>=0&&insertVal < arr[j];j--){
                arr[j+1] = arr[j];
                arr[j] = insertVal;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        InsertSort is = new InsertSort();
        is.inSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
