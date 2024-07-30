package com.zcl.search;

/**
 * 插值查找
 *
 * @Author AlphaZcl
 * @Date 2021/7/21
 **/
public class InsertValSearch {

    public int insertValSearch(int[] arr,int val){
        return search(arr,0,arr.length-1,val);
    }

    private int search(int[] arr,int left,int right,int val){
        if(left>right){
            return -1;
        }
        int mid = left + (val - arr[left])*(right-left)/(arr[right]-arr[left]);
        if(val>arr[mid]){
            return search(arr,mid+1,right,val);
        }else if (val<arr[mid]){
            return search(arr,left,mid-1,val);
        }else{
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 14, 53, 63, 154, 214, 542, 616, 748};
        int val = 600;
        InsertValSearch ivs = new InsertValSearch();
        System.out.println(ivs.insertValSearch(arr,val));
    }
}
