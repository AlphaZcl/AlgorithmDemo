package com.zcl.search;

import java.util.Arrays;

/**
 * 黄金分割查找法（斐波那契数列查找法）
 *
 * @Author AlphaZcl
 * @Date 2021/7/21
 **/
public class FibSearch {

    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */
    private int[] fib(int n) {
        int pre = 0, post = 1, sum = 0;
        int[] fibArr = new int[n];
        for (int i = 0; i < n; i++) {
            sum = pre + post;
            pre = post;
            post = sum;
            fibArr[i]=pre;
        }
        return fibArr;
    }

    public int fibSearch(int[] arr, int val) {
        /*获取斐波那契数列的k值*/
        int low=0,high=arr.length-1,k=0;
        int[] fibArr = fib(arr.length);
        while (high>fibArr[k]-1){
            k++;
        }
        /*k值能比arr数组长度大,需要一个新的数组代替原数组*/
        int[] temp = Arrays.copyOf(arr,fibArr[k]);
        for(int i = high+1;i<fibArr[k];i++){
            temp[i] = arr[high];
        }

        /*查询对应的目标值*/
        while (low<=high){
            int mid= low + fibArr[k-1]-1;
            if(val>temp[mid]){
                /*在分割点的右侧，右侧有fib[k-2]个元素*/
                k-=2;
                low = mid+1;
            }else if(val < temp[mid]){
                /*在分割点的左侧，左侧有fib[k-1]个元素*/
                k--;
                high = mid -1;
            }else{
                if(mid>high){
                    return high;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FibSearch sf = new FibSearch();
        int[] arr = {3,14,53,66,214,748,1000};
        System.out.println(sf.fibSearch(arr,748));
    }
}
