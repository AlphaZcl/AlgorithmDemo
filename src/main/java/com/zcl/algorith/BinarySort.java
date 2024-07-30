package com.zcl.algorith;

/**
 * 二分法查找，非递归方式
 *
 * @Author AlphaZcl
 * @Date 2021/7/27
 **/
public class BinarySort {

    public int binarySort(int[] arr,int val){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(left<right){
            mid = ((right-left)>>1)+left;
            if(arr[mid]>val){
                right = mid+1;
            }else if(arr[mid]<val){
                left = mid -1 ;
            }else{
                break;
            }
        }
        return  mid ;
    }
}
