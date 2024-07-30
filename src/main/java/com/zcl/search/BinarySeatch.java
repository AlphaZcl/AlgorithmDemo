package com.zcl.search;

/**
 * 二分查找
 *
 * @Author AlphaZcl
 * @Date 2021/7/21
 **/
public class BinarySeatch {

    public int binarySearch(int[] arr, int val) {
        return search(arr, 0, arr.length - 1, val);
    }

    private int search(int[] arr, int left, int right, int val) {
        if (left > right) {
            return -1;
        }
        int mid = ((right - left) >> 2) + left;
        if (val > arr[mid]) {
            return search(arr, mid + 1, right, val);
        } else if (val < arr[mid]) {
            return search(arr, left, mid - 1, val);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 14, 53, 63, 154, 214, 542, 616, 748};
        int val = 33;
        BinarySeatch bs = new BinarySeatch();
        System.out.println(bs.binarySearch(arr,val));
    }
}
