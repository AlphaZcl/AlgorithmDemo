package com.zcl.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 堆排序
 *
 * @Author AlphaZcl
 * @Date 2021/7/23
 **/
public class HeapSort {

    public void heapSort(int[] arr) {
        /*建立初始大顶堆,从最后一个非叶子节点开始整理arr.length/2-1*/
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        /*对大顶堆排序*/
        int tmp = 0;
        for(int i=arr.length-1;i>0;i--){
            /*交换堆顶和首位元素*/
            tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            adjustHeap(arr,0,i);
        }
    }

    /**
     * 大顶堆构造
     *
     * @param arr    待调整数组
     * @param idx    父节点
     * @param length 待调整的数组长度
     */
    private void adjustHeap(int[] arr, int idx, int length) {
        /*暂存父节点*/
        int tmp = arr[idx];
        for(int i = 2*idx+1;i<length;i=2*i+1){
            /*子节点中较大值*/
            if(i+1<length&&arr[i]<arr[i+1]){
                i++;
            }
            /*比较子节点中较大值与父节点大小，取大*/
            if(arr[i]>tmp){
                arr[idx] = arr[i];
                /*idx指向i，以i作为父节点继续往下调整*/
                idx = i;
            }else{
                break;
            }
        }
        arr[idx] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {39, 57, 11, 40, 75, 34, 38, 48, 60, 13, 9, 7};
        HeapSort hs = new HeapSort();
        hs.heapSort(arr);
        System.out.println(Arrays.toString(arr));
        HashMap map = new HashMap();
    }
}
