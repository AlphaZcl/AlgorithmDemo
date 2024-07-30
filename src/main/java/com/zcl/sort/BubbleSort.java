package com.zcl.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 * @author zclys
 * @date 2021/1/25 17:19
 */
public class BubbleSort {

    public void buSort(int[] srcArr){
        for(int i=0;i<srcArr.length-1;i++){
            for(int j = 0;j<srcArr.length-i-1;j++){
                if(srcArr[j]>srcArr[j+1]){
                    int tmp = srcArr[j+1];
                    srcArr[j+1] = srcArr[j];
                    srcArr[j] = tmp;
                }
            }
        }
    }

    public void buSort2(int[] srcArr){
        boolean flag = false;
        for(int i=0;i<srcArr.length-1;i++){
            for(int j = 0;j<srcArr.length-i-1;j++){
                if(srcArr[j]>srcArr[j+1]){
                    flag = true;
                    int tmp = srcArr[j+1];
                    srcArr[j+1] = srcArr[j];
                    srcArr[j] = tmp;
                }
            }
            if(!flag){
                /*本轮未发生交换*/
                break;
            }else{
                /*重置*/
                flag = false;
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
        BubbleSort bs = new BubbleSort();
        bs.buSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
